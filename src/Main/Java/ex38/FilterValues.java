package ex38;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.concurrent.atomic.AtomicReferenceArray;

public class FilterValues {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a list of numbers, separated by spaces: ");
        String data = in.nextLine();

        String[] list;
        list = " ".split(data);
        AtomicReferenceArray<Integer> evenList = new AtomicReferenceArray<>(filterEvenNumbers(list));

        System.out.print("The even numbers are ");
        for(int i = 0; evenList.length() > i; i++){
            if(i < evenList.length() -1){
                System.out.print(evenList.get(i) + " ");
            }
            else
            {
                System.out.print(evenList.get(i) + ".");
            }
        }
    }
    public static Integer[] filterEvenNumbers(String[] list) {
        ArrayList<Integer> newList = new ArrayList<>();


        for (String s : list) {
            int num = Integer.parseInt(s);
            if (num % 2 == 0) {
                newList.add(num);
            }
        }
        Integer[] arr = new Integer[newList.size()];
        arr = newList.toArray(arr);
        return arr;
    }
}