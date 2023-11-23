## Operators, Loops & Control-Flow:

### Task 1: Basic Arithmetic Operators

- Write a Java program that calculates the area of a rectangle. Ask the user for the length and width as input, and then compute and display the area.
Use the `+, -, *`, and `/` operators for addition, subtraction, multiplication, and division, respectively.

### Task 2: Logical Operators

- Write a program that determines if a year entered by the user is a leap year. A leap year is divisible by 4 but not by 100 unless it's also divisible by 400.
- Use the `&&` (logical AND) and `||` (logical OR) operators to check the conditions.

### Task 3: Temperature Converter

- Write a program that converts a temperature in `Celsius` to `Fahrenheit` or vice versa based on user input. Ask the user to enter the temperature value and the scale (C or F).

### Task 4: Positive, Negative, or Zero

- Write a program that asks the user to enter a number and then checks if it's positive, negative, or zero.

### Task 5: Calculate Factorial with a while Loop

- Write a program that calculates the factorial of a number entered by the user using a `while` loop.
Ask the user for the number, and then compute and display the factorial.

### Task 6: Sum of Even Numbers

- Write a program that calculates the sum of even numbers from 1 to 100 using a `for` loop.
Display the result at the end.

### Task 7: Find Prime Numbers

- Write a program that uses a `for` loop to find and display prime numbers within a specified range (e.g., 1 to 100).

### Task 8: Reverse a Number

- Write a program that reverses a given number using a while loop.
For example, if the user enters `12345`, the program should print `54321`.

### Task 9: Factorization

- Write a program that finds the prime factorization of a number entered by the user.
For example, if the user enters 36, the program should print `2 * 2 * 3 * 3` as the prime factorization.

## OOPs:

### Task 10: Inheritance
- Create a base class called Shape with properties like color and a method getArea(). Then, create two derived classes Circle and Rectangle that inherit from Shape. Implement the specific logic for calculating the area in each derived class.

### Task 11: Polymorphism
- Define an interface called Drawable with a method draw(). Make the Circle and Rectangle classes from the previous task implement this interface. Create an array of Drawable objects and demonstrate polymorphism by calling the draw() method on each object, regardless of whether it's a circle or rectangle.

### Task 12: Method Overriding
- Extend the Shape example by adding a method displayInfo() in the base class. Override this method in both Circle and Rectangle to display information specific to each shape. Create instances of both shapes and call the displayInfo() method on each.

### Task 13: Abstract Class
- Introduce an abstract class called Vehicle with common properties like brand and an abstract method start(). Create two concrete classes, Car and Motorcycle, that extend Vehicle and implement the start() method in their own way.

### Task 14: Interface and Inheritance
- Create an interface Eatable with a method consume(). Implement this interface in a class Fruit. Then, create a class Apple that extends Fruit. Implement the consume() method in both Fruit and Apple classes.

## Exception Handling

### Task 15: Basic Exception Handling
- Write a program that takes two numbers as input from the user and divides them. Handle ArithmeticException for division by zero and InputMismatchException for invalid input.

### Task 16: Custom Exception
- Create a custom exception class called InvalidInputException. Modify the program from Task 15 to throw this exception when the input is not a valid number.

### Task 17: Multiple Catch Blocks
- Write a program that reads data from a file. Handle FileNotFoundException for the file not found, IOException for other IO-related issues, and a generic Exception for any other unforeseen errors.

### Task 18: Try-with-Resources
- Create a program that reads data from a file using the BufferedReader class. Use try-with-resources to automatically close the resources (BufferedReader) after use. Handle IOException appropriately.

### Task 19: Exception Propagation
- Write a method that calls another method. The inner method should throw a custom exception, and the outer method should catch and handle that exception. Demonstrate how exceptions propagate up the call stack.

### Task 20: Finally Block
- Modify the program from Task 19 to include a finally block. Print a message in the finally block to indicate that it is being executed regardless of whether an exception occurred or not.

### Task 21: Checked vs Unchecked Exceptions
- Write a program that intentionally divides a number by zero. Observe the difference between checked exceptions (those that need to be declared or caught) and unchecked exceptions (runtime exceptions).

### Task 22: Exception Chaining
- Create a chain of exceptions by catching one exception type and throwing another with additional information. Demonstrate how this can be useful for providing more detailed error messages.

### Task 23: Cleanup Operations
- Write a program that opens a network connection or a file and handles IOException. Ensure that the resources are properly closed in a finally block or by using try-with-resources.

## Collections Framework

### Task 24: Basic Operations - List
- Create an ArrayList and a LinkedList.
- Perform common operations such as adding elements, removing elements, and retrieving elements.
- Print the elements of both lists.

### Task 25: Iteration - List
- Use an iterator to iterate through both the ArrayList and LinkedList.
- Print each element during iteration.

### Task 26: Performance Comparison - List
- Write a program that measures the time taken to perform add, remove, and get operations on both ArrayList and LinkedList for a large number of elements.
- Compare the performance differences.

### Task 27: Basic Operations - Set
- Create a HashSet and a LinkedHashSet.
- Perform common operations such as adding elements, removing elements, and checking for the existence of elements.
- Print the elements of both sets.

### Task 28: Iteration - Set
- Use an iterator to iterate through both the HashSet and LinkedHashSet.
- Print each element during iteration.

### Task 29: Order Observation - Set
- Observe and document the order in which elements are stored in HashSet and LinkedHashSet.
- Discuss the differences between the two in terms of ordering.

### Task 30: Basic Operations - Map
- Create a HashMap and a LinkedHashMap.
- Perform common operations such as adding key-value pairs, removing entries, and retrieving values based on keys.
- Print the key-value pairs of both maps.

### Task 31: Iteration - Map
- Use an iterator or enhanced for loop to iterate through both the HashMap and LinkedHashMap.
- Print each key-value pair during iteration.

### Task 32: Order Observation - Map
- Observe and document the order in which key-value pairs are stored in HashMap and LinkedHashMap.
- Discuss the differences between the two in terms of ordering.

### Task 33: Combine Collections - Advanced
- Create a program that uses a combination of List, Set, and Map.
- For example, create a list of custom objects, a set of unique values from the list, and a map where keys are derived from the list and values are some transformation of the list elements.
