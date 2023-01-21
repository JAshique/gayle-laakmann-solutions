package topics.arraystrings;

import java.util.Scanner;
/*
 * 1.5 Assume a string s1 went through a string operation and stored as s2.
 * Given 2 strings, check if one string is one edit away from the other string.
 * 
 * Time/Space Complexity: O(n) where n is the length of the smallest string.
 * 
 * Note: It is assumed that the input strings are case sensitive.
 * 
 * @author JAshique
 */
public class OneAway {
    
    public static void main (String[] args) {

        Scanner scn = new Scanner(System.in);
        System.out.println("Enter String 1: ");
        final String s1 = scn.nextLine();
        System.out.println("Enter String 2: ");
        final String s2 = scn.nextLine();
        scn.close();
        final boolean result = isOneEdit(s1, s2);
        System.out.println("String 1 is one edit away from s2: " + result);
    }

    /*
     * Find if 2 strings have only a difference of one edit.
     * 
     * @param string1 {@link String}
     * @param string2 {@link String}
     * 
     * @return {@link Boolean}
     */
    private static boolean isOneEdit(final String string1, final String string2) {

        // If both strings are identical, then there is no edits done. Hence we return false.
        if(string1.equals(string2)) {
            return Boolean.FALSE;
        }
        // Length check incase of an insert operation. 
        if((string1.length() - string2.length()) > 1) {
            return Boolean.FALSE;
        }
        int index1 = 0, index2 = 0;
        boolean oneEdit = false;
        // Identify small(s1) and large(s2) string
        final String s1 = string1.length() < string2.length() ? string1: string2;
        final String s2 = string1.length() < string2.length() ? string2: string1;

        while(index2 < s2.length() && index1 < s1.length()) {
            if(s1.charAt(index1) != s2.charAt(index2)) {
                if(oneEdit) {
                    return Boolean.FALSE;
                }
                // counter is set to true since we detect a change. This will show help us detect another edit.
                oneEdit = Boolean.TRUE;
                // Increment index if operation is a replace
                if(s1.length() == s2.length()) {
                    index1++;
                }
            }
            else {
                index1++;
            }
            // index2 is incremented always at each iteration.
            index2++;
        }
        return Boolean.TRUE;
    }
}
