import java.util.*;

public class SortingNames {

    public static void main(String[] args) {
        String names[] = {"Krishna", "Balaram", "Shiva", "Bharama", "Ganesh", "Durga", "Avinash", "Avinasa"};
        
        ArrayList<String> names_list = sort(names, 0, names.length - 1);
        
        for (int i = 0; i < names_list.size(); i++) {
            System.out.print(names_list.get(i) + " ");
        }
    }
    
    public static ArrayList<String> merge(String arr[], int l, int m, int r) {
        int l1 = m - l + 1;
        int l2 = r - m;
        
        String Left[] = new String[l1];
        String Right[] = new String[l2];
        
        for (int i = 0; i < l1; ++i) {
            Left[i] = arr[l+i];
        }
        for (int j = 0; j < l2; ++j) {
            Right[j] = arr[m+1+j];
        }
        
        int p1 = 0, p2 = 0;
        ArrayList<String> al = new ArrayList<>();
        
        while (p1 < l1 && p2 < l2) {
            int index = 0;
            while (index < Left[p1].length() && index < Right[p2].length() && Left[p1].charAt(index) == Right[p2].charAt(index)) {
                index++;
            }
            if (index < Left[p1].length() && index < Right[p2].length() && Left[p1].charAt(index) <= Right[p2].charAt(index)) {
                al.add(Left[p1]);
                p1++;
            } else {
                al.add(Right[p2]);
                p2++;
            }
        }
        
        while (p1 < l1) {
            al.add(Left[p1]);
            p1++;
        }
        
        while (p2 < l2) {
            al.add(Right[p2]);
            p2++;
        }
        
        return al;
    }
    
    public static ArrayList<String> sort(String arr[], int l, int r) {
        if (l < r) {
            int m = (l + r) / 2;
            
            ArrayList<String> leftList = sort(arr, l, m);
            ArrayList<String> rightList = sort(arr, m + 1, r);
            
            String[] newArr = new String[leftList.size() + rightList.size()];
            for (int i = 0; i < leftList.size(); i++) {
                newArr[i] = leftList.get(i);
            }
            for (int i = 0; i < rightList.size(); i++) {
                newArr[leftList.size() + i] = rightList.get(i);
            }
            
            return merge(newArr, 0, leftList.size() - 1, newArr.length - 1);
        } 
        else {
            ArrayList<String> singleElementList = new ArrayList<>();
            singleElementList.add(arr[l]);
            return singleElementList;
        }
    }
}

