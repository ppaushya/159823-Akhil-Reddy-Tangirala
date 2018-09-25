package org.cap.demo;
import java.util.Scanner;
public class pascaltriangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 
		
		int value= 1, space, i, j;
		
		System.out.println("enter the rows");
		Scanner scr=new Scanner(System.in);
		int rows=scr.nextInt();
		
		for(i=0; i<rows; i++)
	    {
	        for(space=1; space <= rows-i; space++)
	            System.out.print("  ");

	        for(j=0; j <= i; j++)
	        {
	            if (j==0 || i==0)
	                value= 1;
	            else
	                value = value*(i-j+1)/j;

	            System.out.print(" "+value+"  ");
	        }
	        System.out.print("\n");
	    }
		
	}
	


   

    

}
