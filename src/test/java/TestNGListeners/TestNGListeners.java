package TestNGListeners;

import org.testng.ITestContext;
import org.testng.ITestNGListener;
import org.testng.ITestResult;

public class TestNGListeners implements ITestNGListener {


    public void onStart(ITestContext context) {
        System.out.println("********* Test Started : " + context.getName());


    }

    public void onFinish(ITestContext context) {
        System.out.println("********* Test Completed : " + context.getName());


    }

    public void onTestStart(ITestResult result) {
        System.out.println("********* Test Started : " + result.getName());

    }

    public void onTestSkipped(ITestResult result) {
        System.out.println("********* Test skipped : " + result.getName());


    }


    public void onTestSuccess(ITestResult result) {
        System.out.println("********* Test is success : " + result.getName());


    }

    public void onTestFailure(ITestResult result) {
        System.out.println("********* Test failed : " + result.getName());


    }


    public void onTestFiledButWithinSuccessPercantage(ITestResult result) {


    }

}
