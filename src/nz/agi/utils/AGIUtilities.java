package nz.agi.utils;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class AGIUtilities 
{
	public static String getData(int offset)
	{
		String retDate;
	
		Calendar calendar=Calendar.getInstance();
		
		calendar.add(Calendar.DATE, offset);
		
		SimpleDateFormat formatObject = new SimpleDateFormat("dd/MM/yyyy");

		retDate = formatObject.format(calendar.getTime());
		
		return retDate;
		
	}
	

}
