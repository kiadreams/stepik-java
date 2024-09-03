package javajunior.oop;

public class Rect {
    int width;
    int length;

    void setSides(int width, int length) {
        this.width = width;
        this.length = length;
    }

    int getArea() {
        return width * length;
    }
}
