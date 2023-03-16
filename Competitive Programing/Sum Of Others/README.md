## Sum of Others

### Problem Description

Given an array of integers, the task is to find a number in the array that is equal to the sum of all other numbers in the array.

### Input

The input consists of multiple lines. Each line contains a sequence of integers separated by spaces.

### Output

For each line of input, the program outputs the number that is equal to the sum of the other numbers in the array. If no such number exists, the program outputs "No such number found".

### Code Explanation

1. **Import the necessary classes**: The `Scanner` class from `java.util` package is imported to read input from the user.

2. **Create the main class**: The `SumOfOthers` class contains the `main` method, which is the entry point of the program.

3. **Read input**: Inside the `main` method, a `Scanner` object is created to read input from the user. The program reads input line by line using `hasNextLine()` and `nextLine()` methods.

4. **Split the input**: The input line is split into an array of strings using the `split(" ")` method. This creates an array of string representations of the numbers.

5. **Calculate the sum**: Iterate through the array of string numbers, parse each element as an integer using `Integer.parseInt()` method, and calculate the sum of all the numbers.

6. **Find the target number**: Iterate through the array of string numbers again. For each number, check if the sum of all numbers minus the current number is equal to the current number. If this condition is satisfied, set the target number as the current number and break the loop. A boolean variable `found` is used to keep track of whether the target number was found or not.

7. **Output the result**: If the target number is found, print the target number. Otherwise, print "No such number found".

8. **Close the Scanner**: Close the `Scanner` object after processing all input lines using `scanner.close()` method.
