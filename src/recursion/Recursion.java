package recursion;

import java.util.Scanner;

public class Recursion {

    public static void main(String[] args){


        Scanner in = new Scanner(System.in);
        System.out.println("Enter a factorial number");
        int num = in.nextInt();
        int calFactorial = factorial(num);

        System.out.println("Factorial num of " +num+ " is "+ calFactorial);

    }

    public  static int factorial(int n){

        if(n == 0)
            return 1;
        return n * factorial(n-1);
    }

}
