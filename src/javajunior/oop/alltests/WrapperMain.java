package javajunior.oop.alltests;

import javajunior.oop.examples.Person;

public class WrapperMain {

    public static void main(String[] args) {
        String s = "1000";
        String s1 = "2000";
        int a = Integer.parseInt(s);
        int b = Integer.parseInt(s1);
        System.out.println(s + s1);
        System.out.println(a + b);

        String text = "This is John. He is 27 years old.";
        String name1 = text.substring(8, 12);
        System.out.println(name1);

        System.out.println();

        String[] words = text.split(" ");
        String name = words[2].substring(0, 4);
        System.out.println(name);
        int age = Integer.parseInt(words[5]);
        System.out.println(age);
        Person men = new Person(name, age);
        System.out.println("Имя: " + men.getName() + "; Возраст: " + men.getAge() + ";");
    }
}
