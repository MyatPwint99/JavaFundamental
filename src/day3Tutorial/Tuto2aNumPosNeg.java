package day3Tutorial;

import java.util.Scanner;

public class Tuto2aNumPosNeg {
    public static void main(String[] args) {
        String res;
        do {
            // User Input Number to decide Positive or Negative

            System.out.println("Test Data");
            Scanner sc = new Scanner(System.in);
            System.out.print("Input number: ");
            int num = sc.nextInt();
            System.out.print("Expected Output : ");
            if (num > 0) {
                System.out.println("Number is Positive");
            } else if (num < 0) {
                System.out.println("Number is Negative");
            } else {
                System.out.println("0 is Positive nor Negative");
            }
            System.out.println();
            System.out.print("Want to do again? (y/n) : ");
            res = sc.next();
        }while (res.equals("y"));

    }
}
