package automationPractice;
import java.io.IOException;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import mySel.Baseclass;
public class CustomListener extends Baseclass implements ITestListener {

	public void onTestStart(ITestResult result) {
		// TODO Auto-generated method stub
		System.out.println("TEST START");
		try {
			takeScreenShot(result.getMethod().getMethodName()+"testStart");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

	public void onTestSuccess(ITestResult result) {
		// TODO Auto-generated method stub
		System.out.println("SUCCESS TEST");
		
			try {
				takeScreenShot(result.getMethod().getMethodName()+"success");
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	
		
	}

	public void onTestFailure(ITestResult result) {
		System.out.println("FAILED TEST");
		try {
			takeScreenShot(result.getMethod().getMethodName()+"failed");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		// TODO Auto-generated method stub
		
	}

	public void onTestSkipped(ITestResult result) {
		// TODO Auto-generated method stub
		
	}

	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		// TODO Auto-generated method stub
		
	}

	public void onStart(ITestContext context) {
		// TODO Auto-generated method stub
		
	}

	public void onFinish(ITestContext context) {
		// TODO Auto-generated method stub
		
	}

	

}
