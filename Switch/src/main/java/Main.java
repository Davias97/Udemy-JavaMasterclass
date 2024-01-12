public class Main {

    public static void main(String[] args) {

        int value = 1;
        if (value == 1) {
            System.out.println("Value was 1");
        } else if (value == 2) {
            System.out.println("Value was 2");
        } else {
            System.out.println("Was not 1 or 2");
        }

        int switchValue = 3;

        switch (switchValue) {
            case 1:
                System.out.println("Value was 1");
                break;
            case 2:
                System.out.println("Value was 2");
                break;
            case 3:
            case 4:
            case 5:
                System.out.println("Was a 3, a 4, or a 5");
                System.out.println("Actually it was a " + switchValue);
                break;
            default:
                System.out.println("Was not 1, 2, 3, 4, or 5");
                break;
        }

        String month = "OCTOBER";
        System.out.println(month + " is in the " + getQuarter(month) + " quarter");

        char sign = 'B';

        switch (sign) {
            case 'A':
                System.out.println(sign + " Able");
                break;
            case 'B':
                System.out.println(sign + " Baker");
                break;
            case 'C':
                System.out.println(sign + " Charlie");
                break;
            case 'D':
                System.out.println(sign + " Dog");
                break;
            case 'E':
                System.out.println(sign + " Easy");
                break;
            default:
                System.out.println(sign + " not found");
                break;
        }

        printDayOfWeek(0);
        printDayOfWeek(1);
        printDayOfWeek(2);
        printDayOfWeek(3);
        printDayOfWeek(4);
        printDayOfWeek(5);
        printDayOfWeek(6);
        printDayOfWeek(7);
    }

    public static String getQuarter(String month) {

        return switch (month) {
            case "JANUARY", "FEBRUARY", "MARCH" -> {
                yield "1st";
            }
            case "APRIL", "MAY", "JUNE" -> "2nd";
            case "JULY", "AUGUST", "SEPTEMBER" -> "3rd";
            case "OCTOBER", "NOVEMBER", "DECEMBER" -> "4th";
            default -> {
                String badResponse = month + " is bad";
                yield badResponse;
            }
        };

    }

    public static void printDayOfWeek(int day) {

        String dayOfTheWeek =
                switch (day) {
                    case 0 -> "Sunday";
                    case 1 -> "Monday";
                    case 2 -> "Tuesday";
                    case 3 -> "Wednesday";
                    case 4 -> "Thursday";
                    case 5 -> "Friday";
                    case 6 -> "Saturday";
                    default -> "Invalid Day";
                };

        System.out.println(day + " is a " + dayOfTheWeek);
    }
}
