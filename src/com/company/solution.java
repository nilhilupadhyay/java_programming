package com.company;
import java.util.*;

public class solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        hotel[] ht = new hotel[4];

        for (int i = 0; i < ht.length ; i++) {

            int a = sc.nextInt(); sc.nextLine();
            String b= sc.nextLine();
            String c = sc.nextLine();
            int d = sc.nextInt(); sc.nextLine();
            String e = sc.nextLine();
            double f = sc.nextDouble();sc.nextLine();

            ht[i]=new hotel(a,b,c,d,e,f);



        }

        String st= sc.nextLine();

        int result = totalNoOfRoomBooked(ht, st);

        if ( result > 0){
            System.out.println(result);
        }
        else {
            System.out.println("No such rooms booked");
        }







    }

    public static int totalNoOfRoomBooked(hotel[] ht, String st){
        int sum = 0;
        for (int i = 0; i < ht.length; i++) {

            if (ht[i].getCf().equalsIgnoreCase(st) & ht[i].getNoofroombk()>5){
                sum = sum + ht[i].getNoofroombk();
            }


        }

        if (sum > 0){
            return sum;
        }
        else {
            return 0;
        }
    }




}
class hotel{
    private int id, noofroombk;
    private double total;
    private String name, dob, cf;

    public hotel(int id, String name, String dob, int noofroombk, String cf, double total){
        this.id= id;
        this.name =name;
        this.dob=dob;
        this.noofroombk=noofroombk;
        this.cf=cf;
        this.total=total;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDob(String dob) {
        this.dob = dob;
    }

    public void setNoofroombk(int noofroombk) {
        this.noofroombk = noofroombk;
    }

    public void setCf(String cf) {
        this.cf = cf;
    }

    public void setTotal(double total) {
        this.total = total;
    }

    public int getId() {
        return id;
    }
    public String getName() {
        return name;
    }

    public String getDob() {
        return dob;
    }

    public int getNoofroombk() {
        return noofroombk;
    }

    public String getCf() {
        return cf;
    }

    public double getTotal() {
        return total;
    }
}
