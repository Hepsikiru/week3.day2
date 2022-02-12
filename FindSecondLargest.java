package week3.day2.practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class FindSecondLargest {
/*
 * int[] data = {3,2,11,4,6,7};

		
		/*
		 Pseudo Code:
		 1) Arrange the array in ascending order
		 2) Pick the 2nd element from the last and print it
		 */
 
	public static void main(String[] args) {
		int[] givenNumbers = {3,2,11,4,6,7};
		
	int len = givenNumbers.length;
	List<Integer> intList = new ArrayList<Integer>(givenNumbers.length);
	for (int i : givenNumbers)
	{
	    intList.add(i);
	}
	System.out.println("Before sort : "+intList);
	 Collections.sort(intList);
	 System.out.println("After sort : "+intList);
	 System.out.println("The Second Largest Number is "+" "+intList.get(1));
		
	}

}
