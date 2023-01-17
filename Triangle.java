package com.lpu.shape;

public class Triangle extends Shape {
private double base;
private double height;

public Triangle(double b ,double h, String name){
super(name);
this.base=b;
this.height=h;
}

public double getArea(){
return 0.5*base*height;

}