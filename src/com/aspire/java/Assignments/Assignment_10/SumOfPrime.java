package com.aspire.java.Assignments.Assignment_10;

import java.util.Scanner;



public class SumOfPrime {
	
	public int DisplaySumPrime(int max)
		{
		int count=1,flag,i=2,sum=0;
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
					sum=sum+i;
					System.out.println(i);
					count++;
				}
				
				i++;	
			
		}
		return sum;
			
		}
		public static void main(String[] args) {
			// TODO Auto-generated method stub
			int max;
			SumOfPrime o=new SumOfPrime();
			Scanner sc=new Scanner(System.in);
			
			System.out.println("Enter Range upto Prime No. ends :-");
			max=sc.nextInt();
			int sum=o.DisplaySumPrime(max);
			System.out.println("Addition of Prime numbers form 1 to "+max+" is :-"+sum);
			
					
			

		}



	
}
