### Variables:
   1. *Definition:*
     Variables in Java are like containers that store data. They have a type (int, double, String) and a name. Use variables to store and manipulate data.

### Datatypes:
   1. *Definition:*
       Datatypes specify the type of data a variable can hold. 

### Conditional Statements:
   1. Conditional statements  are used to control the flow of the program based on certain conditions. These statements allow the program to make decisions and execute different blocks of code depending on whether a specified condition evaluates to true or false. The primary conditional statements in Java include:

### 1. `if` Statement:

**Definition:**
The `if` statement is used to execute a block of code only if a specified condition is true.

**Syntax:**
```java
if (condition) {
    // Code to be executed if the condition is true
}
```

### 2. `if-else` Statement:

**Definition:**
The `if-else` statement is used to execute one block of code if the condition is true and another block of code if the condition is false.

**Syntax:**
```java
if (condition) {
    // Code to be executed if the condition is true
} else {
    // Code to be executed if the condition is false
}
```

### 3. `if-else if-else` Statement:

**Definition:**
The `if-else if-else` statement allows you to check multiple conditions in sequence. It executes the first block of code whose condition is true.

**Syntax:**
```java
if (condition1) {
    // Code to be executed if condition1 is true
} else if (condition2) {
    // Code to be executed if condition2 is true
} else {
    // Code to be executed if none of the conditions is true
}
```

### Switch-case statement:

1.  The switch-case statement in Java is a conditional statement used to make decisions based on the value of an expression. 
 - The switch statement evaluates the expression and then compares it against various case values. When a match is found, the associated block of code is executed.

**Syntax:**

```java
switch (expression) {
    case value1:
        // Code to be executed if expression equals value1
        break;
    case value2:
        // Code to be executed if expression equals value2
        break;
    // Additional cases as needed
    default:
        // Code to be executed if none of the cases match
}
```
*Key points about the switch-case statement:*
1. *Expression:*
    The expression is evaluated once and its value is then compared with the constant values specified in the case statements.
2. *Case Values:*
    Each case specifies a constant value that the expression is compared against. If there's a match, the code block following that case is executed.
3. *Break Statement:*
    The break statement is used to exit the switch statement after a match is found. Without break, the flow of execution would continue to subsequent case statements.
4. *Default Case:*
    The default case is optional and serves as a fallback if none of the case values match the expression. It is executed when no other matching case is found.

### Differences and Usage of If and Switch case Statements:
1. Number of Conditions:
`if`: Suitable for handling a relatively small number of conditions or conditions that don't share a common expression.
`switch`: Especially useful when there are multiple conditions sharing the same expression.
2. Equality Comparison:
`if`: Allows for complex conditions involving equality, inequality, or other relational operators.
`switch`: Specifically designed for equality-based comparisons. Each case checks if the expression equals a constant value.
3. Complex Conditions:
`if`: Provides flexibility to handle more complex conditions with logical operators (AND, OR).
`switch`: Limited to simple equality conditions; each case checks if the expression equals a specific value.
4. Default Case:
`if`: No default case; you can handle default behavior with an additional else statement.
`switch`: Has a built-in default case, which is executed when none of the case values match the expression.



          



  