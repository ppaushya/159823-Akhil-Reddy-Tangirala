import java.util.Scanner;


public class day4ques2 {

	public static void main(String[] args) {
Scanner scr=new Scanner(System.in);

System.out.println("enter string");

		String original = scr.next();
		int j = 0;
		char temp = 0;

		char[] chars = new char[original.length()];
		
		for(int i=0;i<original.length();i++)
		{
			chars[i]=original.charAt(i);
		}

		for (int i = 0; i < chars.length; i++) {

			for (j = 0; j < chars.length; j++) {

				if (chars[j] > chars[i]) {
					temp = chars[i];
					chars[i] = chars[j];
					chars[j] = temp;
				}

			}

		}

		for (int k = 0; k < chars.length; k++) {
			System.out.print(chars[k]);
		}

	}
}