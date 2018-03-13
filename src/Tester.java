import java.util.*;
import java.util.*;
public class Tester {

	public static void main(String[] args) {
		Scanner console = new Scanner(System.in);
		System.out.print("Enter any string:");
		 String inputString = console.nextLine();
	        Stack stk = new Stack();
palindrone Test = new palindrone();
	        for (int i = 0; i < inputString.length(); i++) {
	            stk.push(inputString.charAt(i));
	        }

	        String reverseString = "";

	        while (!stk.isEmpty()) {
	            reverseString = reverseString+stk.pop();
	        }

	        if (inputString.equals(reverseString))
	            System.out.println("The input String is a palindrome.");
	        else
	            System.out.println("The input String is not a palindrome.");
System.out.println(Test.isPalindrone());
	    }
	}



