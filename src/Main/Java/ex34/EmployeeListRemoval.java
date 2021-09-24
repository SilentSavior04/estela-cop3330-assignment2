package ex34;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class EmployeeListRemoval {
    public static void main(String[] args) {

        ArrayList<String> employees = new ArrayList<String>(Arrays.asList("Joel Jackson", "Jack Jones", "Chris Smith", "Amanda Goodman", "Jeremy Lee"));
        printEmployees(employees);
        Scanner sc = new Scanner(System.in);

        System.out.println();
        System.out.println("Enter an employee name to be removed: ");
        String nameToRemove = sc.nextLine();

        employees.remove(nameToRemove);

        System.out.println();
        printEmployees(employees);
    }
    public static void printEmployees(ArrayList<String> employees)
    {
        System.out.println("There are "+ employees.size() +" employees: ");
        for(String emp:employees) {
            System.out.println(emp);
        }
    }
}
