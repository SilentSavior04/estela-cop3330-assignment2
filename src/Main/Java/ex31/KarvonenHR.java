package ex31;
import java.util.Scanner;

public class KarvonenHR {
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        int age = 0;
        while (age < 1)
        {
            System.out.print("Age:");
            age = input.nextInt();

            if (age < 1)
                System.out.println("Invalid input. \n");
        }
        int restingHR = 0;
        while (restingHR < 55 || restingHR > 95)
        {
            System.out.print("Enter resting HR (55 - 95): ");
            restingHR = input.nextInt();

            if (restingHR < 55 || restingHR > 95)
                System.out.println("Invalid Input. \n");
        }
        System.out.println("\nIntensity \tRate");
        for (int intensity = 55; intensity <= restingHR; intensity += 5)
        {
            double rate = (((220 - age) - restingHR) * (intensity / 100.0)) + restingHR;
            System.out.println(intensity + "%" + "\t\t" + (int) Math.ceil(rate) + "BPM");
        }
    }
}