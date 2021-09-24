package ex37;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;
import java.util.Scanner;

public class PassworkGen {
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);

        System.out.print("Minimum Length? ");
        int size = Integer.parseInt(in.nextLine());

        System.out.print("Special Characters? ");
        int special = Integer.parseInt(in.nextLine());

        System.out.print("How many numbers? ");
        int numbers = Integer.parseInt(in.nextLine());

        System.out.println("The password is " + generatePassword(size, special, numbers));
    }
    public static String generatePassword(int length, int special, int nums)
    {
        String letters = "abcdefghijklmnopqrstuvwxyz";
        String specialCharacters = "!@#$%^&*";
        String numbers = "123456789";
        Random random = new Random();
        ArrayList<Character> chars = new ArrayList<>();
        for(int i=0; i<special; i++){
            chars.add(specialCharacters.charAt(random.nextInt(specialCharacters.length())));
        }
        for(int i=0; i<nums; i++){
            chars.add(numbers.charAt(random.nextInt(numbers.length())));
        }

        for(int i=chars.size() -1; i < length; i++){
            chars.add(letters.charAt(random.nextInt(letters.length())));
        }
        Collections.shuffle(chars);
        StringBuilder password = new StringBuilder();
        for(Character s : chars)
        {
            password.append(Character.toString(s));
        }
        return password.toString();
    }
}
