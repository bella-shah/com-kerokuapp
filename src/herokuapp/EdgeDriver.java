package herokuapp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.time.Duration;

public class EdgeDriver { public static void main(String[] args) {
    String baseUrl = "http://the-internet.herokuapp.com/login";
    System.setProperty("webdriver.edge.driver", "Drivers/msedgedriver.exe");
    WebDriver driver = new org.openqa.selenium.edge.EdgeDriver();
    driver.get(baseUrl);
    driver.manage().window().maximize();
    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(80));
    String title = driver.getTitle();
    System.out.println(title);

    System.out.println("Current URL = " + driver.getCurrentUrl());

    WebElement emailField = driver.findElement(By.id("username"));
    emailField.sendKeys("tomsmith");

    WebElement passwordField = driver.findElement(By.name("password"));
    passwordField.sendKeys("SuperSecretPassword!");

    driver.close();
}
}

