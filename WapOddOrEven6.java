//6. WAP to input any number and find out if it’s odd or even
import java.util.Scanner;

public class WapOddOrEven6 {


//public class Odd_Even.
    //int n;

    public static void main(String[] args) {


        Scanner s = new Scanner(System.in);
        System.out.print("Enter the number you want to check:");
        int n = s.nextInt();
        if (n % 2 == 0)
            System.out.println("The given number " + n + " is Even ");
        else {
            System.out.println("The given number " + n + " is Odd ");

        }

    }
}

