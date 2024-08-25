
# Extent Report:

     - Use aventstack library
         <!-- https://mvnrepository.com/artifact/com.aventstack/extentreports -->
<dependency>
    <groupId>com.aventstack</groupId>
    <artifactId>extentreports</artifactId>
    <version>3.1.5</version>
</dependency>

    Advantages:
      - Can attach Screenshot for each step
      - Can have report based on different author 
      - Can have report based on different category
      - Consolidated Dashboard with graphs

Extent Classes:
  - ExtentHTMLReporter
  - ExtentReport
  - ExtentTest
  - MediaEntityBuilder


Steps to integrate ExtentReport:
   1. Create startReport() in the BaseClass and declare the ExtentReport extent as a global variable
        - Add all the common lines of code (Step 1 - Step 3)
        - Annotate startReport() with @BeforeSuite
   2. Create stopReport() in the BaseClass and have the code 
         - extent.flush();    
         - Annotate with @AfterSuite
   3. Create testCaseDetails() in the BAseClass and have the lines of code to create testcase and assign the details
         - Annotate this method with @BeforeClass
         - Replace all the hardcoded datas with some global variables
         - Declare some global variables as 
            public String testName, testDescription,testAuthor, testCategory;
   4. Assign all the value inside setValues() in each testcase
   