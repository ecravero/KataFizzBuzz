package test.java.fizzbuzz;

import main.java.fizzbuzz.FizzBuzzNumber;

import org.junit.Assert;
import org.junit.Test;

/**
 * 
 * @author ecravero
 * 
 */
public class FizzBuzzNumberTest {
	@Test
	public void toStringShouldReturnOneWhenEqualsOne() {
		FizzBuzzNumber number = new FizzBuzzNumber(1);
		String expected = "1";
		Assert.assertEquals(expected, number.toString());
	}

	@Test
	public void toStringShouldReturnFizzWhenDivisibleBy3() {
		FizzBuzzNumber number = new FizzBuzzNumber(9);
		String expected = "Fizz";
		Assert.assertEquals(expected, number.toString());
	}

	@Test
	public void toStringShouldReturnBuzzWhenDivisibleBy5() {
		FizzBuzzNumber number = new FizzBuzzNumber(10);
		String expected = "Buzz";
		Assert.assertEquals(expected, number.toString());
	}

	@Test
	public void toStringShouldReturnFizzBuzzWhenDivisibleBy3And5() {
		FizzBuzzNumber number = new FizzBuzzNumber(15);
		String expected = "FizzBuzz";
		Assert.assertEquals(expected, number.toString());

	}
}
