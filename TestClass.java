package org.cap.demo;

public class TestClass {

	public void testIf(int num)
	{
		if(num>0)
		{
			System.out.println("Positive");
			if(num%2==0)
			{
				System.out.println("even");
			}
		}
		else if(num==0)
		{
			System.out.println("zero");
		}
		else
		{
			System.out.println("negative");
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TestClass class1=new TestClass();
		
		class1.testIf(12);
	}

}
