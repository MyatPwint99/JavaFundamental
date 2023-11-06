package day3Tutorial;

import java.util.*;

public class Tuto5RockPaperScissors {
    public static void main(String[] args)
    {
        introduction();
        Game();
    }
    public static void introduction() {

        System.out.println("Do you want to play Rock Paper Scissors Game ");
        System.out.println(" 'Rock'     : 0");
        System.out.println(" 'Paper'    : 1");
        System.out.println(" 'Scissors' : 2");
    }
    public static void Game() {

        Scanner sc = new Scanner(System.in);
        Random random = new Random();

        System.out.print("Please Enter ( 0, 1, 2 ): ");

        int user = sc.nextInt();

        int com = random.nextInt(3);



        if(user >= 0 && user < 3) {
            if(com == 0) {
                if (user == 0) {
                    System.out.println("Com : Rock vs. User : Rock, ITS A TIE!");
                } else if (user == 1) {
                    System.out.println("Com : Rock vs. User : Paper! You win!");
                } else if (user == 2) {
                    System.out.println("Com : Rock vs. User : Scissors! You lose!");
                }

            } else if(com == 1) {
                if(user == 0)
                {
                    System.out.println("Com : Paper vs. User : Rock! You lose!");
                } else if(user == 1)
                {
                    System.out.println("Com : Paper vs. User : Paper! Its a tie!");
                } else if(user == 2) {
                    System.out.println("Com : Paper vs. User : Scissors! You win!");
                }

            } else if(com == 2) {
                    if(user == 0)
                    {
                        System.out.println("Com : Scissors vs. User : Rock! You win!");
                    } else if(user == 1)
                    {
                        System.out.println("Com : Scissors vs. User : Paper, You lose!");
                    } else if(user == 2)
                    {
                        System.out.println("Com : Scissors vs User : Scissors! Its a tie!");
                    }

            }
        }else {
            System.out.println("User must enter 0 , 1 , 2");
        }
      }
    }



