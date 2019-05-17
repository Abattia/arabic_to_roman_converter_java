package arabicToRoman.tests;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertEquals;
public class ToRomanShould {

	arabicToRoman.ArabicToRoman atr;

	@Before
	public void SetUp() {
		atr = new arabicToRoman.ArabicToRoman();
	}

	@Test
	public void ReturnsMMDCCLXIVWIth2764() {
		String result = atr.ToRoman(2764);
		assertEquals("MMDCCLXIV", result);
	}

	@Test
	public void ReturnsXWIth10() {
		String result = atr.ToRoman(10);
		assertEquals("X", result);
	}

	@Test
	public void ReturnsIIIWIth3() {
		String result = atr.ToRoman(3);
		assertEquals("III", result);
	}

	@Test
	public void ReturnsIIWIth2() {
		String result = atr.ToRoman(2);
		assertEquals("II", result);
	}

	@Test
	public void ReturnsIWIth1() {
		String result = atr.ToRoman(1);
		assertEquals("I", result);
	}

	@Test
	public void TesterIsWorking() {
		String test = "Tester is working";
		assertEquals("Tester is working", test);
	}
}
