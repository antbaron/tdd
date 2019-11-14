package fr.epsi.test.tdd.roman;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

class RomanNumberTest {

	@ParameterizedTest(name = "{1} should be \"{0}\"")
	@CsvSource({ "I, 1", "II, 2", "IV, 4", "V, 5", "VI, 6", "IX, 9", "X, 10", "XI, 11", "XIV, 14", "XV, 15", "XVI, 16",
			"XIX, 19", "XX, 20", "XL, 40", "L, 50", "XC, 90", "C, 100", "CD, 400", "D, 500", "CM, 900", "M, 1000" })
	void testIntToRoman(String word, int number) {
		assertEquals(word, RomanNumber.compute(number));
	}

	
	@ParameterizedTest(name = "{1} should be \"{0}\"")
	@CsvSource({"MMMMDCCCLXXXVIII, 4888", "MDXV, 1515", "MMII, 2002", "DCLXVI, 666", "DIX, 509"})
	void testExempleSources(String word, int number) {
		assertEquals(word, RomanNumber.compute(number));
	}

}
