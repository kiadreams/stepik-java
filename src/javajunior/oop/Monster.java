package javajunior.oop;

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

    void voice(int count, String word) {
        for (int i = 0; i < count; i++) {
            System.out.println(word);
        }
    }

    void voice(int count) {
        this.voice(count, "Grrrrrrrrr...");
    }

    void voice() {
        this.voice(1);
    }
}
