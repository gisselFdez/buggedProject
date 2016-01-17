package classes;

import static classes.Exemple.and;
import static classes.Exemple.compare;
import static classes.Exemple.estDansIntervalle;
import static classes.Exemple.estModulo;
import static classes.Exemple.estModuloBis;
import static classes.Exemple.getSigne;
import static classes.Exemple.getSigne2;
import static classes.Exemple.xor;

import org.junit.Assert;
import org.junit.Test;

public class ExempleTest {

  public static final String REP_NULL = "Value NULL";
  public static final String REP_POS = "Value POSITIVE";
  public static final String REP_NEG = "Value NEGATIVE";

  @Test
  public void test1() {
    Assert.assertTrue(getSigne(null).equals(REP_NULL));
  }

  @Test
  public void test2() throws Exception {
    Assert.assertTrue(getSigne(1).equals(REP_POS));
  }

  @Test
  public void test3() throws Exception {
    Assert.assertTrue(getSigne(0).equals(REP_NEG));
  }

  @Test
  public void test4() throws Exception {
    Assert.assertTrue(getSigne(-10).equals(REP_NEG));
  }

  @Test
  public void test1bis() {
    Assert.assertTrue(getSigne2(null).equals(REP_NULL));
  }

  @Test
  public void test2bis() throws Exception {
    Assert.assertTrue(getSigne2(1).equals(REP_POS));
  }

  @Test
  public void test3bis() throws Exception {
    Assert.assertTrue(getSigne2(0).equals(REP_NEG));
  }

  @Test
  public void test4bis() throws Exception {
    Assert.assertTrue(getSigne2(-10).equals(REP_NEG));
  }

  @Test
  public void test5() throws Exception {
    Assert.assertTrue(compare(10, 5).equals(1));
  }

  @Test
  public void test6() throws Exception {
    Assert.assertTrue(compare(5, 5).equals(0));
  }

  @Test
  public void test7() throws Exception {
    Assert.assertTrue(compare(5, 10).equals(-1));
  }

  @Test
  public void test8() throws Exception {
    Assert.assertNull(compare(null, 5));
  }

  @Test
  public void test9() throws Exception {
    Assert.assertNull(compare(10, null));
  }

  @Test
  public void test10() throws Exception {
    Assert.assertTrue(compare(null, null).equals(0));
  }

  @Test
  public void test11() throws Exception {
    Assert.assertTrue(estModulo(2, 6));
  }

  @Test
  public void test12() throws Exception {
    Assert.assertFalse(estModulo(2, 5));
  }

  @Test
  public void test13() throws Exception {
    Assert.assertFalse(estModulo(0, 6));
  }

  @Test
  public void test14() throws Exception {
    Assert.assertNull(estModulo(null, 6));
  }

  @Test
  public void test15() throws Exception {
    Assert.assertNull(estModulo(2, null));
  }

  @Test
  public void test11bis() throws Exception {
    Assert.assertTrue(estModuloBis(2, 6));
  }

  @Test
  public void test12bis() throws Exception {
    Assert.assertFalse(estModuloBis(2, 5));
  }

  @Test
  public void test13bis() throws Exception {
    Assert.assertFalse(estModuloBis(0, 6));
  }

  @Test
  public void test14bis() throws Exception {
    Assert.assertNull(estModuloBis(null, 6));
  }

  @Test
  public void test15bis() throws Exception {
    Assert.assertNull(estModuloBis(2, null));
  }
  
  @Test
  public void test16() throws Exception {
    Assert.assertTrue(estDansIntervalle(0, 10, 5));
  }

  @Test
  public void test17() throws Exception {
    Assert.assertFalse(estDansIntervalle(0, 5, 10));
  }

  @Test
  public void test18() throws Exception {
    Assert.assertFalse(estDansIntervalle(0, 0, 5));
  }

  @Test
  public void test19() throws Exception {
    Assert.assertTrue(estDansIntervalle(0, 0, 0));
  }

  @Test
  public void test20() throws Exception {
    Assert.assertTrue(estDansIntervalle(0, 10, 10));
  }

  @Test
  public void test21() throws Exception {
    Assert.assertTrue(estDansIntervalle(0, 10, 0));
  }

  @Test
  public void test22() throws Exception {
    Assert.assertTrue(and(2, 2));
  }

  @Test
  public void test23() throws Exception {
    Assert.assertFalse(and(1, 2));
  }

  @Test
  public void test24() throws Exception {
    Assert.assertFalse(and(0, 0));
  }

  @Test
  public void test25() throws Exception {
    Assert.assertFalse(and(12, 2));
  }

  @Test
  public void test26() throws Exception {
    Assert.assertFalse(xor(2, 2));
  }

  @Test
  public void test27() throws Exception {
    Assert.assertTrue(xor(0, 2));
  }

  @Test
  public void test28() throws Exception {
    Assert.assertFalse(xor(-2, 0));
  }

  @Test
  public void test29() throws Exception {
    Assert.assertFalse(xor(0, 0));
  }

  @Test
  public void test30() throws Exception {
    Assert.assertFalse(xor(0, -10));
  }

  @Test
  public void test31() throws Exception {
    Assert.assertTrue(xor(0, 5));
  }

  @Test
  public void test32() throws Exception {
    Assert.assertTrue(xor(6, 0));
  }
}
