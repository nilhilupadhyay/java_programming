package com.company;
/* Count number of even digit in a number
 * If the count greater than or equal to 3, then print "True" otherwise "False"
 */
import java.util.*;
public class checkeven {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int count =0;
        while (a!=0){
            int digit = a%10;
            a=a/10;
            if (digit%2==0){
                count++;
            }

        }
        if (count>=3){
            System.out.println("True");
        }
        else System.out.println("False");
    }
    
    
    
    

}
