/**
 * 
 */
package com.openDJ.util;

import java.math.RoundingMode;
import java.text.DecimalFormat;

/**
 * @author Sagar Panchasara
 *
 */
public class NumberUtil {

	private final static DecimalFormat DECIMAL_FORMAT = new DecimalFormat(".##");
	static {
		DECIMAL_FORMAT.setRoundingMode(RoundingMode.UP);
		DECIMAL_FORMAT.setMinimumFractionDigits(2);
		DECIMAL_FORMAT.setMinimumIntegerDigits(1);
	}

	/**
	 * Format values as #.## format
	 * 
	 * @param value
	 * @return Returns null if {@code value} is null else formated String
	 */
	public static String twoDecimalFormat(Double value) {
		return value == null ? null : DECIMAL_FORMAT.format(value);
	}

}
