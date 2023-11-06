package day3Tutorial;

import java.util.Scanner;

public class Tuto1NumPattern {
    public static void main(String[] args) {

        for(int i=1; i<=7; i++){
            for(int j=1; j<i; j++) {
                System.out.print(" ");
            }
            for (int k = i; k <= 7; k++) {
                System.out.print(k + " ");
            }
            System.out.println();
        }

        for(int i=6; i>=1; i--){
            for(int j=1; j<i; j++) {
                System.out.print(" ");
            }
            for (int k = i; k <= 7; k++) {
                System.out.print(k + " ");
            }
            System.out.println();
        }
        System.out.println();

        // User Input Number's Pattern

        String res;
    do {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number : ");
        int num = sc.nextInt();
        System.out.println();
        for (int i = 1; i <= num; i++) {
            for (int j = 1; j < i; j++) {
                System.out.print(" ");
            }
            for (int k = i; k <= num; k++) {
                System.out.print(k + " ");
            }
            System.out.println();
        }

        for (int i = num - 1; i >= 1; i--) {
            for (int j = 1; j < i; j++) {
                System.out.print(" ");
            }
            for (int k = i; k <= num; k++) {
                System.out.print(k + " ");
            }

        }

        System.out.println();
        System.out.print("Want to do again? (y/n) : ");
        res = sc.next();

    }while (res.equals("y"));
    }
}
