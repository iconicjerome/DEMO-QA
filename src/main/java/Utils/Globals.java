package Utils;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

import java.io.IOException;

public class Globals {
    public static WebDriver driver;
    public static ExtentReports extent;

    @BeforeSuite
    public static ExtentReports generateReport() {
        startBrowser();
        extent = new ExtentReports();
        ExtentSparkReporter spark = new ExtentSparkReporter("Reports/extent.html");
        spark.config().setTheme(Theme.DARK);
        spark.config().setDocumentTitle("DEMO QA REPORT");
        extent.attachReporter(spark);
        return extent;
    }

    @AfterSuite
    public void closeBrowser() throws InterruptedException {
        extent.flush();
        Thread.sleep(5000);
        driver.quit();
    }

    public static String getWorkbook1(int rowNum, int colNum) throws IOException {
        String projectPath = System.getProperty("user.dir");
        XSSFWorkbook workbook = new XSSFWorkbook(projectPath + "/Resources/testdata.xlsx");
        XSSFSheet sheet = workbook.getSheet("Sheet1");
        String getData = sheet.getRow(rowNum).getCell(colNum).getStringCellValue();
        return getData;
    }


    public static WebDriver startBrowser() {
        driver = new EdgeDriver();
        driver.manage().window().maximize();
        driver.get("https://demoqa.com/automation-practice-form");
        return driver;
    }
}
