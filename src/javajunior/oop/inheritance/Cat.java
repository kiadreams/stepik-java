package javajunior.oop.inheritance;

public class Cat extends CatFamily {

    public Cat() {
        super(4, 2, false);
        this.canEatPerson = false;
    }

    @Override
    public void eat() {
        super.eat();
        System.out.println(" visskas!");
    }
}
