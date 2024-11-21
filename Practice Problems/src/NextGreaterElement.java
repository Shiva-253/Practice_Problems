import java.util.*;
public class NextGreaterElement {

	public static void main(String[] args) {
//		Given an array, print the Next Greater Element for every element. The Next greater Element for an element x is the first greater element
//		on the right side of x in the array. Elements for which no greater element exist, consider the next greater element as -1. 
		
		int arr[] = {4, 0, 9, 1, 3, 6};
		int[] ans = new int[arr.length];
		
		Stack<Integer> stack = new Stack<>();
		
		ans[arr.length-1] = -1;
		stack.push(arr[arr.length-1]);
		
		for(int i=arr.length-2; i>=0; i--) {
			
			while(stack.isEmpty() == false && stack.peek() <= arr[i]) {
				stack.pop();
			}
			if(stack.isEmpty()) {
				ans[i] = -1;
				stack.push(arr[i]);
				continue;
			}
				ans[i] = stack.peek();
				stack.push(arr[i]);
		}
		
		for(int i=0; i<ans.length; i++) {
			System.out.print(ans[i]+ " ");
		}

	}

}
