package org.cap.demo;

import java.util.Scanner;


public class Testpattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int num=1,sum=0,count=5,gap=0;
		while(num<=50)
		{
			
			
			if(num%2==0)
			{
				if(gap==0) {
				System.out.print(num+" ");
				
				count--;
				}
				else
				{
					System.out.print(" * ");
					count--;
				}
				
				gap++;
				
				if(gap==6)
					gap=0;
			}
			
			if(count==0)
			{
				count=5;
				System.out.println();
			}
		
			
			num++;
		}
		
		num=52;
		gap=0;
		
		while(num >= 52 && num<=100)
		{
			
			
			if(num%2==0)
			{
				if(gap==0) {
				System.out.print(num+" ");
				
				count--;
				}
				else
				{
					System.out.print(" * ");
					count--;
				}
				
				gap++;
				
				if(gap==6)
					gap=0;
			}
			
			if(count==0)
			{
				count=5;
				System.out.println();
			}
		
			
			num++;
		}
		

		
	}

}
