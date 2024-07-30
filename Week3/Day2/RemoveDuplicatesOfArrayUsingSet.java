package week3.day1;

import java.util.Set;
import java.util.TreeSet;

public class RemoveDuplicatesOfArrayUsingSet {

	public static void main(String[] args) {
		
		
		//String str ="google";
		//str.toCharArray()
	    //Expected Output=[g,o,l,e]
		
		
		//Declaring Array
		
		int[] nums= {2,4,5,3,2,4};
		         //  0 1 2 3 4 5
		//Declaring Integer set
		
		Set<Integer> uniqueNumber=new TreeSet<Integer>();
		        //nums[0]    to nums[5]
		for (int i = 0; i < nums.length; i++) {
			uniqueNumber.add(nums[i]);
		}
		System.out.println("Unique Numbers: "+uniqueNumber);

	}

}
