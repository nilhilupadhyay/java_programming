/* Find the characters in odd position of a string which are consonent
 *
 * Input: Arijit Ghosh
 * Output: hs
 */

package com.company;
import java.util.Scanner;

public class consonant {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine().toLowerCase();


        int count=0;
        for (int i = 0; i < str.length(); i++) {
            if (!toCheck(str.charAt(i)) && (i+1)%2!=0) {

                System.out.print(str.charAt(i));
            }

        }







    }
    public static boolean toCheck(char c){
        if (c=='a' || c=='e' || c=='i' || c=='o' || c=='u' || c==' '){
            return true;
        }
        else {
            return false;
        }
    }
}
