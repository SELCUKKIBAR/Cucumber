package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

import java.util.List;

public class DemoGuruPage {

    public DemoGuruPage(){
        PageFactory.initElements(Driver.getDriver(),this);

    }


    @FindBy(tagName = "//iframe")
    public List<WebElement>iframeSayisi;

    @FindBy(xpath = "//*[@id=\"movie_player\"]/div[4]/div")
    public WebElement youTubeLinki;
}
