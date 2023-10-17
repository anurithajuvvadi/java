package testing;

import static org.junit.Assert.assertEquals;

import org.junit.After;
import org.junit.Before;
import org.junit.jupiter.api.Test;

public class test2 {//this program is not working for after and before
	@Before
	public void before() {
		System.out.println("before class");
	}
	@Test
	public void test_method() {
		test t=new test();
		int sum=t.adition(10, 20);
		
		assertEquals(30,sum);
		
	}
	@Test
	public void test_method1() {
		test t=new test();
		int expected=6;
		int res=t.mul(2, 3);
		assertEquals(expected,res);
		
	}
	@Test
	public void test_method2() {
		test t=new test();
		int expectedresut=9808;
		int res=t.largest();
		assertEquals(expectedresut,res);

	}
	@After
	public void afterclass() {
		System.out.println("after class")	;
		}

}
