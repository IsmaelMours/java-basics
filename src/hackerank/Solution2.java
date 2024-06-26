package hackerank;

import java.util.Scanner;

public class Solution2 {

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        // Read input strings
        String s1 = scanner.nextLine().trim();
        String s2 = scanner.nextLine().trim();

        // Sum the lengths of s1 and s2
        int lengthSum = s1.length() + s2.length();
        System.out.println(lengthSum);

        // Determine if s1 is lexicographically greater than s2
        if (s1.compareTo(s2) > 0) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }

        // Capitalize the first letter in both s1 and s2
        String capitalizedS1 = capitalizeFirstLetter(s1);
        String capitalizedS2 = capitalizeFirstLetter(s2);
        System.out.println(capitalizedS1 + " " + capitalizedS2);

        // Close the Scanner
        scanner.close();
    }

    // Function to capitalize the first letter of a string
    private static String capitalizeFirstLetter(String s) {
        if (s == null || s.isEmpty()) {
            return s;
        }
        return Character.toUpperCase(s.charAt(0)) + s.substring(1);
    }
}
