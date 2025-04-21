import java.util.ArrayList;
public class TextToAscii{
	private String text;
	private ArrayList <Integer>ascii= new ArrayList<Integer>();
	public TextToAscii(String text) {
		this.text = text;
	}
	public String getText() {
		return this.text;
	}
	public void setText(String text) {
		this.text = text;
	}
	public ArrayList<Integer> asciiValue() {
		ascii.clear();
		ArrayList <String> words = new ArrayList<String>(); 
		for (String word : text.split(" ")) {
			words.add(word);
		}
		for(String i : words) {
			for(int k=0;k<i.length();k++) {
			   int asciivalue = (int)i.charAt(k);
			   ascii.add(asciivalue);
			}
		}
		return ascii;
	}
}