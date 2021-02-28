import java.util.Scanner;

public class HW1 {

    public static void main(String[] args) {
        // 1) S money was put in the bank. What will the deposit amount become in N years
        // if the interest of 1.5% is added to the deposit amount on a monthly basis?
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter sum of initial deposit :");
        System.out.println("Enter number of years :");
        double startSum = scanner.nextDouble();
        double startSumCopy = startSum;
        double endSum = 0;
        int years = scanner.nextInt();
        int months = years * 12;
        for (int i = 0; i < months; i++) {
            endSum = startSum * 1.015;
            startSum = endSum;
        }
        System.out.printf("if you deposit %s $ , then in %s years " +
                "you will have %.3fs $ in your account.", startSumCopy, years, endSum);
    }
}
