package Com.Omniwyse.Assignment_1;

import org.junit.Assert;
import org.junit.Test;

public class TestGCD {

	@Test
	public void GCDofNumbers() {
		Assert.assertEquals(3, FindGCD.gcd(9, 3));
	}

}