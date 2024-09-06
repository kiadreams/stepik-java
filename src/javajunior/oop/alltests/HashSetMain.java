package javajunior.oop.alltests;

import java.util.HashSet;

public class HashSetMain {

    public static void main(String[] args) {
        var employees = getEmployees();
        employees.add("James");
        showStringSet(employees);
        employees.remove("Emma");
        showStringSet(employees);
    }

    private static HashSet<String> getEmployees() {
        var employees = new HashSet<String>();
        employees.add("John");
        employees.add("John");
        employees.add("Olivia");
        employees.add("Emma");
        employees.add("Max");
        employees.add("Nick");
        return employees;
    }

    private static void showStringSet(HashSet<String> employees) {
        for (String employee : employees) {
            System.out.println(employee);
        }
        System.out.println();
    }

}
