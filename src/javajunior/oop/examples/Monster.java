package javajunior.oop.examples;

public class Monster {

    int eyes;
    int hands;
    int legs;

    public Monster() {
        this(2);
    }

    public Monster(int parts) {
        this(parts, parts, parts);
    }

    public Monster(int eyes, int hands, int legs) {
        this.eyes = eyes;
        this.hands = hands;
        this.legs = legs;
    }

    public void voice(int count, String word) {
        for (int i = 0; i < count; i++) {
            System.out.println(word);
        }
    }

    public void voice(int count) {
        this.voice(count, "Grrrrrrrrr...");
    }

    public void voice() {
        this.voice(1);
    }
}
