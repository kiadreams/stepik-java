package javajunior.oop.intefaces;

public class Chef implements Worker, Driver {

    @Override
    public void drive() {
        System.out.println("Программист водит!");
    }

    @Override
    public void work() {
        System.out.println("Программист работает!");
    }
}
