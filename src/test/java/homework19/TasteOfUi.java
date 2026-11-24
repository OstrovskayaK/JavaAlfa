package homework19;

import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Condition.visible;

public class TasteOfUi {

    @Test
    public void successfulAuthorization() {

        Selenide.open("https://the-internet.herokuapp.com/");

        SelenideElement formAuthenticationButton = Selenide.$x("//a[@href ='/login']");
        SelenideElement pageTitle = Selenide.$x("//div[@class='example']");
        SelenideElement inputFieldUsername = Selenide.$x("//input[@id='username']");
        SelenideElement inputFieldPassword = Selenide.$x("//input[@id='password']");
        SelenideElement loginButton = Selenide.$x("//button[@class='radius']");
        SelenideElement loginResultText = Selenide.$x("//div[@class='flash success']");
        SelenideElement logoutButton = Selenide.$x("//a[@href='/logout']");



        formAuthenticationButton.click();
        pageTitle.shouldHave(text("Login Page"));
        inputFieldUsername.click();
        inputFieldUsername.setValue("tomsmith");
        inputFieldPassword.click();
        inputFieldPassword.setValue("SuperSecretPassword!");
        loginButton.click();
        loginResultText.shouldHave(text("You logged into a secure area!"));
        logoutButton.shouldBe(visible);
        logoutButton.click();
        pageTitle.shouldHave(text("Login Page"));

    }
    @Test
    public void unsuccessfulAuthorization() {

        Selenide.open("https://the-internet.herokuapp.com/");

        SelenideElement formAuthenticationButton = Selenide.$x("//a[@href ='/login']");
        SelenideElement elementalSeleniumLink = Selenide.$x("//a[contains(text(), 'Elemental Selenium')]");
        SelenideElement inputFieldUsername = Selenide.$x("//input[@id='username']");
        SelenideElement inputFieldPassword = Selenide.$x("//input[@id='password']");
        SelenideElement loginButton = Selenide.$x("//button[@class='radius']");
        SelenideElement loginBadResultText = Selenide.$x("//div[@class='flash error']");



        formAuthenticationButton.click();
        elementalSeleniumLink.shouldBe(visible);
        inputFieldUsername.setValue("admin");
        inputFieldPassword.click();
        inputFieldPassword.setValue("1234");
        loginButton.click();
        loginBadResultText.shouldHave(text("Your username is invalid!"));

    }
}
