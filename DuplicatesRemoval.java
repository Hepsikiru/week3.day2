package week3.day2.practice;

import java.util.LinkedHashSet;
import java.util.Set;

public class DuplicatesRemoval {
	/*
	 * Pseudo code 
	 
	 * a) Use the declared String text as input
		String text = "We learn java basics as part of java sessions in java week1";		
	 * b) Initialize an integer variable as count	  
	 * c) Split the String into array and iterate over it 
	 * d) Initialize another loop to check whether the word is there in the array
	 * e) if it is available then increase and count by 1. 
	 * f) if the count > 1 then replace the word as "" 
	 
	 * g) Displaying the String without duplicate words	
	 * 
	 * 
	 * 
	 */
	public static void main(String args[])
	{
		String text = "We learn java basics as part of java sessions in java week1";
		int count=0;
		String[] txtSplit=text.split(" ");
		Set<String> setTxt=new LinkedHashSet<String>();
		 for(String Arraylist:txtSplit)
		    {
			 setTxt.add(Arraylist);
		    		
		    	}
		   
			System.out.println(setTxt);
			String reformedString=setTxt.toString();
			System.out.println(reformedString.replace('[',' ').replace(',', ' ').replace(']',' ').replace("  ", " "));
	}

}
