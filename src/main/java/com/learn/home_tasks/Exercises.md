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
