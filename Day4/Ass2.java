package day4;
import java.util.Scanner;

public class Ass2 {
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		int[] arr=new int[5];
		for(int i=0;i<5;i++)
		{
			System.out.println("Enter numbers");
			arr[i]=sc.nextInt();
		}
		System.out.println("ODD NUMBERS-");
		for(int i=0;i<5;i++)
		{
			if(arr[i]%2!=0);
			{
				System.out.println(arr[i]);
			}
			
		}
		
	}
}
