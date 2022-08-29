package initializerFunction;

import java.io.IOException;
import java.lang.reflect.Method;
import java.util.Date;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;

import com.relevantcodes.extentreports.ExtentReports;

import commonFunctionWeb.WebBrowser;
import dataSource.PropertiesReader;
import reporter.GraphicalReport;

public class BaseClass extends GraphicalReport{

	
		public static WebDriver driver = null;
		@BeforeSuite
		public void beforeSuiteStart() throws IOException{
			System.out.println(new Date().toString());
			graphicalReport = new ExtentReports(PropertiesReader.getPropertyValue(CommonStaticDM.configPath, "reportPath"), true);
		}
		@BeforeMethod
		public void beforeEachTestCase(Method testMethod) throws IOException{
			reporterLogger = graphicalReport.startTest(testMethod.getName());
			driver = WebBrowser.openBrowser(PropertiesReader.getPropertyValue(CommonStaticDM.configPath, "browser"));
			driver.get(PropertiesReader.getPropertyValue(CommonStaticDM.configPath, "AUT"));
		}
		@AfterMethod
		public void afterEachTestCase(){
			//driver.close();
			graphicalReport.endTest(reporterLogger);
			graphicalReport.flush();
		}
	}


