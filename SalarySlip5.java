/* 5. WAP to input employee id, name, basic salary then find HRA, TA, DA, PF and
 Gross salary, HRA = basic salary 10%,DA = Basic salary 8%,TA = Basic salary 9%
PF= Basic salary 20%, Gross salary = basic salary + HRA + TA + DA –PF*/


import java.util.Scanner;

public class SalarySlip5 {

    public static void main(String[] args) {
        SalarySlip5 obj = new SalarySlip5();
        obj.mySalarySlip();
    }

    public void mySalarySlip() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Employeer Id :    ");
        int eId = sc.nextInt();
        System.out.println("Enter Employeer Name :  ");
        String eName = sc.next();
        System.out.println("Enter Employeer Basic Salary:  ");
        int basicSalary = sc.nextInt();
        int hra = (basicSalary * 10) / 100;
        int ta = (basicSalary * 8) / 100;
        int da = (basicSalary * 9) / 100;
        int pf = (basicSalary * 20) / 100;

        double grossSalary = basicSalary + hra + ta + da - pf;


        System.out.println("_________________________________________________");
        System.out.println("|              Salary Slip                      |");
        System.out.println("|_______________________________________________|");
        System.out.println("|Employee Id             :    " + eId + "       |");
        System.out.println("|  Employee Name           :   " + eName + "    |");
        System.out.println("__________________________________________");
        System.out.println("|Basic Salary             :  " + basicSalary + "|");
        System.out.println("|Hra 10%                  :  " + hra + "        |");
        System.out.println("|TA  8%                   :  " + ta + "         |");
        System.out.println("|DA  9%                   :  " + da + "         |");
        System.out.println("|PF 20%                   :  " + pf + "         |");
        System.out.println("|_______________________________________________|");
        System.out.println("|Gross Salary             :  " + grossSalary + "|");
        System.out.println("________________________________________________|");
    }


}