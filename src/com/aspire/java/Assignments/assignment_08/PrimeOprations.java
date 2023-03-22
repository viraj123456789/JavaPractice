package com.aspire.java.Assignments.assignment_08;

import java.util.Scanner;

public class PrimeOprations {

	 void PrimeFromTo(int min,int max)
		{
		int sum=0,count=0,avg=0;
		 System.out.println("Prime Numbers from "+min+" to "+max+" is :-");
			for(int i=min; i<=max; i++)
			{
				for(int j=2;j<max;j++)
				{
					if(i%j==0)
					{
						System.out.println("No is not Prime");
						
						break;
					}
					else
					{
						count++;
						sum=sum+i;
					System.out.println("no is prime"+i);
					break;
					
				}
				
				}
			}
			avg=sum/count;
			System.out.println("Count of prime numbers are:-"+count);
			System.out.println("Sum of prime numbers are:-"+sum);
			System.out.println("Average of prime numbers are:-"+avg);
		}
		
		public static void main(String[] args) {
			// TODO Auto-generated method stub
			int min,max;
			PrimeOprations o=new PrimeOprations();
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter Range From Prime No. Start :-");
			min=sc.nextInt();
			System.out.println("Enter Range upto Prime No. ends :-");
			max=sc.nextInt();
			o.PrimeFromTo(min,max);
			
					
			

		}

}
