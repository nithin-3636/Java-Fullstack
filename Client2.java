package com.lpu.client2;

import com.lpu.shape.Art;
import com.lpu.shape.CircleBasic;
import com.lpu.shape.Shape;
import com.lpu.shape.Triangle;
import com.lpu.shape.Triangle2;

public class Client2 {

	public static void main(String[] args) {
		CircleBasic cb = new CircleBasic(5,"MyCircle");
		Triangle tr = new Triangle(2, 3,"MyTriangle");
		
		Shape s = new CircleBasic(5,"MyCircle");
		Shape s2 =  new Triangle2(2, 3,"MyTriangle");
		Triangle t1 = new Triangle(2, 3,"MyTriangle");
		Triangle t2 = new Triangle(2, 3,"MyTriangle");		
		Art a = new Triangle2(2, 3,"MyTriangleArt");
		 a = new CircleBasic(5,"MyCircleArt");
		a = new Shape("ArtShape");
		
		
	
		
		System.out.println(s.getName());
		System.out.println(cb.getArea());
		
		System.out.println(s2.getName());
		System.out.println(tr.getArea());
		
		System.out.println(a.animate("fast"));
		// System.out.println(b.animate("slow"));
		

	}

}
