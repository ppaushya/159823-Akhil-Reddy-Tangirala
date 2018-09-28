import java.util.Scanner;
public class day4ques5 {

	public String ReverseOrder(String str)
	{
		char[] ch=new char[str.length()];
		
		for(int i=0;i<str.length();i++)
		{
			ch[i]=str.charAt(i);
		}
		
		int i=0;
		int j=ch.length-1;
		while(i<j)
		{
			char temp;
			temp=ch[i];
			ch[i]=ch[j];
			ch[j]=temp;
			
			i++;
			j--;
		}
		
		
        String st = new String(ch); 
        return st; 
		
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
			
		String str;
		
		Scanner scr=new Scanner(System.in);
		day4ques5 q=new day4ques5();
		System.out.println("Enter the string");
		
		str=scr.nextLine();
		q.ReverseOrder(str);
		
		
		System.out.println(q.ReverseOrder(str));

	}

}