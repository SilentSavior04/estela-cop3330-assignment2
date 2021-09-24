package ex35;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class WinnerPick {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        String name;
        ArrayList<String> nameList = new ArrayList<>();
        do {
            System.out.println("Enter a name:");
            name = input.nextLine();

            if (!name.isBlank() && !name.isEmpty())
                nameList.add(name);
        } while (!name.isBlank() && !name.isEmpty());

        Random random = new Random();
        int randomIndex = random.nextInt(nameList.size());

        System.out.println("The winner is... " + nameList.get(randomIndex));
    }
}