import java.util.*;
public class TripletsInArray {

	public static void main(String[] args) {
//		Given an array of distinct elements. The task is to find triplets in the array whose sum is zero.
//
//		Input : arr[] = {0, -1, 2, -3, 1}
//
//		Output : (0 -1 1), (2 -3 1)
		
		int arr[] = {4, 0 ,-2, 1, -3, -1, 2};
		
		System.out.println(TripletsInArray.get_triplets(arr));
	}
	
	public static ArrayList<ArrayList<Integer>> get_triplets(int[] arr) {
		ArrayList<ArrayList<Integer>> al = new ArrayList<>();
		for(int i=0; i<arr.length-2; i++) {
			for(int j=i+1; j<arr.length-1; j++) {
				for(int k=j+1; k<arr.length; k++) {
					if(arr[i]+arr[j]+arr[k] == 0) {
						ArrayList<Integer> al_new = new ArrayList<>();
						al_new.add(arr[i]);
						al_new.add(arr[j]);
						al_new.add(arr[k]);
						al.add(al_new);
					}
				}
			}
			
		}
		return al;
	}

}
