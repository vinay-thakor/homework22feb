//19. Write a Java program to calculate the average value of array elements.


public class WallArea19 {
    public static void main(String[] args) {
        double[] number = {10.1, 20.2, 30.3, 40.4, 50.5, 60.6, 70, 80, 90, 100};
        //calculate sum of all array elements

        double sum = 0;
        for (int i = 0; i < number.length; i++)
            sum = sum + number[i];
        // calculate average value

        double average = sum / number.length;
        System.out.println("Average value of the array element is: " + average);

    }
}



