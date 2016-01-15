package classes;

import static org.junit.Assert.*;
import org.junit.Test;

public class ExempleTest {

	public static final String REP_NULL = "Value NULL";
	public static final String REP_POS = "Value POSITIVE";
	public static final String REP_NEG = "Value NEGATIVE";
	  
	@Test
	public void test1() {
		//fail("Not yet implemented");
		Exemple ex = new Exemple();		
		assertTrue(ex.getMessage(null).equals(REP_NULL));
	}
	
	@Test
	  public void test2() throws Exception {
		Exemple ex = new Exemple();		
		assertTrue(ex.getMessage(1).equals(REP_POS));
	  }

	  @Test
	  public void test3() throws Exception {
		Exemple ex = new Exemple();		
		assertTrue(ex.getMessage(0).equals(REP_NEG));
	  }

	  @Test
	  public void test4() throws Exception {
		Exemple ex = new Exemple();		
		assertTrue(ex.getMessage(-10).equals(REP_NEG));
	  }

}
