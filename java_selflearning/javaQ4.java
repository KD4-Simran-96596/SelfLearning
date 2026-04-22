enum Day {
    MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY;

    // Check if weekend
    public boolean isWeekend() {
        return this == SATURDAY || this == SUNDAY;
    }

    // Check if weekday
    public boolean isWeekday() {
        return !isWeekend();
    }
}
public class EnumTest {
    public static void main(String[] args) {

        Day d = Day.SATURDAY;

        System.out.println("Day: " + d);

        if (d.isWeekend()) {
            System.out.println("It is Weekend");
        } else {
            System.out.println("It is Weekday");
        }

        // Loop through all days
        System.out.println("\nAll Days:");
        for (Day day : Day.values()) {
            System.out.println(day + " -> Weekend: " + day.isWeekend());
        }
    }
}
