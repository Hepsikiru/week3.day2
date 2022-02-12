package week3.day2.practice;


import java.util.ArrayList;

public class FindIntersection {
	/*
	 * Pseudo Code
	
	 * a) Declare An array for {3,2,11,4,6,7};	 
	 * b) Declare another array for {1,2,8,4,9,7};
	 * c) Declare for loop iterator from 0 to array length
	 * d) Declare a nested for another array from 0 to array length
	 * e) Compare Both the arrays using a condition statement
	 
	 *  f) Print the first array (should match item in both arrays)
	 */
	
	public static void main(String[] args) {
		System.out.println("Intersection of Array");
		
		int[] firstarr = {3,2,11,4,6,7};
		int[] Secondarr = {1,2,8,4,9,7};
		ArrayList<Integer> list = new ArrayList<>();
		for(int i=0;i<firstarr.length;i++) {
			
			for(int j=0;j<Secondarr.length;j++) {
				
				if(firstarr[i]==Secondarr[j]) {
					list.add(firstarr[i]);
					
				}
				
			}
			
			
		}
	
	System.out.println(list);
	}

}
