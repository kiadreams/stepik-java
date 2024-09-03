package javajunior.syntax;

public class Array {

    public static void main(String[] args) {
        String[] nameOfMonth = new String[12];
        nameOfMonth[0] = "January";
        nameOfMonth[1] = "February";
        nameOfMonth[2] = "March";
        nameOfMonth[3] = "April";
        nameOfMonth[4] = "May";
        nameOfMonth[5] = "June";
        nameOfMonth[6] = "July";
        nameOfMonth[7] = "August";
        nameOfMonth[8] = "September";
        nameOfMonth[9] = "October";
        nameOfMonth[10] = "November";
        nameOfMonth[11] = "December";

        for (int i = 0; i < 11; i++) {
            System.out.print(nameOfMonth[i] + ", ");
        }
        System.out.println(nameOfMonth[11] + ".");

        System.out.println();

        for (int x = 0; x < nameOfMonth.length; x++) {
            System.out.print(nameOfMonth[x]);
            if (x < nameOfMonth.length - 1) {
                System.out.print(", ");
            } else {
                System.out.println(".");
            }
        }

        System.out.println();

        int[] numbers = {1, 3, 5, 6};
        for (int y = 0; y < numbers.length; y++) {
            System.out.print(numbers[y]);
            System.out.print(" ");
        }

        System.out.println("\nДругой вариант цикла по массиву...");

        for (int number : numbers) {
            System.out.print(number + " ");
        }
    }
}
