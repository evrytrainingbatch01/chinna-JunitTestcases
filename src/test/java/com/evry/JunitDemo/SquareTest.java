package com.evry.JunitDemo;

import static org.junit.Assert.*;

import org.junit.Test;

public class SquareTest {

	@Test
	public void test() {
		
		assertEquals(3,Square.countSquares(9, 25));
		
	}

}
