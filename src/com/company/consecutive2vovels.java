/*Count the number of words in a sentence that contain at least two consecutive vowels (a, e, i, o, u) in them.
Here's a sample input and output:

Input: I enjoy eating spaghetti and meatballs for dinner
Output: 2

Explanation: There are two words in the sentence that contain at least two consecutive vowels - "enjoy" and "meatballs".
 */
package com.company;
import java.util.*;


public class consecutive2vovels {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine().toLowerCase();
        String[] str = input.split(" ");
        int cout =0;
        for (int i = 0; i < str.length; i++) {
            for (int j = 0; j < str[i].length()-1; j++) {
                if (toCheck(str[i].charAt(j))==true && toCheck(str[i].charAt(j+1))==true  ){
                    cout++;
                    break;
                }

            }


        }
        System.out.println(cout);
    }
    public static boolean toCheck(char c){
        if (c=='a' || c=='e' || c=='i' || c=='o' || c=='u'){
            return true;
        }
        else {
            return false;
        }

    }

}
