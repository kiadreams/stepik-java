package javajunior.oop.inheritance.mains;

import javajunior.oop.inheritance.BoxWeight;

public class BoxMain {

    public static void main(String[] args) {
        var box = new BoxWeight(5, 5, 5, 10);
        box.showInfo();
    }
}
