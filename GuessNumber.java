import java.util.Random;
public class GuessNumber{
	private int n;
	private int m;
	private int noOfGuess=0;
	Random r = new Random();
	public GuessNumber(int number) {
		n= r.nextInt(100);
		m= number;
		noOfGuess++;
	}
	public void setGuessNumber(int j) {
		m=j;
		noOfGuess++;
	}
	public boolean isCorrectGuess() {
		System.out.println("Number should be in range of 0-99");
		if(n==m) {
			System.out.println("Congratulations you won \n");
			System.out.print("Number of guesses you took "+ noOfGuess);
			return true;
		}
		else if(m>=100||m<0) {
			System.out.println("INVALID");
			return false;
		}
		else if(n>m) {
			System.out.println(m+" is smaller then the actual number ");
			return false;

		}
		else if(n<m) {
			System.out.println(m +" is larger then the actual number");
			return false;

		}
		else {
			return false;
		}
	}
	public int getTheGuessedNumber() {
		return m;
	}
	public int getActualNumber() {
		return n;
	}
}