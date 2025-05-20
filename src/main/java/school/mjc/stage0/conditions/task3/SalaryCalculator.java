package school.mjc.stage0.conditions.task3;

public class SalaryCalculator {
    public void calculateSalary(int salary) {

        if (salary < 0) {
            System.out.println("wrong input!");
        } else if (salary <= 10000) {
            System.out.println((int)(salary * 0.85));
        } else if (salary <= 20000) {
            System.out.println((int)(salary * 0.82));
        } else {
            System.out.println((int)(salary * 0.8));
        }
    }

    public static void main(String[] args) {
        SalaryCalculator calculator = new SalaryCalculator();
        calculator.calculateSalary(0);
        calculator.calculateSalary(-5);
        calculator.calculateSalary(9999);
        calculator.calculateSalary(19999);
        calculator.calculateSalary(20001);
    }
}
