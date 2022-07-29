package utilities;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

//import com.relevantcodes.extentreports.ExtentReports;
//import com.relevantcodes.extentreports.ExtentTest;
//import com.relevantcodes.extentreports.LogStatus;



public class ExtentReports_ {
	
	
//	ConfigRead cr = new ConfigRead();
//	public ExtentReports reports;
//	public ExtentTest test;
//	
//	public void createReports() {
//		Date d= new Date();
//		SimpleDateFormat sdf = new SimpleDateFormat("MM/dd/yyyy/HH/mm/ss");
//		String date = sdf.format(d);
//		String timestamp = "./Reports/"+date.replaceAll("/", "_")+"-"+cr.getReportName()+".html";
//		reports = new ExtentReports(timestamp,true);
//		
//	}
//public ExtentTest createTest(String testname) {
//	test = reports.startTest(testname);
//	test.assignAuthor(cr.getAuthor());
//	return test;
//	
//}
//public void logPass(String text) {
//	test.log(LogStatus.PASS, text);
//}
//public void logFail(String text) {
//	test.log(LogStatus.FAIL, text);
//}
//public void closeTest() {
//
//	reports.endTest(test);
//}
//public void closeReport() {
//    reports.flush();
//    reports.close();
//
//}

public static ExtentReports report;
public static ExtentSparkReporter extent;

public static ExtentReports ExtentReports() {
	SimpleDateFormat sdf = new SimpleDateFormat("MM/dd/yyyy/HH/mm/ss");
	Date currentDate=new Date();
	String date = sdf.format(currentDate);
	extent=new ExtentSparkReporter(new File(System.getProperty("user.dir")+"/Reports/AutomationTesting_"+date.replaceAll("/", "_")+".html"));
	report =new ExtentReports();
	report.attachReporter(extent);
	try {
		return report;
	} catch (Exception e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	return report;
}

}
