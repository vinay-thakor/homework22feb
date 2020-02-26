
//12. Write a program that tells us input value is number or an alphabet or symbol.
//To do Sir,
import java.util.Scanner;

public class AlphaberOrNot12 {
    public static void main(String[] args) {
        Scanner s1 = new Scanner(System.in);
        System.out.println("Enter any input value");
        char ch = s1.next().charAt(0);
        if ((ch >= 'a' && ch <= 'z') || (ch >= 'A' && ch <= 'Z')) {
            System.out.println(ch + "is a Number");
        } else if (ch >= '0' && ch <= '9') {
            System.out.println(ch + "    is a Answer");
        } else {
            System.out.println(ch + " is a Symbol");
        }
    }

}
