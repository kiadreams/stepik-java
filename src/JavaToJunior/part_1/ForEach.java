package JavaToJunior.part_1;

public class ForEach {
    public static void main(String[] args) {
        String[] students = {"Ivan", "Denis", "Peta", "Kola"};
        for (int i = 0; i < students.length; i++) {
            System.out.println(students[i]);
        }

        System.out.println();

        for (String student : students) {
            System.out.println(student);
        }

        System.out.println();

        int[] numbers = new int[100];
        for (int x = 100; x < 200; x++) {
            numbers[x - 100] = x;
        }

        for (var num : numbers) {
            System.out.println(num);
        }

    }
}
