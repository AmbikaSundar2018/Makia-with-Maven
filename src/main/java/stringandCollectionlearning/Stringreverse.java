package stringandCollectionlearning;

public class Stringreverse {

	public static void main(String[] args) {

		/*1) Method1: Using normal string

		String name = "Ambika";

		char[] charArray = name.toCharArray();

		for(char c:charArray)
		{

			System.out.println(c);
		}
		int length = name.length();

		System.out.println(length);

		2) Method1: Using normal string with charAt() method

		for(int i=length-1;i>=0;i--)
		{

			System.out.println(charArray[i]);
		}

		for(int i=length-1;i>=0;i--)
		{

			System.out.println(name.charAt(i));
		}


		3) Method3: Using String Builder*/

		StringBuilder reverseString = new StringBuilder("Ambika");

		reverseString.reverse();

		System.out.println(reverseString);
	}



}
