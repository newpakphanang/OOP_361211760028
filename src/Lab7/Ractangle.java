package Lab7;

import java.awt.*;

public class Ractangle {
    //class attributes
    private double length;
    private double width;
    //constructor
    public Ractangle(){

    }
    public  Ractangle(double length,double width) {
        this.length = length;
        this.width = width;
    }
        public  double getLength() {
        return length;
    }

    public  void  setLength (double newlength){
        length = newlength;
    }
    public  double getWidth(){
        return  width;

    }
    public  void  setWidth (double newwidth){
        width = newwidth;
    }
    public double findRectangleArea(){
        return  length * width;//area
    }








}