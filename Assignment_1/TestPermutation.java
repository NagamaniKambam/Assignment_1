package Com.Omniwyse.Assignment_1;

import org.junit.Assert;
import org.junit.Test;

public class TestPermutation {

	@Test
	public void test() {
		Assert.assertEquals(6, Permutation.stringPermutation("", "ABC"));
	}

}