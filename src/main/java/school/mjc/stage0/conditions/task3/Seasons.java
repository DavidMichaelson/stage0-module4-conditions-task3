package school.mjc.stage0.conditions.task3;

public class Seasons {
    public void tellTheSeasonByMonthNumber(int month) {

        if ((month > 0 && month < 3) || (month == 12)) {
            System.out.println("Winter");
        } else if (month > 2 && month < 6) {
            System.out.println("Spring");
        } else if (month > 5 && month < 9) {
            System.out.println("Summer");

        } else if (month > 8 && month < 12) {
            System.out.println("Autumn");
        } else  {
            System.out.println("wrong number!");
        }
    }

    public static void main(String[] args) {
        Seasons seasons = new Seasons();
        seasons.tellTheSeasonByMonthNumber(12);
        seasons.tellTheSeasonByMonthNumber(1);
        seasons.tellTheSeasonByMonthNumber(2);
        seasons.tellTheSeasonByMonthNumber(3);
        seasons.tellTheSeasonByMonthNumber(4);
        seasons.tellTheSeasonByMonthNumber(5);
        seasons.tellTheSeasonByMonthNumber(6);
        seasons.tellTheSeasonByMonthNumber(7);
        seasons.tellTheSeasonByMonthNumber(8);
        seasons.tellTheSeasonByMonthNumber(9);
        seasons.tellTheSeasonByMonthNumber(10);
        seasons.tellTheSeasonByMonthNumber(11);
        seasons.tellTheSeasonByMonthNumber(13);
    }
}
