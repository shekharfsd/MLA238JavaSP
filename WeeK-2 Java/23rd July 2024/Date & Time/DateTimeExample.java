package com.mphasis.date;

import java.time.Duration;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.time.Period;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

public class DateTimeExample {
    public static void main(String[] args) {
        // LocalDate
        LocalDate today = LocalDate.now();
        LocalDate birthDate = LocalDate.of(1990, Month.JANUARY, 1);
        System.out.println("Today's date: " + today);
        System.out.println("Birth date: " + birthDate);
        
        
        
        // LocalTime
        LocalTime now = LocalTime.now();
        LocalTime meetingTime = LocalTime.of(14, 30);
        System.out.println("Current time: " + now);
        System.out.println("Meeting time: " + meetingTime);
        
        
        
        

        // LocalDateTime
        LocalDateTime appointment = LocalDateTime.of
        		(2024, Month.JULY, 23, 16, 30);
        System.out.println("Appointment: " + appointment);
        
        
        
        
        
  
        // ZonedDateTime
        ZonedDateTime zonedDateTime = ZonedDateTime.now();
        ZonedDateTime parisTime = ZonedDateTime.now
        		(ZoneId.of("Europe/London"));
       
        System.out.println("Current ZonedDateTime: " + zonedDateTime);
        System.out.println("Paris ZonedDateTime: " + parisTime);
        
        
        
        
        
        
        // Instant
        Instant instant = Instant.now();
        System.out.println("Current Instant: " + instant);
        
        
        
        
        
        
        
        
        
        // Duration
        Duration duration = Duration.ofHours(5);
        System.out.println("Duration: " + duration);
        
        // Period
        Period period = Period.ofYears(1);
        System.out.println("Period: " + period);
        
        Period period2 = Period.of(1, 6, 10);
        System.out.println("Period: " + period2);
        
        // Formatting and Parsing
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
       
        LocalDate parsedDate = LocalDate.parse("23/07/2024", formatter);
       
        String todaydate = today.format(formatter);
        
        System.out.println("Parsed date: " + parsedDate);
        
        System.out.println("Formatted date: " + todaydate);
        
        // ChronoUnit
        long daysBetween = ChronoUnit.DAYS.between(birthDate, today);
        System.out.println("Days between birth date and today: " + daysBetween);
    }
}
