package stepDefinition;

import org.openqa.selenium.By;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class cucumber extends Driver_Setup{
	
@Given("Github page is launched")
public void github_page_is_launched() 
{
	Driver_Setup stp=new Driver_Setup();
    stp.init();
    d.get("https://github.com");
}

@Given("login is visible")
public void login_is_visible()throws Exception
{
	Thread.sleep(2000);
	d.findElement(By.xpath(".//a[@href='/login']")).click();
}

@When("User Enter user_name and passowrd in login form")
public void user_Enter_user_name_and_passowrd_in_login_form()  {
    d.findElement(By.xpath(".//input[@name='login']")).sendKeys("vishwanathmalakar@gmail.com");
	d.findElement(By.xpath(".//input[@name='password']")).sendKeys("Uonly@G***6");
}

@When("click login button")
public void click_login_button() {
	d.findElement(By.xpath(".//input[@name=\"commit\"]")).click();
}

@Then("Login should be success")
public void login_should_be_success() {
   String Title=d.getTitle();
   System.out.println(Title);
}

}
