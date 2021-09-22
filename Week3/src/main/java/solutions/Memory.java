package solutions;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class Memory {
	public static void main(String[] args) {
		System.out.println(actualMemorySize("32GB"));
		System.out.println(actualMemorySize("2GB"));
		System.out.println(actualMemorySize("512MB"));
		System.out.println(actualMemorySize("51a2MB"));
	}

	private static String actualMemorySize(String s) {
		// Check if in correct format first
		boolean isGB = false;
		if (s.charAt(s.length()-2) == 'G') {
			isGB = true;
		} else if (s.charAt(s.length()-2) == 'M') {
			
		} else {
			return "Invalid entry type\n    Ensure the format is a number followed by GB or MB without a space\n    For Example: 123MB 1473.12GB";
		}
		double initSize;
		try {
			initSize = Double.parseDouble(s.substring(0,s.length()-2));
		} catch (Exception e){
			return s.substring(0,s.length()-2) + " is an invalid entry type\n    Ensure the format is a number followed by GB or MB without a space\n    For Example: 123MB or 1473.12GB";
		}
		
		double trueSize = initSize*.93;
		
		if (isGB) {
			BigDecimal roundSize = new BigDecimal(trueSize).setScale(2, RoundingMode.HALF_UP);
			return Double.toString(roundSize.doubleValue()) + "GB";
		} else {
			BigDecimal roundSize = new BigDecimal(trueSize).setScale(0, RoundingMode.HALF_UP);
			return roundSize.toString() + "MB";
		}
		
		
	}
}
