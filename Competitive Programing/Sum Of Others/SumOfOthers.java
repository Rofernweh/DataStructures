import java.util.Scanner;

public class SumOfOthers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNextLine()) {
            String numberLine = scanner.nextLine();
            String[] numberSplit = numberLine.split(" ");

            int sum = 0;
            for (int i = 0; i < numberSplit.length; i++) {
                sum += Integer.parseInt(numberSplit[i]);
            }

            int target = 0;
            boolean found = false;
            for (int i = 0; i < numberSplit.length; i++) {
                int currentNumber = Integer.parseInt(numberSplit[i]);
                if (sum - currentNumber == currentNumber) {
                    target = currentNumber;
                    found = true;
                    break;
                }
            }

            if (found) {
                System.out.println(target);
            } else {
                System.out.println("No such number found");
            }
        }
        scanner.close();
    }
}
