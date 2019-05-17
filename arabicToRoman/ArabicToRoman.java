package arabicToRoman;
import java.util.HashMap;

public class ArabicToRoman {

	private Integer[] levels = new Integer[] {1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};

	private HashMap<Integer, String> symbol = new HashMap<Integer, String>() {{
							put(1000, "M");
							put(900, "CM");
							put(500, "D");
							put(400, "CD");
							put(100, "C");
							put(90, "XC");
							put(50, "L");
							put(40, "XL");
							put(10, "X");
							put(9, "IX");
							put(5, "V");
							put(4, "IV");
							put(1, "I");
						}};

	public String ToRoman(int anArabic) {
		StringBuilder result = new StringBuilder();
		for (int level : levels) {
			if (anArabic >= level) {
				do {
					result.append(symbol.get(level));
					anArabic -= level;
				} while (anArabic >= level);
			}
		}
		return result.toString();
	}
}
