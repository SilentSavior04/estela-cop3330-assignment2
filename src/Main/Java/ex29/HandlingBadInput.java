package ex29;
import java.util.Scanner;

public class HandlingBadInput {
    public static void main (String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int value;
        while(true){
            System.out.print("What is the rate of return? ");
            value = sc.nextInt();
            System.out.println(value);
            if(value>=1 && value<=72){
                System.out.println("It will take "+(72 / value)+" year to double your initial investment");
                break;
            }
            else
            {
                System.out.println("Invali Input");
            }
        }
    }
}
