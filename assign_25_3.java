package org.cap.demo;


public class assign_25_3 {

	public void isPrime()
	{
		int count=0;
		for(int i=2;i<=1000;i++)
		{
			for(int j=1;j<=i;j++)
			{
				if(i%j==0)
				{
					count++;
				}
				
			}
			
			if(count==2)
			{
				System.out.println(i);

			}
			
			count=0;
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		
		assign_25_3 b=new assign_25_3();
		b.isPrime();
		
	}

}
