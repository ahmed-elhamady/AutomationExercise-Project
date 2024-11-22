package TestSteps;

import TestPages.P08_SubscriptionPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class T08_SubscriptionSteps {

    P08_SubscriptionPage subscriptionPage = new P08_SubscriptionPage();


    @Given("user open the home page")
    public void open_the_Home_subscriptionPage() {
        // Open the Home page;
        subscriptionPage.newSoftAssert();
    }

    @When("the user click on 'Cart' button")
    public void cart_button() {
        subscriptionPage.cartBtn().click();
    }

    @When("user enter the email address as {string}")
    public void email_address(String email) {
        subscriptionPage.emailNpt().sendKeys(email);
    }

    @And("clicks on arrow Btn")
    public void arrow_button() {
        subscriptionPage.arrowBtn().click();
    }

    @Then("the success message 'You have been successfully subscribed!' should be appeared")
    public void success_message() {
        subscriptionPage.assertSuccessSMS();
        subscriptionPage.assertAll();
    }
}
