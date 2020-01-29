package mavendemo;


public class Extend_report {


	ExtentReports extent;
	ExtentTest test;
	
	@BeforeTest
	public void startReport()
	{
	extent = new ExtentReports(System.getProperty("user.dir")+"/test-output/myOwnreport.html",true);
	extent.addSystemInfo("HostName","franklin")
	.addSystemInfo("Environment","Prodouction environment")
	.addSystemInfo("User Name","franklin");
	extent.loadConfig(new File(System.getProperty("user.dir")+"/extent.config"));
	}
	@Test
	public void demoReportPass()
	{
	test=extent.startTest("demoReportPass");
	Assert.assertTrue(true);
	test.log(LogStatus.PASS,"Assert pass as condition is True");
	}
	@Test
	public void demoReportfail()
	{
	test = extent.startTest("demoReportFail");
	Assert.assertTrue(false);
	test.log(LogStatus.FAIL,"Assert fail as condition is false");
	}
	@AfterMethod
	public void getResult(ITestResult result)
		{
	if(result.getStatus()==ITestResult.FAILURE)
	{
	test.log(LogStatus.FAIL,result.getThrowable());
	}
	extent.endTest(test);
	}
	@AfterTest
	public void endReport()
	{
	extent.flush();
	extent.close();
	}

	
