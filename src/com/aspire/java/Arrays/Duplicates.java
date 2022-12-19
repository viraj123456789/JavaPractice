package com.aspire.java.Arrays;

public class Duplicates 
{
	public static void main(String[] args) 
	{
		int [] a = {1,2,3,4,1,2,3,4};
		int count = 0;
		
		for(int i=0; i<a.length; i++ )
		{
			for(int j=i; j<a.length; j++)
			{
				if (a[i]==a[j] && i!=j)
				{
					System.out.print(a[i] + ", ");
					count++;
				}
			}
		}
		System.out.println();
		System.out.println("Count of duplicate numbers ="+count);
//		
		
		
		
		
		  
//	       String string1 = "Great responsibility";  
//	       int count;  
//		          
//	       //Converts given string into character array  
//	       char string[] = string1.toCharArray();  
//		          
//	       System.out.println("Duplicate characters in a given string: ");  
//		        //Counts each character present in the string  
//	      for(int i = 0; i <string.length; i++) 
//	      {  
//		            count = 1;  
//	          for(int j = i+1; j <string.length; j++) 
//	          {  
//		         if(string[i] == string[j] && string[i] != ' ') {  
//		           count++;  
//		                    //Set string[j] to 0 to avoid printing visited character  
//		         string[j] = '0';  
//		       }  
//          }  
//		            //A character is considered as duplicate if count is greater than 1  
//		      if(count > 1 && string[i] != '0')  
//		          System.out.println(string[i]);  
//	  }  
		     
		
		
		
	}

}
