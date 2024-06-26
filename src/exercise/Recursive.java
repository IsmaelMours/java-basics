package exercise;

import java.util.Scanner;

public class Recursive {

    public static void main(String[] args){

        Scanner input = new Scanner(System.in);

        int n = input.nextInt();


//            int  results = factorial(n);
//            System.out.println(results);

//          int  results = sum(n);
//           System.out.println(results);

        int  results = fibonacci(n);
        System.out.println(results);

    }

    public static int factorial(int n){
        if(n==0)
            return 1;
        return n * factorial(n-1);
    }

    public static int sum(int n){
        if(n < 0)
            return 1;
        return n + sum(n - 1);
    }

    public static int fibonacci(int n){
        if(n == 0){
            return 0;
        } else if (n == 1) {
            return 1;
        }

        return fibonacci(n-1) + fibonacci(n-2);
    }

    public static boolean isPalindrome(String str){

        if(str.length() <= 1)
        {
            return true;
        }

        char firstLetter = str.charAt(0);
        char lastLetter = str.charAt(str.length() -1);

        if(firstLetter != lastLetter)
        {
            return false;
        }

        String remainingString = str.substring(1, str.length() - 1);

        return  isPalindrome(remainingString);
    }
}
