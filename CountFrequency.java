//cOUNTING fREQUENCY OF CHARACTER IN SENTANCES
import java.util.Scanner;
public class CountFrequency{
	public static void main(String[] args) {
		Scanner S = new Scanner(System.in);
	    String Sentance,c,choice;
		int frequency=0;
		System.out.print("Enter the Sentence : ");
		Sentance = S.nextLine();
		System.out.print("Enter a character : ");
		c = S.next();
		System.out.print("Do you want to find frequency  of "+c+" case sensitive ? (Yes/No) : ");
		choice = S.next();
		if(choice.toLowerCase().equals("yes")) {
		  for(int i=0;i<Sentance.length();i++) {
			if(Sentance.substring(i,i+1).equals(c)) {
				frequency++;
			}
		  }
		}
		else {
			for(int j=0;j<Sentance.length();j++) {
				if(Sentance.substring(j,j+1).equalsIgnoreCase(c)) {
					frequency++;
				}
			}
		}
		System.out.println("The Frequency of Character " + c+" is :"+frequency);
		int Ascii = (int)c.charAt(0);
		System.out.println("The Frequency/ASCII of Character " + c+" is "+ frequency/Ascii);

	}
}
