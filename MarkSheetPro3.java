import com.sun.deploy.security.SelectableSecurityManager;
/*3. Write a java program to input student Name, roll No, and three subjects Math,
 Science and English marks (marks is between 0 to 100 and if it is out of range
  print error message “Invalid Input, Marks should between 0 to 100”) and find out total,
  percentage and result.If he is pass or fail on basis of percentage (pass>=35)
   and also give them grade>= 80 A+, >= 60 A, >= 50 B, >=
    35 C And print Mark Sheet in following format*/

import java.util.Scanner;

public class MarkSheetPro3 {

    public static void main(String args[]) {
        String name;
        int roll, math, sci, eng;

        Scanner SC = new Scanner(System.in);


        System.out.print("Enter Name: ");
        name = SC.nextLine();
        System.out.print("Enter Roll Number: ");
        roll = SC.nextInt();
        System.out.print("Enter marks in Math: ");
        math = SC.nextInt();
        if (math > 0 && math <= 100) {

        } else {
            System.out.println("Invalid input, Mark should be between 0 to 100");
            System.out.print("Enter marks in Math: ");
            math = SC.nextInt();
        }
        System.out.print("Enter marks in Science: ");
        sci = SC.nextInt();
        if (sci > 0 && sci <= 100) {

        } else {
            System.out.println("Invalid input, Mark should be between 0 to 100");
            System.out.print("Enter marks in Science: ");
            sci = SC.nextInt();

        }

        System.out.print("Enter marks in English: ");

        eng = SC.nextInt();
        if (eng > 0 && eng <= 100) {

        } else {
            System.out.println("Invalid input, Mark should be between 0 to 100");
            System.out.print("Enter marks in English: ");
            eng = SC.nextInt();
        }
        int total = math + sci + eng;
        float percentage = (float) total / 300 * 100;


        System.out.println(" ____________");
        System.out.println("|                                  |");
        System.out.println("|           Mark Sheet             |");
        System.out.println("|____________|");
        System.out.println("|     Name      :      " + name + "        |");
        System.out.println("|     Roll No   :      " + roll + "          |");
        System.out.println("|____________|");
        System.out.println("|     Subjects  :      Marks       |");
        System.out.println("|____________|");
        System.out.println("|     Math      :      " + math + "          |");
        System.out.println("|     Science   :      " + sci + "          |");
        System.out.println("|     English   :      " + eng + "          |");
        System.out.println("|____________|");
        System.out.println("|     Total     :      " + total + "         |");
        System.out.println("|____________|");
        System.out.println("|     Percentage:      " + percentage + "        |");
        System.out.print("|     Result    : ");
        if (percentage >= 35) {
            System.out.println("     Pass        |");
        } else if (percentage < 35)
            System.out.println("     Fail        |");
        System.out.print("|     Grade     : ");
        if (percentage >= 80) {
            System.out.println("      A+         |");
        } else if (percentage >= 60 && percentage < 80) {
            System.out.println("      A          |");
        } else if (percentage >= 50 && percentage < 60) {
            System.out.println("      B          |");
        } else if (percentage >= 35 && percentage < 50) {
            System.out.println("      C          |");
        } else if (percentage <= 35) {
            System.out.println("      D          |");
        }
        System.out.println("|____________|");


    }
}