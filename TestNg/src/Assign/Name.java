package Assign;

import org.testng.annotations.Test;

public class Name {
@Test(priority=1)
public void n1() {
	System.out.println("name1");
}
@Test(dependsOnMethods= {"n1"},priority=0)
public void n2() {
	System.out.println("name2");
}
}
