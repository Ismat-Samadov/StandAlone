package Classes;

enum DayOfWeek {
    SUNDAY,
    MONDAY,
    TUESDAY,
    WEDNESDAY,
    THURSDAY,
    FRIDAY,
    SATURDAY
}

class Main2 {
    public static void main(String[] args) {
        DayOfWeek today = DayOfWeek.MONDAY;

        // Switch statement using enum
        switch (today) {
            case MONDAY:
            case TUESDAY:
            case WEDNESDAY:
            case THURSDAY:
            case FRIDAY:
                System.out.println("It's a weekday.");
                break;
            case SATURDAY:
            case SUNDAY:
                System.out.println("It's a weekend.");
                break;
        }

        // Iterating over enum values
        for (DayOfWeek day : DayOfWeek.values()) {
            System.out.println(day);
        }
    }
}

