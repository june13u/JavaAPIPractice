import static org.hamcrest.CoreMatchers.is;

import org.junit.Assert;
import org.junit.Test;

public class StringTest {

	@Test
	public void constractorTest() {
		String name = "Jun Otani";
		System.out.println(name); // Output: Jun Otani

		int codePointOfJ = name.codePointAt(0);
		int codePointOft = name.codePointAt(5);
		int codePoints[] = { codePointOfJ, codePointOft };
		String stringOfcodePoints = new String(codePoints, 0, 2);
		System.out.println(stringOfcodePoints);// Output: Ja
		
		String a = new String(new int[] { 100, 110012 }, 0, 2);
		System.out.println(a);
		System.out.println(a.length());

	}

	@Test
	public void shiftOperationTest() {

		// 右シフト演算符号あり
		Assert.assertThat(-100 >> 1, is(-50));

		// 右シフト演算符号なし(補数を考慮しない)
		Assert.assertThat(-100 >>> 1, is(2147483598));

		// 左シフト演算符号あり
		Assert.assertThat(-100 << 1, is(-200));
		
		String hibyte = new String (new byte[]{111,111,111}, 10, 0, 3);
		System.out.println(hibyte);

	}
}
