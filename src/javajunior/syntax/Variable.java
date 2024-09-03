package javajunior.syntax;

public class Variable {

    public static void main(String[] args) {
        int x = 5;
        int y = x + 5;
        System.out.println(y);

        System.out.println();

        int john = 100;
        int nick = 100 * 5;
        System.out.println(nick + john);

        System.out.println();

        int a = 10;
        int b = 3;
        int c = a / b;
        System.out.println(c);

        System.out.println();

        int d = a % b;
        System.out.println(d);

        System.out.println();

        int all_days = 10000;
        int years = all_days / 365;
        int months = all_days % 365 / 30;
        int days = all_days % 365 % 30;
        System.out.println(years);
        System.out.println(months);
        System.out.println(days);
    }
}
