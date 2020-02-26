


/*10. WAP to input any two number and ask user to enter their symbol (+, -, /, *)
 find addition, Subtraction, multiplication and division according to their symbol
  (using if else)*/

import java.util.Scanner;

public class FindSymbol10 {
    public static void main(String[] args) {

        Scanner s3 = new Scanner(System.in);
        System.out.println("Input the first number");
        int number1 = s3.nextInt();
        System.out.println("Input the Secound number");
        int number2 = s3.nextInt();
        System.out.println(number1 + "   +  " + number2 + " = " + (number1 + number2));
        System.out.println(number1 + "  -  " + number2 + " = " + (number1 - number2));
        System.out.println(number1 + "  X  " + number2 + " = " + (number1 * number2));
        System.out.println(number1 + "  /  " + number2 + " = " + (number1 / number2));
        System.out.println(number1 + "  mod  " + number2 + " = " + (number1 % number2));


    }
}
