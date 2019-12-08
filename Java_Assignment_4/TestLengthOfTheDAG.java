package com.omniwyse.Java_Assignment_4;

import org.junit.Test;

public class TestLengthOfTheDAG {

	@Test
	public void test() {
		int n = 5;
		LengthOfTheDAG graph = new LengthOfTheDAG(n);

		graph.addEdge(1, 2);
		graph.addEdge(1, 3);
		graph.addEdge(3, 2);
		graph.addEdge(2, 4);
		graph.addEdge(3, 4);
		graph.findLongestPath(n);
		System.out.println(graph.findLongestPath(n));

	}

}
