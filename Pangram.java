//Pangram is a string in which all alphabets are present at least once
import java.util.Scanner;
public class pangram{
	public static void main(String [] args) {
		String Sentance,lowerSentance;
		Scanner S = new Scanner(System.in);
		Sentance = S.nextLine();
		lowerSentance = Sentance.toLowerCase();
		boolean [] AllLetter= new boolean[26];
		int DistinctPresent=0;
		for(char c : lowerSentance.toCharArray()) {
			if(c>='a'&&c <='z') {
				int index = c - 'a';
				if(!AllLetter[index]) {
					AllLetter[index]=true;
					DistinctPresent++;
				}
			}
		}
		if(DistinctPresent==26) {
			System.out.println("The String is Pangram");
			S.close();
			return;
		}
        System.out.println("String is not Pangram");
		S.close();
	}
}
