package com.company;
import java.util.*;
public class solution2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        resort[] rt = new resort[4];
        for (int i = 0; i < rt.length; i++) {
            int a = sc.nextInt();sc.nextLine();
            String b = sc.nextLine();
            String c = sc.nextLine();
            double d =sc.nextDouble();
            double e = sc.nextDouble();sc.nextLine();
            rt[i]= new resort(a,b,c,d,e);

        }
        String check = sc.nextLine();
        double m = findAvgPrice(rt,check);
        if (m!=0){
            System.out.println("The average price of "+check+" :"+(int)m);
        }
        else {
            System.out.println("No scuh Resort found");
        }

    }
    public static double findAvgPrice(resort[] rt, String check){
        double sum=0;
        int count =0;
        for (int i = 0; i < rt.length ; i++) {
            if (rt[i].getCategory().equalsIgnoreCase(check)){
                if (rt[i].getRating()>4){
                    sum=sum + rt[i].getPrice();
                    count++;
                }
            }

        }
        if(count>0){
            return sum/count;
        }
        else {
            return 0;
        }




    }





}
class resort{
    private int id;
    private String name, category;
    private double price, rating;

    public resort(int id, String name, String category, double price, double rating){
        this.id=id;
        this.name= name;
        this.category=category;
        this.price=price;
        this.rating=rating;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setRating(double rating) {
        this.rating = rating;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getCategory() {
        return category;
    }

    public double getPrice() {
        return price;
    }

    public double getRating() {
        return rating;
    }
}