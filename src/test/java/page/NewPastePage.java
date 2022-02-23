package page;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

public class NewPastePage extends GeneralPage {
    public NewPastePage(WebDriver driver) {
        super(driver);
    }
    private By pasteField = By.xpath("//*[@id='postform-text']");
    private By syntaxHighlightingField = By.xpath("//*[@id='select2-postform-format-container']");
    private By syntaxHighlightingSearch = By.xpath("//input['@class=select2-search__field' and @type='search']");
  //  private By
    private By pasteExpirationList = By.id("select2-postform-expiration-container");
    private By pasteExpirationSelection = By.xpath("//li[contains(text(), '10 Minutes')]");
    private By pasteNameField = By.id("postform-name");
    private By newPasteButton = By.xpath("//button[contains(text(), 'Create New Paste')]");
    private By textName = By.xpath("//div[@class='info-top']/child::h1");
    private By textSyntaxButton = By.xpath("//div[@class='left']/child::a");
    private By textDataField = By.xpath("//textarea[@class='textarea']");

    public void openPage(){
        driver.get("https://pastebin.com");
    }

    public void pasteTextIntoNewPasteField(String textForNewPaste){
        driver.findElement(pasteField)
                .sendKeys(textForNewPaste);
    }

    public void selectSyntaxHighlighting(String syntax){
        driver.findElement(syntaxHighlightingField)
                .click();
        WebElement syntaxSelection = driver.findElement(syntaxHighlightingSearch);
        syntaxSelection.sendKeys(syntax);
        syntaxSelection.sendKeys(Keys.ENTER);
    }
    public void selectPasteExpiration(){
        driver.findElement(pasteExpirationList)
                .click();
        driver.findElement(pasteExpirationSelection)
                .click();
    }

    public void pasteTextIntoPasteNameField(String textForPasteName){
        driver.findElement(pasteNameField)
                .sendKeys(textForPasteName);
    }

    public void clickCreateNewPasteButton(){
        driver.findElement(newPasteButton)
                .click();
    }

    public void checkPasteName(String textForPasteName){
        String isExist = driver.findElement(textName)
                .getText();
        Assert.assertEquals(isExist,textForPasteName);
    }

    public void checkTextSyntaxButton(String syntax){
        String isExist = driver.findElement(textSyntaxButton)
                .getText();
        Assert.assertEquals(isExist,syntax);
    }

    public void checkTextPasteField(String textInPasteData){
        String isExist = driver.findElement(textDataField)
                .getText();
        Assert.assertEquals(isExist,textInPasteData);
    }
}
