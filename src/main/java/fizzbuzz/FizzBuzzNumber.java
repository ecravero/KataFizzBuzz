package main.java.fizzbuzz;

/**
 * 
 * @author ecravero
 * 
 */
public class FizzBuzzNumber {
	private static final int FIZZ_VALUE = 3;
	private static final int BUZZ_VALUE = 5;
	private static final String FIZZ_MESSAGE = "Fizz";
	private static final String BUZZ_MESSAGE = "Buzz";

	private int value;

	public FizzBuzzNumber(int value) {
		this.value = value;
	}

	@Override
	public String toString() {
		String printableValue = "";

		if (isFizz() || isBuzz()) {
			if (isFizz()) {
				printableValue = FIZZ_MESSAGE;
			}
			if (isBuzz()) {
				printableValue += BUZZ_MESSAGE;
			}
		} else {
			printableValue = String.valueOf(value);
		}
		return printableValue;
	}

	private boolean isBuzz() {
		return value % BUZZ_VALUE == 0;
	}

	private boolean isFizz() {
		return value % FIZZ_VALUE == 0;
	}

	public int getValue() {
		return value;
	}

	public void setValue(int value) {
		this.value = value;
	}
}
