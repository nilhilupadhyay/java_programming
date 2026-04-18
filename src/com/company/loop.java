package com.company;
import java.util.Scanner;

public class loop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int total=0;
        for ( int i = 0; i<= a; i++ ){
            ++total;
        }
        System.out.println(total);
    }
}
