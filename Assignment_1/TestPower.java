package Com.Omniwyse.Assignment_1;

import org.junit.Assert;
import org.junit.Test;

public class TestPower {

	@Test
	public void test() {
		Assert.assertEquals(8, FindPower.power(2, 3));
	}

}