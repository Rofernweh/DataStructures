## Watermelon Division

### Problem Description

Pete and Billy bought a watermelon that weighs `w` kilos. They want to divide the watermelon into two parts such that each part weighs an even number of kilos, and each part has a positive weight. The task is to find out if they can divide the watermelon as they want.

### Input

The input consists of a single integer `w` (1 ≤ w ≤ 100) — the weight of the watermelon bought by the boys.

### Output

If the boys can divide the watermelon into two parts, each of them weighing an even number of kilos, print "YES". Otherwise, print "NO".

### Code Explanation

1. **Import the necessary classes**: The `Scanner` class from `java.util` package is imported to read input from the user.

2. **Create the main class**: The `Watermelon` class contains the `main` method, which is the entry point of the program.

3. **Read input**: Inside the `main` method, a `Scanner` object is created to read input from the user. The weight of the watermelon, `W`, is read as an integer using the `nextInt()` method.

4. **Check the divisibility condition**: Check if `W` is divisible by 2 (i.e., `W % 2 == 0`) and greater than 2 (`W > 2`). If both conditions are true, print "YES", otherwise print "NO".

5. **Close the Scanner**: Close the `Scanner` object after processing the input using `input.close()` method.

