package lis;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;


public class Listenerstest implements ITestListener{
	@Override
	public void onFinish(ITestContext res) {
		// TODO Auto-generated method stub
		System.out.println("finished"+res.getName());
	}

	@Override
	public void onStart(ITestContext res) {
		// TODO Auto-generated method stub
		System.out.println("Started"+res.getName());
	}

	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult res) {
		// TODO Auto-generated method stub
		System.out.println("percentage"+res.getName());
	}

	@Override
	public void onTestFailure(ITestResult res) {
		// TODO Auto-generated method stub
		System.out.println("TestFailed"+res.getName());
	}

	@Override
	public void onTestSkipped(ITestResult res) {
		// TODO Auto-generated method stub
		System.out.println("test skipped"+res.getName());
	}

	@Override
	public void onTestStart(ITestResult res) {
		// TODO Auto-generated method stub
		System.out.println("Test Started"+res.getName());
	}

	@Override
	public void onTestSuccess(ITestResult res) {
		// TODO Auto-generated method stub
		System.out.println("Test Success"+res.getName());
	}

}

