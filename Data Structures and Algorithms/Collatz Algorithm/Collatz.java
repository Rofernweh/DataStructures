import java.util.Scanner;

public class Collatz {
    public static void collatz(int n) {
        while (n!=1)
        {
            if(n%2==0)
                n = (n/2);
            else if (n%2==1) {
                n = (n*3+1);
            }
            else
                System.out.println("wrong input");

            System.out.print(n + " ");
        }


    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a positive integer: ");
        int n = scanner.nextInt();
        collatz(n);
        scanner.close();

    }
}
