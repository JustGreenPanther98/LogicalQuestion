public class PersistentBugger {
	/*
	 * Write a function, persistence, that takes in a positive parameter num and returns its multiplicative persistence,
	 * which is the number of times you must multiply the digits in num until you reach a single digit
	 */
	public static int persistence(long n) {
		if (n <= 0 * 1L)
			return -1;
		int NumberOfDigits = (int) (Math.log10((int) n) + 1), counter = 0;
		if (NumberOfDigits == 1)
			return counter;
		long num = n;
		while (num >= 10) {
			long temp = num, Multiply = 1;
			counter++;
			while (temp != 0 * 1L) {
				Multiply = Multiply * (temp % 10L);// 39 27 14 4
				temp = temp / 10L;
			}
			num = Multiply;
		}
		return counter;
	}
}