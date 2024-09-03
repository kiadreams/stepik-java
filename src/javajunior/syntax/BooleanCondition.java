package javajunior.syntax;

public class BooleanCondition {

    public static void main(String[] args) {
        int temp = 25;
        int time = 21;

        boolean sampleTrue = true;
        boolean sampleFalse = false;
        System.out.println(sampleFalse);
        System.out.println(sampleTrue);

        boolean hot = temp >= 25;
        boolean cold = temp <= 20;
        boolean isNight = time > 22 || time < 6;

        if (hot && !isNight) {
            System.out.println("Кондиционер включён!");
        } else if (cold) {
            System.out.println("Кондиционер выключен!");
        } else {
            System.out.println("Температура в норме!!!");
        }
    }
}
