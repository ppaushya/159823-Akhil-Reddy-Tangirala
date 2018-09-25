package org.cap.demo;

import java.util.Scanner;

public class assign25_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scr=new Scanner(System.in);
		int num;
		System.out.println("Enter the number");
		num=scr.nextInt();
		int n=0;
		while(num>n) {
		for(int i=1+n;i<=6+n;i++)
		{
			if(i%2!=0)
			{
				System.out.print(i+ " ");
				
			}
			
		}
		
		
		for(int i=1+n;i<=6+n;i++)
		{
			if(i%2==0)
			{
				System.out.print(i+ " ");
				
			}
			
		}
		
		n=n+6;
		
	}
		
		
	}

}
