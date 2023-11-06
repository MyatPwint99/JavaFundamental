package day3Tutorial;

import java.util.Scanner;

public class Tuto2bThreeNumGetGreatest {
    public static void main(String[] args) {

        String res;
        do {
            // User Input Three Number to decide the Greatest Number
        System.out.println("Test Data");
        Scanner sc = new Scanner(System.in);
        System.out.print("Input the 1st number: ");
        int num1 = sc.nextInt();
        System.out.print("Input the 2nd number: ");
        int num2 = sc.nextInt();
        System.out.print("Input the 3rd number: ");
        int num3 = sc.nextInt();

        int max = 0, max2 = 0;

        System.out.println("Expected Output :");
        System.out.print("The greatest: ");
            if (num1 == num2 && num1 == num3 && num2 == num3) {
                System.out.println(num1+" (Three Numbers are Same Numbers.)");
            }else {
                if (num1 > num2 && num1 > num3) {
                    max = num1;
                    System.out.println(max);
                } else if (num2 > num1 && num2 > num3) {
                    max = num2;
                    System.out.println(max);
                } else if (num3 > num1 && num3 > num2) {
                    max = num3;
                    System.out.println(max);
                } else {
                    if (num1 == num2) {
                        max = num1;
                        System.out.println(max + " (Two Numbers 1st & 2nd are Same Numbers.)");
                    } else if (num1 == num3) {
                        max = num1;
                        System.out.println(max + " (Two Numbers 1st & 3rd are Same Numbers.)");
                    } else if (num2 == num3) {
                        max = num2;
                        System.out.println(max + " (Two Numbers 2nd & 3rd are Same Numbers.)");
                    }
                }
            }
        System.out.println();
        System.out.print("Want to do again? (y/n) : ");
        res = sc.next();

        }while (res.equals("y"));

    }
}
