package javajunior.oop.inheritance;

public class Triangle extends Shape {
    private int c;

    public Triangle(int a, int b, int c) {
        super(a, b);
        this.c = c;
    }

    public final void setC(int c) {
        this.c = c;
    }

    public final int getC() {
        return this.c;
    }

    @Override
    public int getPerimeter() {
        return getA() + getB() + this.c;
    }
}
