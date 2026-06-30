package com.company;
import java.util.*;

public class armstrong2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String num= sc.nextLine();
        int sum=0;
        for (int i = 0; i <num.length(); i++) {
            sum+= Math.pow(Integer.parseInt(String.valueOf(num.charAt(i))),3);
        }
        if (sum==Integer.parseInt(num)) {
            System.out.println("its armstrong no.");
            
        }

    }

}
