package JavaToJunior.part_1;

public class FloatDouble {

    public static void main(String[] args) {
        double radius = 10.8;
        double pi = 3.14;
        double area = pi * radius * radius;
        System.out.println(area);

        System.out.println();

        float radius_1 = 10.8f;
        float pi_1 = 3.14f;
        float area_1 = pi_1 * radius_1 * radius_1;
        System.out.println(area_1);

        System.out.println();

        int helen = 47;
        int max = 17;
        int john = 13;
        int nick = 22;
        int sum = helen + max + john + nick;
        double average = sum / 4;
        System.out.println(average);
        double average_2 = sum / 4f;
        System.out.println(average_2);
    }
}
