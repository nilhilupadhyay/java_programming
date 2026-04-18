package com.company;
import java.util.*;
public class twodarray {
    public static void main(String[] args) {
        int [][] array;
        array = new int[3][3];
        array[0][0]= 400;
        array[0][1]= 1100;
        array[0][2]= 100;
        array[1][0]= 200;
        array[1][1]= 0;
        array[1][2]= 300;
        array[2][0]= 900;
        array[2][1]= 250;
        array[2][2]= 150;
        int max= array[0][0];
        System.out.println(array.length);

        for(int i =0; i< array.length;i++){

            for (int j=0; j< array.length; j++){
                System.out.println(array[i][j]);
                if(array[i][j] > max){
                 max=array[i][j];
                }

            }

        }
        array[1][1]= max;
        System.out.println(array[1][1]);
    }
}
