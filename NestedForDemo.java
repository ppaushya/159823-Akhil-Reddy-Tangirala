package org.cap.demo;

public class NestedForDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		int count=0;
//		for(int i=0;i<10;i++)
//		{
//			for(int j=0;j<10;j++)
//			{
//				count++;
//			}
//		}
//		
//		System.out.println(count);

		for(int i=0;i<=5;i++)
		{
			for(int j=0;j<=i;j++)
			{
				System.out.print("*\t");
			}
			
			System.out.println();
		}
		
	}

}












