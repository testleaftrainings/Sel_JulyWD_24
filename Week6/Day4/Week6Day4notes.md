

# Exception:
    - Abnormal behaviour which stops the program execution

Excpetions:
   - Compile Time Exceptions or Checked Exceptions
   - RunTime Exception or Unchecked Exceptions
      - NullPointerException
      - NoSuchElementException
      - ArrayOutOfBoundsException
      - NoSuchWindowException
      - StaleElementReferenceException
      - ElementNotInteractableException
      - NoAlertPresentException
      - UnhandledAlertException


# Exception Handling:
   - Apply try / catch block
   - catch block will be exceuted only when there is an exception
   - we cannot have try block alone
   - we cannot have catch block alone
   - All the Exceptions are classes
   - Exception is the super class for all the Exceptions
   - Finally block will be getting executed irrespective of the exceptions
   - To handle exceptions catch block is mandatory
   - try block should be followed by either catch block / finally / catch & finally

   try       try        try
   catch     catch          try
             catch          catch
             catch     catch
                       catch

