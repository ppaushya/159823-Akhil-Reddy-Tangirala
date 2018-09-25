package org.cap.demo;

import java.util.Scanner;


public class assign25 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scr=new Scanner(System.in);
		int digit,sum=0,temp=0,remain=0;
		System.out.println("Enter digit");
		digit=scr.nextInt();
		temp=digit;
		while(temp>0)
		{
			remain=temp%10;
			sum=sum+remain;
			temp=temp/10;
			
		}
		
		System.out.println("Sum of digit: "+sum);
	}

}
