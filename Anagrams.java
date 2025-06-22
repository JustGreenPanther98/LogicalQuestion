import java.util.Arrays;

public class Anagrams{
	//Ignore special characters like %,$,@,^,& etc.
	public static boolean isAnagram(String s1,String s2) {
		String NewString1="",NewString2="";
		for(char c: s1.toCharArray()) {
			if(Character.isAlphabetic(c))
				NewString1=NewString1+String.valueOf(c).toLowerCase();
		}
		for(char c1:s2.toCharArray()) {
			if(Character.isAlphabetic(c1))
				NewString2=NewString2+String.valueOf(c1).toLowerCase();
		}
		char [] arr1 =NewString1.toCharArray();
		char [] arr2 = NewString2.toCharArray();
		Arrays.sort(arr1);
		Arrays.sort(arr2);
		if(String.valueOf(arr1).equals(String.valueOf(arr2))) {
			return true;
		}
		else {
			return false;
		}
		
	}
	public static void main(String[] args) {
		System.out.println(isAnagram("bangkok","koganbk"));
	}
}