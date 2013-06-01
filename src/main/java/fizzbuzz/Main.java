package main.java.fizzbuzz;

public class Main {

	public static void main(String[] args) {
		FizzBuzzNumber number = null;
		for (int i = 1; i <= 100; i++) {
			number = new FizzBuzzNumber(i);

			System.out.println(number.toString());
		}
	}
}
