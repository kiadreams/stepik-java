package javajunior.oop.alltests;

import javajunior.oop.box.Box;
import javajunior.oop.examples.*;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        Box box1 = new Box();
        Box box2 = new Box(20, 20, 20);
        Box box3 = box2;
        box1.showVolume();
        box2.showVolume();
        box3.width = 0;
        box2.showVolume();
        System.out.println();
        System.out.println(box2.compare(box1));
        var box4 = new Box(box2);
        System.out.println(box2.compare(box4));
        box1.setDimens(40, 40, 40);
        Box box5 = box1.copy();
        Box box6 = box5.increase();
        box5.showVolume();
        box6.showVolume();

        System.out.println();

        Test test = new Test();
        System.out.println(test.square(7));

        System.out.println("Прямоугольник!");

        Rect rect = new Rect();
        rect.setSides(5, 3);
        System.out.println(rect.getArea());

        System.out.println();

        var men = new Worker("Ivan", "enginer", 100_000);
        men.showInfo();

        System.out.println();

        System.out.println(MyMath.multiple(10, 5));
        System.out.println(MyMath.multiple(5.2, 4.3));
        System.out.println(MyMath.multiple(7));

        System.out.println(Math.pow(5.0, 2.0));

        System.out.println();

        var monster = new Monster();
        monster.voice();
        System.out.println();
        monster.voice(2);
        System.out.println();
        monster.voice(3, "AAAAAAAAA...");

        System.out.println();

        var john = new Person("John", 25);
        System.out.println(john.getName() + " " + john.getAge());
        john.setAge(-40);
        System.out.println(john.getName() + " " + john.getAge());

        System.out.println();

        System.out.println(MyMath.length(10));
        System.out.println(MyMath.area(10));
        System.out.println(MyMath.length(10));
        System.out.println(MyMath.sum(1, 3, 5, 7));

    }
}
