import java.util.HashMap;
public class CountingAnyDuplicates{
	 public static int duplicateCount(String text) {
	      int repeat=0;
	      HashMap <Character, Integer> repeated = new HashMap<>();
	      for(char c:text.toCharArray()){
	        int counter=repeated.getOrDefault(Character.toLowerCase(c),0);
	        repeated.put(Character.toLowerCase(c),counter+1);
	      }
	      for(char c: repeated.keySet()){
	        if(repeated.get(Character.toLowerCase(c))>1)
	          repeat++;
	      }
	      return repeat;
	    }
}