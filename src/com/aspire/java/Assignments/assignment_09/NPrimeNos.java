package com.aspire.java.Assignments.assignment_09;

import java.util.Scanner;



public class NPrimeNos {
	
	 void PrimeFromTo(int max)
		{
		int count=1,flag,i=2;
		 System.out.println("Prime Numbers from 1 to "+max+" is :-");
		while(count <= max)	
		{
			flag=0;
	
				for(int j=2;j<=i/2;j++)
				{
					if(i%j==0)
					{
						flag=1;
						break;
					}
					
				}
				
				if(flag==0)
				{
					System.out.println(i);
					count++;
				}
				
				i++;	
			
		}
			
		}
		public static void main(String[] args) {
			// TODO Auto-generated method stub
			int max;
			NPrimeNos o=new NPrimeNos();
			Scanner sc=new Scanner(System.in);
			
			System.out.println("Enter Range upto Prime No. ends :-");
			max=sc.nextInt();
			o.PrimeFromTo(max);
			
					
			

		}


}
