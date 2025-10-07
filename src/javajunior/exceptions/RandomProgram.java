package javajunior.exceptions;

import java.util.Random;


public class RandomProgram {

    public static void main(String[] args) {
        Random random = new Random();
        for (int i = 0; i < 100; i++) {
            System.out.printf("Ваше число %s%n", random.nextInt(1, 7));
        }
    }
}
