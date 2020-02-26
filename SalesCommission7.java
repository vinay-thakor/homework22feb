/* 5. WAP to input employee id, name, basic salary then find HRA, TA, DA, PF and Gross salary
HRA = basic salary 10%,DA = Basic salary 8%,TA = Basic salary 9%,PF= Basic salary 20%
Gross salary = basic salary + HRA + TA + DA –PF*/

import java.util.Scanner;

public class SalesCommission7 {


    public static void main(String[] args) {
        int salesAmount;
        String name;
        //float pesentage;
        Scanner obj12 = new Scanner(System.in);
        System.out.print("Please Sales Person Name");
        name = obj12.next();

        //salesAmount = obj12.nextInt();
        System.out.println("Please enter sales amount");
        salesAmount = obj12.nextInt();


        if (salesAmount >= 50000) {
            System.out.println("Sales commission   : " + salesAmount * 35 / 100);
        } else if (salesAmount >= 30000 && salesAmount == 49999) {
            System.out.println("Sales commission   :    " + salesAmount * 20 / 100);
        } else if (salesAmount >= 20000 && salesAmount == 29999) {
            System.out.println("Sales commission   :  " + salesAmount * 10 / 100);
        } else if (salesAmount > 0001 && salesAmount == 19999) {
            System.out.println("Sales commission   :  " + salesAmount * 5 / 100);
        }

        if (salesAmount >= 50000) {
            System.out.println(salesAmount * 35 / 100);
        } else if (salesAmount >= 35000 && salesAmount == 49999) ;
        System.out.println(salesAmount * 20 / 100);
        if (salesAmount >= 20000 && salesAmount == 34999) {
            System.out.println(salesAmount * 10 / 100);

        } else if (salesAmount >= 10000 && salesAmount == 19999) {
            System.out.println(salesAmount * 5 / 100);


        }
    }
}












