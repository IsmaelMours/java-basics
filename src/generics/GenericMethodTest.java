package generics;

public class GenericMethodTest {

    //generic method printArray

    public static <E> void printArray(E[] inputArray) {
        for(E element : inputArray){
            System.out.printf("%s ", element);
        }
        System.out.println();
    }
}
