import java.util.ArrayList;
import java.util.HashMap;
/*
 * Write a function that accepts a fight string which consists of only small letters 
 * and  * which represents a bomb drop place. 
 * Return who wins the fight after bombs are exploded. 
 * When the left side wins return Left side wins!, and when the right side wins return Right side wins!. 
 * In other cases, return Let's fight again!.
 * 
 * The left side letters and their power:
 w - 4
 p - 3 
 b - 2
 s - 1
 The right side letters and their power:
 m - 4
 q - 3 
 d - 2
 z - 1
 */
public class AlphabetWarAirstrike{
  public static String alphabetWar(String fight){
    ArrayList<Integer> index = new ArrayList<>();
    for(int i=0;i<fight.length();i++) {
			if(fight.charAt(i)=='*'){
				index.add(i);
			}
		}
		index.trimToSize();
		for(int i:index) {
			if(i==0) {
				fight=fight.replace(fight.substring(0,2), "__");
				continue;
			}
			if(i==fight.length()-1) {
				fight = fight.replace(fight.substring(i-1), "__");
				continue;
			}
			if(i!=0||i!=fight.length()-1) {
				if(Character.isAlphabetic(fight.charAt(i-1))&&(Character.isAlphabetic(fight.charAt(i+1)))) {
					fight = fight.replace(fight.substring(i-1, i+2),"___");					continue;
				}
				if(Character.isAlphabetic(fight.charAt(i-1))) {
					fight= fight.replace(fight.substring(i-1,i+1),"__");
					continue;
				}
				if(Character.isAlphabetic(fight.charAt(i+1))) {
					fight = fight.replace(fight.substring(i,i+2),"__");
					continue;
				}
			}
		}
	fight = fight.replace("*", "_");
    int leftCounter=0;
    int rightCounter=0;
    HashMap<Character, Integer> Warrior = new HashMap<>();
        Warrior.put('w', 4);
        Warrior.put('p', 3);
        Warrior.put('b', 2);
        Warrior.put('s', 1);
        Warrior.put('m', 4);
        Warrior.put('q', 3);
        Warrior.put('d', 2);
        Warrior.put('z', 1);
        for(int i=0;i<fight.length();i++) {
        	char c=fight.charAt(i);
        	if(Warrior.containsKey(c))
        		leftCounter=leftCounter+Warrior.get(c);
        	else if(Warrior.containsKey(c)) {
        		rightCounter=rightCounter+Warrior.get(c);
        	}
        }
        if(leftCounter>rightCounter)
        	return "Left side wins!";
        else if(rightCounter>leftCounter)
        	return "Right side wins!";
        else 
        	return "Let's fight again!";
  }
  public static void main(String[] args) {
	System.out.println(alphabetWar("hhw*kwfz*se**mep*i*s"));
}
}