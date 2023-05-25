package stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import pages.AmazonPage;
import utilities.ConfigReader;
import utilities.Driver;

public class C01_AmazonStepDefitions {
    AmazonPage amazonPage = new AmazonPage();

    @Given("Kullanici amazon anasayfaya gider")
    public void kullanici_amazon_anasayfaya_gider() {
        // Write code here that turns the phrase above into concrete actions
        Driver.getDriver().get(ConfigReader.getProperty("amazonUrl"));

    }

    @When("Nutella icin arama yapar")
    public void nutella_icin_arama_yapar() {
        // Write code here that turns the phrase above into concrete actions

        amazonPage.aramaKutusu.sendKeys("Nutella"+ Keys.ENTER);

    }

    @Then("Arama sonuclarinin Nutella icerdigini test eder")
    public void arama_sonuclarinin_nutella_icerdigini_test_eder() {
        // Write code here that turns the phrase above into concrete actions

        String actulaAramasonucu = amazonPage.aramaSonucuElementi.getText();
        String expectediCerik = "Nutella";
        Assert.assertTrue(actulaAramasonucu.contains(expectediCerik));

    }

    @Then("Sayfayı kapatir")
    public void sayfayi_kapatir() {
        // Write code here that turns the phrase above into concrete actions
        Driver.quitDriver();

    }

}