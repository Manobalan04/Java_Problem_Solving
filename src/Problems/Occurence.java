package Problems;

import java.util.HashMap;
import java.util.Scanner;

public class Occurence {
	
	public static void getCharCount(String name) {
	
	HashMap<Character, Integer> words=new HashMap<>();
	char [] strArray= name.toCharArray();
	
	for(char c: strArray) {
		
		if(words.containsKey(c)) {
			words.put(c,words.get(c)+1);
		}else {
			words.put(c,1);
		}
	}
	System.out.println(name+":"+words);
	
	}
	public static void main(String [] args) {
		
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the value:");
		String i= s.nextLine();
		
		getCharCount(i);
		
	}
	
}
