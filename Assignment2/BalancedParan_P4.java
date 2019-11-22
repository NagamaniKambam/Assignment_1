

package Com.Omniwyse.Assignment2;

import java.util.Stack;

public class BalancedParan_P4 {
	static boolean checkParan(String string)
	{
		//String string = "{()}[]";
		Stack<Character> stack = new Stack<Character>();
		for (int i = 0; i < string.length(); i++) {
			if (string.charAt(i) == '{' || string.charAt(i) == '[' || string.charAt(i) == '(') {
				stack.push(string.charAt(i));
			} else if (!stack.empty() && ((string.charAt(i) == ']' && stack.peek() == '[')
					|| (string.charAt(i) == '}' && stack.peek() == '{')
					|| (string.charAt(i) == ')' && stack.peek() == '('))) {
				stack.pop();
			} else {
				stack.push(string.charAt(i));
			}
		}
		if (stack.empty()) {
				return true;
		} else {
			return false;
		}
	}
}