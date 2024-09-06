package javajunior.oop.alltests;

import java.util.ArrayList;

public class ArrayMain {

    public static void main(String[] args) {
        var employees = getEmployees();
        employees.add("James");
        showStringArray(employees);
        employees.remove("Emma");
        showStringArray(employees);

        var numbers = new ArrayList<Integer>();
        for (int i = 0; i < 1000; i++) {
            numbers.add(i);
        }
        showIntArray(numbers);
    }

//    private static MyArrayList getEmployees() {
//        MyArrayList employees = new MyArrayList();
//        employees.add("John");
//        employees.add("Olivia");
//        employees.add("Emma");
//        employees.add("Max");
//        employees.add("Nick");
//        return employees;
//    }

    private static ArrayList<String> getEmployees() {
        var employees = new ArrayList<String>();
        employees.add("John");
        employees.add("John");
        employees.add("Olivia");
        employees.add("Emma");
        employees.add("Max");
        employees.add("Nick");
        return employees;
    }

    private static void showStringArray(ArrayList<String> employees) {
        for (String employee : employees) {
            System.out.println(employee);
        }
        System.out.println();
    }

    private static void showIntArray(ArrayList<Integer> numbers) {
        for (Integer number : numbers) {
            System.out.println(number);
        }
        System.out.println();
    }
}
