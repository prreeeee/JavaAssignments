package Day3;
import java.util.Scanner;

public class Assgn1 
{
	public static void main(String[] args)
	{	Scanner sc=new Scanner(System.in);
		float p;
		System.out.println("Enter Marks of Sub");
		int s1=sc.nextInt();
		int s2=sc.nextInt();
		int s3=sc.nextInt();
		int s4=sc.nextInt();
		int s5=sc.nextInt();
		int total=s1+s2+s3+s4+s5;
		p=total/5;
		//System.out.println(p+"%");
		if(p>=90)
		{
			System.out.println("Grade A with Percentage="+p);
		}
		else if(p>=80)
		{
			System.out.println("Grade B with Percentage="+p);
		}
		else if(p>=70)
		{
			System.out.println("Grade c with Percentage="+p);
		}
		else if(p>=60)
		{
			System.out.println("Grade D with Percentage="+p);
		}
		else if(p>=50)
		{
			System.out.println("Grade E with Percentage="+p);
		}
		else
		{
			System.out.println("Grade F(fail) with Percentage="+p);
		}
	}
}
