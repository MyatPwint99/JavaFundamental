package day3Tutorial;

import java.util.Scanner;

public class Tuto3aAvgValArray {
    public static void main(String[] args) {
        int num[] = {3,4,5,7,9};
        double sum = 0;
        System.out.print("Input: ");
        for (int i:num){
            System.out.print(i+" ");
        }
        for(int i=0;i<num.length;i++){
            sum += num[i];
        }
        System.out.println();
        System.out.println("Sum Value : "+sum);
        sum /= num.length;
        System.out.println("Average Value : "+sum);

        // User Input numbers to calculate the average value of array elements

        String res;
        do {
            int num2[] = new int[5];
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter Five Number : ");
            for (int i = 0; i<num2.length; i++){
                num2[i] = sc.nextInt();
            }
            System.out.print("Input: ");
            for(int i:num2) {
                System.out.print(i+" ");
            }
            System.out.println();
            double sum2 = 0;

            for(int i=0;i<num2.length;i++){
                sum2 += num2[i];
            }
            System.out.println("Sum Value : "+sum2);
            sum2 /= num2.length;
            System.out.println("Average Value : "+sum2);

            System.out.println();
            System.out.print("Want to do again? (y/n) : ");
            res = sc.next();

        }while (res.equals("y"));


    }
}
