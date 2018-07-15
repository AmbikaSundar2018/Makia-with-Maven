package stringandCollectionlearning;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class RemoveDuplicateChar {

	public static void main(String[] args) {

	//1) Method1: Using set
		
		String name = "ambika";
		
		Set<Character> Uniquechar = new HashSet<>();
		/*Set<Character> Uniquechar = new TreeSet<>();*/
		/*Set<Character> Uniquechar = new LinkedHashSet<>()*/;
		
		char[] charArray = name.toCharArray();
		
		for(char c: charArray) {
			
			Uniquechar.add(c);
		}
		
		System.out.println(Uniquechar);
	}

	//Method2: using List
	
	/*String name = "google";
	
	List<Character> list = new ArrayList<Character>();
	
	
	char[] charArray = name.toCharArray();
	
	for(char c: charArray) {
		
		if(!list.contains(c)) {
			
			list.add(c);
		}
	}
	
	System.out.println(list);*/

		//Method: 3
		
		/*String name = "Ambika";
		
		char[] charArray = name.toCharArray();
		
		for (int i = 0; i < charArray.length; i++) {
			
			for (int j = 0; j < charArray.length; j++) {
				
				
			}
			
			*/
		

}

