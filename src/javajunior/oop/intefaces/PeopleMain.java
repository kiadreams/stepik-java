package javajunior.oop.intefaces;

public class PeopleMain {

    public static void main(String[] args) {
        Director director = new Director();
        Programmer programmer = new Programmer();
        director.force(new Worker() {
            @Override
            public void work() {
                System.out.println("Работник работает!");
            }
        });

        System.out.println("\nДомашка с официантом 1 вариант!");
        Client client = new Client();
        var waiter = new WaiterBob();
        client.makeOrder(waiter, "пицца");

        System.out.println("\nДомашка с официантом 2 вариант!");
        client.makeOrder(new Waiter() {
            @Override
            public void bringOrder(String dish) {
                System.out.println("Официант принес: " + dish);
            }
        }, "торт");



    }
}
