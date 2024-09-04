package javajunior.oop;

public class Box {
    double length;
    double width;
    double height;

    Box() {
        this(10);
    }

    Box(double length, double width, double height) {
        this.length = length;
        this.width = width;
        this.height = height;
    }

    Box(double size) {
        this(size, size, size);
    }

    Box(Box another) {
        this(another.length, another.width, another.height);
    }

    int compare(Box another) {
        double currentVolume = getVolume();
        double anotherVolume = another.getVolume();
        int result;
        if (currentVolume > anotherVolume) {
            result = 1;
        } else if (currentVolume < anotherVolume) {
            result = -1;
        } else {
            result = 0;
        }
        return result;
    }

    Box copy() {
        return new Box(this.length, this.width, this.height);
    }

    Box increase() {
        return new Box(this.length * 2, this.width * 2, this.height * 2);
    }

    void setDimens(double length, double width, double height) {
       this.length = length;
       this.width = width;
       this.height = height;
    }

    double getVolume() {
        return length * width * height;
    }

    void showVolume() {
        System.out.println(getVolume());
    }
}
