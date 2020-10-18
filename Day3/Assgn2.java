package Day3;
import java.util.Scanner;
public class Assgn2 {
	public static void main(String[] args)   {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Name of Employee");
		String name=sc.nextLine();
		System.out.println("Birth Date,Month,Year");
		int date=sc.nextInt();
		int month=sc.nextInt();
		int year=sc.nextInt();
		System.out.println("Monthy Salary");
		int salary=sc.nextInt();
		
		int age=2020-year;
		int annual=salary*12;
		int tax=0;
		if(annual>=500000)
		{
			tax=20;
		}
		else if(annual>=400000)
		{
			tax=15;
		}
		else if(annual>=300000)
		{
			tax=10;
		}
		else if(annual>=200000)
		{
			tax=5;
		}
		System.out.println("Details of Employee/n Name- ");
		System.out.println(name);
		System.out.println("Age is "+age);
		System.out.println("Annual Salary is "+annual);
		System.out.println("Tax percent "+tax);
	}
}
