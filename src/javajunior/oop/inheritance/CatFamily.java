package javajunior.oop.inheritance;

public class CatFamily {
    protected int legs;
    protected int eyes;
    protected boolean canEatPerson;

//    public CatFamily() {
//        this.legs = 4;
//        this.eyes = 2;
//        this.canEatPerson = true;
//    }

    public CatFamily(int legs, int eyes, boolean canEatPerson) {
        this.legs = legs;
        this.eyes = eyes;
        this.canEatPerson = canEatPerson;
    }

    public int getLegs() {
        return legs;
    }

    public int getEyes() {
        return eyes;
    }

    public boolean isCanEatPerson() {
        return canEatPerson;
    }

    public void eat() {
        System.out.print("Кушаю");
    }
}
