package org.cap.demo;

public class pattern2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			for(int i=4;i>=0;i--)
			{
				int space=4-i;
				while(space!=0)
				{
					System.out.print("\t");
					space--;
				}
			    for(int j=0;j<i;j++) {
				System.out.print("*\t");
			}
			    
			    System.out.println();
	}
	}

}
