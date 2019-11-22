package Com.Omniwyse.Assignment2;

import java.util.ArrayList;

import org.junit.Assert;
import org.junit.Test;

public class TestReverseArray {

	@Test
	public void test() {
		ArrayList<Integer> inputlist = new ArrayList<Integer>();
		
		  inputlist.add(1);
		  inputlist.add(2);
		  inputlist.add(3);
		  
		ArrayList<Integer> expectedlist = new ArrayList<Integer>();
		
		  expectedlist.add(3);
		  expectedlist.add(2);
		  expectedlist.add(1);	
		  
		Assert.assertEquals(expectedlist, ReverseArray.reverseList(inputlist));
	}
}
