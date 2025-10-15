package TestNG;

import org.testng.ITestListener;
import org.testng.ITestResult;

public class listernersDemo implements ITestListener {

    @Override
    public void onTestStart(ITestResult result) {
        System.out.println(result.getName()+ " Test Started");
    }

    @Override
    public void onTestSuccess(ITestResult result) {
        System.out.println(result.getName()+ " Test has successfully executed");
    }

    @Override
    public void onTestFailure(ITestResult result) {
        System.out.println(result.getName()+ " Test has failed");
    }
}
