package topics.arraystrings;
import java.util.Scanner;
/*
 *  1.1 Implement an algorithm to determine if a string has unique characters.
 * 
 *  Time/Space Complexity: O(n) where n is the length of the i/p string.
 * 
 *  Note: 1. It is assumed that lowercase & uppercase characters are the same, hence
 *           converting the i/p string to lowercase.
 *        2. It is also assumed that there is no upper/lower limit for the length of
 *           the string
 *        3. If additional data structures should be avoided, then we can do a linear
 *           search for each character in the string. 
 *           Time Complexity: O(n^2) Space Complexity: O(1)
 * 
 * @author JAshique
 */
public class isUnique {
    public static void main(String[] args) {
        //get input string
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter input string to process: ");
        final String input = scn.nextLine();
        scn.close();
        System.out.println("The String " + "\"" + input + "\"" + " is unique: " + ifUnique(input));
    }

    /*
     * checks if a string is unique or not.
     * 
     * @param input {@link String}
     * @return boolean
     */
    private static boolean ifUnique(final String input) {
        boolean[] uniqueVal = new boolean[128];

        //converting to lowercase to avoid duplicates via uppercase/lowecase characters
        //remove whitespaces as well
        final String lowerVal = input.toLowerCase().replaceAll(" ", "");
        for(int i=0; i<lowerVal.length(); i++) {
            int val = lowerVal.charAt(i);
            if(uniqueVal[val]) {
                return false;
            }
            uniqueVal[val] = true;
        }
        return true;
    }
}
