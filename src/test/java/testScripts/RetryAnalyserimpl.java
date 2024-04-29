package testScripts;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class RetryAnalyserimpl implements IRetryAnalyzer {
	private int retrycount = 0;
	private static final int maxRetryCount = 3;
	@Override
	
	public boolean retry(ITestResult result) {
		
		if (!result.isSuccess()) {
			if (retrycount<maxRetryCount) {
				retrycount++;
				return true;
			}
		}
		return false;
	}

}
