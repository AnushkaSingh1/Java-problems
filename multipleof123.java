import java.util.Scanner;  
public class Main   
{  
public static void main(String args[])  
{  
  
Scanner sc = new Scanner(System.in);  
System.out.print("Enter number: ");       
 
int num=sc.nextInt();  
System.out.print("Enter range: ");       
  
int range=sc.nextInt();  
int i = 1;  
   
while (i <= range)   
{  
 
System.out.println( num * i);  
 
i++;  
}  
}  
}
