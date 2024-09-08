package javajunior.oop.intefaces;

import java.util.ArrayList;

public class AnimalMain {

    public static void main(String[] args) {
        var cat = new Cat();
        var fish = new Fish();
        var dog = new Dog();
        var bird = new Bird();
        var list = new ArrayList<Animal>();
        list.add(cat);
        list.add(fish);
        list.add(dog);
        list.add(bird);

        System.out.println("Заставляем всех животных есть");
        for (Animal animal : list) {
            animal.eat();
        }
        Animal animal = new Dog();
        animal.eat();
//        animal.run(); Так не работает!
        Dog dog1 = (Dog) animal;
        dog1.run();

        System.out.println();

        animal = new Cat();
//        dog1 = (Dog) animal; //Здесь ошибка, так как кот к собаке не привести!

        System.out.println("Заставим бегать способных на это животных");
        var list2 = new ArrayList<AbleToRun>();
        list2.add(dog1);
        list2.add(new Cat());
        for (AbleToRun animal1 : list2) {
            animal1.run();
        }

        System.out.println("Заставим летать способных на это животных");

        AbleToFly ableToFly = new Bird();
        ableToFly.fly();
    }
}
