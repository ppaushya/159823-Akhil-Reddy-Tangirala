import java.util.Scanner;
public class day5ques_1 {

	
	public void findprimefraction(int num)
	{
		for(int i=2;i<=num;i++)
		{
			if(num%i==0)
			{
				int count=0;
				for(int k=1;k<=i;k++)
				{
					if(i%k==0)
					{
						count++;
					}
				}
				
				if(count==2)
				{
					System.out.println(i);
				}
				
				findprimefraction(num/i);
				break;
			}
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generate1d method stub
		Scanner scr=new Scanner(System.in);
		System.out.println("Enter the number");
		int num=scr.nextInt();
		day5ques_1 q=new day5ques_1();
		q.findprimefraction(num);
		
	}

}
