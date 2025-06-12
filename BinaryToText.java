//Each 8 bits on the binary string represent 1 character on the ASCII table.
public class BinaryToText{
	public static String binaryToText(String binary) {
	    if(binary.trim().equals("")) return "";
	    String s="";
	    //substring(0,8)
	    //substring(8,16)
	    //substring(16,24)
	    for(int i=0;i<binary.length();i=i+8){
	      String str=binary.substring(i,i+8);
	      int decimalValue = Integer.parseInt(str, 2);
	      char asciiChar = (char) decimalValue;
	      String corrospodingString = Character.toString(asciiChar);
	      s+=corrospodingString;
	    }
	    return s;
	  }
}