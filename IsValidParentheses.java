public class IsValidParentheses {
	// String only contains "(" or ")"
	public class Kata {
		public static boolean validParentheses(String parenStr) {
			if (parenStr.isEmpty())
				return true;
			int counter = 0;
			for (int i = 0; i < parenStr.length(); i++) {
				if (parenStr.charAt(i) == '(')
					counter++;
				else {
					counter--;
					if (counter < 0)
						return false;
				}
			}
			if (counter == 0 && parenStr.charAt(0) == '(' && parenStr.charAt(parenStr.length() - 1) == ')')
				return true;
			else
				return false;
		}
	}
}