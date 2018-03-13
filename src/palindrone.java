import java.util.*;
public class palindrone {

	private String inputString = "racecar";
	private Stack<Character> charStack = new Stack<Character>();

	public  void Palindrome (String str)
	{
		inputString = str;
		fillStack();
	}
private void fillStack()
{
	for(int i = 0; i < inputString.length(); i++)
	{
		charStack.push(inputString.charAt(i));
	}
}
private String buildReverse()
{
	StringBuilder result = new StringBuilder();
	while (!charStack.empty())
	{
		result.append(charStack.pop());
	}
	return result.toString();
}
public boolean  isPalindrone()
{
	return (inputString.equalsIgnoreCase(buildReverse()));
}
public static void main (String args[])
{
	Scanner console = new Scanner(System.in);
	System.out.println("Enter the String");
	String str = console.nextLine();
	palindrone palin = new palindrone();
	boolean pal = palin.isPalindrone();
	if(pal)
	{
		System.out.println(str + " : palindrome");
	}
	else
	{
		System.out.println(str + " : not palindrome");
	}
}
}
