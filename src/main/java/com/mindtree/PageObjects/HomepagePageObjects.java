package com.mindtree.PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.mindtree.UIStore.HomepageUI;

public class HomepagePageObjects extends HomepageUI{
	WebDriver driver;
	public HomepagePageObjects(WebDriver driver) {
		// TODO Auto-generated constructor stub
		this.driver = driver;
	}
	public WebElement username() {
		return driver.findElement(signupemail);
	}
	public WebElement password() {
		return driver.findElement(signupPwd);
	}
	public WebElement loginbutton() {
		return driver.findElement(signupbutton);
	}
	public WebElement Icon() {
		return driver.findElement(humanicon);
	}
	public WebElement profileButton() {
		return driver.findElement(profile);
	}
	public WebElement editButton() {
		return driver.findElement(edit);
	}
	public WebElement customerName() {
		return driver.findElement(name);
	}
	public WebElement customerMobile() {
		return driver.findElement(mobile);
	}
	public WebElement updateButton() {
		return driver.findElement(update);
	}
	public WebElement storeButton() {
		return driver.findElement(stores);
	}
	public WebElement viewDetails() {
		return driver.findElement(storedetails);
	}
	public WebElement storeAddress() {
		return driver.findElement(address);
	}
	public WebElement returnHomepage() {
		return driver.findElement(homepage);
	}
	public WebElement viewCustomerstories() {
		return driver.findElement(customerstories);
	}
	public WebElement aboutUs() {
		return driver.findElement(aboutcompany);
	}
	public WebElement search() {
		return driver.findElement(searchbox);
	}
	public WebElement sorting() {
		return driver.findElement(sort);
	}
	public WebElement viewNewarrivals() {
		return driver.findElement(newarrivals);
	}
	public WebElement selectProduct() {
		return driver.findElement(product);
	}
	public WebElement addToCart() {
		return driver.findElement(addcart);
	}
	public WebElement emiOption() {
		return driver.findElement(emi);
	}
	public WebElement close() {
		return driver.findElement(cross);
	}
	public WebElement Logo() {
		return driver.findElement(homeLogo);
	}
	public WebElement emailBox() {
		return driver.findElement(email);
	}
	public WebElement subscribeButton() {
		return driver.findElement(subscribe);
	}
	public WebElement logoutButton() {
		return driver.findElement(logout);
	}

}
