public class AreValidBrackets {
  /*
   * Function that takes a string of braces, and determines if the order of the braces is valid. 
   * It should return true if the string is valid, 
   * and false if it's invalid.
   * All input strings will be nonempty, 
   * and will only consist of parentheses, brackets and curly braces: ()[]{}.
   */
	public boolean isValid(String braces) {
    if(braces.trim().isEmpty()) 
      return true;
    if(braces.charAt(0)==')'||braces.charAt(0)=='}'||braces.charAt(0)==']'||braces.charAt(braces.length()-1)=='('||braces.charAt(braces.length()-1)=='{'||braces.charAt(braces.length()-1)=='[')
      return false;
    char [] stack = new char[braces.length()];
    int top=-1;
    for(char c : braces.toCharArray()){
      if(c=='('||c=='['||c=='{'){
        top++;
        stack[top]=c;
      }
      else if(c==')'||c==']'||c=='}'){
        char getTop = stack[top];
        top--;
        if(getTop=='('&& c==')' || getTop=='['&& c==']' || getTop=='{'&& c=='}') continue;
        else return false;
      }
    }
    return top==-1;
  }
}