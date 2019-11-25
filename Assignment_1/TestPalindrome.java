package Com.Omniwyse.Assignment_1;

import org.junit.Assert;
import org.junit.Test;

public class TestPalindrome {

	@Test
	public void Palindrome() {
		Assert.assertEquals(false, Palindrome.isPal("statement"));
	}

	@Test
	public void CheckPalindrome() {
		Assert.assertEquals(true, Palindrome.isPal("madam"));
	}
}