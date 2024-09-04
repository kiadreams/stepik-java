package javajunior.oop;

public class Worker {
    String name;
    String position;
    int salary;

//    Worker(String name, String position, int salary) {
//        this.name = name;
//        this.position = position;
//        this.salary = salary;
//    }


    public Worker(String name, String position, int salary) {
        this.name = name;
        this.position = position;
        this.salary = salary;
    }

    void showInfo() {
        System.out.println(
                "Сотрудник: " + name + " на должности " + position + " получает зарплату " + salary + " рублей;"
        );
    }
}
