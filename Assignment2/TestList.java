package Com.Omniwyse.Assignment2;

import java.util.LinkedList;

import org.junit.Assert;
import org.junit.Test;

public class TestList {

	@Test
	public void testListInsert() {
		LinkedList<Integer> list = new LinkedList<Integer>();
		list.add(1);
		list.add(2);
		ListExample.insert(list, 3);
		Assert.assertEquals(3, ListExample.size);
	}

	@Test
	public void testListFind() {
		LinkedList<Integer> list = new LinkedList<Integer>();
		list.add(1);
		list.add(2);
		Assert.assertEquals(2, ListExample.find(list, 2));
	}

	@Test
	public void testDeleteList() {
		LinkedList<Integer> list = new LinkedList<Integer>();
		list.add(1);
		list.add(2);
		ListExample.delete(list, 2);
		Assert.assertEquals(1, ListExample.size);
	}

	@Test
	public void testDispalyList() {
		LinkedList<Integer> list = new LinkedList<Integer>();
		list.add(1);
		list.add(2);
		ListExample.displayList(list);
		Assert.assertEquals(2, ListExample.count);
	}

	@Test
	public void testSizeOfList() {
		LinkedList<Integer> list = new LinkedList<Integer>();
		list.add(1);
		list.add(2);
		Assert.assertEquals(2, ListExample.sizeOfList(list));
	}

	@Test
	public void testIsEmpty() {
		LinkedList<Integer> list = new LinkedList<Integer>();
		list.add(1);
		list.add(2);
		Assert.assertEquals(false, ListExample.isEmpty((list)));
	}
}
