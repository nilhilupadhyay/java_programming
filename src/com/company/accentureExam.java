package com.company;
import java.util.*;

public class accentureExam {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine().toLowerCase();

        StringBuilder output = new StringBuilder();
        int i = 0;
        while (i < input.length()){
            int count= 0;
            char current = input.charAt(i);
            while (i < input.length() && input.charAt(i)==current){
                count++;
                i++;

            }
            int position = current - 'a' + 1;
            output.append(current).append(position);
            if (count>1){
                output.append('*');
            }


        }
        System.out.println(output);


    }

}