package CalculatorTest;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.Shaun.project.Calculator;

public class DivTest {
	@Test
	public void testDivCase1(){
		System.out.println("testing substraction x=15, y=5");
		Integer x =15;
		Integer y =5;
		Integer expResult = 3;
		Integer result = Calculator.division(x, y);
		assertEquals(expResult, result);
	}@Test
	public void testDivCase2(){
		System.out.println("testing sum x=null, y=10");
		Integer y = 10;
		Integer expResult = null;
		assertEquals(expResult, Calculator.division(null, y));
	}
	@Test
	public void testDivCase3(){
		System.out.println("testing sum x=15, y=null");
		Integer x = 15;
		Integer expResult = null;
		assertEquals(expResult, Calculator.division(x, null));
	}
	@Test
	public void testDivCase4(){
		System.out.println("testing sum x=null, y=null");
		Integer expResult = null;
		assertEquals(expResult, Calculator.division(null, null));
	}
	@Test
	public void testDivCase5(){
		System.out.println("testing sum x=10, y=0");
		Integer y = 0;
		Integer expResult = null;
		assertEquals(expResult, Calculator.division(null, y));
	}
}
