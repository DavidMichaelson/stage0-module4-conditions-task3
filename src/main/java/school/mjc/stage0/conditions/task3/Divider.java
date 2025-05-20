package school.mjc.stage0.conditions.task3;

public class Divider {
    public void isDividableBy5And11(int number) {

        if (number == 0) {
            System.out.println("cannot divide by zero");
        } else if (number % 5 == 0 && number % 11 == 0) {
            System.out.println("dividable");
        } else {
            System.out.println("Non dividable");
        }
    }

    public static void main(String[] args) {
        Divider divider = new Divider();
        divider.isDividableBy5And11(1);
        divider.isDividableBy5And11(10);
        divider.isDividableBy5And11(0);
        divider.isDividableBy5And11(100);
        divider.isDividableBy5And11(-10);
        divider.isDividableBy5And11(26);
    }
}
