package com.mphasis.date;

import java.time.LocalDate;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

public class FormatEx {

	public static void main(String[] args) {

		// Create a LocalDate instance
		LocalDate date = LocalDate.of(2024, 7, 23);

		// Define various formatters
		DateTimeFormatter formatter1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		DateTimeFormatter formatter2 = DateTimeFormatter.ofPattern("MM/dd/yyyy");
		DateTimeFormatter formatter3 = DateTimeFormatter.ofPattern("EEEE, MMMM d, yyyy", Locale.ENGLISH);

		// Format the date
		String formattedDate1 = date.format(formatter1);
		String formattedDate2 = date.format(formatter2);
		String formattedDate3 = date.format(formatter3);

		System.out.println(formattedDate1); // Output: 23/07/2024
		System.out.println(formattedDate2); // Output: 07/23/2024
		System.out.println(formattedDate3); // Output: Tuesday, July 23, 2024

		ZonedDateTime zonedDateTime = ZonedDateTime.now();

		// Define various formatters with time zone
		DateTimeFormatter formatter4 = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss Z");
		DateTimeFormatter formatter5 = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss z");

		// Format the date-time with time zone
		String formattedDateTime1 = zonedDateTime.format(formatter4);
		String formattedDateTime2 = zonedDateTime.format(formatter5);

		System.out.println(formattedDateTime1); // Output: e.g., 2024-07-23 14:30:00 +0000
		System.out.println(formattedDateTime2); // Output: e.g., 2024-07-23 14:30:00 GMT
	
		// Define a formatter
		DateTimeFormatter formatter6 = DateTimeFormatter.ofPattern("dd/MM/yyyy");

		// Parse a string to LocalDate
		LocalDate parsedDate = LocalDate.parse("23/07/2024", formatter6);
		System.out.println(parsedDate);  // Output: 2024-07-23
		
		
		// Create a LocalDate instance
		LocalDate ldate = LocalDate.now();

		// Define a formatter with Locale
		DateTimeFormatter formatter7 = DateTimeFormatter.ofPattern("EEEE, MMMM d, yyyy", Locale.FRENCH);

		// Format the date
		String formattedDate = date.format(formatter7);
		System.out.println(formattedDate);  // Output: e.g., mardi 23 juillet 2024

	
	}
}
