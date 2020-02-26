import java.util.Scanner;
//To do Sir,

public class NumberOfDays4 {


    public static void main(String[] args) {
        int year;
        System.out.println("Enter an Year :: ");
        Scanner sc = new Scanner(System.in);
        year = sc.nextInt();


        if (((year % 4 == 0) && (year % 100 != 0)) || (year % 400 == 0))
            System.out.println("Specified year is a leap year");

        else
            System.out.println("Specified year is not a leap year");

    }
}
      //  NumberOfDays4 obj2 = new NumberOfDays4();

    //    obj2.cal1();
  //  }


//}




