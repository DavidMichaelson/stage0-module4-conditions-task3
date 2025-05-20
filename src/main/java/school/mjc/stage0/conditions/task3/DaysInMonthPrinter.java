package school.mjc.stage0.conditions.task3;

public class DaysInMonthPrinter {
    public void amountOfDays(int month) {

        if (month < 1 || month > 12) {
            System.out.println("wrong number!");
            return;
        }

        if (month == 4 || month == 6 || month == 9 || month == 11) {
            System.out.println("30");
        } else if (month == 2) {
            System.out.println("28");
        } else {
            System.out.println("31");
        }
    }

    public static void main(String[] args) {
        DaysInMonthPrinter printer = new DaysInMonthPrinter();
        printer.amountOfDays(0);
        printer.amountOfDays(1);
        printer.amountOfDays(2);
        printer.amountOfDays(3);
        printer.amountOfDays(4);
        printer.amountOfDays(5);
        printer.amountOfDays(6);
        printer.amountOfDays(7);
        printer.amountOfDays(8);
        printer.amountOfDays(9);
        printer.amountOfDays(10);
        printer.amountOfDays(11);
        printer.amountOfDays(12);
        printer.amountOfDays(13);
    }
}
