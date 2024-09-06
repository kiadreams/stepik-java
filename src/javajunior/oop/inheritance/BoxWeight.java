package javajunior.oop.inheritance;

import javajunior.oop.box.Box;

public class BoxWeight extends Box {
    private int weight;

//    public BoxWeight(double length, double width, double height, int weight) {
//        super(length, width, height);
//        this.weight = weight;
//    }


    public BoxWeight() {
        this.weight = 10;
    }

    public BoxWeight(double length, double width, double height, int weight) {
        super(length, width, height);
        this.weight = weight;
    }

    public BoxWeight(double size, int weight) {
        super(size);
        this.weight = weight;
    }

    public BoxWeight(Box another, int weight) {
        super(another);
        this.weight = weight;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    @Override
    public void showInfo() {
        super.showInfo();
        System.out.println("Вес: " + this.weight + ";");
    }
}
