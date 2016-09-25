import org.junit.Test;

public class StringTest {


	@Test
	public void TestConstractor() {
		String name = "Jun Otani";
		System.out.println(name); // Output: Jun Otani

		int codePointOfJ = name.codePointAt(0);
		int codePointOft = name.codePointAt(5);
		int codePoints[] = { codePointOfJ, codePointOft };
		String stringOfcodePoints = new String(codePoints, 0, 2);
		System.out.println(stringOfcodePoints);// Output: Ja
	}
}
