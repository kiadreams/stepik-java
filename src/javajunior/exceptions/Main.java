package javajunior.exceptions;

public class Main {

    public static void main(String[] args) {
        int a = 1;
        try {
            int b = 7 / a;
            int c = Integer.parseInt("1a");
        } catch (Exception e) {
            System.out.println("На ноль делить нельзя!\n" + e.getClass() + e.getMessage());
        }
        System.out.println("Hello!");

        var myArray = new int[5];
        myArray[0] = 1;
        for (int i = 0; i <= 5; i++) {
            try {
                System.out.println(myArray[i]);
            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("Индекс находится вне массива!\n" + e.getClass()+ ": " + e.getMessage());
            }
        }
    }
}
