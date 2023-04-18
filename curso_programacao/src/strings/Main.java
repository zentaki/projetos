package strings;

import java.util.Locale;

public class Main {

	public static void main(String[] args) {
		
		Locale brasil = new Locale("pt", "BR");
		Locale.setDefault(brasil);


		String original = "abcde FGHIJ ABC abc DEFG    ";

		String s01 = original.toLowerCase();
		String s02 = original.toUpperCase();
		String s03 = original.trim();
		String s04 = original.substring(2);
		String s05 = original.substring(2, 9);
		String s06 = original.replace('a', 'x');
		String s07 = original.replace("abc", "xy");
		int i = original.indexOf("bc");
		int j = original.lastIndexOf("bc");

		System.out.println("Original : -" + original + "-");
		System.out.println("toLowerCase : -" + s01 + "-");
		System.out.println("toUpperCase : -" + s02 + "-");
		System.out.println("trim : -" + s03 + "-");
		System.out.println("substring(2) : -" + s04 + "-");
		System.out.println("substring(2,9) : -" + s05 + "-");
		System.out.println("replace(a,x) : -" + s06 + "-");
		System.out.println("replace(abc,xy) : -" + s07 + "-");
		System.out.println("indexOf(bc) : -" + i + "-");
		System.out.println("lastIndexOf(bc) : -" + j + "-");

		String s = "batata maçã limão";
		String[] s_vec = s.split(" ");

		System.out.println("\nOriginal : " + s);
		for (int k = 0; k < s_vec.length; k++) {
			
			System.out.println("split(' ') : " + s_vec[k]);
		}

	}

}
