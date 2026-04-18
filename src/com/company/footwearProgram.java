package com.company;
import java.util.*;
public class footwearProgram {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Footwear[] ft = new Footwear[5];

        for (int i = 0; i < 5; i++) {
            int a = sc.nextInt();
            sc.nextLine();
            String b = sc.nextLine();
            String c = sc.nextLine();
            int d = sc.nextInt();
            sc.nextLine();
            ft[i] = new Footwear(a, b, c, d);

        }
        String ftType;
        ftType = sc.nextLine();

        int count = getCountByType(ft, ftType);
        System.out.println(count);


    }

    public static int getCountByType(Footwear[] ft, String t) {
        String[] type = new String[ft.length];
        for (int i = 0; i < ft.length; i++) {
            if (ft[i].getFootwearType().equalsIgnoreCase(t)) {
                type[i] = ft[i].getFootwearType();
            }


        }
        int count=0;
        for(String i : type){
            if (i != null) {
                count++;

            }


        }


        if (count != 0) {
            return count;
        } else {
            return 0;
        }

    }
}
class Footwear{

    private int footwearID, price;
    private String footwearName, footwearType;



    public void setFootwearID(int footwearID) {
        this.footwearID = footwearID;
    }

    public int getFootwearID() {
        return footwearID;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getPrice() {
        return price;
    }

    public void setFootwearName(String footwearName) {
        this.footwearName = footwearName;
    }

    public String getFootwearName() {
        return footwearName;
    }

    public void setFootwearType(String footwearType) {
        this.footwearType = footwearType;
    }

    public String getFootwearType() {
        return footwearType;
    }


    public Footwear(int footwearID, String footwearName, String footwearType, int price){
        this.footwearID= footwearID;
        this.footwearName= footwearName;
        this.footwearType= footwearType;
        this.price= price;
    }

}
