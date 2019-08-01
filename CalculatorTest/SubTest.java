package CalculatorTest;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.Shaun.project.Calculator;

public class SubTest {
	@Test
	public void testSubCase1(){
		System.out.println("testing substraction x=15, y=10");
		Integer x =15;
		Integer y =10;
		Integer expResult = 5;
		Integer result = Calculator.substraction(x, y);
		assertEquals(expResult, result);
	}@Test
	public void testSubCase2(){
		System.out.println("testing sum x=null, y=10");
		Integer y = 10;
		Integer expResult = null;
		assertEquals(expResult, Calculator.substraction(null, y));
	}
	@Test
	public void testSubCase3(){
		System.out.println("testing sum x=15, y=null");
		Integer x = 15;
		Integer expResult = null;
		assertEquals(expResult, Calculator.substraction(x, null));
	}
	@Test
	public void testSumCase4(){
		System.out.println("testing sum x=null, y=null");
		Integer expResult = null;
		assertEquals(expResult, Calculator.substraction(null, null));
	}
}
