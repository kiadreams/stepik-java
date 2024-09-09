package javajunior.oop.alltests;

import java.util.Random;

public class Cube {
    private int number;

    public void roll() {
        var random = new Random();
        this.number = random.nextInt(1, 7);
    }

    @Override
    public String toString() {
        return String.format("На кубике число %s", number);
    }
}
