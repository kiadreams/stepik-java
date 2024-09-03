package javajunior.syntax;

public class IntegerTypes {

    public static void main(String[] args) {
        int speed = 300_000;
        long distance = 365L * 24 * 60 * 60 * speed;
        System.out.println(distance);

        System.out.println();

        byte b = 127;
        System.out.println(b);
//        b = b + 1; Не работает, так как литерал с права приводится к типу 1 (int), а он не может положиться в byte
        b++; // происходит переполнение типа byte и отчет начинается с начала (с -128)
        System.out.println(b);
        b++; // если к -128 прибавить 1 - получится -127
        System.out.println(b);
        b = (byte) (b + 1); // явно приведя тип int (b + 1) к типу byte, чтобы положить в тип byte
        System.out.println(b);
    }
}
