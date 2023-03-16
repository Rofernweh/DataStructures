/*One hot summer day Pete and his friend Billy decided to buy a watermelon. 
They chose the biggest and the ripest one, in their opinion. 
After that the watermelon was weighed, and the scales showed w kilos. 
They rushed home, dying of thirst, and decided to divide the berry, however they faced a hard problem.

Pete and Billy are great fans of even numbers, 
that's why they want to divide the watermelon in such a way that each of the two parts weighs even number of kilos,
at the same time it is not obligatory that the parts are equal. The boys are extremely tired and want to start their meal as soon as possible,
that's why you should help them and find out, if they can divide the watermelon in the way they want.
For sure, each of them should get a part of positive weight.
*/





/* It's somewhat of a generic answer, but this is basically what it is asking for.

The problem requires you to determine whether a given weight can be divided into two parts such that each part weighs an even number of kilos. 
To solve this, you can take the input weight, and use the modulo operator (%) to check if it is divisible by 2. 
If the remainder is 0, then the weight can be split into even parts. */



import java.util.Scanner;

public class Watermelon {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int W = input.nextInt();
        if (W % 2 == 0 && W > 2) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
        input.close();
    }
}
