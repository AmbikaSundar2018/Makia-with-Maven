package stringandCollectionlearning;

import java.util.LinkedHashMap;
import java.util.Map;


public class LearningMap {

	public static void main(String[] args) {

		String company = "Gisbis Tehchnologies Limited ";

		company = company.toLowerCase();

		System.out.println(company);

		char[] charArray = company.toCharArray();

		Map<Character, Integer> map = new LinkedHashMap<Character,Integer>();

		for(char eachChar:charArray) {

			System.out.println(eachChar);

			if(map.containsKey(eachChar)) {

				//Increasing the occurence for already existing values.
				map.put(eachChar, map.get(eachChar)+1);
			}

			else {
				//Assigning value 1 for one time occurence.
				map.put(eachChar, 1);
			}

		}//Printing the occurance
		System.out.println(map);
	}

}
