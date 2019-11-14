package fr.epsi.test.tdd.roman;


public class RomanNumber {

	public static String compute(int number) {
		String output = "";
		for (RomanSymbol romanSymbol : RomanSymbol.values()) {
			while (number >= romanSymbol.getChiffreArabe()) {
				output += romanSymbol.name();
				number -= romanSymbol.getChiffreArabe();
			}
		}
		return output;
	}

}
