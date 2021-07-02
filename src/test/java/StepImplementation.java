import com.thoughtworks.gauge.Step;
import org.openqa.selenium.By;

public class StepImplementation extends BaseTest
{
    @Step("click the element with the id of <id>")
    public void clickById(String id) throws InterruptedException {
        appiumDriver.findElement(By.id(id)).click();
        System.out.println("Element is clicked.");
        Thread.sleep(2000);
    }

    @Step("click the element with the xpath of <xpath>")
    public void clickByXPath(String xpath) throws InterruptedException {
        appiumDriver.findElement(By.xpath(xpath)).click();
        System.out.println("Element is clicked.");
        Thread.sleep(2000);
    }

    @Step("send <key> to the <id> element")
    public void sendKeysById(String key, String id) throws InterruptedException {
        appiumDriver.findElement(By.id(id)).sendKeys(key);
        System.out.println("key has been sent to the element");
        Thread.sleep(2000);
    }

    @Step("click the element with the text of <text>")
    public void clickByText(String text) throws InterruptedException {
        appiumDriver.findElement(By.xpath("//*[@text='" + text + "']")).click();
        System.out.println("Element is clicked.");
        Thread.sleep(2000);
    }

    @Step("read text value of the element with <id>")
    public void readTextValue(String id) throws InterruptedException {
        String currentDate = appiumDriver.findElement(By.id(id)).getText();
        System.out.println("Element has been read.");
        int dayToPick = Integer.parseInt(currentDate) + 2;
        String dayToPickAsText = String.valueOf(dayToPick);
        appiumDriver.findElement(By.xpath("//*[@text='" + dayToPickAsText + "']")).click();
        System.out.println("Element is clicked.");
        Thread.sleep(2000);
    }

    @Step("check if an element with the id of <id> is displayed on screen")
    public void checkIfExists(String id) throws InterruptedException {
        if(appiumDriver.findElements(By.id(id)).size() > 0){
            System.out.println("Element is displayed.");
        }else{
            System.out.println("Element not found.");
        }

        Thread.sleep(2000);
    }

}
