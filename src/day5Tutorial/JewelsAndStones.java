package day5Tutorial;

import java.util.Scanner;

public class JewelsAndStones {
    public static void main(String[] args) {
        String jewels = "aA";
        String stones = "aAAbbbb";
        System.out.print("Input: ");
        System.out.print("Jewels = \'"+jewels+"\' ");
        System.out.print("Stones = \'"+stones+"\' ");
        System.out.println();
        System.out.println("Output: "+numJewelsInStones(jewels,stones));

        String jewels2 = "z";
        String stones2 = "ZZ";
        System.out.print("Input: Jewels = \'"+jewels2+"\' Stones = \'"+stones2+"\' ");
        System.out.println();
        System.out.println("Output: "+numJewelsInStones(jewels2,stones2));

        // User Input Jewels And Stones
        String res;

        do {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Jewels(At most 2 Characters): ");
        String jewels3 = sc.nextLine();
        System.out.print("Enter Stones(At most 50 Characters): ");
        String stones3 = sc.nextLine();

        if(jewels3.length() <= 2){
            if(stones3.length() <= 50){

                System.out.println("Output : "+numJewelsInStones(jewels3, stones3));
            }else {
                System.out.println("Stones must be at most 50 characters!");
            }
        }else {
            System.out.println("Jewels must be at most 2 characters!");
        }
            System.out.println();
            System.out.print("Want to do again? (y/n) : ");
            res = sc.next();

        }while (res.equals("y"));
    }
    public static int numJewelsInStones(String jewels, String stones) {

        int c=0;
        for(int i=0;i<jewels.length();i++){
            for(int j=0;j<stones.length();j++){
                if(jewels.charAt(i)==stones.charAt(j)){
                    c++;
                }
            }
        }
        return c;
    }
}
