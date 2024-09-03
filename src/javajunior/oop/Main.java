package javajunior.oop;

public class Main {

    public static void main(String[] args) {
        Box box1 = new Box();
        box1.setDimens(10, 10, 10);

        Box box2 = new Box();
        box2.setDimens(20, 20, 20);

        Box box3 = box2;

        box1.showVolume();

        box2.showVolume();

        box3.width = 0;
        box2.showVolume();

        System.out.println();

        var per1 = new Person();
        var per2 = new Person();
        var per3 = new Person();
        per1.name = "Ivan";
        per1.weight = 85.5f;
        per1.age = 34;
        per2.name = "Roman";
        per2.weight = 65.5f;
        per2.age = 45;
        per3.name = "Gorg";
        per3.weight = 75.5f;
        per3.age = 37;
        System.out.println((per1.age + per2.age + per3.age) / 3);

        System.out.println();

        Test test = new Test();
        System.out.println(test.square(7));

        System.out.println("Прямоугольник!");

        Rect rect = new Rect();
        rect.setSides(5, 3);
        System.out.println(rect.getArea());
    }
}
