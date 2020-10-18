package day4;

import java.util.Scanner;

public class Ass3 {
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		int[] arr=new int[5];
		for(int i=0;i<5;i++)
		{
			System.out.println("Enter numbers");
			arr[i]=sc.nextInt();
		}
		int sum=0;
		for(int i=0;i<5;i++)
		{
			sum=sum+arr[i];
		}
		System.out.println("SUM "+sum);
	}
}