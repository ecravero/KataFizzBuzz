package main.java.fizzbuzz;

/**
 * 
 * @author ecravero
 * 
 */
public class FizzBuzzNumber {
	private static final Integer FIZZ_VALUE = 3;
	private static final Integer BUZZ_VALUE = 5;
	private static final String FIZZ_MESSAGE = "Fizz";
	private static final String BUZZ_MESSAGE = "Buzz";

	private Integer value;

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

	private boolean isFizz() {
		return value % FIZZ_VALUE == 0
				|| value.toString().contains(FIZZ_VALUE.toString());
	}

	private boolean isBuzz() {
		return value % BUZZ_VALUE == 0
				|| value.toString().contains(BUZZ_VALUE.toString());
	}

	public Integer getValue() {
		return value;
	}

	public void setValue(Integer value) {
		this.value = value;
	}

}
