package application;

import java.time.Duration;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

public class Program01 {

	public static void main(String[] args) {

		LocalDate d01 = LocalDate.now();
		LocalDateTime d02 = LocalDateTime.now();
		Instant d03 = Instant.now();
		LocalDate d04 = LocalDate.parse("2022-07-20");
		LocalDateTime d05 = LocalDateTime.parse("2022-07-20T01:30:26");
		Instant d06 = Instant.parse("2022-07-20T01:30:26Z");
		Instant d07 = Instant.parse("2022-07-20T01:30:26-03:00");
		
		// https://docs.oracle.com/javase/8/docs/api/java/time/format/DateTimeFormatter.html
		DateTimeFormatter fmt1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		LocalDate d08 = LocalDate.parse("20/07/2022", fmt1);
		
		DateTimeFormatter fmt2 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
		LocalDateTime d09 = LocalDateTime.parse("20/07/2022 01:30", fmt2);
		
		LocalDate d10 = LocalDate.of(2022, 7, 20);
		LocalDateTime d11 = LocalDateTime.of(2022,  7, 20, 1, 30);
		
		DateTimeFormatter fmt3 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm").withZone(ZoneId.systemDefault());
		DateTimeFormatter fmt4 = DateTimeFormatter.ISO_DATE_TIME;
		DateTimeFormatter fmt5 = DateTimeFormatter.ISO_INSTANT;
		
		System.out.println("d01 = " + d01.toString());
		System.out.println("d02 = " + d02.toString());
		System.out.println("d03 = " + d03.toString());
		System.out.println("d04 = " + d04.toString());
		System.out.println("d05 = " + d05.toString());
		System.out.println("d06 = " + d06.toString());
		System.out.println("d07 = " + d07.toString());
		System.out.println("d08 = " + d08.toString());
		System.out.println("d09 = " + d09.toString());
		System.out.println("d10 = " + d10.toString());
		System.out.println("d11 = " + d11.toString());
		System.out.println("d04 = " + d04.format(fmt1));
		System.out.println("d04 = " + fmt1.format(d04));
		System.out.println("d05 = " + d05.format(fmt1));
		System.out.println("d05 = " + d05.format(fmt2));
		System.out.println("d06 = " + fmt3.format(d06));
		System.out.println("d05 = " + d05.format(fmt4));
		System.out.println("d06 = " + fmt5.format(d06));
		
		//		for (String s: ZoneId.getAvailableZoneIds()) {
		//			System.out.println(s);
		//		}
		// Print the available zoneId to use
		
		LocalDate r1 = LocalDate.ofInstant(d06, ZoneId.systemDefault());
		System.out.println("r1 = " + r1);
		
		LocalDate r2 = LocalDate.ofInstant(d06, ZoneId.of("Portugal"));
		System.out.println("r2 = " + r2);
		
		LocalDateTime r3 = LocalDateTime.ofInstant(d06, ZoneId.systemDefault());
		System.out.println("r3 = " + r3);
		
		LocalDateTime r4 = LocalDateTime.ofInstant(d06, ZoneId.of("Portugal"));
		System.out.println("r4 = " + r4);
		
		System.out.println("d04 day = " + d04.getDayOfMonth());
		System.out.println("d04 month = " + d04.getMonthValue());
		System.out.println("d04 year = " + d04.getYear());
		System.out.println("d05 hours = " + d05.getHour());
		System.out.println("d05 minute = " + d05.getMinute());
	
		LocalDate pastWeekLocalDate = d04.minusDays(7);
		LocalDate nextWeekLocalDate = d04.plusDays(7);
		System.out.println("Past week local date = " + pastWeekLocalDate);
		System.out.println("Next week local date = " + nextWeekLocalDate);
		
		LocalDateTime pastWeekLocalDateTime = d05.minusDays(7);
		LocalDateTime nextWeekLocalDateTime = d05.plusDays(7);
		System.out.println("Past week local date time = " + pastWeekLocalDateTime);
		System.out.println("Next week local date time = " + nextWeekLocalDateTime);
		
		Instant pastWeekInstant = d06.minus(7, ChronoUnit.DAYS);
		Instant nextWeekInstant = d06.plus(7, ChronoUnit.DAYS);
		System.out.println("Past week instant = " + pastWeekInstant);
		System.out.println("Next week instant = " + nextWeekInstant);
		
		Duration t1 = Duration.between(pastWeekLocalDateTime, d05);
		System.out.println("t1 days = " + t1.toDays());
		
		Duration t2 = Duration.between(pastWeekLocalDate.atStartOfDay(), d04.atStartOfDay());
		System.out.println("t2 days = " + t2.toDays());
		
		Duration t3 = Duration.between(pastWeekInstant, d06);
		System.out.println("t3 days = " + t3.toDays());
		
		Duration t4 = Duration.between(d06, pastWeekInstant);
		System.out.println("t4 days = " + t4.toDays());
	}

}
