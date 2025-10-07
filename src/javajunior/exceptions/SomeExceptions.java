package javajunior.exceptions;


public class SomeExceptions {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4,};
        try {
            System.out.println(numbers[5]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Индекс выходит за размер массива");
        }
    }
}
