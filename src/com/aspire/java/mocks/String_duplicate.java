package com.aspire.java.mocks;

public class String_duplicate 
{
	public static void main(String[] args) 
	{
//		String  s1 = "virajvirajviraj";
//		char [] s2  = s1.toCharArray();
//		
//		int count=0;
//		for (int i = 0; i < s2.length; i++) 
//		{
//			
//			for (int j = i; j < s2.length; j++) 
//			{
//				if(s2[i]==s2[j]&& i!=j)
//				{
//					
//					System.out.print(s2[j]+", ");
//					count++;
//				}
//			}
//
//		}
//		System.out.println();
//				
//		System.out.println("Count of duplicate numbers ="+count);
		
		
		String string1 = "virajvirajviraj";  
        int count;  
          
        //Converts given string into character array  
        char string[] = string1.toCharArray();  
          
        System.out.println("Duplicate characters in a given string: ");  
        //Counts each character present in the string  
        for(int i = 0; i <string.length; i++) 
        {  
            count = 1;  
            for(int j = i+1; j <string.length; j++) 
            {  
                if(string[i] == string[j] && string[i] != ' ') 
                {  
                    count++;  
                    //Set string[j] to 0 to avoid printing visited character  
                    string[j] = '0';  
                }  
            }  
            //A character is considered as duplicate if count is greater than 1  
            if(count > 1 && string[i] != '0')  
                System.out.println(string[i]);
           
        }  
				
	}

}
