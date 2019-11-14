package fr.epsi.test.tdd.fizzbuzz;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;

public class FizzBuzz {

	public static String compute(int number) {
		Map<Integer, String> exceptions = createExceptions();

		String result = String.valueOf(number);

		for (Entry<Integer, String> exception : exceptions.entrySet()) {
			if (number % exception.getKey() == 0) {
				result = exception.getValue();
				break;
			}
		}
		return result;
	}

	@SuppressWarnings("serial")
	private static Map<Integer, String> createExceptions() {
		return new LinkedHashMap<Integer, String>() {
			{
				put(15, "FizzBuzz");
			}
			{
				put(5, "Buzz");
			}
			{
				put(3, "Fizz");
			}
		};
	}
}
