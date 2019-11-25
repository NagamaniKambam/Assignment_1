package Com.Omniwyse.Assignment_1;

import org.junit.Assert;
import org.junit.Test;

public class TestFibonacciSeries {

@Test
public void test() {
Assert.assertEquals(21, FibonacciSeries.fib(8));
}

}