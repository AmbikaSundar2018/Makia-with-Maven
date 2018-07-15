package stringandCollectionlearning;

import java.util.regex.Pattern;

public class LearningRegularexpression {

	public static void main(String[] args) {


		String text = " TestLeaf(67890) has number of Employees 20";

		String pattern = "\\D";

		Pattern p = Pattern.compile(pattern);
	
		/*//String with special characters
		String replaceAll = text.replaceAll("\\d", "");
		System.out.println(replaceAll);*/

		String replaceAll = text.replaceAll("\\D", "");
		System.out.println(replaceAll);	

	}

}
