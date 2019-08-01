package CalculatorTest;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.Shaun.project.Calculator;

public class MultiTest {
	@Test
	public void testMultiCase1(){
		System.out.println("testing substraction x=15, y=2");
		Integer x =15;
		Integer y =2;
		Integer expResult = 30;
		Integer result = Calculator.mutliply(x, y);
		assertEquals(expResult, result);
	}@Test
	public void testMultiCase2(){
		System.out.println("testing sum x=null, y=10");
		Integer y = 10;
		Integer expResult = null;
		assertEquals(expResult, Calculator.mutliply(null, y));
	}
	@Test
	public void testMultiCase3(){
		System.out.println("testing sum x=15, y=null");
		Integer x = 15;
		Integer expResult = null;
		assertEquals(expResult, Calculator.mutliply(x, null));
	}
	@Test
	public void testMultiCase4(){
		System.out.println("testing sum x=null, y=null");
		Integer expResult = null;
		assertEquals(expResult, Calculator.mutliply(null, null));
	}
}
