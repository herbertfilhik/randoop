
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest0 {

  public static boolean debug = false;

  @Test
  public void test001() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test001"); }

    Operadores operadores0 = new Operadores();
    java.lang.Integer i3 = operadores0.somar((java.lang.Integer)0, (java.lang.Integer)1);
    java.lang.Integer i6 = operadores0.somar((java.lang.Integer)101, (java.lang.Integer)10);
    java.lang.Integer i9 = operadores0.somar((java.lang.Integer)11, (java.lang.Integer)101);
    java.lang.Integer i12 = operadores0.somar((java.lang.Integer)100, (java.lang.Integer)312);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i3 + "' != '" + 1+ "'", i3.equals(1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i6 + "' != '" + 111+ "'", i6.equals(111));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i9 + "' != '" + 112+ "'", i9.equals(112));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i12 + "' != '" + 412+ "'", i12.equals(412));

  }

  @Test
  public void test002() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test002"); }

    Operadores operadores0 = new Operadores();
    java.lang.Integer i3 = operadores0.somar((java.lang.Integer)0, (java.lang.Integer)1);
    java.lang.Integer i6 = operadores0.somar((java.lang.Integer)0, (java.lang.Integer)100);
    java.lang.Integer i9 = operadores0.somar((java.lang.Integer)211, (java.lang.Integer)1);
    java.lang.Integer i12 = operadores0.somar((java.lang.Integer)312, (java.lang.Integer)112);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i3 + "' != '" + 1+ "'", i3.equals(1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i6 + "' != '" + 100+ "'", i6.equals(100));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i9 + "' != '" + 212+ "'", i9.equals(212));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i12 + "' != '" + 424+ "'", i12.equals(424));

  }

  @Test
  public void test003() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test003"); }

    Operadores operadores0 = new Operadores();
    java.lang.Integer i3 = operadores0.somar((java.lang.Integer)0, (java.lang.Integer)1);
    java.lang.Integer i6 = operadores0.somar((java.lang.Integer)0, (java.lang.Integer)100);
    java.lang.Integer i9 = operadores0.somar((java.lang.Integer)0, (java.lang.Integer)102);
    java.lang.Integer i12 = operadores0.somar((java.lang.Integer)211, (java.lang.Integer)101);
    java.lang.Integer i15 = operadores0.somar((java.lang.Integer)424, (java.lang.Integer)12);
    java.lang.Integer i18 = operadores0.somar((java.lang.Integer)223, (java.lang.Integer)1058);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i3 + "' != '" + 1+ "'", i3.equals(1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i6 + "' != '" + 100+ "'", i6.equals(100));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i9 + "' != '" + 102+ "'", i9.equals(102));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i12 + "' != '" + 312+ "'", i12.equals(312));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i15 + "' != '" + 436+ "'", i15.equals(436));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i18 + "' != '" + 1281+ "'", i18.equals(1281));

  }

  @Test
  public void test004() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test004"); }

    Operadores operadores0 = new Operadores();
    java.lang.Integer i3 = operadores0.somar((java.lang.Integer)0, (java.lang.Integer)1);
    java.lang.Integer i6 = operadores0.somar((java.lang.Integer)0, (java.lang.Integer)100);
    java.lang.Integer i9 = operadores0.somar((java.lang.Integer)211, (java.lang.Integer)1);
    java.lang.Integer i12 = operadores0.somar((java.lang.Integer)12, (java.lang.Integer)211);
    java.lang.Integer i15 = operadores0.somar((java.lang.Integer)436, (java.lang.Integer)536);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i3 + "' != '" + 1+ "'", i3.equals(1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i6 + "' != '" + 100+ "'", i6.equals(100));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i9 + "' != '" + 212+ "'", i9.equals(212));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i12 + "' != '" + 223+ "'", i12.equals(223));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i15 + "' != '" + 972+ "'", i15.equals(972));

  }

  @Test
  public void test005() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test005"); }

    Operadores operadores0 = new Operadores();
    java.lang.Integer i3 = operadores0.somar((java.lang.Integer)0, (java.lang.Integer)1);
    java.lang.Integer i6 = operadores0.somar((java.lang.Integer)0, (java.lang.Integer)100);
    java.lang.Integer i9 = operadores0.somar((java.lang.Integer)0, (java.lang.Integer)102);
    java.lang.Integer i12 = operadores0.somar((java.lang.Integer)0, (java.lang.Integer)211);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i3 + "' != '" + 1+ "'", i3.equals(1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i6 + "' != '" + 100+ "'", i6.equals(100));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i9 + "' != '" + 102+ "'", i9.equals(102));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i12 + "' != '" + 211+ "'", i12.equals(211));

  }

  @Test
  public void test006() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test006"); }

    Operadores operadores0 = new Operadores();
    java.lang.Integer i3 = operadores0.somar((java.lang.Integer)0, (java.lang.Integer)1);
    java.lang.Integer i6 = operadores0.somar((java.lang.Integer)101, (java.lang.Integer)10);
    java.lang.Integer i9 = operadores0.somar((java.lang.Integer)11, (java.lang.Integer)101);
    java.lang.Integer i12 = operadores0.somar((java.lang.Integer)0, (java.lang.Integer)0);
    java.lang.Integer i15 = operadores0.somar((java.lang.Integer)0, (java.lang.Integer)312);
    java.lang.Integer i18 = operadores0.somar((java.lang.Integer)423, (java.lang.Integer)1281);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i3 + "' != '" + 1+ "'", i3.equals(1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i6 + "' != '" + 111+ "'", i6.equals(111));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i9 + "' != '" + 112+ "'", i9.equals(112));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i12 + "' != '" + 0+ "'", i12.equals(0));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i15 + "' != '" + 312+ "'", i15.equals(312));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i18 + "' != '" + 1704+ "'", i18.equals(1704));

  }

  @Test
  public void test007() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test007"); }

    Operadores operadores0 = new Operadores();
    java.lang.Integer i3 = operadores0.somar((java.lang.Integer)0, (java.lang.Integer)1);
    java.lang.Integer i6 = operadores0.somar((java.lang.Integer)101, (java.lang.Integer)0);
    java.lang.Integer i9 = operadores0.somar((java.lang.Integer)211, (java.lang.Integer)1058);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i3 + "' != '" + 1+ "'", i3.equals(1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i6 + "' != '" + 101+ "'", i6.equals(101));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i9 + "' != '" + 1269+ "'", i9.equals(1269));

  }

  @Test
  public void test008() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test008"); }

    Operadores operadores0 = new Operadores();
    java.lang.Integer i3 = operadores0.somar((java.lang.Integer)0, (java.lang.Integer)1);
    java.lang.Integer i6 = operadores0.somar((java.lang.Integer)0, (java.lang.Integer)100);
    java.lang.Integer i9 = operadores0.somar((java.lang.Integer)211, (java.lang.Integer)1);
    java.lang.Integer i12 = operadores0.somar((java.lang.Integer)12, (java.lang.Integer)211);
    java.lang.Integer i15 = operadores0.somar((java.lang.Integer)536, (java.lang.Integer)424);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i3 + "' != '" + 1+ "'", i3.equals(1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i6 + "' != '" + 100+ "'", i6.equals(100));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i9 + "' != '" + 212+ "'", i9.equals(212));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i12 + "' != '" + 223+ "'", i12.equals(223));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i15 + "' != '" + 960+ "'", i15.equals(960));

  }

  @Test
  public void test009() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test009"); }

    Operadores operadores0 = new Operadores();
    java.lang.Integer i3 = operadores0.somar((java.lang.Integer)0, (java.lang.Integer)1);
    java.lang.Integer i6 = operadores0.somar((java.lang.Integer)101, (java.lang.Integer)10);
    java.lang.Integer i9 = operadores0.somar((java.lang.Integer)11, (java.lang.Integer)101);
    java.lang.Integer i12 = operadores0.somar((java.lang.Integer)111, (java.lang.Integer)100);
    java.lang.Integer i15 = operadores0.somar((java.lang.Integer)735, (java.lang.Integer)(-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i3 + "' != '" + 1+ "'", i3.equals(1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i6 + "' != '" + 111+ "'", i6.equals(111));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i9 + "' != '" + 112+ "'", i9.equals(112));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i12 + "' != '" + 211+ "'", i12.equals(211));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i15 + "' != '" + 734+ "'", i15.equals(734));

  }

  @Test
  public void test010() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test010"); }

    Operadores operadores0 = new Operadores();
    java.lang.Integer i3 = operadores0.somar((java.lang.Integer)0, (java.lang.Integer)1);
    java.lang.Integer i6 = operadores0.somar((java.lang.Integer)0, (java.lang.Integer)100);
    java.lang.Integer i9 = operadores0.somar((java.lang.Integer)211, (java.lang.Integer)1);
    java.lang.Integer i12 = operadores0.somar((java.lang.Integer)735, (java.lang.Integer)212);
    java.lang.Integer i15 = operadores0.somar((java.lang.Integer)2896, (java.lang.Integer)312);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i3 + "' != '" + 1+ "'", i3.equals(1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i6 + "' != '" + 100+ "'", i6.equals(100));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i9 + "' != '" + 212+ "'", i9.equals(212));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i12 + "' != '" + 947+ "'", i12.equals(947));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i15 + "' != '" + 3208+ "'", i15.equals(3208));

  }

  @Test
  public void test011() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test011"); }

    Operadores operadores0 = new Operadores();
    java.lang.Integer i3 = operadores0.somar((java.lang.Integer)0, (java.lang.Integer)1);
    java.lang.Integer i6 = operadores0.somar((java.lang.Integer)101, (java.lang.Integer)10);
    java.lang.Integer i9 = operadores0.somar((java.lang.Integer)222, (java.lang.Integer)412);
    java.lang.Integer i12 = operadores0.somar((java.lang.Integer)211, (java.lang.Integer)536);
    java.lang.Integer i15 = operadores0.somar((java.lang.Integer)638, (java.lang.Integer)112);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i3 + "' != '" + 1+ "'", i3.equals(1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i6 + "' != '" + 111+ "'", i6.equals(111));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i9 + "' != '" + 634+ "'", i9.equals(634));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i12 + "' != '" + 747+ "'", i12.equals(747));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i15 + "' != '" + 750+ "'", i15.equals(750));

  }

  @Test
  public void test012() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test012"); }

    Operadores operadores0 = new Operadores();
    java.lang.Integer i3 = operadores0.somar((java.lang.Integer)101, (java.lang.Integer)11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i3 + "' != '" + 112+ "'", i3.equals(112));

  }

  @Test
  public void test013() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test013"); }

    Operadores operadores0 = new Operadores();
    java.lang.Integer i3 = operadores0.somar((java.lang.Integer)0, (java.lang.Integer)1);
    java.lang.Integer i6 = operadores0.somar((java.lang.Integer)0, (java.lang.Integer)100);
    java.lang.Integer i9 = operadores0.somar((java.lang.Integer)0, (java.lang.Integer)102);
    java.lang.Integer i12 = operadores0.somar((java.lang.Integer)211, (java.lang.Integer)101);
    java.lang.Integer i15 = operadores0.somar((java.lang.Integer)424, (java.lang.Integer)12);
    java.lang.Integer i18 = operadores0.somar((java.lang.Integer)412, (java.lang.Integer)11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i3 + "' != '" + 1+ "'", i3.equals(1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i6 + "' != '" + 100+ "'", i6.equals(100));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i9 + "' != '" + 102+ "'", i9.equals(102));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i12 + "' != '" + 312+ "'", i12.equals(312));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i15 + "' != '" + 436+ "'", i15.equals(436));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i18 + "' != '" + 423+ "'", i18.equals(423));

  }

  @Test
  public void test014() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test014"); }

    Operadores operadores0 = new Operadores();
    java.lang.Integer i3 = operadores0.somar((java.lang.Integer)0, (java.lang.Integer)1);
    java.lang.Integer i6 = operadores0.somar((java.lang.Integer)1515, (java.lang.Integer)1381);
    java.lang.Integer i9 = operadores0.somar((java.lang.Integer)223, (java.lang.Integer)1503);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i3 + "' != '" + 1+ "'", i3.equals(1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i6 + "' != '" + 2896+ "'", i6.equals(2896));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i9 + "' != '" + 1726+ "'", i9.equals(1726));

  }

  @Test
  public void test015() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test015"); }

    Operadores operadores0 = new Operadores();
    java.lang.Integer i3 = operadores0.somar((java.lang.Integer)0, (java.lang.Integer)1);
    java.lang.Integer i6 = operadores0.somar((java.lang.Integer)101, (java.lang.Integer)10);
    java.lang.Integer i9 = operadores0.somar((java.lang.Integer)11, (java.lang.Integer)101);
    java.lang.Integer i12 = operadores0.somar((java.lang.Integer)0, (java.lang.Integer)0);
    java.lang.Integer i15 = operadores0.somar((java.lang.Integer)750, (java.lang.Integer)1292);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i3 + "' != '" + 1+ "'", i3.equals(1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i6 + "' != '" + 111+ "'", i6.equals(111));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i9 + "' != '" + 112+ "'", i9.equals(112));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i12 + "' != '" + 0+ "'", i12.equals(0));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i15 + "' != '" + 2042+ "'", i15.equals(2042));

  }

  @Test
  public void test016() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test016"); }

    Operadores operadores0 = new Operadores();
    java.lang.Integer i3 = operadores0.somar((java.lang.Integer)0, (java.lang.Integer)1);
    java.lang.Integer i6 = operadores0.somar((java.lang.Integer)0, (java.lang.Integer)100);
    java.lang.Integer i9 = operadores0.somar((java.lang.Integer)211, (java.lang.Integer)1);
    java.lang.Integer i12 = operadores0.somar((java.lang.Integer)423, (java.lang.Integer)1291);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i3 + "' != '" + 1+ "'", i3.equals(1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i6 + "' != '" + 100+ "'", i6.equals(100));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i9 + "' != '" + 212+ "'", i9.equals(212));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i12 + "' != '" + 1714+ "'", i12.equals(1714));

  }

  @Test
  public void test017() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test017"); }

    Operadores operadores0 = new Operadores();
    java.lang.Integer i3 = operadores0.somar((java.lang.Integer)0, (java.lang.Integer)1);
    java.lang.Integer i6 = operadores0.somar((java.lang.Integer)0, (java.lang.Integer)100);
    java.lang.Integer i9 = operadores0.somar((java.lang.Integer)211, (java.lang.Integer)1);
    java.lang.Integer i12 = operadores0.somar((java.lang.Integer)12, (java.lang.Integer)211);
    java.lang.Integer i15 = operadores0.somar((java.lang.Integer)211, (java.lang.Integer)(-1));
    java.lang.Integer i18 = operadores0.somar((java.lang.Integer)10, (java.lang.Integer)212);
    java.lang.Integer i21 = operadores0.somar((java.lang.Integer)211, (java.lang.Integer)1862);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i3 + "' != '" + 1+ "'", i3.equals(1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i6 + "' != '" + 100+ "'", i6.equals(100));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i9 + "' != '" + 212+ "'", i9.equals(212));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i12 + "' != '" + 223+ "'", i12.equals(223));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i15 + "' != '" + 210+ "'", i15.equals(210));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i18 + "' != '" + 222+ "'", i18.equals(222));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i21 + "' != '" + 2073+ "'", i21.equals(2073));

  }

  @Test
  public void test018() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test018"); }

    Operadores operadores0 = new Operadores();
    java.lang.Integer i3 = operadores0.somar((java.lang.Integer)211, (java.lang.Integer)212);
    java.lang.Integer i6 = operadores0.somar((java.lang.Integer)2962, (java.lang.Integer)1492);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i3 + "' != '" + 423+ "'", i3.equals(423));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i6 + "' != '" + 4454+ "'", i6.equals(4454));

  }

  @Test
  public void test019() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test019"); }

    Operadores operadores0 = new Operadores();
    java.lang.Integer i3 = operadores0.somar((java.lang.Integer)0, (java.lang.Integer)1);
    java.lang.Integer i6 = operadores0.somar((java.lang.Integer)0, (java.lang.Integer)100);
    java.lang.Integer i9 = operadores0.somar((java.lang.Integer)211, (java.lang.Integer)1);
    java.lang.Integer i12 = operadores0.somar((java.lang.Integer)12, (java.lang.Integer)211);
    java.lang.Integer i15 = operadores0.somar((java.lang.Integer)211, (java.lang.Integer)(-1));
    java.lang.Integer i18 = operadores0.somar((java.lang.Integer)10, (java.lang.Integer)212);
    java.lang.Integer i21 = operadores0.somar((java.lang.Integer)0, (java.lang.Integer)10);
    java.lang.Integer i24 = operadores0.somar((java.lang.Integer)524, (java.lang.Integer)570);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i3 + "' != '" + 1+ "'", i3.equals(1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i6 + "' != '" + 100+ "'", i6.equals(100));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i9 + "' != '" + 212+ "'", i9.equals(212));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i12 + "' != '" + 223+ "'", i12.equals(223));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i15 + "' != '" + 210+ "'", i15.equals(210));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i18 + "' != '" + 222+ "'", i18.equals(222));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i21 + "' != '" + 10+ "'", i21.equals(10));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i24 + "' != '" + 1094+ "'", i24.equals(1094));

  }

  @Test
  public void test020() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test020"); }

    Operadores operadores0 = new Operadores();
    java.lang.Integer i3 = operadores0.somar((java.lang.Integer)0, (java.lang.Integer)1);
    java.lang.Integer i6 = operadores0.somar((java.lang.Integer)0, (java.lang.Integer)100);
    java.lang.Integer i9 = operadores0.somar((java.lang.Integer)211, (java.lang.Integer)1);
    java.lang.Integer i12 = operadores0.somar((java.lang.Integer)12, (java.lang.Integer)211);
    java.lang.Integer i15 = operadores0.somar((java.lang.Integer)211, (java.lang.Integer)(-1));
    java.lang.Integer i18 = operadores0.somar((java.lang.Integer)312, (java.lang.Integer)312);
    java.lang.Integer i21 = operadores0.somar((java.lang.Integer)11, (java.lang.Integer)2901);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i3 + "' != '" + 1+ "'", i3.equals(1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i6 + "' != '" + 100+ "'", i6.equals(100));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i9 + "' != '" + 212+ "'", i9.equals(212));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i12 + "' != '" + 223+ "'", i12.equals(223));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i15 + "' != '" + 210+ "'", i15.equals(210));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i18 + "' != '" + 624+ "'", i18.equals(624));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i21 + "' != '" + 2912+ "'", i21.equals(2912));

  }

  @Test
  public void test021() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test021"); }

    Operadores operadores0 = new Operadores();
    java.lang.Integer i3 = operadores0.somar((java.lang.Integer)0, (java.lang.Integer)1);
    java.lang.Integer i6 = operadores0.somar((java.lang.Integer)0, (java.lang.Integer)100);
    java.lang.Integer i9 = operadores0.somar((java.lang.Integer)0, (java.lang.Integer)102);
    java.lang.Integer i12 = operadores0.somar((java.lang.Integer)1291, (java.lang.Integer)1893);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i3 + "' != '" + 1+ "'", i3.equals(1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i6 + "' != '" + 100+ "'", i6.equals(100));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i9 + "' != '" + 102+ "'", i9.equals(102));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i12 + "' != '" + 3184+ "'", i12.equals(3184));

  }

  @Test
  public void test022() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test022"); }

    Operadores operadores0 = new Operadores();
    java.lang.Integer i3 = operadores0.somar((java.lang.Integer)0, (java.lang.Integer)1);
    java.lang.Integer i6 = operadores0.somar((java.lang.Integer)10, (java.lang.Integer)1);
    java.lang.Integer i9 = operadores0.somar((java.lang.Integer)0, (java.lang.Integer)11);
    java.lang.Integer i12 = operadores0.somar((java.lang.Integer)201, (java.lang.Integer)323);
    java.lang.Integer i15 = operadores0.somar((java.lang.Integer)1269, (java.lang.Integer)947);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i3 + "' != '" + 1+ "'", i3.equals(1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i6 + "' != '" + 11+ "'", i6.equals(11));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i9 + "' != '" + 11+ "'", i9.equals(11));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i12 + "' != '" + 524+ "'", i12.equals(524));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i15 + "' != '" + 2216+ "'", i15.equals(2216));

  }

  @Test
  public void test023() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test023"); }

    Operadores operadores0 = new Operadores();
    java.lang.Integer i3 = operadores0.somar((java.lang.Integer)0, (java.lang.Integer)1);
    java.lang.Integer i6 = operadores0.somar((java.lang.Integer)0, (java.lang.Integer)100);
    java.lang.Integer i9 = operadores0.somar((java.lang.Integer)211, (java.lang.Integer)1);
    java.lang.Integer i12 = operadores0.somar((java.lang.Integer)12, (java.lang.Integer)211);
    java.lang.Integer i15 = operadores0.somar((java.lang.Integer)211, (java.lang.Integer)(-1));
    java.lang.Integer i18 = operadores0.somar((java.lang.Integer)10, (java.lang.Integer)212);
    java.lang.Integer i21 = operadores0.somar((java.lang.Integer)1094, (java.lang.Integer)0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i3 + "' != '" + 1+ "'", i3.equals(1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i6 + "' != '" + 100+ "'", i6.equals(100));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i9 + "' != '" + 212+ "'", i9.equals(212));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i12 + "' != '" + 223+ "'", i12.equals(223));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i15 + "' != '" + 210+ "'", i15.equals(210));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i18 + "' != '" + 222+ "'", i18.equals(222));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i21 + "' != '" + 1094+ "'", i21.equals(1094));

  }

  @Test
  public void test024() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test024"); }

    Operadores operadores0 = new Operadores();
    java.lang.Integer i3 = operadores0.somar((java.lang.Integer)0, (java.lang.Integer)1);
    java.lang.Integer i6 = operadores0.somar((java.lang.Integer)101, (java.lang.Integer)10);
    java.lang.Integer i9 = operadores0.somar((java.lang.Integer)102, (java.lang.Integer)223);
    java.lang.Integer i12 = operadores0.somar((java.lang.Integer)947, (java.lang.Integer)570);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i3 + "' != '" + 1+ "'", i3.equals(1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i6 + "' != '" + 111+ "'", i6.equals(111));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i9 + "' != '" + 325+ "'", i9.equals(325));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i12 + "' != '" + 1517+ "'", i12.equals(1517));

  }

  @Test
  public void test025() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test025"); }

    Operadores operadores0 = new Operadores();
    java.lang.Integer i3 = operadores0.somar((java.lang.Integer)0, (java.lang.Integer)1);
    java.lang.Integer i6 = operadores0.somar((java.lang.Integer)101, (java.lang.Integer)10);
    java.lang.Integer i9 = operadores0.somar((java.lang.Integer)102, (java.lang.Integer)223);
    java.lang.Integer i12 = operadores0.somar((java.lang.Integer)1370, (java.lang.Integer)(-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i3 + "' != '" + 1+ "'", i3.equals(1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i6 + "' != '" + 111+ "'", i6.equals(111));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i9 + "' != '" + 325+ "'", i9.equals(325));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i12 + "' != '" + 1369+ "'", i12.equals(1369));

  }

  @Test
  public void test026() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test026"); }

    Operadores operadores0 = new Operadores();
    java.lang.Integer i3 = operadores0.somar((java.lang.Integer)0, (java.lang.Integer)1);
    java.lang.Integer i6 = operadores0.somar((java.lang.Integer)10, (java.lang.Integer)1);
    java.lang.Integer i9 = operadores0.somar((java.lang.Integer)0, (java.lang.Integer)11);
    java.lang.Integer i12 = operadores0.somar((java.lang.Integer)212, (java.lang.Integer)111);
    java.lang.Integer i15 = operadores0.somar((java.lang.Integer)2003, (java.lang.Integer)522);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i3 + "' != '" + 1+ "'", i3.equals(1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i6 + "' != '" + 11+ "'", i6.equals(11));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i9 + "' != '" + 11+ "'", i9.equals(11));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i12 + "' != '" + 323+ "'", i12.equals(323));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i15 + "' != '" + 2525+ "'", i15.equals(2525));

  }

  @Test
  public void test027() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test027"); }

    Operadores operadores0 = new Operadores();
    java.lang.Integer i3 = operadores0.somar((java.lang.Integer)11, (java.lang.Integer)1);
    java.lang.Integer i6 = operadores0.somar((java.lang.Integer)3534, (java.lang.Integer)1704);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i3 + "' != '" + 12+ "'", i3.equals(12));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i6 + "' != '" + 5238+ "'", i6.equals(5238));

  }

  @Test
  public void test028() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test028"); }

    Operadores operadores0 = new Operadores();
    java.lang.Integer i3 = operadores0.somar((java.lang.Integer)0, (java.lang.Integer)1);
    java.lang.Integer i6 = operadores0.somar((java.lang.Integer)0, (java.lang.Integer)100);
    java.lang.Integer i9 = operadores0.somar((java.lang.Integer)0, (java.lang.Integer)102);
    java.lang.Integer i12 = operadores0.somar((java.lang.Integer)211, (java.lang.Integer)101);
    java.lang.Integer i15 = operadores0.somar((java.lang.Integer)735, (java.lang.Integer)336);
    java.lang.Integer i18 = operadores0.somar((java.lang.Integer)203, (java.lang.Integer)2896);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i3 + "' != '" + 1+ "'", i3.equals(1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i6 + "' != '" + 100+ "'", i6.equals(100));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i9 + "' != '" + 102+ "'", i9.equals(102));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i12 + "' != '" + 312+ "'", i12.equals(312));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i15 + "' != '" + 1071+ "'", i15.equals(1071));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i18 + "' != '" + 3099+ "'", i18.equals(3099));

  }

  @Test
  public void test029() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test029"); }

    Operadores operadores0 = new Operadores();
    java.lang.Integer i3 = operadores0.somar((java.lang.Integer)0, (java.lang.Integer)1);
    java.lang.Integer i6 = operadores0.somar((java.lang.Integer)0, (java.lang.Integer)100);
    java.lang.Integer i9 = operadores0.somar((java.lang.Integer)1, (java.lang.Integer)211);
    java.lang.Integer i12 = operadores0.somar((java.lang.Integer)111, (java.lang.Integer)2896);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i3 + "' != '" + 1+ "'", i3.equals(1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i6 + "' != '" + 100+ "'", i6.equals(100));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i9 + "' != '" + 212+ "'", i9.equals(212));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i12 + "' != '" + 3007+ "'", i12.equals(3007));

  }

  @Test
  public void test030() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test030"); }

    Operadores operadores0 = new Operadores();
    java.lang.Integer i3 = operadores0.somar((java.lang.Integer)0, (java.lang.Integer)1);
    java.lang.Integer i6 = operadores0.somar((java.lang.Integer)10, (java.lang.Integer)1);
    java.lang.Integer i9 = operadores0.somar((java.lang.Integer)0, (java.lang.Integer)11);
    java.lang.Integer i12 = operadores0.somar((java.lang.Integer)0, (java.lang.Integer)(-1));
    java.lang.Integer i15 = operadores0.somar((java.lang.Integer)1, (java.lang.Integer)111);
    java.lang.Integer i18 = operadores0.somar((java.lang.Integer)970, (java.lang.Integer)(-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i3 + "' != '" + 1+ "'", i3.equals(1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i6 + "' != '" + 11+ "'", i6.equals(11));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i9 + "' != '" + 11+ "'", i9.equals(11));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i12 + "' != '" + (-1)+ "'", i12.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i15 + "' != '" + 112+ "'", i15.equals(112));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i18 + "' != '" + 969+ "'", i18.equals(969));

  }

  @Test
  public void test031() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test031"); }

    Operadores operadores0 = new Operadores();
    java.lang.Integer i3 = operadores0.somar((java.lang.Integer)0, (java.lang.Integer)1);
    java.lang.Integer i6 = operadores0.somar((java.lang.Integer)0, (java.lang.Integer)100);
    java.lang.Integer i9 = operadores0.somar((java.lang.Integer)0, (java.lang.Integer)102);
    java.lang.Integer i12 = operadores0.somar((java.lang.Integer)1862, (java.lang.Integer)2003);
    java.lang.Integer i15 = operadores0.somar((java.lang.Integer)546, (java.lang.Integer)222);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i3 + "' != '" + 1+ "'", i3.equals(1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i6 + "' != '" + 100+ "'", i6.equals(100));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i9 + "' != '" + 102+ "'", i9.equals(102));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i12 + "' != '" + 3865+ "'", i12.equals(3865));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i15 + "' != '" + 768+ "'", i15.equals(768));

  }

  @Test
  public void test032() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test032"); }

    Operadores operadores0 = new Operadores();
    java.lang.Integer i3 = operadores0.somar((java.lang.Integer)0, (java.lang.Integer)1);
    java.lang.Integer i6 = operadores0.somar((java.lang.Integer)101, (java.lang.Integer)10);
    java.lang.Integer i9 = operadores0.somar((java.lang.Integer)11, (java.lang.Integer)101);
    java.lang.Integer i12 = operadores0.somar((java.lang.Integer)0, (java.lang.Integer)0);
    java.lang.Integer i15 = operadores0.somar((java.lang.Integer)(-1), (java.lang.Integer)102);
    java.lang.Integer i18 = operadores0.somar((java.lang.Integer)101, (java.lang.Integer)634);
    java.lang.Integer i21 = operadores0.somar((java.lang.Integer)436, (java.lang.Integer)101);
    java.lang.Integer i24 = operadores0.somar((java.lang.Integer)1614, (java.lang.Integer)1693);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i3 + "' != '" + 1+ "'", i3.equals(1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i6 + "' != '" + 111+ "'", i6.equals(111));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i9 + "' != '" + 112+ "'", i9.equals(112));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i12 + "' != '" + 0+ "'", i12.equals(0));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i15 + "' != '" + 101+ "'", i15.equals(101));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i18 + "' != '" + 735+ "'", i18.equals(735));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i21 + "' != '" + 537+ "'", i21.equals(537));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i24 + "' != '" + 3307+ "'", i24.equals(3307));

  }

  @Test
  public void test033() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test033"); }

    Operadores operadores0 = new Operadores();
    java.lang.Integer i3 = operadores0.somar((java.lang.Integer)0, (java.lang.Integer)1);
    java.lang.Integer i6 = operadores0.somar((java.lang.Integer)1515, (java.lang.Integer)1381);
    java.lang.Integer i9 = operadores0.somar((java.lang.Integer)747, (java.lang.Integer)0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i3 + "' != '" + 1+ "'", i3.equals(1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i6 + "' != '" + 2896+ "'", i6.equals(2896));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i9 + "' != '" + 747+ "'", i9.equals(747));

  }

  @Test
  public void test034() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test034"); }

    Operadores operadores0 = new Operadores();
    java.lang.Integer i3 = operadores0.somar((java.lang.Integer)0, (java.lang.Integer)1);
    java.lang.Integer i6 = operadores0.somar((java.lang.Integer)0, (java.lang.Integer)100);
    java.lang.Integer i9 = operadores0.somar((java.lang.Integer)211, (java.lang.Integer)1);
    java.lang.Integer i12 = operadores0.somar((java.lang.Integer)12, (java.lang.Integer)211);
    java.lang.Integer i15 = operadores0.somar((java.lang.Integer)424, (java.lang.Integer)211);
    java.lang.Integer i18 = operadores0.somar((java.lang.Integer)1094, (java.lang.Integer)234);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i3 + "' != '" + 1+ "'", i3.equals(1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i6 + "' != '" + 100+ "'", i6.equals(100));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i9 + "' != '" + 212+ "'", i9.equals(212));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i12 + "' != '" + 223+ "'", i12.equals(223));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i15 + "' != '" + 635+ "'", i15.equals(635));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i18 + "' != '" + 1328+ "'", i18.equals(1328));

  }

  @Test
  public void test035() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test035"); }

    Operadores operadores0 = new Operadores();
    java.lang.Integer i3 = operadores0.somar((java.lang.Integer)0, (java.lang.Integer)1);
    java.lang.Integer i6 = operadores0.somar((java.lang.Integer)101, (java.lang.Integer)10);
    java.lang.Integer i9 = operadores0.somar((java.lang.Integer)11, (java.lang.Integer)101);
    java.lang.Integer i12 = operadores0.somar((java.lang.Integer)1058, (java.lang.Integer)100);
    java.lang.Integer i15 = operadores0.somar((java.lang.Integer)234, (java.lang.Integer)623);
    java.lang.Integer i18 = operadores0.somar((java.lang.Integer)648, (java.lang.Integer)1726);
    java.lang.Integer i21 = operadores0.somar((java.lang.Integer)1328, (java.lang.Integer)1893);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i3 + "' != '" + 1+ "'", i3.equals(1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i6 + "' != '" + 111+ "'", i6.equals(111));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i9 + "' != '" + 112+ "'", i9.equals(112));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i12 + "' != '" + 1158+ "'", i12.equals(1158));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i15 + "' != '" + 857+ "'", i15.equals(857));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i18 + "' != '" + 2374+ "'", i18.equals(2374));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i21 + "' != '" + 3221+ "'", i21.equals(3221));

  }

  @Test
  public void test036() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test036"); }

    Operadores operadores0 = new Operadores();
    java.lang.Integer i3 = operadores0.somar((java.lang.Integer)0, (java.lang.Integer)1);
    java.lang.Integer i6 = operadores0.somar((java.lang.Integer)0, (java.lang.Integer)100);
    java.lang.Integer i9 = operadores0.somar((java.lang.Integer)211, (java.lang.Integer)1);
    java.lang.Integer i12 = operadores0.somar((java.lang.Integer)12, (java.lang.Integer)211);
    java.lang.Integer i15 = operadores0.somar((java.lang.Integer)211, (java.lang.Integer)(-1));
    java.lang.Integer i18 = operadores0.somar((java.lang.Integer)10, (java.lang.Integer)212);
    java.lang.Integer i21 = operadores0.somar((java.lang.Integer)11, (java.lang.Integer)0);
    java.lang.Integer i24 = operadores0.somar((java.lang.Integer)336, (java.lang.Integer)969);
    java.lang.Integer i27 = operadores0.somar((java.lang.Integer)1585, (java.lang.Integer)3099);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i3 + "' != '" + 1+ "'", i3.equals(1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i6 + "' != '" + 100+ "'", i6.equals(100));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i9 + "' != '" + 212+ "'", i9.equals(212));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i12 + "' != '" + 223+ "'", i12.equals(223));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i15 + "' != '" + 210+ "'", i15.equals(210));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i18 + "' != '" + 222+ "'", i18.equals(222));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i21 + "' != '" + 11+ "'", i21.equals(11));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i24 + "' != '" + 1305+ "'", i24.equals(1305));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i27 + "' != '" + 4684+ "'", i27.equals(4684));

  }

  @Test
  public void test037() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test037"); }

    Operadores operadores0 = new Operadores();
    java.lang.Integer i3 = operadores0.somar((java.lang.Integer)0, (java.lang.Integer)1);
    java.lang.Integer i6 = operadores0.somar((java.lang.Integer)10, (java.lang.Integer)1);
    java.lang.Integer i9 = operadores0.somar((java.lang.Integer)0, (java.lang.Integer)11);
    java.lang.Integer i12 = operadores0.somar((java.lang.Integer)212, (java.lang.Integer)111);
    java.lang.Integer i15 = operadores0.somar((java.lang.Integer)1058, (java.lang.Integer)234);
    java.lang.Integer i18 = operadores0.somar((java.lang.Integer)0, (java.lang.Integer)735);
    java.lang.Integer i21 = operadores0.somar((java.lang.Integer)635, (java.lang.Integer)101);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i3 + "' != '" + 1+ "'", i3.equals(1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i6 + "' != '" + 11+ "'", i6.equals(11));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i9 + "' != '" + 11+ "'", i9.equals(11));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i12 + "' != '" + 323+ "'", i12.equals(323));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i15 + "' != '" + 1292+ "'", i15.equals(1292));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i18 + "' != '" + 735+ "'", i18.equals(735));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i21 + "' != '" + 736+ "'", i21.equals(736));

  }

  @Test
  public void test038() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test038"); }

    Operadores operadores0 = new Operadores();
    java.lang.Integer i3 = operadores0.somar((java.lang.Integer)0, (java.lang.Integer)1);
    java.lang.Integer i6 = operadores0.somar((java.lang.Integer)0, (java.lang.Integer)100);
    java.lang.Integer i9 = operadores0.somar((java.lang.Integer)211, (java.lang.Integer)1);
    java.lang.Integer i12 = operadores0.somar((java.lang.Integer)112, (java.lang.Integer)424);
    java.lang.Integer i15 = operadores0.somar((java.lang.Integer)660, (java.lang.Integer)1704);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i3 + "' != '" + 1+ "'", i3.equals(1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i6 + "' != '" + 100+ "'", i6.equals(100));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i9 + "' != '" + 212+ "'", i9.equals(212));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i12 + "' != '" + 536+ "'", i12.equals(536));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i15 + "' != '" + 2364+ "'", i15.equals(2364));

  }

  @Test
  public void test039() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test039"); }

    Operadores operadores0 = new Operadores();
    java.lang.Integer i3 = operadores0.somar((java.lang.Integer)0, (java.lang.Integer)1);
    java.lang.Integer i6 = operadores0.somar((java.lang.Integer)101, (java.lang.Integer)10);
    java.lang.Integer i9 = operadores0.somar((java.lang.Integer)11, (java.lang.Integer)101);
    java.lang.Integer i12 = operadores0.somar((java.lang.Integer)0, (java.lang.Integer)0);
    java.lang.Integer i15 = operadores0.somar((java.lang.Integer)(-1), (java.lang.Integer)102);
    java.lang.Integer i18 = operadores0.somar((java.lang.Integer)101, (java.lang.Integer)634);
    java.lang.Integer i21 = operadores0.somar((java.lang.Integer)436, (java.lang.Integer)211);
    java.lang.Integer i24 = operadores0.somar((java.lang.Integer)12, (java.lang.Integer)648);
    java.lang.Integer i27 = operadores0.somar((java.lang.Integer)970, (java.lang.Integer)1292);
    java.lang.Integer i30 = operadores0.somar((java.lang.Integer)1305, (java.lang.Integer)734);
    java.lang.Integer i33 = operadores0.somar((java.lang.Integer)2241, (java.lang.Integer)100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i3 + "' != '" + 1+ "'", i3.equals(1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i6 + "' != '" + 111+ "'", i6.equals(111));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i9 + "' != '" + 112+ "'", i9.equals(112));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i12 + "' != '" + 0+ "'", i12.equals(0));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i15 + "' != '" + 101+ "'", i15.equals(101));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i18 + "' != '" + 735+ "'", i18.equals(735));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i21 + "' != '" + 647+ "'", i21.equals(647));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i24 + "' != '" + 660+ "'", i24.equals(660));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i27 + "' != '" + 2262+ "'", i27.equals(2262));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i30 + "' != '" + 2039+ "'", i30.equals(2039));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i33 + "' != '" + 2341+ "'", i33.equals(2341));

  }

  @Test
  public void test040() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test040"); }

    Operadores operadores0 = new Operadores();
    java.lang.Integer i3 = operadores0.somar((java.lang.Integer)0, (java.lang.Integer)1);
    java.lang.Integer i6 = operadores0.somar((java.lang.Integer)101, (java.lang.Integer)10);
    java.lang.Integer i9 = operadores0.somar((java.lang.Integer)1503, (java.lang.Integer)648);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i3 + "' != '" + 1+ "'", i3.equals(1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i6 + "' != '" + 111+ "'", i6.equals(111));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i9 + "' != '" + 2151+ "'", i9.equals(2151));

  }

  @Test
  public void test041() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test041"); }

    Operadores operadores0 = new Operadores();
    java.lang.Integer i3 = operadores0.somar((java.lang.Integer)570, (java.lang.Integer)424);
    java.lang.Integer i6 = operadores0.somar((java.lang.Integer)1614, (java.lang.Integer)635);
    java.lang.Integer i9 = operadores0.somar((java.lang.Integer)2129, (java.lang.Integer)747);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i3 + "' != '" + 994+ "'", i3.equals(994));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i6 + "' != '" + 2249+ "'", i6.equals(2249));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i9 + "' != '" + 2876+ "'", i9.equals(2876));

  }

  @Test
  public void test042() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test042"); }

    Operadores operadores0 = new Operadores();
    java.lang.Integer i3 = operadores0.somar((java.lang.Integer)0, (java.lang.Integer)1);
    java.lang.Integer i6 = operadores0.somar((java.lang.Integer)101, (java.lang.Integer)10);
    java.lang.Integer i9 = operadores0.somar((java.lang.Integer)11, (java.lang.Integer)101);
    java.lang.Integer i12 = operadores0.somar((java.lang.Integer)2216, (java.lang.Integer)1585);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i3 + "' != '" + 1+ "'", i3.equals(1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i6 + "' != '" + 111+ "'", i6.equals(111));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i9 + "' != '" + 112+ "'", i9.equals(112));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i12 + "' != '" + 3801+ "'", i12.equals(3801));

  }

  @Test
  public void test043() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test043"); }

    Operadores operadores0 = new Operadores();
    java.lang.Integer i3 = operadores0.somar((java.lang.Integer)0, (java.lang.Integer)1);
    java.lang.Integer i6 = operadores0.somar((java.lang.Integer)101, (java.lang.Integer)10);
    java.lang.Integer i9 = operadores0.somar((java.lang.Integer)11, (java.lang.Integer)101);
    java.lang.Integer i12 = operadores0.somar((java.lang.Integer)2129, (java.lang.Integer)3208);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i3 + "' != '" + 1+ "'", i3.equals(1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i6 + "' != '" + 111+ "'", i6.equals(111));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i9 + "' != '" + 112+ "'", i9.equals(112));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i12 + "' != '" + 5337+ "'", i12.equals(5337));

  }

  @Test
  public void test044() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test044"); }

    Operadores operadores0 = new Operadores();
    java.lang.Integer i3 = operadores0.somar((java.lang.Integer)0, (java.lang.Integer)1);
    java.lang.Integer i6 = operadores0.somar((java.lang.Integer)101, (java.lang.Integer)10);
    java.lang.Integer i9 = operadores0.somar((java.lang.Integer)11, (java.lang.Integer)101);
    java.lang.Integer i12 = operadores0.somar((java.lang.Integer)0, (java.lang.Integer)0);
    java.lang.Integer i15 = operadores0.somar((java.lang.Integer)0, (java.lang.Integer)312);
    java.lang.Integer i18 = operadores0.somar((java.lang.Integer)4688, (java.lang.Integer)1515);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i3 + "' != '" + 1+ "'", i3.equals(1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i6 + "' != '" + 111+ "'", i6.equals(111));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i9 + "' != '" + 112+ "'", i9.equals(112));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i12 + "' != '" + 0+ "'", i12.equals(0));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i15 + "' != '" + 312+ "'", i15.equals(312));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i18 + "' != '" + 6203+ "'", i18.equals(6203));

  }

  @Test
  public void test045() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test045"); }

    Operadores operadores0 = new Operadores();
    java.lang.Integer i3 = operadores0.somar((java.lang.Integer)0, (java.lang.Integer)1);
    java.lang.Integer i6 = operadores0.somar((java.lang.Integer)101, (java.lang.Integer)10);
    java.lang.Integer i9 = operadores0.somar((java.lang.Integer)211, (java.lang.Integer)0);
    java.lang.Integer i12 = operadores0.somar((java.lang.Integer)112, (java.lang.Integer)623);
    java.lang.Integer i15 = operadores0.somar((java.lang.Integer)2249, (java.lang.Integer)203);
    java.lang.Integer i18 = operadores0.somar((java.lang.Integer)2003, (java.lang.Integer)3322);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i3 + "' != '" + 1+ "'", i3.equals(1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i6 + "' != '" + 111+ "'", i6.equals(111));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i9 + "' != '" + 211+ "'", i9.equals(211));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i12 + "' != '" + 735+ "'", i12.equals(735));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i15 + "' != '" + 2452+ "'", i15.equals(2452));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i18 + "' != '" + 5325+ "'", i18.equals(5325));

  }

  @Test
  public void test046() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test046"); }

    Operadores operadores0 = new Operadores();
    java.lang.Integer i3 = operadores0.somar((java.lang.Integer)2364, (java.lang.Integer)0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i3 + "' != '" + 2364+ "'", i3.equals(2364));

  }

  @Test
  public void test047() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test047"); }

    Operadores operadores0 = new Operadores();
    java.lang.Integer i3 = operadores0.somar((java.lang.Integer)0, (java.lang.Integer)1);
    java.lang.Integer i6 = operadores0.somar((java.lang.Integer)101, (java.lang.Integer)0);
    java.lang.Integer i9 = operadores0.somar((java.lang.Integer)772, (java.lang.Integer)101);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i3 + "' != '" + 1+ "'", i3.equals(1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i6 + "' != '" + 101+ "'", i6.equals(101));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i9 + "' != '" + 873+ "'", i9.equals(873));

  }

  @Test
  public void test048() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test048"); }

    Operadores operadores0 = new Operadores();
    java.lang.Integer i3 = operadores0.somar((java.lang.Integer)0, (java.lang.Integer)1);
    java.lang.Integer i6 = operadores0.somar((java.lang.Integer)101, (java.lang.Integer)10);
    java.lang.Integer i9 = operadores0.somar((java.lang.Integer)11, (java.lang.Integer)101);
    java.lang.Integer i12 = operadores0.somar((java.lang.Integer)111, (java.lang.Integer)100);
    java.lang.Integer i15 = operadores0.somar((java.lang.Integer)1158, (java.lang.Integer)1084);
    java.lang.Integer i18 = operadores0.somar((java.lang.Integer)970, (java.lang.Integer)747);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i3 + "' != '" + 1+ "'", i3.equals(1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i6 + "' != '" + 111+ "'", i6.equals(111));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i9 + "' != '" + 112+ "'", i9.equals(112));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i12 + "' != '" + 211+ "'", i12.equals(211));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i15 + "' != '" + 2242+ "'", i15.equals(2242));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i18 + "' != '" + 1717+ "'", i18.equals(1717));

  }

  @Test
  public void test049() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test049"); }

    Operadores operadores0 = new Operadores();
    java.lang.Integer i3 = operadores0.somar((java.lang.Integer)0, (java.lang.Integer)1);
    java.lang.Integer i6 = operadores0.somar((java.lang.Integer)101, (java.lang.Integer)10);
    java.lang.Integer i9 = operadores0.somar((java.lang.Integer)11, (java.lang.Integer)101);
    java.lang.Integer i12 = operadores0.somar((java.lang.Integer)1058, (java.lang.Integer)100);
    java.lang.Integer i15 = operadores0.somar((java.lang.Integer)2452, (java.lang.Integer)112);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i3 + "' != '" + 1+ "'", i3.equals(1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i6 + "' != '" + 111+ "'", i6.equals(111));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i9 + "' != '" + 112+ "'", i9.equals(112));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i12 + "' != '" + 1158+ "'", i12.equals(1158));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i15 + "' != '" + 2564+ "'", i15.equals(2564));

  }

  @Test
  public void test050() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test050"); }

    Operadores operadores0 = new Operadores();
    java.lang.Integer i3 = operadores0.somar((java.lang.Integer)0, (java.lang.Integer)1);
    java.lang.Integer i6 = operadores0.somar((java.lang.Integer)101, (java.lang.Integer)10);
    java.lang.Integer i9 = operadores0.somar((java.lang.Integer)11, (java.lang.Integer)101);
    java.lang.Integer i12 = operadores0.somar((java.lang.Integer)0, (java.lang.Integer)0);
    java.lang.Integer i15 = operadores0.somar((java.lang.Integer)(-1), (java.lang.Integer)102);
    java.lang.Integer i18 = operadores0.somar((java.lang.Integer)1058, (java.lang.Integer)635);
    java.lang.Integer i21 = operadores0.somar((java.lang.Integer)546, (java.lang.Integer)0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i3 + "' != '" + 1+ "'", i3.equals(1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i6 + "' != '" + 111+ "'", i6.equals(111));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i9 + "' != '" + 112+ "'", i9.equals(112));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i12 + "' != '" + 0+ "'", i12.equals(0));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i15 + "' != '" + 101+ "'", i15.equals(101));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i18 + "' != '" + 1693+ "'", i18.equals(1693));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i21 + "' != '" + 546+ "'", i21.equals(546));

  }

  @Test
  public void test051() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test051"); }

    Operadores operadores0 = new Operadores();
    java.lang.Integer i3 = operadores0.somar((java.lang.Integer)0, (java.lang.Integer)1);
    java.lang.Integer i6 = operadores0.somar((java.lang.Integer)101, (java.lang.Integer)0);
    java.lang.Integer i9 = operadores0.somar((java.lang.Integer)1292, (java.lang.Integer)(-1));
    java.lang.Integer i12 = operadores0.somar((java.lang.Integer)747, (java.lang.Integer)623);
    java.lang.Integer i15 = operadores0.somar((java.lang.Integer)4688, (java.lang.Integer)1517);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i3 + "' != '" + 1+ "'", i3.equals(1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i6 + "' != '" + 101+ "'", i6.equals(101));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i9 + "' != '" + 1291+ "'", i9.equals(1291));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i12 + "' != '" + 1370+ "'", i12.equals(1370));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i15 + "' != '" + 6205+ "'", i15.equals(6205));

  }

  @Test
  public void test052() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test052"); }

    Operadores operadores0 = new Operadores();
    java.lang.Integer i3 = operadores0.somar((java.lang.Integer)0, (java.lang.Integer)1);
    java.lang.Integer i6 = operadores0.somar((java.lang.Integer)101, (java.lang.Integer)0);
    java.lang.Integer i9 = operadores0.somar((java.lang.Integer)1292, (java.lang.Integer)(-1));
    java.lang.Integer i12 = operadores0.somar((java.lang.Integer)747, (java.lang.Integer)623);
    java.lang.Integer i15 = operadores0.somar((java.lang.Integer)1370, (java.lang.Integer)1693);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i3 + "' != '" + 1+ "'", i3.equals(1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i6 + "' != '" + 101+ "'", i6.equals(101));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i9 + "' != '" + 1291+ "'", i9.equals(1291));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i12 + "' != '" + 1370+ "'", i12.equals(1370));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i15 + "' != '" + 3063+ "'", i15.equals(3063));

  }

  @Test
  public void test053() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test053"); }

    Operadores operadores0 = new Operadores();
    java.lang.Integer i3 = operadores0.somar((java.lang.Integer)0, (java.lang.Integer)1);
    java.lang.Integer i6 = operadores0.somar((java.lang.Integer)101, (java.lang.Integer)10);
    java.lang.Integer i9 = operadores0.somar((java.lang.Integer)11, (java.lang.Integer)101);
    java.lang.Integer i12 = operadores0.somar((java.lang.Integer)0, (java.lang.Integer)0);
    java.lang.Integer i15 = operadores0.somar((java.lang.Integer)(-1), (java.lang.Integer)102);
    java.lang.Integer i18 = operadores0.somar((java.lang.Integer)102, (java.lang.Integer)234);
    java.lang.Integer i21 = operadores0.somar((java.lang.Integer)211, (java.lang.Integer)0);
    java.lang.Integer i24 = operadores0.somar((java.lang.Integer)5649, (java.lang.Integer)0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i3 + "' != '" + 1+ "'", i3.equals(1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i6 + "' != '" + 111+ "'", i6.equals(111));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i9 + "' != '" + 112+ "'", i9.equals(112));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i12 + "' != '" + 0+ "'", i12.equals(0));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i15 + "' != '" + 101+ "'", i15.equals(101));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i18 + "' != '" + 336+ "'", i18.equals(336));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i21 + "' != '" + 211+ "'", i21.equals(211));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i24 + "' != '" + 5649+ "'", i24.equals(5649));

  }

  @Test
  public void test054() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test054"); }

    Operadores operadores0 = new Operadores();
    java.lang.Integer i3 = operadores0.somar((java.lang.Integer)0, (java.lang.Integer)1);
    java.lang.Integer i6 = operadores0.somar((java.lang.Integer)101, (java.lang.Integer)10);
    java.lang.Integer i9 = operadores0.somar((java.lang.Integer)11, (java.lang.Integer)101);
    java.lang.Integer i12 = operadores0.somar((java.lang.Integer)0, (java.lang.Integer)0);
    java.lang.Integer i15 = operadores0.somar((java.lang.Integer)(-1), (java.lang.Integer)102);
    java.lang.Integer i18 = operadores0.somar((java.lang.Integer)101, (java.lang.Integer)634);
    java.lang.Integer i21 = operadores0.somar((java.lang.Integer)436, (java.lang.Integer)211);
    java.lang.Integer i24 = operadores0.somar((java.lang.Integer)0, (java.lang.Integer)522);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i3 + "' != '" + 1+ "'", i3.equals(1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i6 + "' != '" + 111+ "'", i6.equals(111));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i9 + "' != '" + 112+ "'", i9.equals(112));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i12 + "' != '" + 0+ "'", i12.equals(0));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i15 + "' != '" + 101+ "'", i15.equals(101));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i18 + "' != '" + 735+ "'", i18.equals(735));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i21 + "' != '" + 647+ "'", i21.equals(647));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i24 + "' != '" + 522+ "'", i24.equals(522));

  }

  @Test
  public void test055() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test055"); }

    Operadores operadores0 = new Operadores();
    java.lang.Integer i3 = operadores0.somar((java.lang.Integer)0, (java.lang.Integer)1);
    java.lang.Integer i6 = operadores0.somar((java.lang.Integer)0, (java.lang.Integer)100);
    java.lang.Integer i9 = operadores0.somar((java.lang.Integer)211, (java.lang.Integer)1);
    java.lang.Integer i12 = operadores0.somar((java.lang.Integer)12, (java.lang.Integer)211);
    java.lang.Integer i15 = operadores0.somar((java.lang.Integer)211, (java.lang.Integer)(-1));
    java.lang.Integer i18 = operadores0.somar((java.lang.Integer)10, (java.lang.Integer)212);
    java.lang.Integer i21 = operadores0.somar((java.lang.Integer)972, (java.lang.Integer)112);
    java.lang.Integer i24 = operadores0.somar((java.lang.Integer)2341, (java.lang.Integer)6203);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i3 + "' != '" + 1+ "'", i3.equals(1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i6 + "' != '" + 100+ "'", i6.equals(100));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i9 + "' != '" + 212+ "'", i9.equals(212));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i12 + "' != '" + 223+ "'", i12.equals(223));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i15 + "' != '" + 210+ "'", i15.equals(210));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i18 + "' != '" + 222+ "'", i18.equals(222));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i21 + "' != '" + 1084+ "'", i21.equals(1084));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i24 + "' != '" + 8544+ "'", i24.equals(8544));

  }

  @Test
  public void test056() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test056"); }

    Operadores operadores0 = new Operadores();
    java.lang.Integer i3 = operadores0.somar((java.lang.Integer)0, (java.lang.Integer)1);
    java.lang.Integer i6 = operadores0.somar((java.lang.Integer)0, (java.lang.Integer)100);
    java.lang.Integer i9 = operadores0.somar((java.lang.Integer)101, (java.lang.Integer)102);
    java.lang.Integer i12 = operadores0.somar((java.lang.Integer)11, (java.lang.Integer)1693);
    java.lang.Integer i15 = operadores0.somar((java.lang.Integer)1292, (java.lang.Integer)211);
    java.lang.Integer i18 = operadores0.somar((java.lang.Integer)3865, (java.lang.Integer)2249);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i3 + "' != '" + 1+ "'", i3.equals(1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i6 + "' != '" + 100+ "'", i6.equals(100));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i9 + "' != '" + 203+ "'", i9.equals(203));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i12 + "' != '" + 1704+ "'", i12.equals(1704));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i15 + "' != '" + 1503+ "'", i15.equals(1503));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i18 + "' != '" + 6114+ "'", i18.equals(6114));

  }

  @Test
  public void test057() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test057"); }

    Operadores operadores0 = new Operadores();
    java.lang.Integer i3 = operadores0.somar((java.lang.Integer)0, (java.lang.Integer)1);
    java.lang.Integer i6 = operadores0.somar((java.lang.Integer)10, (java.lang.Integer)1);
    java.lang.Integer i9 = operadores0.somar((java.lang.Integer)101, (java.lang.Integer)1);
    java.lang.Integer i12 = operadores0.somar((java.lang.Integer)1269, (java.lang.Integer)734);
    java.lang.Integer i15 = operadores0.somar((java.lang.Integer)2129, (java.lang.Integer)772);
    java.lang.Integer i18 = operadores0.somar((java.lang.Integer)436, (java.lang.Integer)2525);
    java.lang.Integer i21 = operadores0.somar((java.lang.Integer)(-1), (java.lang.Integer)0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i3 + "' != '" + 1+ "'", i3.equals(1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i6 + "' != '" + 11+ "'", i6.equals(11));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i9 + "' != '" + 102+ "'", i9.equals(102));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i12 + "' != '" + 2003+ "'", i12.equals(2003));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i15 + "' != '" + 2901+ "'", i15.equals(2901));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i18 + "' != '" + 2961+ "'", i18.equals(2961));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i21 + "' != '" + (-1)+ "'", i21.equals((-1)));

  }

  @Test
  public void test058() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test058"); }

    Operadores operadores0 = new Operadores();
    java.lang.Integer i3 = operadores0.somar((java.lang.Integer)0, (java.lang.Integer)1);
    java.lang.Integer i6 = operadores0.somar((java.lang.Integer)101, (java.lang.Integer)10);
    java.lang.Integer i9 = operadores0.somar((java.lang.Integer)102, (java.lang.Integer)223);
    java.lang.Integer i12 = operadores0.somar((java.lang.Integer)323, (java.lang.Integer)223);
    java.lang.Integer i15 = operadores0.somar((java.lang.Integer)635, (java.lang.Integer)2241);
    java.lang.Integer i18 = operadores0.somar((java.lang.Integer)6203, (java.lang.Integer)424);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i3 + "' != '" + 1+ "'", i3.equals(1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i6 + "' != '" + 111+ "'", i6.equals(111));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i9 + "' != '" + 325+ "'", i9.equals(325));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i12 + "' != '" + 546+ "'", i12.equals(546));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i15 + "' != '" + 2876+ "'", i15.equals(2876));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i18 + "' != '" + 6627+ "'", i18.equals(6627));

  }

  @Test
  public void test059() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test059"); }

    Operadores operadores0 = new Operadores();
    java.lang.Integer i3 = operadores0.somar((java.lang.Integer)0, (java.lang.Integer)1);
    java.lang.Integer i6 = operadores0.somar((java.lang.Integer)101, (java.lang.Integer)10);
    java.lang.Integer i9 = operadores0.somar((java.lang.Integer)11, (java.lang.Integer)101);
    java.lang.Integer i12 = operadores0.somar((java.lang.Integer)0, (java.lang.Integer)0);
    java.lang.Integer i15 = operadores0.somar((java.lang.Integer)(-1), (java.lang.Integer)102);
    java.lang.Integer i18 = operadores0.somar((java.lang.Integer)101, (java.lang.Integer)634);
    java.lang.Integer i21 = operadores0.somar((java.lang.Integer)1281, (java.lang.Integer)234);
    java.lang.Integer i24 = operadores0.somar((java.lang.Integer)1704, (java.lang.Integer)2912);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i3 + "' != '" + 1+ "'", i3.equals(1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i6 + "' != '" + 111+ "'", i6.equals(111));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i9 + "' != '" + 112+ "'", i9.equals(112));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i12 + "' != '" + 0+ "'", i12.equals(0));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i15 + "' != '" + 101+ "'", i15.equals(101));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i18 + "' != '" + 735+ "'", i18.equals(735));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i21 + "' != '" + 1515+ "'", i21.equals(1515));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i24 + "' != '" + 4616+ "'", i24.equals(4616));

  }

  @Test
  public void test060() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test060"); }

    Operadores operadores0 = new Operadores();
    java.lang.Integer i3 = operadores0.somar((java.lang.Integer)0, (java.lang.Integer)1);
    java.lang.Integer i6 = operadores0.somar((java.lang.Integer)10, (java.lang.Integer)1);
    java.lang.Integer i9 = operadores0.somar((java.lang.Integer)0, (java.lang.Integer)11);
    java.lang.Integer i12 = operadores0.somar((java.lang.Integer)212, (java.lang.Integer)111);
    java.lang.Integer i15 = operadores0.somar((java.lang.Integer)1058, (java.lang.Integer)234);
    java.lang.Integer i18 = operadores0.somar((java.lang.Integer)0, (java.lang.Integer)735);
    java.lang.Integer i21 = operadores0.somar((java.lang.Integer)436, (java.lang.Integer)336);
    java.lang.Integer i24 = operadores0.somar((java.lang.Integer)1862, (java.lang.Integer)2676);
    java.lang.Integer i27 = operadores0.somar((java.lang.Integer)4688, (java.lang.Integer)1369);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i3 + "' != '" + 1+ "'", i3.equals(1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i6 + "' != '" + 11+ "'", i6.equals(11));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i9 + "' != '" + 11+ "'", i9.equals(11));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i12 + "' != '" + 323+ "'", i12.equals(323));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i15 + "' != '" + 1292+ "'", i15.equals(1292));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i18 + "' != '" + 735+ "'", i18.equals(735));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i21 + "' != '" + 772+ "'", i21.equals(772));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i24 + "' != '" + 4538+ "'", i24.equals(4538));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i27 + "' != '" + 6057+ "'", i27.equals(6057));

  }

  @Test
  public void test061() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test061"); }

    Operadores operadores0 = new Operadores();
    java.lang.Integer i3 = operadores0.somar((java.lang.Integer)0, (java.lang.Integer)1);
    java.lang.Integer i6 = operadores0.somar((java.lang.Integer)10, (java.lang.Integer)1);
    java.lang.Integer i9 = operadores0.somar((java.lang.Integer)0, (java.lang.Integer)11);
    java.lang.Integer i12 = operadores0.somar((java.lang.Integer)0, (java.lang.Integer)(-1));
    java.lang.Integer i15 = operadores0.somar((java.lang.Integer)5337, (java.lang.Integer)536);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i3 + "' != '" + 1+ "'", i3.equals(1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i6 + "' != '" + 11+ "'", i6.equals(11));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i9 + "' != '" + 11+ "'", i9.equals(11));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i12 + "' != '" + (-1)+ "'", i12.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i15 + "' != '" + 5873+ "'", i15.equals(5873));

  }

  @Test
  public void test062() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test062"); }

    Operadores operadores0 = new Operadores();
    java.lang.Integer i3 = operadores0.somar((java.lang.Integer)0, (java.lang.Integer)1);
    java.lang.Integer i6 = operadores0.somar((java.lang.Integer)101, (java.lang.Integer)10);
    java.lang.Integer i9 = operadores0.somar((java.lang.Integer)111, (java.lang.Integer)1503);
    java.lang.Integer i12 = operadores0.somar((java.lang.Integer)768, (java.lang.Integer)6203);
    java.lang.Integer i15 = operadores0.somar((java.lang.Integer)634, (java.lang.Integer)735);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i3 + "' != '" + 1+ "'", i3.equals(1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i6 + "' != '" + 111+ "'", i6.equals(111));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i9 + "' != '" + 1614+ "'", i9.equals(1614));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i12 + "' != '" + 6971+ "'", i12.equals(6971));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i15 + "' != '" + 1369+ "'", i15.equals(1369));

  }

  @Test
  public void test063() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test063"); }

    Operadores operadores0 = new Operadores();
    java.lang.Integer i3 = operadores0.somar((java.lang.Integer)0, (java.lang.Integer)1);
    java.lang.Integer i6 = operadores0.somar((java.lang.Integer)0, (java.lang.Integer)100);
    java.lang.Integer i9 = operadores0.somar((java.lang.Integer)211, (java.lang.Integer)1);
    java.lang.Integer i12 = operadores0.somar((java.lang.Integer)12, (java.lang.Integer)211);
    java.lang.Integer i15 = operadores0.somar((java.lang.Integer)211, (java.lang.Integer)(-1));
    java.lang.Integer i18 = operadores0.somar((java.lang.Integer)2554, (java.lang.Integer)768);
    java.lang.Integer i21 = operadores0.somar((java.lang.Integer)1714, (java.lang.Integer)537);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i3 + "' != '" + 1+ "'", i3.equals(1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i6 + "' != '" + 100+ "'", i6.equals(100));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i9 + "' != '" + 212+ "'", i9.equals(212));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i12 + "' != '" + 223+ "'", i12.equals(223));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i15 + "' != '" + 210+ "'", i15.equals(210));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i18 + "' != '" + 3322+ "'", i18.equals(3322));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i21 + "' != '" + 2251+ "'", i21.equals(2251));

  }

  @Test
  public void test064() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test064"); }

    Operadores operadores0 = new Operadores();
    java.lang.Integer i3 = operadores0.somar((java.lang.Integer)0, (java.lang.Integer)1);
    java.lang.Integer i6 = operadores0.somar((java.lang.Integer)10, (java.lang.Integer)1);
    java.lang.Integer i9 = operadores0.somar((java.lang.Integer)0, (java.lang.Integer)11);
    java.lang.Integer i12 = operadores0.somar((java.lang.Integer)212, (java.lang.Integer)111);
    java.lang.Integer i15 = operadores0.somar((java.lang.Integer)536, (java.lang.Integer)102);
    java.lang.Integer i18 = operadores0.somar((java.lang.Integer)1804, (java.lang.Integer)211);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i3 + "' != '" + 1+ "'", i3.equals(1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i6 + "' != '" + 11+ "'", i6.equals(11));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i9 + "' != '" + 11+ "'", i9.equals(11));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i12 + "' != '" + 323+ "'", i12.equals(323));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i15 + "' != '" + 638+ "'", i15.equals(638));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i18 + "' != '" + 2015+ "'", i18.equals(2015));

  }

  @Test
  public void test065() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test065"); }

    Operadores operadores0 = new Operadores();
    java.lang.Integer i3 = operadores0.somar((java.lang.Integer)0, (java.lang.Integer)1);
    java.lang.Integer i6 = operadores0.somar((java.lang.Integer)0, (java.lang.Integer)100);
    java.lang.Integer i9 = operadores0.somar((java.lang.Integer)211, (java.lang.Integer)1);
    java.lang.Integer i12 = operadores0.somar((java.lang.Integer)635, (java.lang.Integer)0);
    java.lang.Integer i15 = operadores0.somar((java.lang.Integer)5337, (java.lang.Integer)3307);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i3 + "' != '" + 1+ "'", i3.equals(1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i6 + "' != '" + 100+ "'", i6.equals(100));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i9 + "' != '" + 212+ "'", i9.equals(212));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i12 + "' != '" + 635+ "'", i12.equals(635));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i15 + "' != '" + 8644+ "'", i15.equals(8644));

  }

  @Test
  public void test066() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test066"); }

    Operadores operadores0 = new Operadores();
    java.lang.Integer i3 = operadores0.somar((java.lang.Integer)0, (java.lang.Integer)1);
    java.lang.Integer i6 = operadores0.somar((java.lang.Integer)0, (java.lang.Integer)100);
    java.lang.Integer i9 = operadores0.somar((java.lang.Integer)101, (java.lang.Integer)102);
    java.lang.Integer i12 = operadores0.somar((java.lang.Integer)1269, (java.lang.Integer)211);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i3 + "' != '" + 1+ "'", i3.equals(1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i6 + "' != '" + 100+ "'", i6.equals(100));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i9 + "' != '" + 203+ "'", i9.equals(203));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i12 + "' != '" + 1480+ "'", i12.equals(1480));

  }

  @Test
  public void test067() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test067"); }

    Operadores operadores0 = new Operadores();
    java.lang.Integer i3 = operadores0.somar((java.lang.Integer)0, (java.lang.Integer)1);
    java.lang.Integer i6 = operadores0.somar((java.lang.Integer)0, (java.lang.Integer)100);
    java.lang.Integer i9 = operadores0.somar((java.lang.Integer)211, (java.lang.Integer)1);
    java.lang.Integer i12 = operadores0.somar((java.lang.Integer)12, (java.lang.Integer)211);
    java.lang.Integer i15 = operadores0.somar((java.lang.Integer)211, (java.lang.Integer)(-1));
    java.lang.Integer i18 = operadores0.somar((java.lang.Integer)210, (java.lang.Integer)312);
    java.lang.Integer i21 = operadores0.somar((java.lang.Integer)1704, (java.lang.Integer)100);
    java.lang.Integer i24 = operadores0.somar((java.lang.Integer)772, (java.lang.Integer)2341);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i3 + "' != '" + 1+ "'", i3.equals(1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i6 + "' != '" + 100+ "'", i6.equals(100));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i9 + "' != '" + 212+ "'", i9.equals(212));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i12 + "' != '" + 223+ "'", i12.equals(223));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i15 + "' != '" + 210+ "'", i15.equals(210));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i18 + "' != '" + 522+ "'", i18.equals(522));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i21 + "' != '" + 1804+ "'", i21.equals(1804));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i24 + "' != '" + 3113+ "'", i24.equals(3113));

  }

  @Test
  public void test068() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test068"); }

    Operadores operadores0 = new Operadores();
    java.lang.Integer i3 = operadores0.somar((java.lang.Integer)0, (java.lang.Integer)1);
    java.lang.Integer i6 = operadores0.somar((java.lang.Integer)10, (java.lang.Integer)1);
    java.lang.Integer i9 = operadores0.somar((java.lang.Integer)0, (java.lang.Integer)11);
    java.lang.Integer i12 = operadores0.somar((java.lang.Integer)212, (java.lang.Integer)111);
    java.lang.Integer i15 = operadores0.somar((java.lang.Integer)536, (java.lang.Integer)102);
    java.lang.Integer i18 = operadores0.somar((java.lang.Integer)1269, (java.lang.Integer)1693);
    java.lang.Integer i21 = operadores0.somar((java.lang.Integer)873, (java.lang.Integer)2562);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i3 + "' != '" + 1+ "'", i3.equals(1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i6 + "' != '" + 11+ "'", i6.equals(11));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i9 + "' != '" + 11+ "'", i9.equals(11));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i12 + "' != '" + 323+ "'", i12.equals(323));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i15 + "' != '" + 638+ "'", i15.equals(638));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i18 + "' != '" + 2962+ "'", i18.equals(2962));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i21 + "' != '" + 3435+ "'", i21.equals(3435));

  }

  @Test
  public void test069() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test069"); }

    Operadores operadores0 = new Operadores();
    java.lang.Integer i3 = operadores0.somar((java.lang.Integer)0, (java.lang.Integer)1);
    java.lang.Integer i6 = operadores0.somar((java.lang.Integer)10, (java.lang.Integer)1);
    java.lang.Integer i9 = operadores0.somar((java.lang.Integer)0, (java.lang.Integer)11);
    java.lang.Integer i12 = operadores0.somar((java.lang.Integer)201, (java.lang.Integer)323);
    java.lang.Integer i15 = operadores0.somar((java.lang.Integer)969, (java.lang.Integer)436);
    java.lang.Integer i18 = operadores0.somar((java.lang.Integer)2241, (java.lang.Integer)5649);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i3 + "' != '" + 1+ "'", i3.equals(1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i6 + "' != '" + 11+ "'", i6.equals(11));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i9 + "' != '" + 11+ "'", i9.equals(11));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i12 + "' != '" + 524+ "'", i12.equals(524));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i15 + "' != '" + 1405+ "'", i15.equals(1405));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i18 + "' != '" + 7890+ "'", i18.equals(7890));

  }

  @Test
  public void test070() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test070"); }

    Operadores operadores0 = new Operadores();
    java.lang.Integer i3 = operadores0.somar((java.lang.Integer)0, (java.lang.Integer)1);
    java.lang.Integer i6 = operadores0.somar((java.lang.Integer)0, (java.lang.Integer)100);
    java.lang.Integer i9 = operadores0.somar((java.lang.Integer)101, (java.lang.Integer)102);
    java.lang.Integer i12 = operadores0.somar((java.lang.Integer)11, (java.lang.Integer)1693);
    java.lang.Integer i15 = operadores0.somar((java.lang.Integer)203, (java.lang.Integer)1614);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i3 + "' != '" + 1+ "'", i3.equals(1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i6 + "' != '" + 100+ "'", i6.equals(100));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i9 + "' != '" + 203+ "'", i9.equals(203));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i12 + "' != '" + 1704+ "'", i12.equals(1704));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i15 + "' != '" + 1817+ "'", i15.equals(1817));

  }

  @Test
  public void test071() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test071"); }

    Operadores operadores0 = new Operadores();
    java.lang.Integer i3 = operadores0.somar((java.lang.Integer)0, (java.lang.Integer)1);
    java.lang.Integer i6 = operadores0.somar((java.lang.Integer)0, (java.lang.Integer)100);
    java.lang.Integer i9 = operadores0.somar((java.lang.Integer)211, (java.lang.Integer)1);
    java.lang.Integer i12 = operadores0.somar((java.lang.Integer)12, (java.lang.Integer)211);
    java.lang.Integer i15 = operadores0.somar((java.lang.Integer)211, (java.lang.Integer)(-1));
    java.lang.Integer i18 = operadores0.somar((java.lang.Integer)312, (java.lang.Integer)312);
    java.lang.Integer i21 = operadores0.somar((java.lang.Integer)1281, (java.lang.Integer)100);
    java.lang.Integer i24 = operadores0.somar((java.lang.Integer)2364, (java.lang.Integer)5337);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i3 + "' != '" + 1+ "'", i3.equals(1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i6 + "' != '" + 100+ "'", i6.equals(100));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i9 + "' != '" + 212+ "'", i9.equals(212));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i12 + "' != '" + 223+ "'", i12.equals(223));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i15 + "' != '" + 210+ "'", i15.equals(210));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i18 + "' != '" + 624+ "'", i18.equals(624));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i21 + "' != '" + 1381+ "'", i21.equals(1381));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i24 + "' != '" + 7701+ "'", i24.equals(7701));

  }

  @Test
  public void test072() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test072"); }

    Operadores operadores0 = new Operadores();
    java.lang.Integer i3 = operadores0.somar((java.lang.Integer)0, (java.lang.Integer)1);
    java.lang.Integer i6 = operadores0.somar((java.lang.Integer)0, (java.lang.Integer)100);
    java.lang.Integer i9 = operadores0.somar((java.lang.Integer)1, (java.lang.Integer)211);
    java.lang.Integer i12 = operadores0.somar((java.lang.Integer)11, (java.lang.Integer)223);
    java.lang.Integer i15 = operadores0.somar((java.lang.Integer)537, (java.lang.Integer)6057);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i3 + "' != '" + 1+ "'", i3.equals(1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i6 + "' != '" + 100+ "'", i6.equals(100));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i9 + "' != '" + 212+ "'", i9.equals(212));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i12 + "' != '" + 234+ "'", i12.equals(234));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i15 + "' != '" + 6594+ "'", i15.equals(6594));

  }

  @Test
  public void test073() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test073"); }

    Operadores operadores0 = new Operadores();
    java.lang.Integer i3 = operadores0.somar((java.lang.Integer)0, (java.lang.Integer)1);
    java.lang.Integer i6 = operadores0.somar((java.lang.Integer)0, (java.lang.Integer)100);
    java.lang.Integer i9 = operadores0.somar((java.lang.Integer)211, (java.lang.Integer)1);
    java.lang.Integer i12 = operadores0.somar((java.lang.Integer)635, (java.lang.Integer)0);
    java.lang.Integer i15 = operadores0.somar((java.lang.Integer)1515, (java.lang.Integer)3310);
    java.lang.Integer i18 = operadores0.somar((java.lang.Integer)1893, (java.lang.Integer)1291);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i3 + "' != '" + 1+ "'", i3.equals(1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i6 + "' != '" + 100+ "'", i6.equals(100));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i9 + "' != '" + 212+ "'", i9.equals(212));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i12 + "' != '" + 635+ "'", i12.equals(635));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i15 + "' != '" + 4825+ "'", i15.equals(4825));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i18 + "' != '" + 3184+ "'", i18.equals(3184));

  }

  @Test
  public void test074() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test074"); }

    Operadores operadores0 = new Operadores();
    java.lang.Integer i3 = operadores0.somar((java.lang.Integer)0, (java.lang.Integer)1);
    java.lang.Integer i6 = operadores0.somar((java.lang.Integer)0, (java.lang.Integer)100);
    java.lang.Integer i9 = operadores0.somar((java.lang.Integer)211, (java.lang.Integer)1);
    java.lang.Integer i12 = operadores0.somar((java.lang.Integer)12, (java.lang.Integer)211);
    java.lang.Integer i15 = operadores0.somar((java.lang.Integer)211, (java.lang.Integer)(-1));
    java.lang.Integer i18 = operadores0.somar((java.lang.Integer)312, (java.lang.Integer)312);
    java.lang.Integer i21 = operadores0.somar((java.lang.Integer)1281, (java.lang.Integer)100);
    java.lang.Integer i24 = operadores0.somar((java.lang.Integer)5337, (java.lang.Integer)2262);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i3 + "' != '" + 1+ "'", i3.equals(1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i6 + "' != '" + 100+ "'", i6.equals(100));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i9 + "' != '" + 212+ "'", i9.equals(212));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i12 + "' != '" + 223+ "'", i12.equals(223));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i15 + "' != '" + 210+ "'", i15.equals(210));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i18 + "' != '" + 624+ "'", i18.equals(624));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i21 + "' != '" + 1381+ "'", i21.equals(1381));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i24 + "' != '" + 7599+ "'", i24.equals(7599));

  }

  @Test
  public void test075() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test075"); }

    Operadores operadores0 = new Operadores();
    java.lang.Integer i3 = operadores0.somar((java.lang.Integer)0, (java.lang.Integer)1);
    java.lang.Integer i6 = operadores0.somar((java.lang.Integer)101, (java.lang.Integer)10);
    java.lang.Integer i9 = operadores0.somar((java.lang.Integer)11, (java.lang.Integer)101);
    java.lang.Integer i12 = operadores0.somar((java.lang.Integer)947, (java.lang.Integer)648);
    java.lang.Integer i15 = operadores0.somar((java.lang.Integer)570, (java.lang.Integer)1292);
    java.lang.Integer i18 = operadores0.somar((java.lang.Integer)1269, (java.lang.Integer)0);
    java.lang.Integer i21 = operadores0.somar((java.lang.Integer)1788, (java.lang.Integer)1717);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i3 + "' != '" + 1+ "'", i3.equals(1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i6 + "' != '" + 111+ "'", i6.equals(111));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i9 + "' != '" + 112+ "'", i9.equals(112));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i12 + "' != '" + 1595+ "'", i12.equals(1595));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i15 + "' != '" + 1862+ "'", i15.equals(1862));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i18 + "' != '" + 1269+ "'", i18.equals(1269));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i21 + "' != '" + 3505+ "'", i21.equals(3505));

  }

  @Test
  public void test076() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test076"); }

    Operadores operadores0 = new Operadores();
    java.lang.Integer i3 = operadores0.somar((java.lang.Integer)0, (java.lang.Integer)1);
    java.lang.Integer i6 = operadores0.somar((java.lang.Integer)0, (java.lang.Integer)100);
    java.lang.Integer i9 = operadores0.somar((java.lang.Integer)211, (java.lang.Integer)1);
    java.lang.Integer i12 = operadores0.somar((java.lang.Integer)635, (java.lang.Integer)0);
    java.lang.Integer i15 = operadores0.somar((java.lang.Integer)3534, (java.lang.Integer)0);
    java.lang.Integer i18 = operadores0.somar((java.lang.Integer)1, (java.lang.Integer)1614);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i3 + "' != '" + 1+ "'", i3.equals(1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i6 + "' != '" + 100+ "'", i6.equals(100));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i9 + "' != '" + 212+ "'", i9.equals(212));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i12 + "' != '" + 635+ "'", i12.equals(635));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i15 + "' != '" + 3534+ "'", i15.equals(3534));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i18 + "' != '" + 1615+ "'", i18.equals(1615));

  }

  @Test
  public void test077() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test077"); }

    Operadores operadores0 = new Operadores();
    java.lang.Integer i3 = operadores0.somar((java.lang.Integer)0, (java.lang.Integer)1);
    java.lang.Integer i6 = operadores0.somar((java.lang.Integer)0, (java.lang.Integer)100);
    java.lang.Integer i9 = operadores0.somar((java.lang.Integer)1, (java.lang.Integer)211);
    java.lang.Integer i12 = operadores0.somar((java.lang.Integer)11, (java.lang.Integer)223);
    java.lang.Integer i15 = operadores0.somar((java.lang.Integer)412, (java.lang.Integer)211);
    java.lang.Integer i18 = operadores0.somar((java.lang.Integer)972, (java.lang.Integer)1704);
    java.lang.Integer i21 = operadores0.somar((java.lang.Integer)312, (java.lang.Integer)5337);
    java.lang.Integer i24 = operadores0.somar((java.lang.Integer)1381, (java.lang.Integer)2554);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i3 + "' != '" + 1+ "'", i3.equals(1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i6 + "' != '" + 100+ "'", i6.equals(100));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i9 + "' != '" + 212+ "'", i9.equals(212));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i12 + "' != '" + 234+ "'", i12.equals(234));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i15 + "' != '" + 623+ "'", i15.equals(623));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i18 + "' != '" + 2676+ "'", i18.equals(2676));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i21 + "' != '" + 5649+ "'", i21.equals(5649));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i24 + "' != '" + 3935+ "'", i24.equals(3935));

  }

  @Test
  public void test078() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test078"); }

    Operadores operadores0 = new Operadores();
    java.lang.Integer i3 = operadores0.somar((java.lang.Integer)0, (java.lang.Integer)1);
    java.lang.Integer i6 = operadores0.somar((java.lang.Integer)0, (java.lang.Integer)100);
    java.lang.Integer i9 = operadores0.somar((java.lang.Integer)211, (java.lang.Integer)1);
    java.lang.Integer i12 = operadores0.somar((java.lang.Integer)635, (java.lang.Integer)0);
    java.lang.Integer i15 = operadores0.somar((java.lang.Integer)10, (java.lang.Integer)201);
    java.lang.Integer i18 = operadores0.somar((java.lang.Integer)2896, (java.lang.Integer)638);
    java.lang.Integer i21 = operadores0.somar((java.lang.Integer)4703, (java.lang.Integer)2923);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i3 + "' != '" + 1+ "'", i3.equals(1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i6 + "' != '" + 100+ "'", i6.equals(100));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i9 + "' != '" + 212+ "'", i9.equals(212));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i12 + "' != '" + 635+ "'", i12.equals(635));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i15 + "' != '" + 211+ "'", i15.equals(211));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i18 + "' != '" + 3534+ "'", i18.equals(3534));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i21 + "' != '" + 7626+ "'", i21.equals(7626));

  }

  @Test
  public void test079() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test079"); }

    Operadores operadores0 = new Operadores();
    java.lang.Integer i3 = operadores0.somar((java.lang.Integer)0, (java.lang.Integer)1);
    java.lang.Integer i6 = operadores0.somar((java.lang.Integer)101, (java.lang.Integer)10);
    java.lang.Integer i9 = operadores0.somar((java.lang.Integer)11, (java.lang.Integer)101);
    java.lang.Integer i12 = operadores0.somar((java.lang.Integer)537, (java.lang.Integer)1704);
    java.lang.Integer i15 = operadores0.somar((java.lang.Integer)4454, (java.lang.Integer)1517);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i3 + "' != '" + 1+ "'", i3.equals(1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i6 + "' != '" + 111+ "'", i6.equals(111));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i9 + "' != '" + 112+ "'", i9.equals(112));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i12 + "' != '" + 2241+ "'", i12.equals(2241));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i15 + "' != '" + 5971+ "'", i15.equals(5971));

  }

  @Test
  public void test080() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test080"); }

    Operadores operadores0 = new Operadores();
    java.lang.Integer i3 = operadores0.somar((java.lang.Integer)0, (java.lang.Integer)1);
    java.lang.Integer i6 = operadores0.somar((java.lang.Integer)10, (java.lang.Integer)1);
    java.lang.Integer i9 = operadores0.somar((java.lang.Integer)0, (java.lang.Integer)11);
    java.lang.Integer i12 = operadores0.somar((java.lang.Integer)201, (java.lang.Integer)323);
    java.lang.Integer i15 = operadores0.somar((java.lang.Integer)969, (java.lang.Integer)436);
    java.lang.Integer i18 = operadores0.somar((java.lang.Integer)1817, (java.lang.Integer)1817);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i3 + "' != '" + 1+ "'", i3.equals(1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i6 + "' != '" + 11+ "'", i6.equals(11));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i9 + "' != '" + 11+ "'", i9.equals(11));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i12 + "' != '" + 524+ "'", i12.equals(524));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i15 + "' != '" + 1405+ "'", i15.equals(1405));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i18 + "' != '" + 3634+ "'", i18.equals(3634));

  }

  @Test
  public void test081() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test081"); }

    Operadores operadores0 = new Operadores();
    java.lang.Integer i3 = operadores0.somar((java.lang.Integer)0, (java.lang.Integer)1);
    java.lang.Integer i6 = operadores0.somar((java.lang.Integer)101, (java.lang.Integer)10);
    java.lang.Integer i9 = operadores0.somar((java.lang.Integer)11, (java.lang.Integer)101);
    java.lang.Integer i12 = operadores0.somar((java.lang.Integer)0, (java.lang.Integer)0);
    java.lang.Integer i15 = operadores0.somar((java.lang.Integer)2249, (java.lang.Integer)1693);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i3 + "' != '" + 1+ "'", i3.equals(1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i6 + "' != '" + 111+ "'", i6.equals(111));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i9 + "' != '" + 112+ "'", i9.equals(112));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i12 + "' != '" + 0+ "'", i12.equals(0));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i15 + "' != '" + 3942+ "'", i15.equals(3942));

  }

  @Test
  public void test082() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test082"); }

    Operadores operadores0 = new Operadores();
    java.lang.Integer i3 = operadores0.somar((java.lang.Integer)0, (java.lang.Integer)1);
    java.lang.Integer i6 = operadores0.somar((java.lang.Integer)0, (java.lang.Integer)100);
    java.lang.Integer i9 = operadores0.somar((java.lang.Integer)211, (java.lang.Integer)1);
    java.lang.Integer i12 = operadores0.somar((java.lang.Integer)12, (java.lang.Integer)211);
    java.lang.Integer i15 = operadores0.somar((java.lang.Integer)211, (java.lang.Integer)(-1));
    java.lang.Integer i18 = operadores0.somar((java.lang.Integer)10, (java.lang.Integer)212);
    java.lang.Integer i21 = operadores0.somar((java.lang.Integer)11, (java.lang.Integer)0);
    java.lang.Integer i24 = operadores0.somar((java.lang.Integer)336, (java.lang.Integer)969);
    java.lang.Integer i27 = operadores0.somar((java.lang.Integer)2554, (java.lang.Integer)4538);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i3 + "' != '" + 1+ "'", i3.equals(1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i6 + "' != '" + 100+ "'", i6.equals(100));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i9 + "' != '" + 212+ "'", i9.equals(212));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i12 + "' != '" + 223+ "'", i12.equals(223));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i15 + "' != '" + 210+ "'", i15.equals(210));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i18 + "' != '" + 222+ "'", i18.equals(222));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i21 + "' != '" + 11+ "'", i21.equals(11));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i24 + "' != '" + 1305+ "'", i24.equals(1305));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i27 + "' != '" + 7092+ "'", i27.equals(7092));

  }

  @Test
  public void test083() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test083"); }

    Operadores operadores0 = new Operadores();
    java.lang.Integer i3 = operadores0.somar((java.lang.Integer)0, (java.lang.Integer)1);
    java.lang.Integer i6 = operadores0.somar((java.lang.Integer)10, (java.lang.Integer)1);
    java.lang.Integer i9 = operadores0.somar((java.lang.Integer)0, (java.lang.Integer)11);
    java.lang.Integer i12 = operadores0.somar((java.lang.Integer)212, (java.lang.Integer)111);
    java.lang.Integer i15 = operadores0.somar((java.lang.Integer)536, (java.lang.Integer)102);
    java.lang.Integer i18 = operadores0.somar((java.lang.Integer)1269, (java.lang.Integer)1693);
    java.lang.Integer i21 = operadores0.somar((java.lang.Integer)2262, (java.lang.Integer)5337);
    java.lang.Integer i24 = operadores0.somar((java.lang.Integer)1517, (java.lang.Integer)2039);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i3 + "' != '" + 1+ "'", i3.equals(1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i6 + "' != '" + 11+ "'", i6.equals(11));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i9 + "' != '" + 11+ "'", i9.equals(11));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i12 + "' != '" + 323+ "'", i12.equals(323));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i15 + "' != '" + 638+ "'", i15.equals(638));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i18 + "' != '" + 2962+ "'", i18.equals(2962));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i21 + "' != '" + 7599+ "'", i21.equals(7599));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i24 + "' != '" + 3556+ "'", i24.equals(3556));

  }

  @Test
  public void test084() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test084"); }

    Operadores operadores0 = new Operadores();
    java.lang.Integer i3 = operadores0.somar((java.lang.Integer)0, (java.lang.Integer)1);
    java.lang.Integer i6 = operadores0.somar((java.lang.Integer)101, (java.lang.Integer)10);
    java.lang.Integer i9 = operadores0.somar((java.lang.Integer)11, (java.lang.Integer)101);
    java.lang.Integer i12 = operadores0.somar((java.lang.Integer)0, (java.lang.Integer)0);
    java.lang.Integer i15 = operadores0.somar((java.lang.Integer)(-1), (java.lang.Integer)102);
    java.lang.Integer i18 = operadores0.somar((java.lang.Integer)100, (java.lang.Integer)101);
    java.lang.Integer i21 = operadores0.somar((java.lang.Integer)2151, (java.lang.Integer)(-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i3 + "' != '" + 1+ "'", i3.equals(1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i6 + "' != '" + 111+ "'", i6.equals(111));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i9 + "' != '" + 112+ "'", i9.equals(112));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i12 + "' != '" + 0+ "'", i12.equals(0));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i15 + "' != '" + 101+ "'", i15.equals(101));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i18 + "' != '" + 201+ "'", i18.equals(201));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i21 + "' != '" + 2150+ "'", i21.equals(2150));

  }

  @Test
  public void test085() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test085"); }

    Operadores operadores0 = new Operadores();
    java.lang.Integer i3 = operadores0.somar((java.lang.Integer)0, (java.lang.Integer)1);
    java.lang.Integer i6 = operadores0.somar((java.lang.Integer)101, (java.lang.Integer)10);
    java.lang.Integer i9 = operadores0.somar((java.lang.Integer)211, (java.lang.Integer)0);
    java.lang.Integer i12 = operadores0.somar((java.lang.Integer)2676, (java.lang.Integer)112);
    java.lang.Integer i15 = operadores0.somar((java.lang.Integer)5230, (java.lang.Integer)3634);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i3 + "' != '" + 1+ "'", i3.equals(1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i6 + "' != '" + 111+ "'", i6.equals(111));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i9 + "' != '" + 211+ "'", i9.equals(211));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i12 + "' != '" + 2788+ "'", i12.equals(2788));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i15 + "' != '" + 8864+ "'", i15.equals(8864));

  }

  @Test
  public void test086() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test086"); }

    Operadores operadores0 = new Operadores();
    java.lang.Integer i3 = operadores0.somar((java.lang.Integer)0, (java.lang.Integer)1);
    java.lang.Integer i6 = operadores0.somar((java.lang.Integer)10, (java.lang.Integer)1);
    java.lang.Integer i9 = operadores0.somar((java.lang.Integer)0, (java.lang.Integer)11);
    java.lang.Integer i12 = operadores0.somar((java.lang.Integer)212, (java.lang.Integer)111);
    java.lang.Integer i15 = operadores0.somar((java.lang.Integer)536, (java.lang.Integer)102);
    java.lang.Integer i18 = operadores0.somar((java.lang.Integer)102, (java.lang.Integer)634);
    java.lang.Integer i21 = operadores0.somar((java.lang.Integer)3634, (java.lang.Integer)1817);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i3 + "' != '" + 1+ "'", i3.equals(1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i6 + "' != '" + 11+ "'", i6.equals(11));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i9 + "' != '" + 11+ "'", i9.equals(11));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i12 + "' != '" + 323+ "'", i12.equals(323));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i15 + "' != '" + 638+ "'", i15.equals(638));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i18 + "' != '" + 736+ "'", i18.equals(736));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i21 + "' != '" + 5451+ "'", i21.equals(5451));

  }

  @Test
  public void test087() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test087"); }

    Operadores operadores0 = new Operadores();
    java.lang.Integer i3 = operadores0.somar((java.lang.Integer)0, (java.lang.Integer)1);
    java.lang.Integer i6 = operadores0.somar((java.lang.Integer)101, (java.lang.Integer)10);
    java.lang.Integer i9 = operadores0.somar((java.lang.Integer)11, (java.lang.Integer)101);
    java.lang.Integer i12 = operadores0.somar((java.lang.Integer)12, (java.lang.Integer)0);
    java.lang.Integer i15 = operadores0.somar((java.lang.Integer)2364, (java.lang.Integer)6971);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i3 + "' != '" + 1+ "'", i3.equals(1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i6 + "' != '" + 111+ "'", i6.equals(111));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i9 + "' != '" + 112+ "'", i9.equals(112));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i12 + "' != '" + 12+ "'", i12.equals(12));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i15 + "' != '" + 9335+ "'", i15.equals(9335));

  }

  @Test
  public void test088() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test088"); }

    Operadores operadores0 = new Operadores();
    java.lang.Integer i3 = operadores0.somar((java.lang.Integer)0, (java.lang.Integer)1);
    java.lang.Integer i6 = operadores0.somar((java.lang.Integer)10, (java.lang.Integer)1);
    java.lang.Integer i9 = operadores0.somar((java.lang.Integer)0, (java.lang.Integer)11);
    java.lang.Integer i12 = operadores0.somar((java.lang.Integer)234, (java.lang.Integer)336);
    java.lang.Integer i15 = operadores0.somar((java.lang.Integer)634, (java.lang.Integer)336);
    java.lang.Integer i18 = operadores0.somar((java.lang.Integer)323, (java.lang.Integer)772);
    java.lang.Integer i21 = operadores0.somar((java.lang.Integer)1515, (java.lang.Integer)2562);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i3 + "' != '" + 1+ "'", i3.equals(1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i6 + "' != '" + 11+ "'", i6.equals(11));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i9 + "' != '" + 11+ "'", i9.equals(11));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i12 + "' != '" + 570+ "'", i12.equals(570));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i15 + "' != '" + 970+ "'", i15.equals(970));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i18 + "' != '" + 1095+ "'", i18.equals(1095));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i21 + "' != '" + 4077+ "'", i21.equals(4077));

  }

  @Test
  public void test089() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test089"); }

    Operadores operadores0 = new Operadores();
    java.lang.Integer i3 = operadores0.somar((java.lang.Integer)0, (java.lang.Integer)1);
    java.lang.Integer i6 = operadores0.somar((java.lang.Integer)0, (java.lang.Integer)100);
    java.lang.Integer i9 = operadores0.somar((java.lang.Integer)0, (java.lang.Integer)102);
    java.lang.Integer i12 = operadores0.somar((java.lang.Integer)211, (java.lang.Integer)101);
    java.lang.Integer i15 = operadores0.somar((java.lang.Integer)234, (java.lang.Integer)336);
    java.lang.Integer i18 = operadores0.somar((java.lang.Integer)647, (java.lang.Integer)2452);
    java.lang.Integer i21 = operadores0.somar((java.lang.Integer)210, (java.lang.Integer)1492);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i3 + "' != '" + 1+ "'", i3.equals(1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i6 + "' != '" + 100+ "'", i6.equals(100));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i9 + "' != '" + 102+ "'", i9.equals(102));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i12 + "' != '" + 312+ "'", i12.equals(312));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i15 + "' != '" + 570+ "'", i15.equals(570));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i18 + "' != '" + 3099+ "'", i18.equals(3099));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i21 + "' != '" + 1702+ "'", i21.equals(1702));

  }

  @Test
  public void test090() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test090"); }

    Operadores operadores0 = new Operadores();
    java.lang.Integer i3 = operadores0.somar((java.lang.Integer)0, (java.lang.Integer)1);
    java.lang.Integer i6 = operadores0.somar((java.lang.Integer)0, (java.lang.Integer)100);
    java.lang.Integer i9 = operadores0.somar((java.lang.Integer)0, (java.lang.Integer)102);
    java.lang.Integer i12 = operadores0.somar((java.lang.Integer)211, (java.lang.Integer)101);
    java.lang.Integer i15 = operadores0.somar((java.lang.Integer)1693, (java.lang.Integer)436);
    java.lang.Integer i18 = operadores0.somar((java.lang.Integer)8544, (java.lang.Integer)3865);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i3 + "' != '" + 1+ "'", i3.equals(1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i6 + "' != '" + 100+ "'", i6.equals(100));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i9 + "' != '" + 102+ "'", i9.equals(102));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i12 + "' != '" + 312+ "'", i12.equals(312));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i15 + "' != '" + 2129+ "'", i15.equals(2129));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i18 + "' != '" + 12409+ "'", i18.equals(12409));

  }

  @Test
  public void test091() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test091"); }

    Operadores operadores0 = new Operadores();
    java.lang.Integer i3 = operadores0.somar((java.lang.Integer)0, (java.lang.Integer)1);
    java.lang.Integer i6 = operadores0.somar((java.lang.Integer)0, (java.lang.Integer)100);
    java.lang.Integer i9 = operadores0.somar((java.lang.Integer)211, (java.lang.Integer)1);
    java.lang.Integer i12 = operadores0.somar((java.lang.Integer)12, (java.lang.Integer)211);
    java.lang.Integer i15 = operadores0.somar((java.lang.Integer)211, (java.lang.Integer)(-1));
    java.lang.Integer i18 = operadores0.somar((java.lang.Integer)10, (java.lang.Integer)212);
    java.lang.Integer i21 = operadores0.somar((java.lang.Integer)972, (java.lang.Integer)112);
    java.lang.Integer i24 = operadores0.somar((java.lang.Integer)1269, (java.lang.Integer)223);
    java.lang.Integer i27 = operadores0.somar((java.lang.Integer)7092, (java.lang.Integer)1305);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i3 + "' != '" + 1+ "'", i3.equals(1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i6 + "' != '" + 100+ "'", i6.equals(100));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i9 + "' != '" + 212+ "'", i9.equals(212));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i12 + "' != '" + 223+ "'", i12.equals(223));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i15 + "' != '" + 210+ "'", i15.equals(210));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i18 + "' != '" + 222+ "'", i18.equals(222));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i21 + "' != '" + 1084+ "'", i21.equals(1084));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i24 + "' != '" + 1492+ "'", i24.equals(1492));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i27 + "' != '" + 8397+ "'", i27.equals(8397));

  }

  @Test
  public void test092() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test092"); }

    Operadores operadores0 = new Operadores();
    java.lang.Integer i3 = operadores0.somar((java.lang.Integer)0, (java.lang.Integer)1);
    java.lang.Integer i6 = operadores0.somar((java.lang.Integer)10, (java.lang.Integer)1);
    java.lang.Integer i9 = operadores0.somar((java.lang.Integer)101, (java.lang.Integer)1);
    java.lang.Integer i12 = operadores0.somar((java.lang.Integer)1328, (java.lang.Integer)960);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i3 + "' != '" + 1+ "'", i3.equals(1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i6 + "' != '" + 11+ "'", i6.equals(11));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i9 + "' != '" + 102+ "'", i9.equals(102));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i12 + "' != '" + 2288+ "'", i12.equals(2288));

  }

  @Test
  public void test093() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test093"); }

    Operadores operadores0 = new Operadores();
    java.lang.Integer i3 = operadores0.somar((java.lang.Integer)0, (java.lang.Integer)1);
    java.lang.Integer i6 = operadores0.somar((java.lang.Integer)0, (java.lang.Integer)100);
    java.lang.Integer i9 = operadores0.somar((java.lang.Integer)211, (java.lang.Integer)1);
    java.lang.Integer i12 = operadores0.somar((java.lang.Integer)635, (java.lang.Integer)0);
    java.lang.Integer i15 = operadores0.somar((java.lang.Integer)1281, (java.lang.Integer)1281);
    java.lang.Integer i18 = operadores0.somar((java.lang.Integer)312, (java.lang.Integer)2242);
    java.lang.Integer i21 = operadores0.somar((java.lang.Integer)4703, (java.lang.Integer)0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i3 + "' != '" + 1+ "'", i3.equals(1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i6 + "' != '" + 100+ "'", i6.equals(100));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i9 + "' != '" + 212+ "'", i9.equals(212));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i12 + "' != '" + 635+ "'", i12.equals(635));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i15 + "' != '" + 2562+ "'", i15.equals(2562));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i18 + "' != '" + 2554+ "'", i18.equals(2554));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i21 + "' != '" + 4703+ "'", i21.equals(4703));

  }

  @Test
  public void test094() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test094"); }

    Operadores operadores0 = new Operadores();
    java.lang.Integer i3 = operadores0.somar((java.lang.Integer)0, (java.lang.Integer)1);
    java.lang.Integer i6 = operadores0.somar((java.lang.Integer)0, (java.lang.Integer)100);
    java.lang.Integer i9 = operadores0.somar((java.lang.Integer)0, (java.lang.Integer)102);
    java.lang.Integer i12 = operadores0.somar((java.lang.Integer)211, (java.lang.Integer)101);
    java.lang.Integer i15 = operadores0.somar((java.lang.Integer)424, (java.lang.Integer)12);
    java.lang.Integer i18 = operadores0.somar((java.lang.Integer)0, (java.lang.Integer)2249);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i3 + "' != '" + 1+ "'", i3.equals(1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i6 + "' != '" + 100+ "'", i6.equals(100));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i9 + "' != '" + 102+ "'", i9.equals(102));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i12 + "' != '" + 312+ "'", i12.equals(312));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i15 + "' != '" + 436+ "'", i15.equals(436));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i18 + "' != '" + 2249+ "'", i18.equals(2249));

  }

  @Test
  public void test095() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test095"); }

    Operadores operadores0 = new Operadores();
    java.lang.Integer i3 = operadores0.somar((java.lang.Integer)0, (java.lang.Integer)1);
    java.lang.Integer i6 = operadores0.somar((java.lang.Integer)1, (java.lang.Integer)100);
    java.lang.Integer i9 = operadores0.somar((java.lang.Integer)634, (java.lang.Integer)424);
    java.lang.Integer i12 = operadores0.somar((java.lang.Integer)1585, (java.lang.Integer)5873);
    java.lang.Integer i15 = operadores0.somar((java.lang.Integer)1585, (java.lang.Integer)203);
    java.lang.Integer i18 = operadores0.somar((java.lang.Integer)1071, (java.lang.Integer)6114);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i3 + "' != '" + 1+ "'", i3.equals(1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i6 + "' != '" + 101+ "'", i6.equals(101));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i9 + "' != '" + 1058+ "'", i9.equals(1058));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i12 + "' != '" + 7458+ "'", i12.equals(7458));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i15 + "' != '" + 1788+ "'", i15.equals(1788));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i18 + "' != '" + 7185+ "'", i18.equals(7185));

  }

  @Test
  public void test096() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test096"); }

    Operadores operadores0 = new Operadores();
    java.lang.Integer i3 = operadores0.somar((java.lang.Integer)0, (java.lang.Integer)1);
    java.lang.Integer i6 = operadores0.somar((java.lang.Integer)0, (java.lang.Integer)100);
    java.lang.Integer i9 = operadores0.somar((java.lang.Integer)0, (java.lang.Integer)102);
    java.lang.Integer i12 = operadores0.somar((java.lang.Integer)211, (java.lang.Integer)101);
    java.lang.Integer i15 = operadores0.somar((java.lang.Integer)234, (java.lang.Integer)336);
    java.lang.Integer i18 = operadores0.somar((java.lang.Integer)647, (java.lang.Integer)2452);
    java.lang.Integer i21 = operadores0.somar((java.lang.Integer)112, (java.lang.Integer)2129);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i3 + "' != '" + 1+ "'", i3.equals(1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i6 + "' != '" + 100+ "'", i6.equals(100));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i9 + "' != '" + 102+ "'", i9.equals(102));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i12 + "' != '" + 312+ "'", i12.equals(312));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i15 + "' != '" + 570+ "'", i15.equals(570));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i18 + "' != '" + 3099+ "'", i18.equals(3099));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i21 + "' != '" + 2241+ "'", i21.equals(2241));

  }

  @Test
  public void test097() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test097"); }

    Operadores operadores0 = new Operadores();
    java.lang.Integer i3 = operadores0.somar((java.lang.Integer)0, (java.lang.Integer)1);
    java.lang.Integer i6 = operadores0.somar((java.lang.Integer)0, (java.lang.Integer)100);
    java.lang.Integer i9 = operadores0.somar((java.lang.Integer)101, (java.lang.Integer)102);
    java.lang.Integer i12 = operadores0.somar((java.lang.Integer)11, (java.lang.Integer)1693);
    java.lang.Integer i15 = operadores0.somar((java.lang.Integer)536, (java.lang.Integer)11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i3 + "' != '" + 1+ "'", i3.equals(1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i6 + "' != '" + 100+ "'", i6.equals(100));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i9 + "' != '" + 203+ "'", i9.equals(203));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i12 + "' != '" + 1704+ "'", i12.equals(1704));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i15 + "' != '" + 547+ "'", i15.equals(547));

  }

  @Test
  public void test098() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test098"); }

    Operadores operadores0 = new Operadores();
    java.lang.Integer i3 = operadores0.somar((java.lang.Integer)211, (java.lang.Integer)212);
    java.lang.Integer i6 = operadores0.somar((java.lang.Integer)4684, (java.lang.Integer)2039);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i3 + "' != '" + 423+ "'", i3.equals(423));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i6 + "' != '" + 6723+ "'", i6.equals(6723));

  }

  @Test
  public void test099() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test099"); }

    Operadores operadores0 = new Operadores();
    java.lang.Integer i3 = operadores0.somar((java.lang.Integer)0, (java.lang.Integer)1);
    java.lang.Integer i6 = operadores0.somar((java.lang.Integer)0, (java.lang.Integer)100);
    java.lang.Integer i9 = operadores0.somar((java.lang.Integer)211, (java.lang.Integer)1);
    java.lang.Integer i12 = operadores0.somar((java.lang.Integer)735, (java.lang.Integer)212);
    java.lang.Integer i15 = operadores0.somar((java.lang.Integer)4454, (java.lang.Integer)234);
    java.lang.Integer i18 = operadores0.somar((java.lang.Integer)2525, (java.lang.Integer)222);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i3 + "' != '" + 1+ "'", i3.equals(1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i6 + "' != '" + 100+ "'", i6.equals(100));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i9 + "' != '" + 212+ "'", i9.equals(212));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i12 + "' != '" + 947+ "'", i12.equals(947));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i15 + "' != '" + 4688+ "'", i15.equals(4688));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i18 + "' != '" + 2747+ "'", i18.equals(2747));

  }

  @Test
  public void test100() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test100"); }

    Operadores operadores0 = new Operadores();
    java.lang.Integer i3 = operadores0.somar((java.lang.Integer)0, (java.lang.Integer)1);
    java.lang.Integer i6 = operadores0.somar((java.lang.Integer)0, (java.lang.Integer)100);
    java.lang.Integer i9 = operadores0.somar((java.lang.Integer)0, (java.lang.Integer)102);
    java.lang.Integer i12 = operadores0.somar((java.lang.Integer)211, (java.lang.Integer)101);
    java.lang.Integer i15 = operadores0.somar((java.lang.Integer)735, (java.lang.Integer)336);
    java.lang.Integer i18 = operadores0.somar((java.lang.Integer)2962, (java.lang.Integer)546);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i3 + "' != '" + 1+ "'", i3.equals(1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i6 + "' != '" + 100+ "'", i6.equals(100));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i9 + "' != '" + 102+ "'", i9.equals(102));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i12 + "' != '" + 312+ "'", i12.equals(312));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i15 + "' != '" + 1071+ "'", i15.equals(1071));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i18 + "' != '" + 3508+ "'", i18.equals(3508));

  }

  @Test
  public void test101() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test101"); }

    Operadores operadores0 = new Operadores();
    java.lang.Integer i3 = operadores0.somar((java.lang.Integer)0, (java.lang.Integer)1);
    java.lang.Integer i6 = operadores0.somar((java.lang.Integer)101, (java.lang.Integer)10);
    java.lang.Integer i9 = operadores0.somar((java.lang.Integer)211, (java.lang.Integer)0);
    java.lang.Integer i12 = operadores0.somar((java.lang.Integer)100, (java.lang.Integer)1704);
    java.lang.Integer i15 = operadores0.somar((java.lang.Integer)7242, (java.lang.Integer)1693);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i3 + "' != '" + 1+ "'", i3.equals(1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i6 + "' != '" + 111+ "'", i6.equals(111));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i9 + "' != '" + 211+ "'", i9.equals(211));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i12 + "' != '" + 1804+ "'", i12.equals(1804));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i15 + "' != '" + 8935+ "'", i15.equals(8935));

  }

  @Test
  public void test102() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test102"); }

    Operadores operadores0 = new Operadores();
    java.lang.Integer i3 = operadores0.somar((java.lang.Integer)0, (java.lang.Integer)1);
    java.lang.Integer i6 = operadores0.somar((java.lang.Integer)0, (java.lang.Integer)100);
    java.lang.Integer i9 = operadores0.somar((java.lang.Integer)211, (java.lang.Integer)1);
    java.lang.Integer i12 = operadores0.somar((java.lang.Integer)12, (java.lang.Integer)211);
    java.lang.Integer i15 = operadores0.somar((java.lang.Integer)211, (java.lang.Integer)(-1));
    java.lang.Integer i18 = operadores0.somar((java.lang.Integer)212, (java.lang.Integer)436);
    java.lang.Integer i21 = operadores0.somar((java.lang.Integer)0, (java.lang.Integer)1);
    java.lang.Integer i24 = operadores0.somar((java.lang.Integer)234, (java.lang.Integer)735);
    java.lang.Integer i27 = operadores0.somar((java.lang.Integer)1517, (java.lang.Integer)10);
    java.lang.Integer i30 = operadores0.somar((java.lang.Integer)102, (java.lang.Integer)2896);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i3 + "' != '" + 1+ "'", i3.equals(1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i6 + "' != '" + 100+ "'", i6.equals(100));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i9 + "' != '" + 212+ "'", i9.equals(212));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i12 + "' != '" + 223+ "'", i12.equals(223));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i15 + "' != '" + 210+ "'", i15.equals(210));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i18 + "' != '" + 648+ "'", i18.equals(648));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i21 + "' != '" + 1+ "'", i21.equals(1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i24 + "' != '" + 969+ "'", i24.equals(969));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i27 + "' != '" + 1527+ "'", i27.equals(1527));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i30 + "' != '" + 2998+ "'", i30.equals(2998));

  }

  @Test
  public void test103() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test103"); }

    Operadores operadores0 = new Operadores();
    java.lang.Integer i3 = operadores0.somar((java.lang.Integer)0, (java.lang.Integer)1);
    java.lang.Integer i6 = operadores0.somar((java.lang.Integer)101, (java.lang.Integer)10);
    java.lang.Integer i9 = operadores0.somar((java.lang.Integer)11, (java.lang.Integer)101);
    java.lang.Integer i12 = operadores0.somar((java.lang.Integer)0, (java.lang.Integer)0);
    java.lang.Integer i15 = operadores0.somar((java.lang.Integer)(-1), (java.lang.Integer)102);
    java.lang.Integer i18 = operadores0.somar((java.lang.Integer)102, (java.lang.Integer)234);
    java.lang.Integer i21 = operadores0.somar((java.lang.Integer)7626, (java.lang.Integer)2073);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i3 + "' != '" + 1+ "'", i3.equals(1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i6 + "' != '" + 111+ "'", i6.equals(111));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i9 + "' != '" + 112+ "'", i9.equals(112));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i12 + "' != '" + 0+ "'", i12.equals(0));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i15 + "' != '" + 101+ "'", i15.equals(101));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i18 + "' != '" + 336+ "'", i18.equals(336));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i21 + "' != '" + 9699+ "'", i21.equals(9699));

  }

  @Test
  public void test104() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test104"); }

    Operadores operadores0 = new Operadores();
    java.lang.Integer i3 = operadores0.somar((java.lang.Integer)0, (java.lang.Integer)1);
    java.lang.Integer i6 = operadores0.somar((java.lang.Integer)101, (java.lang.Integer)10);
    java.lang.Integer i9 = operadores0.somar((java.lang.Integer)11, (java.lang.Integer)101);
    java.lang.Integer i12 = operadores0.somar((java.lang.Integer)947, (java.lang.Integer)648);
    java.lang.Integer i15 = operadores0.somar((java.lang.Integer)570, (java.lang.Integer)1292);
    java.lang.Integer i18 = operadores0.somar((java.lang.Integer)2262, (java.lang.Integer)8935);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i3 + "' != '" + 1+ "'", i3.equals(1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i6 + "' != '" + 111+ "'", i6.equals(111));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i9 + "' != '" + 112+ "'", i9.equals(112));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i12 + "' != '" + 1595+ "'", i12.equals(1595));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i15 + "' != '" + 1862+ "'", i15.equals(1862));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i18 + "' != '" + 11197+ "'", i18.equals(11197));

  }

  @Test
  public void test105() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test105"); }

    Operadores operadores0 = new Operadores();
    java.lang.Integer i3 = operadores0.somar((java.lang.Integer)0, (java.lang.Integer)1);
    java.lang.Integer i6 = operadores0.somar((java.lang.Integer)101, (java.lang.Integer)10);
    java.lang.Integer i9 = operadores0.somar((java.lang.Integer)222, (java.lang.Integer)412);
    java.lang.Integer i12 = operadores0.somar((java.lang.Integer)1704, (java.lang.Integer)3099);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i3 + "' != '" + 1+ "'", i3.equals(1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i6 + "' != '" + 111+ "'", i6.equals(111));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i9 + "' != '" + 634+ "'", i9.equals(634));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i12 + "' != '" + 4803+ "'", i12.equals(4803));

  }

  @Test
  public void test106() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test106"); }

    Operadores operadores0 = new Operadores();
    java.lang.Integer i3 = operadores0.somar((java.lang.Integer)0, (java.lang.Integer)1);
    java.lang.Integer i6 = operadores0.somar((java.lang.Integer)10, (java.lang.Integer)1);
    java.lang.Integer i9 = operadores0.somar((java.lang.Integer)0, (java.lang.Integer)11);
    java.lang.Integer i12 = operadores0.somar((java.lang.Integer)234, (java.lang.Integer)336);
    java.lang.Integer i15 = operadores0.somar((java.lang.Integer)6057, (java.lang.Integer)857);
    java.lang.Integer i18 = operadores0.somar((java.lang.Integer)647, (java.lang.Integer)1370);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i3 + "' != '" + 1+ "'", i3.equals(1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i6 + "' != '" + 11+ "'", i6.equals(11));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i9 + "' != '" + 11+ "'", i9.equals(11));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i12 + "' != '" + 570+ "'", i12.equals(570));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i15 + "' != '" + 6914+ "'", i15.equals(6914));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i18 + "' != '" + 2017+ "'", i18.equals(2017));

  }

  @Test
  public void test107() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test107"); }

    Operadores operadores0 = new Operadores();
    java.lang.Integer i3 = operadores0.somar((java.lang.Integer)0, (java.lang.Integer)1);
    java.lang.Integer i6 = operadores0.somar((java.lang.Integer)101, (java.lang.Integer)10);
    java.lang.Integer i9 = operadores0.somar((java.lang.Integer)11, (java.lang.Integer)101);
    java.lang.Integer i12 = operadores0.somar((java.lang.Integer)537, (java.lang.Integer)1704);
    java.lang.Integer i15 = operadores0.somar((java.lang.Integer)647, (java.lang.Integer)2073);
    java.lang.Integer i18 = operadores0.somar((java.lang.Integer)768, (java.lang.Integer)3935);
    java.lang.Integer i21 = operadores0.somar((java.lang.Integer)3505, (java.lang.Integer)1704);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i3 + "' != '" + 1+ "'", i3.equals(1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i6 + "' != '" + 111+ "'", i6.equals(111));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i9 + "' != '" + 112+ "'", i9.equals(112));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i12 + "' != '" + 2241+ "'", i12.equals(2241));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i15 + "' != '" + 2720+ "'", i15.equals(2720));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i18 + "' != '" + 4703+ "'", i18.equals(4703));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i21 + "' != '" + 5209+ "'", i21.equals(5209));

  }

  @Test
  public void test108() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test108"); }

    Operadores operadores0 = new Operadores();
    java.lang.Integer i3 = operadores0.somar((java.lang.Integer)0, (java.lang.Integer)1);
    java.lang.Integer i6 = operadores0.somar((java.lang.Integer)101, (java.lang.Integer)10);
    java.lang.Integer i9 = operadores0.somar((java.lang.Integer)11, (java.lang.Integer)101);
    java.lang.Integer i12 = operadores0.somar((java.lang.Integer)1058, (java.lang.Integer)100);
    java.lang.Integer i15 = operadores0.somar((java.lang.Integer)7626, (java.lang.Integer)1291);
    java.lang.Integer i18 = operadores0.somar((java.lang.Integer)0, (java.lang.Integer)524);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i3 + "' != '" + 1+ "'", i3.equals(1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i6 + "' != '" + 111+ "'", i6.equals(111));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i9 + "' != '" + 112+ "'", i9.equals(112));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i12 + "' != '" + 1158+ "'", i12.equals(1158));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i15 + "' != '" + 8917+ "'", i15.equals(8917));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i18 + "' != '" + 524+ "'", i18.equals(524));

  }

  @Test
  public void test109() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test109"); }

    Operadores operadores0 = new Operadores();
    java.lang.Integer i3 = operadores0.somar((java.lang.Integer)0, (java.lang.Integer)1);
    java.lang.Integer i6 = operadores0.somar((java.lang.Integer)101, (java.lang.Integer)10);
    java.lang.Integer i9 = operadores0.somar((java.lang.Integer)11, (java.lang.Integer)101);
    java.lang.Integer i12 = operadores0.somar((java.lang.Integer)1058, (java.lang.Integer)100);
    java.lang.Integer i15 = operadores0.somar((java.lang.Integer)234, (java.lang.Integer)623);
    java.lang.Integer i18 = operadores0.somar((java.lang.Integer)648, (java.lang.Integer)1726);
    java.lang.Integer i21 = operadores0.somar((java.lang.Integer)436, (java.lang.Integer)2374);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i3 + "' != '" + 1+ "'", i3.equals(1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i6 + "' != '" + 111+ "'", i6.equals(111));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i9 + "' != '" + 112+ "'", i9.equals(112));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i12 + "' != '" + 1158+ "'", i12.equals(1158));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i15 + "' != '" + 857+ "'", i15.equals(857));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i18 + "' != '" + 2374+ "'", i18.equals(2374));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i21 + "' != '" + 2810+ "'", i21.equals(2810));

  }

  @Test
  public void test110() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test110"); }

    Operadores operadores0 = new Operadores();
    java.lang.Integer i3 = operadores0.somar((java.lang.Integer)0, (java.lang.Integer)1);
    java.lang.Integer i6 = operadores0.somar((java.lang.Integer)101, (java.lang.Integer)10);
    java.lang.Integer i9 = operadores0.somar((java.lang.Integer)857, (java.lang.Integer)1693);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i3 + "' != '" + 1+ "'", i3.equals(1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i6 + "' != '" + 111+ "'", i6.equals(111));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i9 + "' != '" + 2550+ "'", i9.equals(2550));

  }

  @Test
  public void test111() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test111"); }

    Operadores operadores0 = new Operadores();
    java.lang.Integer i3 = operadores0.somar((java.lang.Integer)0, (java.lang.Integer)1);
    java.lang.Integer i6 = operadores0.somar((java.lang.Integer)0, (java.lang.Integer)100);
    java.lang.Integer i9 = operadores0.somar((java.lang.Integer)211, (java.lang.Integer)1);
    java.lang.Integer i12 = operadores0.somar((java.lang.Integer)635, (java.lang.Integer)0);
    java.lang.Integer i15 = operadores0.somar((java.lang.Integer)10, (java.lang.Integer)201);
    java.lang.Integer i18 = operadores0.somar((java.lang.Integer)947, (java.lang.Integer)638);
    java.lang.Integer i21 = operadores0.somar((java.lang.Integer)0, (java.lang.Integer)201);
    java.lang.Integer i24 = operadores0.somar((java.lang.Integer)4454, (java.lang.Integer)2788);
    java.lang.Integer i27 = operadores0.somar((java.lang.Integer)3302, (java.lang.Integer)4077);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i3 + "' != '" + 1+ "'", i3.equals(1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i6 + "' != '" + 100+ "'", i6.equals(100));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i9 + "' != '" + 212+ "'", i9.equals(212));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i12 + "' != '" + 635+ "'", i12.equals(635));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i15 + "' != '" + 211+ "'", i15.equals(211));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i18 + "' != '" + 1585+ "'", i18.equals(1585));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i21 + "' != '" + 201+ "'", i21.equals(201));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i24 + "' != '" + 7242+ "'", i24.equals(7242));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i27 + "' != '" + 7379+ "'", i27.equals(7379));

  }

  @Test
  public void test112() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test112"); }

    Operadores operadores0 = new Operadores();
    java.lang.Integer i3 = operadores0.somar((java.lang.Integer)1369, (java.lang.Integer)6205);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i3 + "' != '" + 7574+ "'", i3.equals(7574));

  }

  @Test
  public void test113() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test113"); }

    Operadores operadores0 = new Operadores();
    java.lang.Integer i3 = operadores0.somar((java.lang.Integer)0, (java.lang.Integer)1);
    java.lang.Integer i6 = operadores0.somar((java.lang.Integer)0, (java.lang.Integer)100);
    java.lang.Integer i9 = operadores0.somar((java.lang.Integer)211, (java.lang.Integer)1);
    java.lang.Integer i12 = operadores0.somar((java.lang.Integer)12, (java.lang.Integer)211);
    java.lang.Integer i15 = operadores0.somar((java.lang.Integer)424, (java.lang.Integer)211);
    java.lang.Integer i18 = operadores0.somar((java.lang.Integer)772, (java.lang.Integer)2151);
    java.lang.Integer i21 = operadores0.somar((java.lang.Integer)660, (java.lang.Integer)7599);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i3 + "' != '" + 1+ "'", i3.equals(1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i6 + "' != '" + 100+ "'", i6.equals(100));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i9 + "' != '" + 212+ "'", i9.equals(212));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i12 + "' != '" + 223+ "'", i12.equals(223));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i15 + "' != '" + 635+ "'", i15.equals(635));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i18 + "' != '" + 2923+ "'", i18.equals(2923));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i21 + "' != '" + 8259+ "'", i21.equals(8259));

  }

  @Test
  public void test114() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test114"); }

    Operadores operadores0 = new Operadores();
    java.lang.Integer i3 = operadores0.somar((java.lang.Integer)0, (java.lang.Integer)1);
    java.lang.Integer i6 = operadores0.somar((java.lang.Integer)101, (java.lang.Integer)10);
    java.lang.Integer i9 = operadores0.somar((java.lang.Integer)11, (java.lang.Integer)101);
    java.lang.Integer i12 = operadores0.somar((java.lang.Integer)0, (java.lang.Integer)0);
    java.lang.Integer i15 = operadores0.somar((java.lang.Integer)(-1), (java.lang.Integer)102);
    java.lang.Integer i18 = operadores0.somar((java.lang.Integer)101, (java.lang.Integer)634);
    java.lang.Integer i21 = operadores0.somar((java.lang.Integer)436, (java.lang.Integer)101);
    java.lang.Integer i24 = operadores0.somar((java.lang.Integer)2562, (java.lang.Integer)2242);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i3 + "' != '" + 1+ "'", i3.equals(1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i6 + "' != '" + 111+ "'", i6.equals(111));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i9 + "' != '" + 112+ "'", i9.equals(112));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i12 + "' != '" + 0+ "'", i12.equals(0));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i15 + "' != '" + 101+ "'", i15.equals(101));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i18 + "' != '" + 735+ "'", i18.equals(735));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i21 + "' != '" + 537+ "'", i21.equals(537));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i24 + "' != '" + 4804+ "'", i24.equals(4804));

  }

  @Test
  public void test115() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test115"); }

    Operadores operadores0 = new Operadores();
    java.lang.Integer i3 = operadores0.somar((java.lang.Integer)0, (java.lang.Integer)1);
    java.lang.Integer i6 = operadores0.somar((java.lang.Integer)101, (java.lang.Integer)10);
    java.lang.Integer i9 = operadores0.somar((java.lang.Integer)11, (java.lang.Integer)101);
    java.lang.Integer i12 = operadores0.somar((java.lang.Integer)111, (java.lang.Integer)100);
    java.lang.Integer i15 = operadores0.somar((java.lang.Integer)0, (java.lang.Integer)10);
    java.lang.Integer i18 = operadores0.somar((java.lang.Integer)5451, (java.lang.Integer)2452);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i3 + "' != '" + 1+ "'", i3.equals(1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i6 + "' != '" + 111+ "'", i6.equals(111));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i9 + "' != '" + 112+ "'", i9.equals(112));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i12 + "' != '" + 211+ "'", i12.equals(211));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i15 + "' != '" + 10+ "'", i15.equals(10));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i18 + "' != '" + 7903+ "'", i18.equals(7903));

  }

  @Test
  public void test116() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test116"); }

    Operadores operadores0 = new Operadores();
    java.lang.Integer i3 = operadores0.somar((java.lang.Integer)0, (java.lang.Integer)1);
    java.lang.Integer i6 = operadores0.somar((java.lang.Integer)10, (java.lang.Integer)1);
    java.lang.Integer i9 = operadores0.somar((java.lang.Integer)0, (java.lang.Integer)11);
    java.lang.Integer i12 = operadores0.somar((java.lang.Integer)201, (java.lang.Integer)323);
    java.lang.Integer i15 = operadores0.somar((java.lang.Integer)3007, (java.lang.Integer)436);
    java.lang.Integer i18 = operadores0.somar((java.lang.Integer)546, (java.lang.Integer)3764);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i3 + "' != '" + 1+ "'", i3.equals(1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i6 + "' != '" + 11+ "'", i6.equals(11));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i9 + "' != '" + 11+ "'", i9.equals(11));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i12 + "' != '" + 524+ "'", i12.equals(524));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i15 + "' != '" + 3443+ "'", i15.equals(3443));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i18 + "' != '" + 4310+ "'", i18.equals(4310));

  }

  @Test
  public void test117() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test117"); }

    Operadores operadores0 = new Operadores();
    java.lang.Integer i3 = operadores0.somar((java.lang.Integer)0, (java.lang.Integer)1);
    java.lang.Integer i6 = operadores0.somar((java.lang.Integer)101, (java.lang.Integer)10);
    java.lang.Integer i9 = operadores0.somar((java.lang.Integer)111, (java.lang.Integer)1503);
    java.lang.Integer i12 = operadores0.somar((java.lang.Integer)2554, (java.lang.Integer)734);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i3 + "' != '" + 1+ "'", i3.equals(1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i6 + "' != '" + 111+ "'", i6.equals(111));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i9 + "' != '" + 1614+ "'", i9.equals(1614));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i12 + "' != '" + 3288+ "'", i12.equals(3288));

  }

  @Test
  public void test118() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test118"); }

    Operadores operadores0 = new Operadores();
    java.lang.Integer i3 = operadores0.somar((java.lang.Integer)0, (java.lang.Integer)1);
    java.lang.Integer i6 = operadores0.somar((java.lang.Integer)0, (java.lang.Integer)100);
    java.lang.Integer i9 = operadores0.somar((java.lang.Integer)211, (java.lang.Integer)1);
    java.lang.Integer i12 = operadores0.somar((java.lang.Integer)12, (java.lang.Integer)211);
    java.lang.Integer i15 = operadores0.somar((java.lang.Integer)211, (java.lang.Integer)(-1));
    java.lang.Integer i18 = operadores0.somar((java.lang.Integer)210, (java.lang.Integer)312);
    java.lang.Integer i21 = operadores0.somar((java.lang.Integer)2554, (java.lang.Integer)2676);
    java.lang.Integer i24 = operadores0.somar((java.lang.Integer)623, (java.lang.Integer)3801);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i3 + "' != '" + 1+ "'", i3.equals(1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i6 + "' != '" + 100+ "'", i6.equals(100));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i9 + "' != '" + 212+ "'", i9.equals(212));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i12 + "' != '" + 223+ "'", i12.equals(223));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i15 + "' != '" + 210+ "'", i15.equals(210));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i18 + "' != '" + 522+ "'", i18.equals(522));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i21 + "' != '" + 5230+ "'", i21.equals(5230));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i24 + "' != '" + 4424+ "'", i24.equals(4424));

  }

  @Test
  public void test119() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test119"); }

    Operadores operadores0 = new Operadores();
    java.lang.Integer i3 = operadores0.somar((java.lang.Integer)0, (java.lang.Integer)1);
    java.lang.Integer i6 = operadores0.somar((java.lang.Integer)0, (java.lang.Integer)100);
    java.lang.Integer i9 = operadores0.somar((java.lang.Integer)0, (java.lang.Integer)102);
    java.lang.Integer i12 = operadores0.somar((java.lang.Integer)211, (java.lang.Integer)101);
    java.lang.Integer i15 = operadores0.somar((java.lang.Integer)1693, (java.lang.Integer)436);
    java.lang.Integer i18 = operadores0.somar((java.lang.Integer)2525, (java.lang.Integer)3534);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i3 + "' != '" + 1+ "'", i3.equals(1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i6 + "' != '" + 100+ "'", i6.equals(100));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i9 + "' != '" + 102+ "'", i9.equals(102));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i12 + "' != '" + 312+ "'", i12.equals(312));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i15 + "' != '" + 2129+ "'", i15.equals(2129));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i18 + "' != '" + 6059+ "'", i18.equals(6059));

  }

  @Test
  public void test120() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test120"); }

    Operadores operadores0 = new Operadores();
    java.lang.Integer i3 = operadores0.somar((java.lang.Integer)0, (java.lang.Integer)1);
    java.lang.Integer i6 = operadores0.somar((java.lang.Integer)0, (java.lang.Integer)100);
    java.lang.Integer i9 = operadores0.somar((java.lang.Integer)211, (java.lang.Integer)1);
    java.lang.Integer i12 = operadores0.somar((java.lang.Integer)635, (java.lang.Integer)0);
    java.lang.Integer i15 = operadores0.somar((java.lang.Integer)10, (java.lang.Integer)201);
    java.lang.Integer i18 = operadores0.somar((java.lang.Integer)2896, (java.lang.Integer)638);
    java.lang.Integer i21 = operadores0.somar((java.lang.Integer)1585, (java.lang.Integer)1717);
    java.lang.Integer i24 = operadores0.somar((java.lang.Integer)3942, (java.lang.Integer)0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i3 + "' != '" + 1+ "'", i3.equals(1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i6 + "' != '" + 100+ "'", i6.equals(100));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i9 + "' != '" + 212+ "'", i9.equals(212));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i12 + "' != '" + 635+ "'", i12.equals(635));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i15 + "' != '" + 211+ "'", i15.equals(211));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i18 + "' != '" + 3534+ "'", i18.equals(3534));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i21 + "' != '" + 3302+ "'", i21.equals(3302));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i24 + "' != '" + 3942+ "'", i24.equals(3942));

  }

  @Test
  public void test121() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test121"); }

    Operadores operadores0 = new Operadores();
    java.lang.Integer i3 = operadores0.somar((java.lang.Integer)0, (java.lang.Integer)1);
    java.lang.Integer i6 = operadores0.somar((java.lang.Integer)101, (java.lang.Integer)10);
    java.lang.Integer i9 = operadores0.somar((java.lang.Integer)11, (java.lang.Integer)101);
    java.lang.Integer i12 = operadores0.somar((java.lang.Integer)12, (java.lang.Integer)0);
    java.lang.Integer i15 = operadores0.somar((java.lang.Integer)634, (java.lang.Integer)2676);
    java.lang.Integer i18 = operadores0.somar((java.lang.Integer)2747, (java.lang.Integer)5230);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i3 + "' != '" + 1+ "'", i3.equals(1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i6 + "' != '" + 111+ "'", i6.equals(111));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i9 + "' != '" + 112+ "'", i9.equals(112));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i12 + "' != '" + 12+ "'", i12.equals(12));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i15 + "' != '" + 3310+ "'", i15.equals(3310));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i18 + "' != '" + 7977+ "'", i18.equals(7977));

  }

  @Test
  public void test122() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test122"); }

    Operadores operadores0 = new Operadores();
    java.lang.Integer i3 = operadores0.somar((java.lang.Integer)0, (java.lang.Integer)1);
    java.lang.Integer i6 = operadores0.somar((java.lang.Integer)0, (java.lang.Integer)100);
    java.lang.Integer i9 = operadores0.somar((java.lang.Integer)1, (java.lang.Integer)211);
    java.lang.Integer i12 = operadores0.somar((java.lang.Integer)11, (java.lang.Integer)223);
    java.lang.Integer i15 = operadores0.somar((java.lang.Integer)412, (java.lang.Integer)211);
    java.lang.Integer i18 = operadores0.somar((java.lang.Integer)972, (java.lang.Integer)1704);
    java.lang.Integer i21 = operadores0.somar((java.lang.Integer)624, (java.lang.Integer)1269);
    java.lang.Integer i24 = operadores0.somar((java.lang.Integer)647, (java.lang.Integer)734);
    java.lang.Integer i27 = operadores0.somar((java.lang.Integer)2249, (java.lang.Integer)1515);
    java.lang.Integer i30 = operadores0.somar((java.lang.Integer)6203, (java.lang.Integer)3208);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i3 + "' != '" + 1+ "'", i3.equals(1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i6 + "' != '" + 100+ "'", i6.equals(100));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i9 + "' != '" + 212+ "'", i9.equals(212));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i12 + "' != '" + 234+ "'", i12.equals(234));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i15 + "' != '" + 623+ "'", i15.equals(623));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i18 + "' != '" + 2676+ "'", i18.equals(2676));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i21 + "' != '" + 1893+ "'", i21.equals(1893));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i24 + "' != '" + 1381+ "'", i24.equals(1381));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i27 + "' != '" + 3764+ "'", i27.equals(3764));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i30 + "' != '" + 9411+ "'", i30.equals(9411));

  }

}
