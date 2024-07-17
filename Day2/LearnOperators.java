package week1.day2;

public class LearnOperators {

	public static void main(String[] args) {
		
		
		//Operators in java
		//Arithmetic operators
		//and, or
		//comparison operator
		//increment and decrement operator
		//Assignment operator
		
		
        //Assignment Operator
		  int a=5;
		  System.out.println(a);   //a=5
		
		//a=a+7;
		  a+=7;    //5+7
		  System.out.println(a);   // a=12
		
		
		//a=a-2;        //12-2=10
		  a-=2;
	      System.out.println(a);
	
	   //a=a*2;
	     a*=2;
	     System.out.println(a);  //a=20
	
	   //a
	     a=a/5;
	     System.out.println(a);  //a=4;
	
	    System.out.println("----------------------------------");
	
	    //Arithmetic Operator
	      int c=10;
	      int b=3;
	
	    //add
	      System.out.println(c+b);
	
	    //sub
	     System.out.println(c-b);
	
	   //mul
	   System.out.println(c*b);
	
	    //div
	   System.out.println(c/b);
	
        //mod
	   System.out.println(c%b);
	
	   System.out.println("-------------------------------");
	
	   //Comparison Operator
       int v=10;
	   int s=10;
	
	   System.out.println(v==s);
	
	   System.out.println(s<v);
	
	   System.out.println(s>=v);
	
	  System.out.println(s<=v);
	
	  System.out.println(s!=v);
	
	  System.out.println("-------------------");
	
	  //Logical Operator
	  //&&    ||
	  System.out.println(s<v&&s>v);
	 
	  System.out.println(s<v||s>v);
	  
	  System.out.println("-----------------------");
	
	  //Increment & Decrement operator
	  //PreIncrement PostIncrement
	  //PreDecrement PostDecrement
	   int p=7;
	   System.out.println(p++);
	  // postIncrement-value will be incresed but it get shown in next iteration
	     System.out.println(p);   //p=8
	
	  //Preincrement
        System.out.println(++p);  //p=9
	
	  //Predecrement
	    System.out.println(--p);    //p=8
	
      //PostDecrement
	    System.out.println(p--);
	
	    System.out.println(p);
	
    }

}
