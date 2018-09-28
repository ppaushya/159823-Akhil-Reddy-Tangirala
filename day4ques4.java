import java.util.Scanner;

public class day4ques4 {

	public void  LetterChanges(String str)
	{
		int i,j;
		
		char temp[]=new char[str.length()];
		
		for(i=0;i<str.length();i++)
		{
		  temp[i]=str.charAt(i);	
		}
		
	//	String replaceString=str.replace('a',);
	
	  for(i=0;i<str.length();i++)
	  {
	      temp[i]=(char)(temp[i]+1);
	     
	      
	      if(temp[i]=='e' || temp[i]=='a' || temp[i]=='i' || temp[i]=='o' || temp[i]=='u')
	      {
	          temp[i]=(char)(temp[i]-32);
	      }
	      System.out.print(temp[i]); 
	      
	  }

     
		
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		day4ques4 q=new day4ques4();
		
		Scanner s=new Scanner(System.in);
		
		String str;
		
		str=s.nextLine();
		
		 q.LetterChanges(str);
	}

}