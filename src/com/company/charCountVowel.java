/* Count the words in a sentence which are start with vowel.
 *
 * Input: Arijit is student of  MCA
 * Output: 3
 *
 * Input: Sara plays tennis
 * Output: No such words
 */
package com.company;
import java.util.Scanner;


public class charCountVowel {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine().toLowerCase();
        int count =0;
        if (toCheckVowel(str.charAt(0))==true){
            count++;
        }
        for (int i = 1; i < str.length() ; i++) {

            if(str.charAt(i-1)==' ' && toCheckVowel(str.charAt(i))==true){
                count++;
            }

        }
        if(count>0){
            System.out.println(count);
        }
        else{
            System.out.println("No such words");
        }

    }
    public static boolean toCheckVowel(char c){
        if (c=='a' || c=='e' || c=='i' || c=='o' || c=='u'){
            return true;
        }
        else {
            return false;
        }

    }
}
