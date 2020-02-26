//16. Write a Java program to sort a numeric array and a string array.

import java.util.Arrays;
import java.util.Scanner;

public class ShortNumAndString16 {
    public static void main(String[] args) {
        int[] my_array1 = {20, 50, 60, 90, 40, 30};
        String[] my_array2 = {"Prime", "Testing", "Manual", "Automation", "Interview"};
        System.out.println("Original numaric array :" + Arrays.toString(my_array1));
        Arrays.sort(my_array1);
        System.out.println("Sorted numeric array :" + Arrays.toString(my_array1));
        Arrays.sort(my_array1);
        System.out.println("Original numeriv array : " + Arrays.toString(my_array2));
        Arrays.sort(my_array2);
        System.out.println("Sorted numeric array :" + Arrays.toString(my_array2));
    }
}

