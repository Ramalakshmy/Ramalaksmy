package week4.day1;

import java.util.LinkedHashSet;
import java.util.Set;

public class Duplicate {
	public static void main(String[] args) {
		String companyName="Google"; 
		char[] ch = companyName.toCharArray();
		Set<Character>name=new LinkedHashSet<Character>();
		for (int i = 0; i < ch.length; i++) {
			name.add(ch[i]);
		}
		System.out.println(name);
		
		}

}
