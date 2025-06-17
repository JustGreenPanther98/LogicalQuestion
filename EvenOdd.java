//Finding given is number odd or even without using % 
import java.util.InputMismatchException;
import java.util.Scanner;
class PositiveIntException extends Exception{
	@Override
	public String toString() {
		return "Positive Integer are only allowed";
	}
	public String getMessage() {
		return"Positive Interger does not include any floating point number nor negative number";
	}
}
public class EvenOdd{
	public static String evenOrOdd(int number) {
		String s = Integer.toBinaryString(number);
		if(s.charAt(s.length()-1)=='0') return "Even";
		else return "Odd";
	}
	public static void main(String[] args) throws PositiveIntException {
		Scanner s = new Scanner(System.in);
		System.out.print("Enter Number : ");
		int number=0,flag=0;
		try {
			number=s.nextInt();
			if(number<=0) {
				try {
					throw new PositiveIntException();
				}
				catch(Exception e) {
					System.out.println(e);
					flag=1;
				}
			}
		}
		catch(InputMismatchException e) {
			System.out.println("Floating point/String/boolean are not allowed");
			flag=1;
		}
		if(flag==0) System.out.println(evenOrOdd(number));
	}
	
}