package topics.arraystrings;

import java.util.Arrays;
import java.util.Scanner;

/*
 * 1.2 Given 2 strings, check if one is a permutation of another.
 * 
 * Time Complexity = O(n log n) where n is the length of the String.
 * Space Complexity = O(n) where n is the length of the String.
 * 
 * @author JAshique
 */
public class checkPermutation {
    
    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);
        System.out.println("Enter the first String: ");
        final String s1 = scn.nextLine().replaceAll(" ", "");
        System.out.println("Enter the second String: ");
        final String s2 = scn.nextLine().replaceAll(" ", "");
        scn.close();
        boolean result = isValidPermutation(s1, s2);
        System.out.println("The statement \"String 1 is a permutation of String 2\" is " + result);
    }

    /*
     * sort characters in a string.
     * 
     * @param s {@link String}
     * @return string instance of charString {@link String}
     */
    private static String sortString(final String s) {
        char[] charString = s.toCharArray();
        Arrays.sort(charString);
        return new String(charString);
    }

    /*
     * check if s1 is a permutation of  s2.
     * 
     * @param s1 {@link String}
     * @param s2 {@link String}
     * @return {@link Boolean}
     */
    private static boolean isValidPermutation(final String s1, final String s2) {

        if(s1.length() != s2.length()) {
            return Boolean.FALSE;
        }
        //It is assumed that both strings are case insensitive.
        return sortString(s1).equalsIgnoreCase(sortString(s2));
    }
}
