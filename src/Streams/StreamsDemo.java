package Streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamsDemo {
    public static void main(String[] args) {

//        // using map
//        List<Integer> numbers = Arrays.asList(2, 3, 4, 5);
//
//        List<Integer> squares = numbers.stream()
//                .map(x -> x * x)
//                .collect(Collectors.toList());
//
//        System.out.println(squares);
//
//        // using filter
//        List<String> names = Arrays.asList("Ismael", "Robert", "Bradley");
//
//        names.stream().filter(s->s.startsWith("m")).collect(Collectors.toList());
//
//        System.out.println(names);
//
//        // using sorted
//
//        List<String> name = Arrays.asList("Ismael", "Robert", "Bradley");
//
//        name.stream().sorted().collect(Collectors.toList());
//        System.out.println(names);


        Stream<Integer> stream = Stream.of(1,2,3,4,5,6);
        stream.forEach(n->System.out.println(n));
    }
}