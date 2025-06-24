public class CamelCaseToNormal{
	public static String camelCase(String input) {
	    //camelCasing=>camle Casing
	    if(input.trim().isEmpty()) return "";
	    StringBuilder sc = new StringBuilder();
	    for(int i=0;i<input.length();i++){
	      if(Character.isUpperCase(input.charAt(i))){
	        sc.append(" ");
	        sc.append(input.charAt(i));
	        }
	      else
	        sc.append(input.charAt(i));
	    }
	    return sc.toString();
	  }
}