package Com.Omniwyse.Assignment2;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class TestQueue {
	private QueueExample queue;
	@Before
	public void setUp()
	{
		queue = new QueueExample(100);
	}

	@Test
	public void testEnqueue() 
	{
		queue.enqueue(5);
		queue.enqueue(7);
		Assert.assertEquals(2, queue.size());
	}
	@Test
	public void TestDequeu()
	{
		queue.enqueue(9);
		queue.enqueue(8);
		
		queue.dequeue();
		queue.dequeue();
		Assert.assertEquals(0, queue.size());
	}
    @Test
    public void TestSize()
    {
    	queue.enqueue(9);
    	queue.enqueue(11);
    	
    	Assert.assertEquals(2, queue.size());
    }
    @Test
    public void TestIsEmpty()
    {
    	Assert.assertEquals(true, queue.isEmpty());
    }
}
