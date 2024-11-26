
public class second_smallest_number {

	public static void main(String[] args) {
		//		3.find Second Smallest Number in an Array
		int arr[] = {12,3,7,5,2,1,34};
		
		int smallest = Integer.MAX_VALUE;
		int sec_smallest = Integer.MAX_VALUE;
		for(int i=0; i<arr.length; i++) {
			if(smallest >= arr[i]) {
				smallest = arr[i];
			}
		}
		
		for(int i=0; i<arr.length; i++) {
			if(arr[i] != smallest && sec_smallest >= arr[i]) {
				sec_smallest = arr[i];
			}
		}
		
		
		
		System.out.println("The second smallest number present in an array is "+sec_smallest);
	
	}
	

}

