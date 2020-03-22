package mahima.com;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.*;

/**
 * Unit test for simple App.
 */
public class AppTest 
   // extends Test
{
	App ob;
	

	@BeforeEach
	void setUp(){
		ob=new App();
	}
	@Test
	void test1(){
		assertEquals("BCD",ob.Del("ABCD"));
	}
	@Test
	void test2(){
		assertEquals("CD",ob.Del("AACD"));
	}
	@Test
	void test3(){
		assertEquals("BCD",ob.Del("BACD"));
	}
	@Test
	void test4(){
		assertEquals("BBAA",ob.Del("BBAA"));
	}
	@Test
	void test5(){
		assertEquals("BAA",ob.Del("AABAA"));
	}
	
		
}
