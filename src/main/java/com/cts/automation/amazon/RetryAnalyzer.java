package com.cts.automation.amazon;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class RetryAnalyzer implements IRetryAnalyzer 
{ 
	int retryCount = 0;

	public boolean retry(ITestResult result) 
	{
		int maxRetryLimit = 5;
		if(retryCount<maxRetryLimit)
		{
			retryCount++;
			return true;
		}
		return false;
	}

}
