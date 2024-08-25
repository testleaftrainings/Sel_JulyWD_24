

# POM with Cucumber:
   For TestNG _POM :
     - with driver as static -> sequential execution is possible
     - To have sequential and parallel execution declare Parameterized Constructor in each pages  
   For Cucumber_POM:
      - Constructor should not be defined 
      - With driver as static -> sequential execution is possible 

# POM with ThreadLocal:
# ThreadLocal:
   - Java class which is used to access each thread independently
   private static final ThreadLocal<ChromeDriver> chDriver = new ThreadLocal<ChromeDriver>();     
 private:
    - This variable can be accessed only within the class
 static+final
    - constant -> cannot change the value

    
	public void setDriver() {
        //Sets the current thread's copy of this thread-local variable
		chDriver.set(new ChromeDriver());
	}
	
	public ChromeDriver getDriver() {
        //Returns the value in the current thread's copy of this thread-local variable
		return chDriver.get();
	}

 # Encapsulation:
     - getter and setter methods   
          