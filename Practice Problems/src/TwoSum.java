import java.util.ArrayList;
public class TwoSum {

	public static void main(String[] args) {
//		3. Write a method that checks if there is at least one pair of numbers whose sum equals the target.
//		arr=[1, 3, 4] and target=5 result is true because the pair (1,4) sums to five.
		
		int arr[] = {4,5,4,2,5,3};
		int target = 9;
		
		System.out.print(twoSum(arr, target));  
	}
	
	public static boolean twoSum(int arr[], int target) {
		ArrayList<Integer> al = new ArrayList<>();
		
		for(int i=0; i<arr.length; i++) {
		int req = target - arr[i];
		if(al.contains(req)) {
			return true;
		}
		al.add(arr[i]);
		}
		return false;
	}

}


