import java.util.Scanner;

public class day4ques7 {

	public void  LongestWord(String str)
	{
		int i,j;
		
		
		
		char st[]=new char[str.length()];
		
		int count=0;
		
		for(i=0;i<str.length();i++)
		{
			st[i]=str.charAt(i);
			//System.out.println(st[i]);
			
			if(st[i]==' ')
			{
				count++;
			}
			
		}
		//System.out.println(count);
		int arr[]=new int[count+1];
		 count=0;
		 
		 int k=0;
		
		for(i=0;i<str.length();i++)
		{
			  if(st[i]!=' ')
			  {
				  count++;
			  }
			  else
			  {
				  arr[k]=count;
				  count=0;
				  k++;
			  }
		}
		
		arr[k]=count;
		
		int max=arr[0];
		
		for(i=1;i<arr.length;i++)
		{
			 if(max<arr[i])
			 {
				 max=arr[i];
			 }
		}
		
		System.out.println("max is " +max);
		
		char output[]=new char[st.length];
		
		count=0;
		
		k=0;
		
		for(i=0;i<st.length;i++)
		{
			 if(st[i]!=' ')
			 {
				 count++;
				 output[k]=st[i];
				 k++;
			 }
			 else
			 {
				 if(count==max)
				 {
					 for(j=0;j<max;j++)
					 {
						 System.out.print(output[j]);
					 }
				 }
				 else
				 {
					 count=0;
					 k=0;
				 }
				 
			 }
			 
		}
		

		 if(count==max)
		 {
			 for(j=0;j<max;j++)
			 {
				 System.out.print(output[j]);
			 }
		 }
		
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
      Scanner s =new Scanner(System.in);
      
      String str;
      
      System.out.println("Enter string");
      str=s.nextLine();
      
      day4ques7 obj=new day4ques7();
      
      obj.LongestWord(str);
      
      
	}

}