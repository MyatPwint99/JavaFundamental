package day3Tutorial;

import java.util.ArrayList;
import java.util.Scanner;

public class Tuto4aArrayListToAddToPrint {
    public static void main(String[] args) {
        // To Add ArrayList To Print
        String res;

      do {
          Scanner sc = new Scanner(System.in);
          ArrayList<String> arr = new ArrayList<String>();
          System.out.println("Enter Word for Collection : ");

         for (int i=1; i <= 5;i++){
              arr.add(sc.next());
          }

          for (int i=0; i<arr.size(); i++){
                System.out.print(arr.get(i)+"  ");
          }

          System.out.println();
          System.out.print("Want to do again? (y/n) : ");
          res = sc.next();

      }while (res.equals("y"));
    }
}
