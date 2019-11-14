package fr.epsi.test.tdd.fizzbuzz;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

class FizzBuzzTest {

	private int currentParam;

	@ParameterizedTest
	@ValueSource(ints = { 1, 2 })
	void doit_retourner_la_valeur(int param) {
		this.currentParam = param;
		expectIs(String.valueOf(param));
	}

	@ParameterizedTest
	@ValueSource(ints = { 3, 6 })
	void doit_retourner_fizz(int param) {
		this.currentParam = param;
		expectIs("Fizz");

	}

	@ParameterizedTest
	@ValueSource(ints = { 5, 10 })
	void doit_retourner_buzz(int param) {
		this.currentParam = param;
		expectIs("Buzz");
	}

	@ParameterizedTest
	@ValueSource(ints = { 15, 30 })
	void doit_retourner_fizzbuzz(int param) {
		this.currentParam = param;
		expectIs("FizzBuzz");
	}

	private void expectIs(String result) {
		assertEquals(result, FizzBuzz.compute(this.currentParam));
	}
}
