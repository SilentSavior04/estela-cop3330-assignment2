package ex24;
import java.util.Scanner;
import java.util.Arrays;
public class AnagramChecker {
    static boolean isAnagram(String str1, String str2){
        String s1 = str1.replaceAll("\\s", "");
        String s2 = str2.replaceAll("\\s", "");
        boolean status;

        if (s1.length() != s2.length()) status = false;
        else {

            char[] ArrayS1 = s1.toLowerCase().toCharArray();
            char[] ArrayS2 = s2.toLowerCase().toCharArray();
            Arrays.sort(ArrayS1);
            Arrays.sort(ArrayS2);
            if (Arrays.equals(ArrayS1, ArrayS2)) status = true;
            else status = false;
        }
        return status;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.println("Input two strings and I will tell you if they are anagrams: ");
        System.out.print("First string: ");
        String str1=sc.nextLine();
        System.out.print("Second string: ");
        String str2=sc.nextLine();
        if(isAnagram(str1,str2))
            System.out.println(str1 + " and " + str2 + " are anagrams");
        else
            System.out.println(str2 + " and " + str2 + " are not anagrams");


    }
}