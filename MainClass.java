package org.cap.demo;

import java.util.Scanner;


public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int num=1,sum=0,count=5;
		while(num<=100)
		{
			
			
			if(num%2==0)
			{
				System.out.print(num+" ");
				sum=sum+num;
				count--;
			}
			
			if(count==0)
			{
				count=5;
				System.out.println();
			}
		
			
			num++;
		}
		
		System.out.println(sum);
		
	}

}
