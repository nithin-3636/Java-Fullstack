package com.lpu;
import java.util.*;
public class Array2D 
{
	Scanner sc = new Scanner(System.in);
    public int arr[][];
    public int m,n;
    /*Array2D()
    {
    	m=0;
    	n=0;
    }*/
    public void create()
    {
        int i,j;
        System.out.print("\n M=");
        m= sc.nextInt();
        System.out.print("\n N=");
        n= sc.nextInt();
        arr =new int[m][n];
        for(i=0;i<m;i++)
        {
            for(j=0;j<n;j++)
            {
                System.out.print("\n Enter the value ("+i+","+j+") cell ");
                arr[i][j]=sc.nextInt();
            }
        }
    }

    public void display()
    {
        int i,j;
        for(i=0;i<m;i++)
        {
            for(j=0;j<n;j++)
                System.out.print(arr[i][j]+"\t");
            System.out.println();
        }
    }
    public static void main(String args[])
    {
    	
    	Array2D obj = new Array2D();
    	obj.create();
    	obj.display();
    }

}