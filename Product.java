package org.cap.demo;

import java.util.Scanner;
public class Product {
	
	String productName;
	int productId;
	int quantity;
	float price;
	float discount;
	float tax;
	
	public void getProductDetails()
	{
		Scanner scr=new Scanner(System.in);
		System.out.println("Enter product name");
		productName=scr.next();
		
		System.out.println("Enter product id");
		productId=scr.nextInt();

		System.out.println("Enter quantity");
		quantity=scr.nextInt();

		System.out.println("Enter price");
		price=scr.nextFloat();

		System.out.println("Enter discount");
		discount=scr.nextFloat();
		
		scr.close();
	}
	
	public float calculateTax()
	{
		if(discount>90)
		{
			tax=price/100;
		}
		else if(discount<=90 && discount>80)
		{
			tax=price*12/100;
		}
		else if(discount<=80 && discount>70)
		{
			tax=price*20/100;
		}
		else if(discount<=70 && discount>60)
		{
			tax=price*25/100;
		}
		else
		{
			tax=price*40/100;
		}
		
		return tax;
	}
	
	public float calculateDisc(float d,float p) {
		
		float discount=0;
		
		discount=p*d/100;
		
		return discount;
	}

	public static void finalPrice(float d,float p)
	{
		float q=p-d;
		System.out.println("Final price is: "+q);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
 		Product pro=new Product();
 		pro.getProductDetails();
 		pro.price=pro.price*pro.quantity;
 		pro.tax=pro.calculateTax();
 		pro.price=pro.price+pro.tax;
 		pro.discount=pro.calculateDisc(pro.discount,pro.price);
 		
 		finalPrice(pro.discount,pro.price);
 		
	}

}
