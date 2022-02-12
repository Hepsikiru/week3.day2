package week3.day2.practice;


import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class MissingElementInAnArray {
/*
 * 	// Here is the input
		int[] arr = {1,2,3,4,7,6,8};

		// Sort the array	
		

		// loop through the array (start i from arr[0] till the length of the array)

			// check if the iterator variable is not equal to the array values respectively
			
				// print the number
				
				// once printed break the iteration
 * 
 */
	public static void main(String[] args) {
		Integer[] arr = {1,2,3,4,7,6,8};
		int len = arr.length;
		List<Integer> list=Arrays.asList(arr); 
		Collections.sort(list);
      int i=1;
		while (i < len) 
		{
			if (arr[i] - arr[i - 1] == 1) {
			
			} 
			
			else {
				System.out.println("Missing number is " + (arr[i - 1] + 1));
			}
			i++;
		}
		
	}
	}



