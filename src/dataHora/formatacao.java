package dataHora;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;

public class formatacao {

	public static void main(String[] args) {
		
		LocalDate d01 = LocalDate.parse("2023-11-13");
		LocalDateTime d02 = LocalDateTime.parse("2023-11-13T01:30:26");
		Instant d03 = Instant.parse("2023-11-13T01:30:26Z");
		
		
		DateTimeFormatter fmt1 = DateTimeFormatter.ofPattern("dd/MM/yyyy"); 
		DateTimeFormatter fmt2 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm"); 
		DateTimeFormatter fmt3 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm").withZone(ZoneId.systemDefault());
		DateTimeFormatter fmt4 = DateTimeFormatter.ISO_DATE_TIME;
		DateTimeFormatter fmt5 = DateTimeFormatter.ISO_INSTANT;
		System.out.println(d01.format(fmt1));
		//ou
		System.out.println(fmt1.format(d01));
		System.out.println(fmt2.format(d02));
		System.out.println(fmt1.format(d02));
		System.out.println(fmt3.format(d03));
		System.out.println("d05 = " + d02.format(fmt4));
		System.out.println("d06 = " + fmt5.format(d03));
	}	

}
