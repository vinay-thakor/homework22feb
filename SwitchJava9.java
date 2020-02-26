/*8. Input any alphabet from a to f and print their city name accordingly (use if else) any other
Alphabet should be invalid entry

9. Same as above program-8 using switch statement.*/

import java.util.Scanner;


public class SwitchJava9 {
    public static void main(String[] args) {
        String alphabet;
        Scanner s2 = new Scanner(System.in);
        System.out.println("  please enter alphabet a to f");
        alphabet = s2.next();
        alphabet = alphabet.toUpperCase();
        alphabet = alphabet.toLowerCase();
        switch (alphabet) {
            case "a":
                System.out.println("city name is Ahmedabad");
                break;
            case "b":
                System.out.println("City name is Baroda");
                break;

            case "c":
                System.out.println("City name is Chinnai");
                break;
            case "d":
                System.out.println("City name is Delhi");
                break;
            case "e":
                System.out.println("City name is Eterna");
                break;
            case "f":
                System.out.println("City name is Faridabad");
                break;
            default:
                System.out.println("Alphabet is not valid");

        }
    }

}

