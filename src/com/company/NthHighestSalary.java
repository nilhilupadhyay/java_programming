package com.company;

import java.util.*;

public class NthHighestSalary {

    public static int nthHighest(int[] salary, int n) {

        TreeSet<Integer> set = new TreeSet<>(Collections.reverseOrder());

        for (int s : salary) {
            set.add(s); // removes duplicates automatically
        }

        if (n > set.size()) {
            return -1;
        }

        int count = 1;

        for (int s : set) {
            if (count == n) {
                return s;
            }
            count++;
        }

        return -1;
    }

    public static void main(String[] args) {

        int[] salary = {3000, 2000, 5000, 4000, 5000};
        int n = 2;

        int result = nthHighest(salary, n);

        if (result != -1) {
            System.out.println(n + "th highest salary is: " + result);
        } else {
            System.out.println("Not enough unique salaries");
        }
    }
}