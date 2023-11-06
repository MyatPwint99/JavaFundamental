package day3Tutorial;

import java.util.ArrayList;
import java.util.Objects;
import java.util.Scanner;

public class Tuto3cConvertArrayListToArray {
    public static void main(String[] args) {
        // To convert an ArrayList to an array.
        ArrayList<String> arr = new ArrayList<String>();
        arr.add("Python");
        arr.add("JAVA");
        arr.add("PHP");
        arr.add("Perl");
        arr.add("C#");

        System.out.print("ArrayList : ");
        for (int i=0; i<arr.size(); i++){
            System.out.print(arr.get(i)+" ");
        }
        System.out.println();
        Object[] newArr = arr.toArray();

        System.out.print("ArrayList to Array : ");
        for (Object obj:newArr){
            System.out.print(obj+" ");
        }
        System.out.println();

        // User Input

        String res;

        do {

            Scanner sc = new Scanner(System.in);
            ArrayList<String> arr2 = new ArrayList<String>();
            System.out.println("Enter Word for Collection : ");

            for (int i=1; i <= 5;i++){
                arr2.add(sc.next());
            }
            System.out.print("ArrayList : ");
            for (int i=0; i < 5; i++){
                System.out.print(arr2.get(i)+" ");
            }
            System.out.println();
            Object[] newArr2 = arr2.toArray();

            System.out.print("ArrayList to Array : ");
            for (Object obj:newArr2){
                System.out.print(obj+" ");
            }

            System.out.println();
            System.out.print("Want to do again? (y/n) : ");
            res = sc.next();

        }while (res.equals("y"));
        }
    }

