import java.util.Scanner;
public class methods{
    public static void main(String[]args){
System.out.print("Enter a 6-digit number: ");
int number = input.nextInt();

int oddSum = 0;
int evenSum = 0;

while (number > 0) {
   int digit = number % 10;

   if (digit % 2 == 0) {
      evenSum += Math.pow(digit, 2);
   } else {
      oddSum += Math.pow(digit, 3);
   }

   number /= 10;
}

if (evenSum != 0) {
   int division = oddSum / evenSum;
   System.out.println("The division of the sum of the cubes of odd digits and sum of the squares of even digits is: " + division);
} else {
   System.out.println("The sum of even digits is zero, cannot divide.");
}
}}