/* Find average of a number array between two limit numbers (except the two numbers)
 * Input
 * ---------------
 *  5
    1
    2
    3
    4
    5
 *  1
 *  4
 *
 * Output
 * ---------------
 * 2
 */
package com.company;
import java.util.*;
public class avg {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] a = new int[5];
        for (int i = 0; i < a.length; i++) {
            int no = sc.nextInt();
            a[i] = no;

        }
        int sum = 0;
        int count = 0;

        int firstNo = sc.nextInt();
        int secondNo = sc.nextInt();

        int fIndex=0;
        int lIndex=0;
        for (int i = 0; i < a.length; i++) {
            if (a[i]==firstNo){
                fIndex=i;
            }
            if (a[i]==secondNo){
                lIndex=i;
            }

        }
        for (int i = 0; i < 5; i++) {
            if (i>fIndex && i<lIndex && lIndex !=0){
                sum = sum + a[i];
                count++;

            }

        }
        if (count>0){
            System.out.println(sum/count);
        }
        else System.out.println("average in not possible");

    }



}
