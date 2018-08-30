package com.asvals.addTest;

import static org.junit.Assert.*;

import org.junit.Test;

public class addTest {

	 @Test
	 public void adder() {
	 adder add = new adder();
	 assertEquals(10, add.addition(7, 3));
		 }
}
