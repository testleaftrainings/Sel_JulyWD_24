package week1.day4;

import java.util.Arrays;

public class LearnArrays {

	public static void main(String[] args) {
		
		//Declare array using instantiation
		
		int[] numbers=new int[5];
		numbers[0]=70;    //0 1 2 3 4 
		numbers[1]=75;
		numbers[2]=80;
		numbers[3]=90;
		numbers[4]=100;
		
		
		System.out.println(numbers[0]);
		
	    //Declare array by literal
	
		//add the scores of a batsman
		              //0   1   2  3  4
		int scores[]= { 54,25,100,67,72};    // last index =length-1
		
		//Arrays methods
		
		//To find the length of the array
		   int arrayLength=scores.length;
		  System.out.println("The length is : "+arrayLength);
		
		 //To Retrieve the particular value 100
		   System.out.println("The value in index 2: "+scores[2]);
		
		
		//To sort the array
		  Arrays.sort(scores);
		  //After sorting  {25,54,67,72,100}
		
		//To get the least value
		System.out.println("After sorting: "+scores[0]);
		
		//To print the largest value
		System.out.println("Largest value: "+scores[arrayLength-1]);
		
		
		//To retrieve all values
		            //0 1 2 3 4
		for (int i = 0; i < scores.length; i++) {
			System.out.println("The array values are: "+scores[i]);
		}
		
		}

}
