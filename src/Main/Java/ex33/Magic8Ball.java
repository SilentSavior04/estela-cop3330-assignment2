package ex33;

import java.util.Random;
import java.util.Scanner;

public class Magic8Ball {
    public static void main(String[] args) {
        String[] responses = {"Yes","No","Maybe","Ask again later"};

        Random random = new Random();
        Scanner sc = new Scanner(System.in);

        System.out.println("Ask your question.");
        sc.nextLine();

        int randomResponseIndex = random.nextInt(responses.length);
        String response = responses[randomResponseIndex];
        System.out.println();
        System.out.println(response);
        System.out.println();
    }
}
