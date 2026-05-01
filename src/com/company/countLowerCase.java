/* Find number of lower case in a string
 * AriJIt = 3
 */
package com.company;
import java.util.Scanner;

public class countLowerCase {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        int count=0;
        for (int i = 0; i < str.length(); i++) {
            /*if (str.charAt(i)>=97 && str.charAt(i)<122){
                count++;
            }*/
            if (Character.isLowerCase(str.charAt(i))){
                count++;
            }

        }
        System.out.println(count);

    }
}
