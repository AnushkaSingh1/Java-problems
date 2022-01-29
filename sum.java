import java.util.Scanner;

public class Main{

  
  private static void FirstLastDigitSum(int number) {

     
     int lastDigit, firstDigit, divisor;;
     int totalDigits = 0;
     int sum = 0;

     
     while(number!=0)
     {
     lastDigit = number%10;
