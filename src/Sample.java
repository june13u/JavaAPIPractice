
public class Sample {

	public static void main(String[] args) {
		String name = "Jun Otani";
		System.out.println(name);

		int codePointOfJ = name.codePointAt(0);
		int codePointOft = name.codePointAt(5);
		int codePoints[] = { codePointOfJ, codePointOft };
		String stringOfcodePoints = new String(codePoints, 0, 2);
		System.out.println(stringOfcodePoints);// Output: Ja
	}

}
