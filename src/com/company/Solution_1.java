package com.company;
import java.util.*;

public class Solution_1 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);

        phone[] ph= new phone[4];
        for (int i = 0; i < ph.length; i++) {
            int a = sc.nextInt();
            sc.nextLine();
            String b = sc.nextLine();
            String c = sc.nextLine();
            int d = sc.nextInt(); sc.nextLine();
            ph[i]= new phone(a,b,c,d);

        }

        String ch= sc.nextLine();
        String bCh= sc.nextLine();
        int oPrice = findPriceForGivenBrand(ph,ch);
        phone oObject= getPhoneIdBasedOnOs(ph,bCh);

        if (oPrice > 0) {
            System.out.println(oPrice);

        }
        else System.out.println("The given Brand is not available");


        if (oObject != null) {
            System.out.println(oObject.getPhoneid());


        }
        else System.out.println("No phones are available with specified os and price range");





    }
    public static int findPriceForGivenBrand(phone[] ph, String ch){
        int sum =0;
        for (int i = 0; i < ph.length; i++) {
            if (ph[i].getBrand().equalsIgnoreCase(ch)){
                sum= sum+ph[i].getPrice();
            }


        }
        if (sum!=0){
            return sum;
        }
        else {
            return 0;
        }

    }
    public static phone getPhoneIdBasedOnOs(phone[] ph, String bCh){

        for (int i = 0; i < ph.length; i++) {
            if (ph[i].getOs().equalsIgnoreCase(bCh) && ph[i].getPrice()>=50000){
                return ph[i];




            }

        }
        return null;

    }
}
class phone{
    private int phoneid, price;
    private String os, brand;

    public phone(int phoneid, String os, String brand, int price){
        this.phoneid=phoneid;
        this.os=os;
        this.brand=brand;
        this.price=price;

    }

    public void setPhoneid(int phoneid) {
        this.phoneid = phoneid;
    }

    public void setOs(String os) {
        this.os = os;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setPrice(int price) {
        this.price = price;
    }


    //getter

    public int getPhoneid() {
        return phoneid;
    }

    public String getBrand() {
        return brand;
    }

    public int getPrice() {
        return price;
    }

    public String getOs() {
        return os;
    }
}