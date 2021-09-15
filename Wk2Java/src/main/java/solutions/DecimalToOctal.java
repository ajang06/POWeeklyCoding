package solutions;

public class DecimalToOctal {
	public static void main(String[] args) {
		System.out.println(dToO(8));
	}

	private static String dToO(int i) {
		return Integer.toOctalString(i);
	}
}
