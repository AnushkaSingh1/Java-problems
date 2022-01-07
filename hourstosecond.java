import java.util.Scanner;
public class Main
{
	public static void main(String[] arg)
	{
	int hrs,sec;
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter hours");
	hrs=sc.nextInt();
	sec=hrs*60*60;
	System.out.println("Seconds: "+sec);
	}
}
