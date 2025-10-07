package javajunior.Multithreading;

import java.util.Random;

public class MainGuessing {

    static boolean isNotNumberGuessed = true;

    public static void main(String[] args) {
        final int RANGE = 1_000_000_000;
        var random = new Random();
        int number = random.nextInt(1, RANGE);

        var thread1 = new Thread(new Runnable() {
            @Override
            public void run() {
                int correctNumber;
                do {
                    correctNumber = random.nextInt(1, RANGE);
                } while (correctNumber != number);
                System.out.println("Число угадано!");
                isNotNumberGuessed = false;
            }
        });

        var thread2 = new Thread(new Runnable() {
            @Override
            public void run() {
                int seconds = 0;
                while (isNotNumberGuessed) {
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {

                    }
                    seconds++;
                }
                System.out.printf("Число %s второй поток угадал за %s секунд!%n", number, seconds);
            }
        });

        thread1.start();
        thread2.start();
    }
}
