package Classes;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class DateTimeExample {
    public static void main(String[] args) {
        // Get the current date and time
        LocalDateTime currentDateTime = LocalDateTime.now();
        System.out.println("Current date and time: " + currentDateTime);

        // Format a date
        LocalDate date = LocalDate.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        String formattedDate = date.format(formatter);
        System.out.println("Formatted date: " + formattedDate);

        // Parse a date from a string
        String dateString = "2023-06-23";
        formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        LocalDate parsedDate = LocalDate.parse(dateString, formatter);
        System.out.println("Parsed date: " + parsedDate);

        // Add or subtract days from a date
        LocalDate futureDate = date.plusDays(7);
        LocalDate pastDate = date.minusDays(3);
        System.out.println("Current date: " + date);
        System.out.println("Date in the future: " + futureDate);
        System.out.println("Date in the past: " + pastDate);

        // Compare two dates
        LocalDate date1 = LocalDate.of(2023, 6, 23);
        LocalDate date2 = LocalDate.of(2023, 6, 25);
        int comparisonResult = date1.compareTo(date2);
        if (comparisonResult < 0) {
            System.out.println(date1 + " is before " + date2);
        } else if (comparisonResult > 0) {
            System.out.println(date1 + " is after " + date2);
        } else {
            System.out.println(date1 + " is equal to " + date2);
        }
    }
}

