package Com.Omniwyse.Assignment2;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class TestStack {
	
    private StackExample stack;
    @Before
    public void setUp()
    {
    	stack = new StackExample(3);
    }
	@Test
	public void Testpush() {
		stack.push(6);
		stack.push(9);
		Assert.assertEquals(2, stack.size());
	}
	@Test
	public void testPop() {
		stack.push(11);
		stack.push(8);
		stack.pop();
		Assert.assertEquals(11, stack.pop());
	}
	public void testPeek()
	{
		stack.push(9);
		stack.push(15);
		stack.peek();
		Assert.assertEquals(15, stack.peek());
	}
	@Test
	public void  TestSize()
	{
		stack.push(1);
		stack.push(9);
		Assert.assertEquals(2, stack.size());
	}
    @Test
    public void TestisEmpty()
    {
    	Assert.assertEquals(true, stack.isEmpty());
    }
    @Test
    public void TestisFull()
    {
    	stack.push(5);
    	stack.push(2);
    	Assert.assertEquals(false, stack.isFull());
    }
}
