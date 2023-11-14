package dataHora;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.Instant;
import java.util.Date;
import java.util.TimeZone;

public class simpleDateFormat {

	public static void main(String[] args) throws ParseException {
		
		Date now = new Date();
		Date nowMilli = new Date(System.currentTimeMillis());
		//tratando com milli segundo
		Date nowMilli05 = new Date(1000L * 60L * 60L * 5L);
		
		SimpleDateFormat sdf1 = new SimpleDateFormat("dd/MM/yyyy");
		SimpleDateFormat sdf2= new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		SimpleDateFormat sdf3= new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		sdf3.setTimeZone(TimeZone.getTimeZone("GMT"));
		
		Date y1 = sdf1.parse("25/06/2023");
		Date y2 = sdf2.parse("25/06/2023 19:34:34");
		Date y3 = Date.from(Instant.parse("2018-06-25T15:42:07Z"));	
		
		System.out.println("now " + sdf2.format(now));
		System.out.println("nowMilli " + sdf2.format(nowMilli));
		System.out.println("nowMilli05 " + sdf2.format(nowMilli05));
		System.out.println("y1 " + sdf2.format(y1));
		System.out.println("y2 " + sdf2.format(y2));
		System.out.println("y3 " + sdf2.format(y3));
		
		System.out.println("----------------------");
		
		System.out.println("now " + sdf3.format(now));
		System.out.println("nowMilli " + sdf3.format(nowMilli));
		System.out.println("nowMilli05 " + sdf3.format(nowMilli05));
		System.out.println("y1 " + sdf3.format(y1));
		System.out.println("y2 " + sdf3.format(y2));
		System.out.println("y3 " + sdf3.format(y3));
	}

}
