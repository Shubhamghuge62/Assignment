package com.extra;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class DateFormat {
    public static void main(String[] args) {
        // Get the current date and time
        LocalDateTime currentDateTime = LocalDateTime.now();

        // Define the formatter for the original format
        DateTimeFormatter originalFormatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");

        // Format the current date and time to a string using the original formatter
        String originalFormattedDate = currentDateTime.format(originalFormatter);

        System.out.println("Original Formatted Date: " + originalFormattedDate);

        // Define the formatter for the new format
        DateTimeFormatter newFormatter = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");

        // Parse the original formatted date and time to LocalDateTime
        LocalDateTime parsedDateTime = LocalDateTime.parse(originalFormattedDate, originalFormatter);

        // Format the parsed date and time to a string using the new formatter
        String newFormattedDate = parsedDateTime.format(newFormatter);

        System.out.println("New Formatted Date: " + newFormattedDate);
    }
}

