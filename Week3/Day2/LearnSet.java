package week3.day2;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class LearnSet {

	public static void main(String[] args) {
		//Declaring Set
		
		//HashSet -Random
		//Set<String> mentors =new HashSet<String>();
		
		//LinkedHashSet -Insertion order
		 //Set<String> mentors =new LinkedHashSet<String>();
		
		//TreeSet - ASCII order
		Set<String> mentors=new TreeSet<String>();
		
		//To add elements
		mentors.add("Vinoth");
		mentors.add("Saranya");
		mentors.add("Anbu");
		mentors.add("Gokul");
		
		System.out.println(mentors);
		
		//remove an element
		  mentors.remove("Vinoth");
		  
		  System.out.println("Set after removing Vinoth: "+mentors);
		  
		  //size
		  int sizeOfSet = mentors.size();
		  System.out.println("Size is: "+sizeOfSet);
		  
		  //addAll-To add all the elements from one set to another
		  
		  Set<String> staffs=new HashSet<String>();
		  
		  System.out.println("Before adding: "+staffs);
		  
		  staffs.addAll(mentors);
		  
		  System.out.println("After adding: "+staffs);
		  
		  
		  //To retrieve an element
		  //Convert the set into list - move all elements from set to list
		  
		  List<String> trainers =new ArrayList<String>(staffs);
		  System.out.println("After moving: "+trainers);
		  
		  String firstIndexValue = trainers.get(0);
		  System.out.println("First Value: "+firstIndexValue);
		  
		  
		  System.out.println("List name is: "+trainers);
		  
		  
		  //For each loop
		     //DataType    //New variable    //variable already data was stored
		  for (String       staffName :          trainers) {
		System.out.println("All value: "+staffName);	
		}
		  
	}

}
