package servercode;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateChecking {

	public void DateChecking() {

	}

	public static void main(String args[]) {
		String inDate = "20161117 23:59:59";
		Date parsed = new Date();
		SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMdd HH:mm:ss");
		SimpleDateFormat output = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss'Z'");

		Date d = new java.util.Date();
		try {
			d = sdf.parse(inDate);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		String formattedTime = output.format(d);
		
		//String formattedTime = formatTimestamp(d, "yyyy-MM-dd");
		

		System.out.println(formattedTime);
	}

	
	public static String formatTimestamp(
			final java.util.Date timestamp,
			final String externalTimestampFormat)
		{
			// Local variables
			java.text.SimpleDateFormat format;
			String timestampString;

			// Is timestamp null?
			if (timestamp == null)
			{
				return null;
			}

			// Create timestamp format
			format = new java.text.SimpleDateFormat();
			format.applyPattern(externalTimestampFormat);

			// Format timestamp to string
			timestampString = format.format(timestamp);

			return timestampString;
		}
}
