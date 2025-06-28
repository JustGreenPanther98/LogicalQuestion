import java.util.HashSet;
public class CountingDuplicatesNumberAndAlphabet {
	public static int duplicateCount(String text) {
		boolean[] presentAlphabet = new boolean[26];
		boolean[] presentNumeric = new boolean[9];
		HashSet<Character> repeated = new HashSet<Character>();
		for (char c : text.toCharArray()) {
			if (Character.isAlphabetic(c)) {
				int index = Character.toLowerCase(c) - 'a';
				if (presentAlphabet[index] == false)
					presentAlphabet[index] = true;
				else
					repeated.add(Character.toLowerCase(c));
			} else {
				int index1 = c - '0';
				if (presentNumeric[index1] == false)
					presentNumeric[index1] = true;
				else
					repeated.add(c);
			}
		}
		return repeated.size();
	}
}