package day4;
import java.util.Scanner;

public class Ass1 {
	Scanner sc=new Scanner(System.in);
	public String name,weapon,power,planet;
	public int age;
	
	public void getDetails()
	{
		System.out.println("Enter Name Of Avenger");
		name=sc.nextLine();
		System.out.println("Enter Age Of Avenger");
		age=sc.nextInt();
		System.out.println("Enter Weapon Of Avenger");
		weapon=sc.next();
		System.out.println("Enter Powers Of Avenger");
		power=sc.next();
		System.out.println("Enter Planet Of Avenger");
		planet=sc.next();
	}
	
	public void displayDetails()
	{
		System.out.println("Name Of Avenger "+name);
		System.out.println("Age Of Avenger "+age);
		System.out.println("Weapon Of Avenger "+weapon);
		System.out.println("Powers Of Avenger "+power);
		System.out.println("Planet Of Avenger "+planet);
		
	}
	
	public static void main(String[] args)
	{
		Ass1[] avg=new Ass1[5];
		for(int i=0;i<5;i++)
		{
			avg[i]=new Ass1();
		}
		
		for(int i=0;i<5;i++)
		{
			avg[i].getDetails();
		}
		for(int i=0;i<5;i++)
		{
			avg[i].displayDetails();
		}
		
		
	}
}
