package JavaToJunior.part_1;

public class SwitchCase {
    public static void main(String[] args) {
        String[] months = {
                "january",
                "february",
                "march",
                "april",
                "may",
                "june",
                "july",
                "august",
                "september",
                "october",
                "november",
                "december"
        };

        int month = 5;

        int month2 = 15;

        switch (month2) {
            case 1:
                System.out.println("january");
                break;
            case 2:
                System.out.println("february");
                break;
            case 3:
                System.out.println("march");
                break;
            case 4:
                System.out.println("april");
                break;
            case 5:
                System.out.println("may");
                break;
            case 6:
                System.out.println("june");
                break;
            case 7:
                System.out.println("july");
                break;
            case 8:
                System.out.println("august");
                break;
            case 9:
                System.out.println("september");
                break;
            case 10:
                System.out.println("october");
                break;
            case 11:
                System.out.println("november");
                break;
            case 12:
                System.out.println("december");
                break;
            default:
                System.out.println("Месяц не известен!");
        }

        System.out.println(months[month - 1]);

        String nameOfMonth = "august";
        switch (nameOfMonth) {
            case "december":
            case "january":
            case "february":
                System.out.println("It's winter now!");
                break;
            case "march":
            case "april":
            case "may":
                System.out.println("It's spring now!");
                break;
            case "june":
            case "july":
            case "august":
                System.out.println("It's summer now!");
                break;
            case "september":
            case "october":
            case "november":
                System.out.println("It's fall now!");
                break;
            default:
                System.out.println("There is no such month!");


        }
    }
}
