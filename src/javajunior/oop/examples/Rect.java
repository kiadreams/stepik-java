package javajunior.oop.examples;

public class Rect {
    int width;
    int length;

    public void setSides(int width, int length) {
        this.width = width;
        this.length = length;
    }

    public int getArea() {
        return width * length;
    }
}
