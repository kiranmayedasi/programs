package lis;


import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import org.testng.Assert;


@Listeners(lis.Listenerstest.class)


                                                                   
public class failedTestcases {
@Test
public void f1() {
	System.out.println("failed testcase1");
	Assert.assertTrue(false);
}
@Test 
public void f2() {
	System.out.println("failed testcase 2");
	Assert.assertTrue(false);
	
}
@Test
public void f3() {
	System.out.println("failed testcase 3");
}
}
