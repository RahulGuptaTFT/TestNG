package Listener;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class TestNGListener implements ITestListener {

    @Override
    public void onTestStart(ITestResult result) {
        System.out.println("test case Start and TestCase name is = "+result.getName());
    }
    @Override
    public void onTestSuccess(ITestResult result) {
        System.out.println("test case Success and TestCase name is = "+result.getName());
    }
    @Override
    public void onTestFailure(ITestResult result) {
        System.out.println("test case Failed and TestCase name is = "+result.getName());
    }
    @Override
    public void onTestSkipped(ITestResult result) {
        System.out.println("test case Skipped and TestCase name is = "+result.getName());
    }
}
