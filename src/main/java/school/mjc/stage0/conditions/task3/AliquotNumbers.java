package school.mjc.stage0.conditions.task3;

public class AliquotNumbers {
    public void isFirstAliquot(int first, int second) {

        if (first < second && second % first == 0) {
            System.out.println("Aliquot");
        } else {
            System.out.println("Not aliquot");
        }
    }

    public static void main(String[] args) {
        AliquotNumbers numbers = new AliquotNumbers();
        numbers.isFirstAliquot(5, 6);
        numbers.isFirstAliquot(6, 5);
        numbers.isFirstAliquot(9, 10);
        numbers.isFirstAliquot(3, 12);
    }
}
