package javajunior.oop.inheritance.mains;

import javajunior.oop.inheritance.ColorRect;
import javajunior.oop.inheritance.Rectangle;
import javajunior.oop.inheritance.Shape;
import javajunior.oop.inheritance.Triangle;

public class ShapeMain {
    public static void main(String[] args) {
        var triangle = new Triangle(10, 7, 6);
        var rect = new Rectangle(10, 5);
        triangle.showPerimeter();
        rect.showPerimeter();
        var colorRect = new ColorRect(12, 15);
        colorRect.showPerimeter();

    }
}
