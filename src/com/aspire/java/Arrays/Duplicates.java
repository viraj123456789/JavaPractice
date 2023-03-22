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
		
		
		
		
		  
	       String s1 = "Great responsibility";  
	       int count1;  
		          
	       //Converts given string into character array  
	       char string[] = s1.toCharArray();  
		          
	       System.out.println("Duplicate characters in a given string: ");  
		        //Counts each character present in the string  
	      for(int i = 0; i <string.length; i++) 
	      {	  
		            count1 = 1;  
	          for(int j = i; j <string.length; j++) 
	          {  
		         if(string[i] == string[j] && string[i] != ' ' && i != j) {  
		           count1++;  
		                    //Set string[j] to 0 to avoid printing visited character  
		         string[j] = '0';  
		         }  
	          }  
		            //A character is considered as duplicate if count is greater than 1  
		      if(count1 > 1 && string[i] != '0')  
		          System.out.println(string[i]);  
	      }  
		     
//	      Duplicate characters in a given string: 
//	    	  r
//	    	  e
//	    	  t
//	    	  s
//	    	  i
		
		
	}

}
