import java.util.Scanner;
//Write a java program that tell us that Input number is odd or even?
//HINT: use turnery operator (? :)


public class InputOddOrNot1 {

    public static void main(String[] args) {
        //  For the tacking user input
        Scanner sc = new Scanner(System.in);
        System.out.println("Please Enter the Number wish to check Odd or Even:");
        int number = sc.nextInt();
        String obj1 = (number % 2 == 0) ? "even" : "  Odd";
        System.out.println(number + " Number is:" + obj1);

    }

}