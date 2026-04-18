package com.company;

public class square{
    public static void main(String[] args) {
        shapeSquare sq1= new shapeSquare();
        sq1.setLenght(5);
        System.out.println(sq1.area());
        System.out.println(sq1.perimeter());

        shapeRectangle sq2 = new shapeRectangle();
        sq2.setBreadth(3);
        sq2.setLenght(5);
        System.out.println(sq2.perimeter());
        System.out.println(sq2.area());



    }
}
class shapeSquare {
    int lenght;

    public int area(){
        return lenght * lenght;
    }

    public void setLenght(int l){
        lenght = l;
    }
    public int perimeter() {
        return 4 * lenght;
    }

}

class shapeRectangle {
    int lenght;
    int breadth;

    public int area(){
        return lenght * breadth;
    }

    public void setLenght(int l){
        lenght = l;
    }
    public void setBreadth(int b){
        breadth = b;
    }
    public int perimeter() {
        return 2 * (lenght + breadth);
    }

}