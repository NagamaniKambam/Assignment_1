package Com.Omniwyse.Assignment2;

import org.junit.Assert;
import org.junit.Test;

public class TestParnthasis {

	@Test
	public void test() {
		String string = "{()}[]";
		Assert.assertEquals(true, BalancedParan_P4.checkParan(string));
	}
}
