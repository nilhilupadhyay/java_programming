package com.company;
import java.util.*;
public class Solution_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Student[] std = new Student[4];
        for(int i = 0; i < 4; i++) {
            int a = sc.nextInt();
            sc.nextLine();
            String b = sc.nextLine();
            String c = sc.nextLine();
            char d = sc.next().charAt(0);
            std[i]= new Student(a,b,c,d);

        }



    }
}

class Student{
    private int r_no;
    private String name;
    private String subject;
    private char grade;


    public Student(int r_no, String name, String subject, char grade){
        this.r_no=r_no;
        this.name=name;
        this.subject=subject;
        this.grade=grade;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setGrade(char grade) {
        this.grade = grade;
    }

    public void setR_no(int r_no) {
        this.r_no = r_no;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public String getName() {
        return name;
    }

    public char getGrade() {
        return grade;
    }

    public int getR_no() {
        return r_no;
    }

    public String getSubject() {
        return subject;
    }
}