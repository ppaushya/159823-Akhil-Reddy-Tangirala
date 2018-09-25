package org.cap.demo;

public class armstrong_assign_4_25 {
	
	public void isArmstrong()
	{
		int sum=0,temp=0,remain=0;
		for(int i=1;i<=1000;i++)
		{
			temp=i;
			while(temp>0)
			{
				remain=temp%10;
				sum=sum+(remain*remain*remain);
				temp=temp/10;
				
			}
			
			if(sum==i)
			{
				System.out.println(i);
			}
			
			sum=0;
		}
		
	
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		armstrong_assign_4_25 a=new armstrong_assign_4_25();
		a.isArmstrong();
	}

}
