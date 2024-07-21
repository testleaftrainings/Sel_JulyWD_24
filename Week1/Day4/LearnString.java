package week1.day4;

public class LearnString {

	public static void main(String[] args) {
		//By Literal
		String str="TestLeaf";
		String str1="TestLeaf";
		
	       //By Instantiation

		   String str2=new String("TestLeaf");
		  
		  
		  //Methods in String
		  
		  //   == compares the reference address
		  //  .equals -compares the content
		  
		  String st1="JulyWeekdayLearners";
		  
		  String st2="JulyWeekdayLearners";
		  
		  //Compares the address which is same for both st1 and st2
		  System.out.println(st1==st2);
		  
		  String st3=new String("July");
		  
		  //Compares the address which is different for both st1 and st2
		  
		  System.out.println(st1==st3);
          System.out.println(st2==st3);
		  
		  // .equals method - Compares the content
		  
		  System.out.println("equals :"+st1.equals(st3));
		  System.out.println("equals :"+st2.equals(st3));
		  
		  //equalsIgnoreCase
		    System.out.println("EqualsIgnore case: "+st1.equalsIgnoreCase(st3));
		  
		  //Contains method - compares the partial match
		    System.out.println(st1.contains(st3));
		  
		  //To find the length  of the string
		    String batchName="JulyWD&2024";
		    int stringLength = batchName.length();
		    System.out.println("String length: "+stringLength);
		  
		  //toUpperCase - converts string upperCase
		    String upperCaseString=batchName.toUpperCase();
		    System.out.println(upperCaseString);
		  
		  //toLowerCase
		    System.out.println(batchName.toLowerCase());
		  
		  
		  //toCharArray - convert string to characters
		  //{J,u,l,y,W,D,2,0,2,4}
		  
		  char[] charArray = batchName.toCharArray();
		  System.out.println(charArray[4]);
		  
		  //charAt
		  System.out.println(batchName.charAt(9));
		  
		
		  //To retrive only the Alphabets
		  
		  //replaceAll method
		  
		  //Empty String s="";
		    String replaceString = batchName.replaceAll("[^0-9]", "");
		    System.out.println("Removed String: "+replaceString);
		  
		  
		  //parseInt
		   String amount="1000";
		   int rate=100;
		  
		   //int+100 - Gets added
		   System.out.println(rate+50);
		   //String+100 -Gets concat
		   System.out.println(amount+50);
		  
		   //Converts string to integer
		  int stringValue =Integer.parseInt(amount);
		  System.out.println(stringValue+100);
		  
	}

}
