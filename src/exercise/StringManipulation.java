package exercise;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class StringManipulation {


    public static void main(String[] args){

        System.out.println(removeDuplicates("pwwkew"));
    }

    public static String removeDuplicates(String str){

        if(str == null)
            return "";

        StringBuilder output = new StringBuilder();
        Set<Character> seen = new HashSet<>();

        for(var ch : str.toCharArray()){
            if(!seen.contains(ch)){
                seen.add(ch);
                output.append(ch);

            }
        }
        return output.toString();
    }

    public static char getMaxOccuringChar(String str){

//        Map<Character, Integer> frequencies = new HashMap<>();
//        for(var ch : str.toCharArray()){
//            if(frequencies.containsKey(ch))
//                frequencies.replace(ch, frequencies.get(ch) + 1);
//            else
//                frequencies.put(ch, 1);
//        }

return 'q';
    }
}
