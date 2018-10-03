package com.cg.maven.test;

import junit.framework.Assert;

import org.junit.Test;

import com.cg.demo.Calculator;

public class TestCalculator {

	@Test
	public void testAdd(){
		Calculator c1=new Calculator();
		int res=c1.add(3,6);
		Assert.assertEquals(9,res);
		
	}
	
	@Test
	public void testSubtract(){
		Calculator c1=new Calculator();
		int res=c1.subtract(13,6);
		Assert.assertEquals(7,res);
		
	}
	
	@Test
	public void testMultiply(){
		Calculator c1=new Calculator();
		int res=c1.multiply(3,6);
		Assert.assertEquals(18,res);
		
	}
}
