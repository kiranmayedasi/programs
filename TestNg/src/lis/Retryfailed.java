package lis;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class Retryfailed implements IRetryAnalyzer {
private int retrycount=0;
private int maxretrycount=3;
	@Override
	public boolean retry(ITestResult result) {
		// TODO Auto-generated method stub
		if(retrycount<maxretrycount) {
		System.out.println("retry test"+result.getName() +"count is"+(retrycount+1));
		retrycount++;
		return true;
	}
		return false;
		

}
}