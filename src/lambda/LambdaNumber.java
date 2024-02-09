package lambda;

import java.util.ArrayList;

public class LambdaNumber {

    public void printNumbers(){

        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(5);
        numbers.add(9);
        numbers.add(8);
        numbers.add(1);

        numbers.forEach((n)->{System.out.println(n);});
    }
}
