package JavaToJunior.part_1;

public class Loops {

    public static void main(String[] args) {
        System.out.println("Цикл while...");
        int i = 1;
        while (i <= 1000) {
            if (i == 5) {
                break;
            }
            else if (i % 2 == 0) {
                System.out.println(i);
            }
            i++;
        }

        System.out.println("Цикл do ... while...");

        int a = 0;
        do {
            System.out.println(a);
        } while (a > 0);

        System.out.println("Цикл for...");

        for (int b = 1; b <= 4; b++) {
            System.out.println(b);
        }

        System.out.println("Домашнее задание...");

        for (int x = 1000; x >= 0; x--) {
            if (x % 3 == 0) {
                System.out.println(x);
            }
        }
    }
}
