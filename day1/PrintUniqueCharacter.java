package week4.day1;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;





public class PrintUniqueCharacter {

	public static void main(String[] args) {
		String name="babu";
		char[] ch=name.toCharArray();
		Set<Character> set=new HashSet<Character>();
		for (int i = 0; i < ch.length; i++) {
			set.add(ch[i]);
		}
			List<Character> list=new LinkedList<Character>(set);
			for (int i = 0; i < list.size(); i++) {
				int c=0;
				for (int j = 0; j < ch.length; j++) {
					if (list.get(i)==ch[j]) {
						c++;
						
						
					}
					if (c==i) {
						System.out.print(list.get(i));
						
					}
					
				}
				
				
			}
			
			
			
				
			
			
			
			
		}
		
		
	}


