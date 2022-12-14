import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ApplicationManager {
    WebDriver wd;

    public void init(){
      WebDriverWait wait = new WebDriverWait(wd, 5);
      WebElement element = wait .until(ExpectedConditions.visibilityOf(wd.findElement(By.id("www"))));

      wait.until(ExpectedConditions.)

    }
}
