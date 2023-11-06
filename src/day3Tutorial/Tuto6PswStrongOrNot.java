package day3Tutorial;

import com.sun.tools.javac.Main;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Tuto6PswStrongOrNot {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        // User Input Number's Pattern

        String res;
        do {
        System.out.print("Enter New Password : ");
        String password = sc.next();
        boolean hasLetter = false;
        boolean hasCapital = false;
        boolean hasSmall = false;
        boolean hasSpChar = false;
        String specialCharacters=" !#$%&'()*+,-./:;<=>?@[]^_`{|}~";
        String str2[]=password.split("");

        if(password.length()>8){
            for (int i = 0; i < password.length(); i++) {
                char x = password.charAt(i);
                if (Character.isLetter(x)) {

                    hasLetter = true;
                }

                if (Character.isUpperCase(x)) {

                    hasCapital = true;
                }
                if (Character.isLowerCase(x)) {

                    hasSmall = true;
                }

                if(hasLetter  && hasCapital && hasSmall) {

                    break;
                }
            }
            for (int i=0;i<str2.length;i++)
            {
                if (specialCharacters.contains(str2[i]))
                {
                    hasSpChar = true;
                    break;
                }
            }

            if (hasLetter  && hasCapital && hasSmall && hasSpChar) {
                System.out.println("Password is Strong.");
            }else {
                System.out.println("Password is Not Strong.");
                System.out.println("Has Capital? "+hasCapital);
                System.out.println("Has Small? "+hasSmall);
                System.out.println("Has Letter? "+hasLetter);
                System.out.println("Has SpecialCharacter? "+hasSpChar);
            }
            }else {
            System.out.println("Password is Not Strong.Less than 8 Characters");
        }

            System.out.println();
            System.out.print("Want to do again? (y/n) : ");
            res = sc.next();

        }while (res.equals("y"));
    }
}
