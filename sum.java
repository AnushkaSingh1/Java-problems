import java.util.Scanner;

public class Main{

  
  private static void FirstLastDigitSum(int number) {

     
     int lastDigit, firstDigit, divisor;;
     int totalDigits = 0;
     int sum = 0;

     
     while(number!=0)
     {
     lastDigit = number%10;

     
     totalDigits = findDigits(number);

     
     divisor = (int)Math.pow(10, totalDigits-1);

     
     firstDigit = number / divisor;
     
     sum = firstDigit + lastDigit;
     number=(number-(firstDigit*(int)Math.pow(10, totalDigits-1))-lastDigit)/10;

     System.out.println(sum);
     }
  }

  
  private static int findDigits(int number) {
     int count = 0;
     while(number!=0) {
        count++;
        number = number/10;
     }
     return count;
  }

  public static void main(String[] args) {


     int number = 0;
     
     Scanner scan =  new Scanner(System.in);

     
     System.out.print("Enter an integer number:: ");
     number = scan.nextInt();

     
      FirstLastDigitSum(number);

     
     scan.close();
  }
}





//Write a program to find the sum of first and last digit of a number, second and second last digit and consecutively. 

//example 

//input 12345678 

//output: 

//1+8=9 

//2+7=9 

//3+6=9 

//4+5=9 
