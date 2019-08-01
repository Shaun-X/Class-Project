package CalculatorTest;

import static org.junit.Assert.*;

import org.junit.Test;

import com.Shaun.project.Calculator;

public class SumTest {
	@Test
	public void testSumCase1(){
		System.out.println("testing sum x=15, y=30");
		Integer x =15;
		Integer y =30;
		Integer expResult = 45;
		Integer result = Calculator.sum(x, y);
		assertEquals(expResult, result);
	}
	@Test
	public void testSumCase2(){
		System.out.println("testing sum x=null, y=30");
		Integer y = 30;
		Integer expResult = null;
		assertEquals(expResult, Calculator.sum(null, y));
	}
	@Test
	public void testSumCase3(){
		System.out.println("testing sum x=15, y=null");
		Integer x = 15;
		Integer expResult = null;
		assertEquals(expResult, Calculator.sum(x, null));
	}
	@Test
	public void testSumCase4(){
		System.out.println("testing sum x=null, y=null");
		Integer expResult = null;
		assertEquals(expResult, Calculator.sum(null, null));
	}
}
