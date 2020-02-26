/*8. Input any alphabet from a to f and print their city name accordingly (use if else) any other
Alphabet should be invalid entry*/

import java.util.Scanner;

public class PrintCityName8 {
    public static void main(String[] args) {


        String alphabet;
        Scanner sc1 = new Scanner(System.in);
        System.out.println("Please Enter an alphabet a to f ");
        alphabet = sc1.next();
        alphabet = alphabet.toUpperCase();
        alphabet = alphabet.toLowerCase();
        if (alphabet.equals("a")) {
            System.out.println("City name is Ahamadabad");
        } else if (alphabet.equals("b")) {
            System.out.println("City name is Bombay");
        } else if (alphabet.equals("c")) {
            System.out.println("City name is Chandigadh");
        } else if(alphabet.equals("d")) {
            System.out.println("City name is Delhi");
        }
    else if (alphabet.equals("e")) {
            System.out.println("City name is Eterna");
        } else if(alphabet.equals("F")) {
            System.out.println("City name is Faridabad");
        }

    }

}