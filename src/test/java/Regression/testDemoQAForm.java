package Regression;

import PageObjects.PracticeForm;
import Utils.Globals;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;
import java.time.Duration;
public class testDemoQAForm extends Globals {

    @Test
    public void testForms() throws InterruptedException {
        //use this to declare the test variable
        ExtentTest test = extent.createTest("Run Demo QA Tests").assignAuthor("Chukwuka").assignCategory("Functional").assignDevice("Windows");
        PracticeForm practiceForm = new PracticeForm(driver);
        test.log(Status.INFO, "Test Begins");
        WebDriverWait wait;
        wait = new WebDriverWait(driver, Duration.ofSeconds(20));
        try {
            wait.until(ExpectedConditions.visibilityOf(practiceForm.lastName));
            test.log(Status.INFO, "The form was loaded properly");

        } catch (Exception e) {
            test.log(Status.INFO, "The form was not loaded properly");
            throw new RuntimeException(e);
        }
        try {
            practiceForm.firstName.sendKeys("Seyi");
            test.log(Status.INFO, "First name entered successfully");

        } catch (Exception e) {
            test.log(Status.INFO, "First name not entered successfully");
            throw new RuntimeException(e);
        }
        try {
            practiceForm.lastName.sendKeys("Vibez");
            test.log(Status.INFO, "Last name entered successfully");
        } catch (Exception e) {
            test.log(Status.INFO, "Last name not entered successfully");
            throw new RuntimeException(e);
        }
        try {
            practiceForm.email.sendKeys("seyivibeez@mailinator.com");
            test.log(Status.INFO, "Email entered successfully");
        } catch (Exception e) {
            test.log(Status.INFO, "Email not entered successfully");
            throw new RuntimeException(e);
        }
        try {
            practiceForm.genderMale.click();
            test.log(Status.INFO, "Gender clicked  successfully");
        } catch (Exception e) {
            test.log(Status.INFO, "Gender not clicked  successfully");
            throw new RuntimeException(e);
        }
        try {
            practiceForm.mobileNumber.sendKeys("1234567890");
            test.log(Status.INFO, "Mobile number entered successfully");
        } catch (Exception e) {
            test.log(Status.INFO, "Mobile number not entered successfully");
            throw new RuntimeException(e);
        }
        try {
            practiceForm.dateOfBirth.clear();
            test.log(Status.INFO, "Mobile number entered successfully");
        } catch (Exception e) {
            test.log(Status.INFO, "Mobile number not entered successfully");
            throw new RuntimeException(e);

        }
        String checkValue = practiceForm.dateOfBirth.getAttribute("value");
        try {
            if (checkValue == null || checkValue.isEmpty()){
                practiceForm.dateOfBirth.sendKeys("25 may 2022");
                test.log(Status.INFO, "D.O.B entered successfully");
            }else{
                test.log(Status.INFO, "The field is not cleared");

            }
        } catch (Exception e) {
            test.log(Status.INFO, "D.O.B not entered successfully");
            throw new RuntimeException(e);
        }
        //use this when you encounter the ElementClickInterceptedException
        try {
            JavascriptExecutor executor = (JavascriptExecutor) driver;
            executor.executeScript("arguments[0].click();", practiceForm.hobbiesSports);
            test.log(Status.INFO, "Hobbies selected successfully");
        } catch (Exception e) {
            test.log(Status.INFO, "Hobbies not selected successfully");
            throw new RuntimeException(e);
        }

        String projectPath =System.getProperty("user.dir");
        try {
            practiceForm.uploadPicture.sendKeys(projectPath+"/Resources/chef2.png");
            test.log(Status.INFO, "Picture uploaded successfully");
        } catch (Exception e) {
            test.log(Status.INFO, "Picture upload failed");
            throw new RuntimeException(e);

        }
        try {
            practiceForm.currentAddress.sendKeys("Brand New Rolex");
            test.log(Status.INFO, "Address entered successfully");
        } catch (Exception e) {
            test.log(Status.INFO, "Address not entered successfully");
            throw new RuntimeException(e);
        }
        try {
            practiceForm.dropdownState.click();
            test.log(Status.INFO, "State drop down clicked successfully");
        } catch (Exception e) {
            test.log(Status.INFO, "State drop down not clicked successfully");
            throw new RuntimeException(e);
        }
        try {
            wait.until(ExpectedConditions.visibilityOf(practiceForm.uttarPradesh));
            test.log(Status.INFO, "Dropdown element visible");
        } catch (Exception e) {
            test.log(Status.INFO, "Dropdown element not visible");
            throw new RuntimeException(e);
        }
        try {
            practiceForm.uttarPradesh.click();
            test.log(Status.INFO, "Dropdown element clicked");
        } catch (Exception e) {
            test.log(Status.INFO, "Dropdown element not clicked");
            throw new RuntimeException(e);
        }
        try {
            practiceForm.dropdownCity.click();
            test.log(Status.INFO, "Dropdown element clicked");
        } catch (Exception e) {
            test.log(Status.INFO, "Dropdown element not clicked");
            throw new RuntimeException(e);
        }
        try {
            wait.until(ExpectedConditions.visibilityOf(practiceForm.agra));
            test.log(Status.INFO, "Agra visible");
        } catch (Exception e) {
            test.log(Status.INFO, "Agra not visible");
            throw new RuntimeException(e);
        }
        try {
            practiceForm.agra.click();
            test.log(Status.INFO, "Agra clicked");
        } catch (Exception e) {
            test.log(Status.INFO, "Agra not clicked");
            throw new RuntimeException(e);
        }
        try {
            practiceForm.submitBtn.click();
            test.log(Status.INFO, "Submit button clicked");
            test.log(Status.PASS, "TEST PASSED!");
        } catch (Exception e) {
            test.log(Status.INFO, "Submit button NOT clicked");
            test.log(Status.FAIL, "TEST FAILED!");
            throw new RuntimeException(e);
        }

    }

}
