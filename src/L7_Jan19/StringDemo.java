package L7_Jan19;

/**
 * @author Garima Chhikara
 * @email garima.chhikara@codingblocks.com
 * @date 19-Jan-2020
 *
 */

public class StringDemo {

	public static void main(String[] args) {

		String str = "hello";

		// size
		System.out.println(str.length());

		// charAt
		System.out.println(str.charAt(1));
		System.out.println(str.charAt(str.length() - 1));

		// substring
		System.out.println(str.substring(0, 5)); // hello
		// System.out.println(str.substring(4,2)); // error
		System.out.println(str.substring(2, 3)); // l
		System.out.println(str.substring(2, 2)); // length : 0
		System.out.println(str.substring(1)); // ello

		// concatenate
		String s1 = "hi";
		String s2 = "bye";
		String s3 = s1 + s2;
		System.out.println(s1 + ", " + s2 + ", " + s3);
		String s4 = s1.concat(s2);
		System.out.println(s1 + ", " + s2 + ", " + s4);

		// indexOf
		System.out.println(str.indexOf("ll"));

		// starts with
		System.out.println(str.startsWith("h"));
		System.out.println(str.startsWith("l"));

		// equals and ==
		s1 = "Hello";
		s2 = s1;
		s3 = "Hello";
		s4 = new String("Hello");

		System.out.println((s1 == s2) + ", " + s1.equals(s2));
		System.out.println((s1 == s3) + ", " + s1.equals(s3));
		System.out.println((s1 == s4) + ", " + s1.equals(s4));

		Integer a = 10;
		Integer aa = new Integer(10);

		System.out.println(a.equals(aa));

		System.out.println(str);

		str = str.replace("ll", "ww");

		System.out.println(str);

		long start = System.currentTimeMillis();
		appendString();
		long end = System.currentTimeMillis();
		System.out.println(end - start);

	}

	public static void appendString() {

		int n = 100000;

		// String str = "";
		StringBuilder sb = new StringBuilder();

		for (int i = 1; i <= n; i++) {
			// str = str + i;
			sb.append(i);

		}

	}

}
