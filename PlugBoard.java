import java.util.*;
class InvalidPlugboardWiresException extends Exception{
	@Override
	super("Exception!")
	public String getMessage() {
		return "Characters are interlinked!";
	}
}

public class PlugBoard {
	private Map<String, String> Connected = new HashMap<>();

	public PlugBoard(String wires) throws InvalidPlugboardWiresException{
	    System.out.println(wires);
	    HashSet <Character> repeated = new HashSet<>();
	    for(int i=0;i<wires.length();i++)
	      repeated.add(wires.charAt(i));
	    if(wires.length()%2!=0||wires.length()>20||wires.length()!=repeated.size()){
	        throw new InvalidPlugboardWiresException();
	      }
	      for(int i=0;i<wires.length();i=i+2){//"ABCDEF" <- 6 LENGTH
	        if(i+1<wires.length()){
	          Connected.put((Character.toString(wires.charAt(i))),(Character.toString(wires.charAt(i+1))));
	          Connected.put((Character.toString(wires.charAt(i+1))),(Character.toString(wires.charAt(i))));
	        }
	      }
	    }
	public String process(String wire) {
		// System.out.println(wire);
		if (Connected.containsKey(wire)) {
			return Connected.get(wire);
		}
		return wire;
	}
}