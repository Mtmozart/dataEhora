package dataHora;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class dataHora {

	public static void main(String[] args) {
		DateTimeFormatter fmt1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		
		//data local - só a data
		LocalDate d01 = LocalDate.now();
		System.out.println(d01);
		//data local - com o time
		LocalDateTime d02 =LocalDateTime.now();
		System.out.println("-------");
		System.out.println(d02);
		//instant
		Instant d03 = Instant.now();
		System.out.println("-------");
		System.out.println(d03);
		
		//data ISO-9601
		LocalDate d04 = LocalDate.parse("2023-11-13");
		System.out.println("-------");
		System.out.println(d04);
		
		//data e time ISO-9601
				LocalDateTime d05 = LocalDateTime.parse("2023-11-13T01:30:26");
				System.out.println("-------");
				System.out.println(d05);
				//instant
				Instant d06 = Instant.parse("2023-11-13T01:30:26Z");
				System.out.println("-------");
				System.out.println(d06);
				
		//DAQUI
				Instant d07 = Instant.parse("2023-11-13T01:30:26-03:00");
				System.out.println("-------");
				System.out.println(d07);
				
				//fORMATO CUSTOMIZADO https://docs.oracle.com/en/java/javase/20/docs/api/java.base/java/time/format/DateTimeFormatter.html
				
				
				LocalDate d08 = LocalDate.parse("20/07/2023", fmt1);
				System.out.println("-------");
				System.out.println(d08);
				//DIA MES E ANO
				LocalDate d09 = LocalDate.of(2023, 11, 13);
				System.out.println("-------");
				System.out.println(d09);
				
				
	}

}
