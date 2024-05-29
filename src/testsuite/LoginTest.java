package testsuite;

import browserfactory.baseTest;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class LoginTest extends baseTest {
    @Test
    public void userShouldLoginSuccessfullyWithValidCredentials() {
        // Enter "Admin" username
        WebElement usernameField = driver.findElement(By.id("txtUsername"));
        usernameField.sendKeys("Admin");

        // Enter "admin123" password
        WebElement passwordField = driver.findElement(By.id("txtPassword"));
        passwordField.sendKeys("admin123");

        // Click on 'LOGIN' button
        WebElement loginButton = driver.findElement(By.id("btnLogin"));
        loginButton.click();

        // Verify the 'Dashboard' text is displayed
        WebElement dashboardText = driver.findElement(By.tagName("h1"));
        String actualText = dashboardText.getText();
        String expectedText = "Dashboard";
        Assert.assertEquals(actualText, expectedText, "User is not logged in successfully.");
    }
}
