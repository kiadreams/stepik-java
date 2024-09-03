package javajunior.syntax;

public class Strings {

    public static void main(String[] args) {
        String s = "Hello World!!!";
        System.out.println(s);

        System.out.println();

        String hello = "Hello";
        String world = "world";
        String result = hello + " " + world + "!!!";
        System.out.println(result);

        System.out.println();

        System.out.println(hello + " " + world + "!!!");

        System.out.println();

        String name = "Jhon";
        int age = 37;
        String result2 = "Привет, \"" + name + "\"!\nТебе " + age + " лет!";
        System.out.println(result2);
    }
}
