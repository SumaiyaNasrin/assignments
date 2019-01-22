/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.datetimeconvert;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.MonthDay;
import java.time.OffsetDateTime;
import java.time.OffsetTime;
import java.time.YearMonth;
import java.time.ZoneId;
import java.time.ZoneOffset;
import java.time.ZonedDateTime;
import java.util.Calendar;
import java.util.Date;

/**
 *
 * @author Asus
 */
public class Conversion {
      public static  LocalDate date_to_localdate(Date date) { // 1
		//SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
         final ZoneId systemDefault = ZoneId.systemDefault();
		LocalDate lt=date.toInstant().atZone(systemDefault).toLocalDate();
		return lt;
	}
	
	public static ZonedDateTime date_to_ZonedDateTime(Date date) { // 2

		return ZonedDateTime.ofInstant(date.toInstant(), ZoneId.systemDefault());
	}
	
	public static LocalDate calender_to_localdate(Calendar c) { // 1
		
		Instant ins = c.getTime().toInstant();
		LocalDate date = ins.atZone(ZoneId.systemDefault()).toLocalDate();
		return date;

	}
	
public static LocalDateTime date_to_Localdatetime(Date date) { // 4

	return date.toInstant().atZone(ZoneId.systemDefault()).toLocalDateTime();
}

public static LocalTime Localdatetime_to_Localtime(Date date) { // 5

	return LocalDateTime.ofInstant(date.toInstant(), ZoneId.systemDefault()).toLocalTime();
}
public static ZoneOffset Localdatetime_to_zoneOffSet(LocalDateTime ldt) { // 6

	return ZoneId.systemDefault().getRules().getOffset(ldt);
}

public static OffsetDateTime zoneOffSet_to_OffsetDateTime(ZoneOffset zno) { // 7

	return OffsetDateTime.now(zno);
}
public static OffsetTime OffsetDateTime_To_OffsetTime(OffsetDateTime dateTime) { // 8

	return  dateTime.toOffsetTime();
}
public static ZonedDateTime OffsetDateTime_To_zonedDateTime(OffsetDateTime dateTime) { // 9

	return  dateTime.toZonedDateTime();
}

public static OffsetTime zoneOffSetToOffsetTime(ZoneOffset zoneOffSet) { // 10

	return  OffsetTime.now(zoneOffSet);
}
}
