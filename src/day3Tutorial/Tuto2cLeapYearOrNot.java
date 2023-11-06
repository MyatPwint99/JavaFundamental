package day3Tutorial;

import java.util.Scanner;

public class Tuto2cLeapYearOrNot {
    public static void main(String[] args) {
        String res;
        do {
            // User Input Year to decide year is a leap year or not.
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a year : ");
        int year = sc.nextInt();

        if(year % 4 == 0){
            if(year % 100 == 0){
                if(year % 400 == 0){
                    System.out.println("Leap Year");
                }
            }else {
                System.out.println("Leap Year");
            }
        }else {
            System.out.println("Not a Leap Year");
        }
            System.out.println();
            System.out.print("Want to do again? (y/n) : ");
            res = sc.next();

        }while (res.equals("y"));

    }
}
