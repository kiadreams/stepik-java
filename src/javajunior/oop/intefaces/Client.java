package javajunior.oop.intefaces;

public class Client {

    public void makeOrder(Waiter waiter, String dish) {
        waiter.bringOrder(dish);
    }
}
