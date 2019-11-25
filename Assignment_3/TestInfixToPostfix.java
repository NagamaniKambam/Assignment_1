package Com.Omniwyse.Assignment_3;

import org.junit.Assert;
import org.junit.Test;

public class TestInfixToPostfix {

	@Test
	public void test() {
		 String exp = "3+4*5/6"; 
		 Assert.assertEquals("345*6/+", ConvertInfixToPostfix.infixToPostfix(exp));
	        System.out.println(ConvertInfixToPostfix.infixToPostfix(exp)); 
	}

}
