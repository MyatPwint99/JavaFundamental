public class Main {
    public static void main(String[] args){

        /* Using ForLoop */

        for(int i = 1; i <= 100 ; i++ ){
            if(i % 3 == 0 && i % 5 == 0) {
                System.out.println("FizzBuzz");
            } else if (i % 3 == 0) {
                System.out.println("Fizz");
            }else if (i % 5 == 0) {
                System.out.println("Buzz");
            }else {
                System.out.println(i);
            }
        }

        /* Using WhileLoop */

//        int j = 1;
//        while (j<=30){
//            if(j % 3 == 0 && j % 5 == 0) {
//                System.out.println("FizzBuzz");
//            } else if (j % 3 == 0) {
//                System.out.println("Fizz");
//            }else if (j % 5 == 0) {
//                System.out.println("Buzz");
//            }else {
//                System.out.println(j);
//            }
//            j++;
//        }

        /* Using DoWhileLoop */

//                int k = 1;
//        do{
//            if(k % 3 == 0 && k % 5 == 0) {
//                System.out.println("FizzBuzz");
//            } else if (k % 3 == 0) {
//                System.out.println("Fizz");
//            }else if (k % 5 == 0) {
//                System.out.println("Buzz");
//            }else {
//                System.out.println(k);
//            }
//            k++;
//        }while (k<=30);

        }
    }

