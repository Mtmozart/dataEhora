package dataHora;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class formatacao {

	public static void main(String[] args) {
		
		LocalDate d01 = LocalDate.parse("2023-11-13");
		/*LocalDateTime d02 = LocalDateTime.parse("2023-11-13");
		Instant d03 = Instant.parse("2023-11-13");*/
		
		
		DateTimeFormatter fmt1 = DateTimeFormatter.ofPattern("dd/MM/yyyy"); 
		System.out.println(d01.format(fmt1));
		//ou
		System.out.println(fmt1.format(d01));
	}

}
