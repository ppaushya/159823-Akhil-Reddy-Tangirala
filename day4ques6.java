import java.util.Scanner;
public class day4ques6 {
	
	public int findFactorial(int num)
	{
		if(num==1)
		{
			return 1;
		}
		return num*findFactorial(num-1);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scr=new Scanner(System.in);
		
		System.out.println("Enter the number");
		int num=scr.nextInt();
		
		day4ques6 f=new day4ques6();
		
		int result=f.findFactorial(num);
		System.out.println(result);
	}

}