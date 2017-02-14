package servercode;

import java.text.DecimalFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.StringTokenizer;

public class PercentageFormatting {

	// Volume numeric format
	private static java.text.DecimalFormat volumeFormat;

	// Percentage numeric format
	private static java.text.DecimalFormat percentFormat;

	public void PercentageFormatting() {

	}

	public static void main(String args[]) {
		// Create volume numeric format
		volumeFormat = new java.text.DecimalFormat("#.##");

		// Create percentage numeric format
		percentFormat = new java.text.DecimalFormat("#.##");

		String inVal = "5.00GB";

		Long value;
		value = stringToBytes(inVal);

		System.out.println(value);

		String percentage = numericToPercent(5068700120D * 100F / value);
		// DecimalFormat df = new DecimalFormat( "#.00" );

		double rem = value / 100000;
		String remaining = numericToUnit(rem);

		System.out.println("Percentage - " + percentage);
		System.out.println("Remaining - " + remaining);
	}

	public static Long stringToBytes(final String operand) {
		// Local variables
		float intValue;

		intValue = Float.valueOf(operand.replaceAll("[^0-9.]+", ""));

		System.out.println("intValue = " + intValue);
		System.out.println("operand = " + operand);

		if (operand.indexOf("GB") != -1) {
			intValue = intValue * 1024 * 1024 * 1024;
		} else if (operand.indexOf("MB") != -1) {
			intValue = intValue * 1024 * 1024;
		} else if (operand.indexOf("KB") != -1) {
			intValue = intValue * 1024;
		}

		System.out.println("leaving intValue = " + intValue);

		return (long) intValue;
	}

	private static String numericToPercent(final double operand) {
		System.out.println("operand - " + operand);
		// Local variables
		String result = null;

		try {
			// Convert numeric to percent
			result = percentFormat.format(operand) + "%";

		} catch (Exception e) {
			System.out.println("exception - " + e.getMessage());
		}

		return result;
	}

	private static String numericToUnit(final double operand) {
		// Local variables
		String result;

		// Numeric must be expressed in gigabytes?
		if (operand >= (1024 * 1024 * 1024)) {
			// Convert megabyte numeric to gigabyte unit
			result = volumeFormat.format(operand / (1024 * 1024 * 1024)) + "GB";
		} else {
			// Convert megabyte numeric to unit
			result = volumeFormat.format(operand / (1024 * 1024)) + "MB";
		}

		return result;
	}
}
