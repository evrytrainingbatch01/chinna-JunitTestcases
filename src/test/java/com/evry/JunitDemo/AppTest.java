package com.evry.JunitDemo;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class AppTest 
{
	@Test
	public void testchekMin()
	{
		assertEquals(6,App.checkMin(new int[] {10,6,8,9}));
		
	}
}