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
	public void toStringShouldReturnOneWhenValueEqualsOne() {
		FizzBuzzNumber number = new FizzBuzzNumber(1);
		String expected = "1";
		Assert.assertEquals(expected, number.toString());
	}

	@Test
	public void toStringShouldReturnFizzWhenValueIsDivisibleBy3() {
		FizzBuzzNumber number = new FizzBuzzNumber(9);
		String expected = "Fizz";
		Assert.assertEquals(expected, number.toString());
	}

	@Test
	public void toStringShouldReturnBuzzWhenValueIsDivisibleBy5() {
		FizzBuzzNumber number = new FizzBuzzNumber(10);
		String expected = "Buzz";
		Assert.assertEquals(expected, number.toString());
	}

	@Test
	public void toStringShouldReturnFizzBuzzWhenValueIsDivisibleBy3And5() {
		FizzBuzzNumber number = new FizzBuzzNumber(15);
		String expected = "FizzBuzz";
		Assert.assertEquals(expected, number.toString());
	}

	@Test
	public void toStringShouldReturnFizzWhenValueContains3() {
		FizzBuzzNumber number = new FizzBuzzNumber(13);
		String expected = "Fizz";
		Assert.assertEquals(expected, number.toString());
	}

	@Test
	public void toStringShouldReturnBuzzWhenValueContains5() {
		FizzBuzzNumber number = new FizzBuzzNumber(52);
		String expected = "Buzz";
		Assert.assertEquals(expected, number.toString());
	}

	@Test
	public void toStringShouldReturnFizzBuzzWhenValueContains3And5() {
		FizzBuzzNumber number = new FizzBuzzNumber(53);
		String expected = "FizzBuzz";
		Assert.assertEquals(expected, number.toString());
	}

	@Test
	public void toStringShouldReturnFizzBuzzWhenValueContains3AndDivisibleBy5() {
		FizzBuzzNumber number = new FizzBuzzNumber(35);
		String expected = "FizzBuzz";
		Assert.assertEquals(expected, number.toString());
	}
}
