package solutions;

/*
 * TASK: Write a program to encrypt a message using the ROT13 technique.
 */
public class ROT13Technique {

	public static void main(String[] args) {
		System.out.println(encrypt("Rapelcgvba"));
	}

	private static String encrypt(String s) {
		String ret = "";
		for (int i = 0; i < s.length(); i++) {
			char c = s.charAt(i);
			if (c >= 'a' && c <= 'm') {
				c += 13;
			}				
			else if (c >= 'A' && c <= 'M') {
				c += 13;
			}
			else if (c >= 'n' && c <= 'z') {
				c -= 13;
			}
			else if (c >= 'N' && c <= 'Z') {
				c -= 13;
			}
			ret += c;
		}
		return ret;
		
	}

}
