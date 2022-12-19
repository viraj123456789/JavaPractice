package com.aspire.java.Logical_Programs;

public class Missing_Number 
{
//	public static int getMissingNo(int[] nums, int n)
//    {
//        int sum = ((n + 1) * (n + 2)) / 2;
//        for (int i = 0; i < n; i++)
//            sum -= nums[i];
//        return sum;
//    }
// 
//    // Driver code
//    public static void main(String[] args)
//    {
//        int[] arr = { 1, 2, 3, 5 };
//        int l = arr.length;
//        System.out.println(getMissingNo(arr, l));
//    }

	public static void main(String[] args) 
	{
		int[] a = { 1, 2, 3, 4, 5 ,7, 8, 9 };
        int n = a.length;
		
        int sum = ((n + 1) * (n + 2)) / 2;     //  ((8+1)*(8+2))/2  == 9*10/2 = 45
        for (int i = 0; i < n; i++) 
        {
        	sum = sum - a[i];			// =45-1=44-2=42-3=39-4=35-5=30-7=23-8=15-9=6
        }
            
		System.out.println("Missing no from array is = "+sum);
	}
}
