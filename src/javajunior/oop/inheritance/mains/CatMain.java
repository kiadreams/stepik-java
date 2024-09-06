package javajunior.oop.inheritance.mains;


import javajunior.oop.inheritance.Cat;
import javajunior.oop.inheritance.Lion;

public class CatMain {

    public static void main(String[] args) {
        var cat = new Cat();
        var lion = new Lion();
        System.out.println(cat.isCanEatPerson());
        System.out.println(lion.isCanEatPerson());

        System.out.println();

        lion.eat();
        cat.eat();
    }
}
