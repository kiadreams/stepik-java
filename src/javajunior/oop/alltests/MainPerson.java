package javajunior.oop.alltests;

import javajunior.oop.examples.Person;

import java.util.Random;

public class MainPerson {

    public static void main(String[] args) {
        var person = new Person("John", 35);
        System.out.println(person.toString());

        System.out.println();

        var empty = new Empty();
        System.out.println(empty);

        System.out.println("\nСлучайные числа!\n");
        var random = new Random();
        for (int i = 0; i < 100; i++) {
            int a = random.nextInt(5, 11);
//            random.
            System.out.print(a + " ");
        }

        System.out.println("\nДомашнее задание!\n");
        var cube = new Cube();
        for (int i = 0; i < 100; i++) {
            cube.roll();
            System.out.println(cube);
        }
    }
}
