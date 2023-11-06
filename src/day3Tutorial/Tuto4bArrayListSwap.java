package day3Tutorial;

import java.util.ArrayList;
import java.util.Scanner;

public class Tuto4bArrayListSwap {
    public static void main(String[] args) {
        ArrayList<String> arr = new ArrayList<String>();
        arr.add("Red");
        arr.add("Green");
        arr.add("Black");
        arr.add("White");
        arr.add("Pink");
        String temp;

        System.out.println(arr+" ");

        for (int i = 0; i<arr.size() ; i++){
            temp = arr.get(i);
            for (int j = 1; j<arr.size(); j++) {
                if (arr.get(j).equals("Black")) {

                arr.set(i,arr.get(j));
                arr.set(j,temp);

                }
            }
        }

        System.out.println(arr+" ");

        // User Input Two Color to Swap

        String res;

        do {

            String temp2;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Two Color That You Want To Swap: ");
        String firstColor = sc.next();
        String secondColor = sc.next();

        for (int i = 0; i<arr.size() ; i++){
            if (arr.get(i).equals(firstColor) || arr.get(i).equals(secondColor)) {
                temp2 = arr.get(i);

                for (int j = 1; j < arr.size(); j++) {
                    if (firstColor != secondColor) {
                        if (arr.get(j).equals(secondColor) || arr.get(j).equals(firstColor)) {

                            arr.set(i, arr.get(j));
                            arr.set(j, temp2);
                            break;
                        }
                    }
                }
            }

        }
        System.out.println(arr+" ");
            System.out.println();
            System.out.print("Want to do again? (y/n) : ");
            res = sc.next();

        }while (res.equals("y"));
    }
}
