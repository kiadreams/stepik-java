package javajunior.oop.examples;

public class Person {
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void setAge(int age) {
        if (age > 10 && age < 110) {
            this.age = age;
        }
    }

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
//        return "Name: " + this.name + ";\n" + "Age: " + this.age + ";";  Не лучщий способ формировать строки!
        return String.format("Name: %s; Age: %s;", name, age);
    }
}
