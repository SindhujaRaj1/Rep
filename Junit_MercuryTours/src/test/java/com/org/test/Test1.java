package com.org.test;

import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.support.ui.Select;

import com.org.BrowserLaunch.BrowserL;
import com.org.location.Locations1;

public class Test1 extends BrowserL {
  public static BrowserL B;
	Locations1 L;
	@BeforeClass
	public static void precondition()
	{
		driver=GetDriver("Chrome");
	}
	@Test
	public void Condition() throws InterruptedException
	{
		L=new Locations1();
		L.setTextName("Sindhuja");
		Assert.assertEquals("Sindhuja", L.getTextName());
		L.setTextpass("Sindhuja1");
		Assert.assertEquals("Sindhuja1", L.getTextpass());
		ButtonClick(L.getLogin());
		L.getRegister().click();
		Thread.sleep(3000);
		L.setTextfirstName("Sindhuja11");
		L.setTextlastName("Rajendran");
		L.setTextphone("923451234");
		L.setTextemail("sindhujaraj92@gmail.com");
		L.setTextUN("SindhujaRaj");
		L.setTextp("Thaman123");
		L.setTextcp("Thaman123");
		ButtonClick(L.getTextsubmit());
		Thread.sleep(3000);
		L.getTextsignon().click();
		L.setTextName("SindhujaRaj");
		L.setTextpass("Thaman123");
		ButtonClick(L.getLogin());
		Thread.sleep(3000);
		select(L.getPassengers(),"3");
		select(L.getFrom(),"London");
		select(L.getMonth(),"May");
		select(L.getFromDate(),"24");
		select(L.getTo(),"New York");
		select(L.getTomonth(),"June");
		select(L.getTodate(),"1");
		L.getTicket().click();
		select(L.getAirline(),"Unified Airlines");
	    ButtonClick(L.getConButton());	
	    Thread.sleep(3000);
	    radiobutton(L.getOutflight());
	    radiobutton(L.getInflight());
	    ButtonClick(L.getReservebutton());
	    Thread.sleep(3000);
		sendelement(L.getTextP1fname(),"Saranya");
		sendelement(L.getTextP1lname(), "Raman");
		select(L.getP1meal(),"Low Calorie");
		sendelement(L.getTextP2fname(),"Janaki");
		sendelement(L.getTextP2lname(),"Raman");
		select(L.getP2meal(),"Vegetarian");
		sendelement(L.getTextP3fname(),"Ram");
		sendelement(L.getTextP3lname(),"prakash");
		select(L.getP3meal(),"Low Sodium");
		select(L.getCardname(),"Visa");
		sendelement(L.getTextCnumber(),"4567890234567");
		select(L.getCardexpmon(),"12");
		select(L.getCardexpyr(),"2008");
		sendelement(L.getTextholdfname(),"Saranya");
		sendelement(L.getTextholdlname(),"Raman");
	    L.getAddress1().clear();
	    sendelement(L.getAddress1(),"No:58");
	    sendelement(L.getAddress2(),"Kingsway");
	    L.getCity().clear();
	    sendelement(L.getCity(),"Norwich");
	    L.getZip().clear();
	    sendelement(L.getZip(),"9844567");
	    select(L.getCountry(),"UNITED KINGDOM ");
	    L.getSameaddress().click();
	    L.getDeladdress1().clear();
	    sendelement(L.getDeladdress1(),"No:58");
	    sendelement(L.getDeladdress2(),"Kingsway");
	    L.getDelcity().clear();
	    sendelement(L.getDelcity(),"Norwich");
	    L.getDelZip().clear();
	    sendelement(L.getDelZip(),"9844567");
	    select(L.getDcountry(),"UNITED KINGDOM ");
	    driver.switchTo().alert().accept();
	   ButtonClick(L.getFsubmit());
	  
		
		
		
	}
	@AfterClass
	public static void postcondition() throws InterruptedException{
		Thread.sleep(30000);
		driver.close();
	}

}
