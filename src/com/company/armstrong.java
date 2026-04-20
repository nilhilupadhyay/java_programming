/*Write a Java program to check if a given number is an Armstrong number or not.

Here's an example of the expected input and output:

Input number: 153
Output: "Yes, the number is an Armstrong number."

*/
package com.company;
import java.util.*;
public class armstrong {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b =a;
        int sum=0;
        int count =0;
        int r = a;
        while (r>0){

            r=r/10;
            count++;
        }
        while (a>0){
            int digit = a%10;
            sum = (int) (sum + Math.pow(digit,count));

            a=a/10;

        }
        if (sum==b){
            System.out.println("Yes, the number is an Armstrong number.");
        }
        else {
            System.out.println("Not an Armstrong number");
        }

    }
}
