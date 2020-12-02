package Assignment2;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Email {
	
	public static final String regex = "^[A-Za-z0-9+_.-]+@[A-Za-z0-9.-]+$";
	
	public static void main(String[] args) {
		List<String> list = new ArrayList<String>();
		
		list.add("amar@mail.com");
		list.add("amar.mail.com");
		
		Pattern pattern = Pattern.compile(regex);
		
		for (String value : list) {
			Matcher matcher = pattern.matcher(value);
			System.out.println("the Email address " + value + " is " + (matcher.matches() ? "valid" : "invalid"));
		}
		
	}

}
