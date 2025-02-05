package Java;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class DuplicateElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	/*	String arr[] = {"Java","C","Java"};
		
		HashSet<String> hs = new HashSet<>();
		
		for(String d: arr) {
			if(hs.add(d)==false) {
				System.out.println("Duplicate element is " + d);
			}
		} */
		
		// Occurance of element in a word
		
	String name = "Java";
	char ch[] = name.toCharArray();
	Map<Character,Integer> charmap = new HashMap<Character, Integer>();
	for(char c: ch) {
		if(charmap.containsKey(c)) {
			charmap.put(c, charmap.get(c)+1);
		}else {
			charmap.put(c, 1);
		}
	}
	System.out.println(charmap);

	}

}
