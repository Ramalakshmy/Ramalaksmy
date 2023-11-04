package week4.day1;

import java.util.Set;
import java.util.TreeSet;

public class RemoveDuplicatesWords {

	public static void main(String[] args) {
		String text = "We learn java basics as part of java sessions in java week1";
		
		Set<Character> data=new TreeSet<Character>();
		for (int i = 0; i < text.length(); i++) {
			data.add(text.charAt(i));
			
			
		}
		for (Character character : data) {
			System.out.print(character.toString());
			
		}
	}

}
