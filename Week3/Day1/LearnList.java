package week3.day1;

import java.util.ArrayList;
import java.util.List;

public class LearnList {

	public static void main(String[] args) {
		
		//Declaring List
		 List<String> learners=new ArrayList<String>();
		
		//Empty List
		System.out.println("Empty List: "+learners);
		
		//add an element to the list
		learners.add("Karthik");
		System.out.println("List after adding 1 element: "+learners);
		
		//add more elements in the list
		learners.add("Rajesh");
		learners.add("Venkatesh");
		System.out.println("After adding 3 Elements :"+learners);
		
		//index starts from 0
		//0-karthik
		//1-Rajesh
		//2-Venkatesh
		
		//add element by index
		learners.add(1, "Siva");
		System.out.println("Add siva in index 1: "+learners);
		
		
		//To get the size of the of the list
		int sizeofList = learners.size();
		System.out.println("Size of the list: "+sizeofList);
		
		//add duplicate
		learners.add("Rajesh");
		System.out.println("List after duplicate: "+learners);
		
		//removing an element
		  learners.remove(2);
		
		  System.out.println("List after removing an element: "+learners);
		 
		//contains
		boolean contains = learners.contains("Ventesh");
		System.out.println("Boolean value: "+contains);
		
		//retrieve siva in list  -getmethod
		String firstIndexValue = learners.get(1);
		System.out.println("First index value is :"+firstIndexValue);
		
		//clear all the data in the list
		learners.clear();
		
		System.out.println("My current List is: "+learners);
		
		
    }

}
