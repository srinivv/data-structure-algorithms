package com.local.dev.stack;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import java.util.EmptyStackException;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class StackTest {

	private MyStack<Integer> stack;

	@Before
	public void setUp() {
		stack = new MyStack<Integer>();
	}

	@After
	public void release() {
		stack = null;
	}

	@Test
	public void stackEmptyTest() {
		assertTrue(stack.isEmpty());
	}

	@Test
	public void stackPushTest() {
		init();
		assertFalse(stack.isEmpty());
		assertEquals(3, stack.size());
	}

	@Test
	public void stackSizeTest() {
		init();
		assertEquals(3, stack.size());
		stack.peek();
		assertEquals(3, stack.size());
		stack.pop();
		assertEquals(2, stack.size());
	}

	@Test
	public void stackPopTest() {
		init();
		assertFalse(stack.isEmpty());
		assertTrue((Integer) stack.pop() == 30);
		assertTrue((Integer) stack.pop() == 20);
		assertTrue((Integer) stack.pop() == 10);
		assertEquals(0, stack.size());
		assertTrue(stack.isEmpty());
	}

	@Test(expected = EmptyStackException.class)
	public void stackPopExceptionTest() {
		init();
		stack.pop();
		stack.pop();
		stack.pop();
		stack.pop();
	}

	@Test
	public void stackPeekTest() {
		init();
		assertFalse(stack.isEmpty());
		assertTrue((Integer) stack.peek() == 30);
		assertTrue((Integer) stack.peek() == 30);
		assertTrue((Integer) stack.peek() == 30);
		assertEquals(3, stack.size());
	}

	private void init() {
		stack.push(10);
		stack.push(20);
		stack.push(30);
	}
}
