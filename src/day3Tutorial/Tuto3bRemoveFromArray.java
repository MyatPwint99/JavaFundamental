package day3Tutorial;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Tuto3bRemoveFromArray {
    public static void main(String[] args) {

        ArrayList<Integer> arr = new ArrayList<>(5);
        arr.add(25);
        arr.add(14);
        arr.add(56);
        arr.add(15);
        arr.add(36);

        for(int i=0; i<arr.size(); i++){
            System.out.print(arr.get(i)+" ");
        }

        System.out.println();

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a Number : ");
        int removeNum = sc.nextInt();

       for (int i=0; i<arr.size(); i++){
           if (arr.get(i) == removeNum){
               arr.remove(i);
           }
       }

        for(int i=0; i<arr.size(); i++){
            System.out.print(arr.get(i)+" ");
        }
        System.out.println();
        //Using Array
        // User Input numbers to remove a specific element from an array.

        String res;
        do {
            int[] arr2 = new int[5];
            System.out.println("Enter Numbers for Input: ");
            for (int i=0; i < arr2.length;i++){
                arr2[i]=sc.nextInt();
            }


            for(int i=0; i<arr2.length; i++){
                System.out.print(arr2[i]+" ");
            }

            System.out.println();

            System.out.print("Enter a Number : ");
            int removeNum2 = sc.nextInt();
            int c;
            for (int i=0; i<arr2.length; i++){
                c = arr2[i];
                if (c == removeNum2){
                    arr2[i] =0;
                    break;
                }
            }

            for(int i=0; i<arr2.length; i++){
                System.out.print(arr2[i]+" ");
            }

            System.out.println();
            System.out.print("Want to do again? (y/n) : ");
            res = sc.next();

        }while (res.equals("y"));

        //Using Array
        // User Input numbers to remove a specific element from an array.


    }
}
