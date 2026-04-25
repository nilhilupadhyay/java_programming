/* Find occurance of a character in a string
    Input
    --------------
 *  Priyanka
 *  a

 *  Output
    ----------------
 *  2
 */



package com.company;
import java.util.Scanner;
public class charCounter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.nextLine();
        String b = sc.nextLine();
        char c = b.charAt(0);
        int l = a.length();
        int count = 0;
        for (int i = 0; i<l; i++){
            if (Character.toLowerCase(a.charAt(i))==Character.toLowerCase(c)){
                count++;
            }
        }
        System.out.println(count);


    }
}
