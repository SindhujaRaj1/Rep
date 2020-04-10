package com.org.location;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.org.BrowserLaunch.BrowserL;

public class Locations1 extends BrowserL{
	@FindBy(xpath="//input[@name='userName']")
    private WebElement textName;
	@FindBy(xpath="//input[@name='password']")
    private WebElement textpass;
	@FindBy(xpath="//input[@name='login']")
    private WebElement login;
	@FindBy(xpath="//*[text()='REGISTER']")
    private WebElement register;
	
	@FindBy(xpath="//input[@name='firstName']")
    private WebElement textfirstName;
	@FindBy(xpath="//input[@name='lastName']")
    private WebElement textlastName;
	@FindBy(xpath="//input[@name='phone']")
    private WebElement textphone;
	@FindBy(xpath="//input[@id='userName']")
    private WebElement textemail;
	@FindBy(xpath="//input[@id='email']")
    private WebElement textUN;
	@FindBy(xpath="//input[@name='password']")
    private WebElement textp;
	@FindBy(xpath="//input[@name='confirmPassword']")
    private WebElement textcp;
	@FindBy(xpath="//input[@name='register']")
    private WebElement textsubmit;
	@FindBy(xpath="//a[text()=' sign-in ']")
    private WebElement textsignon;
	@FindBy(xpath="//select[@name='passCount']")
    private WebElement passengers;
	@FindBy(xpath="//select[@name='fromPort']")
    private WebElement from;
	@FindBy(xpath="//select[@name='fromMonth']")
	private WebElement month;@FindBy(xpath="//select[@name='fromDay']")
	private WebElement fromDate;
	@FindBy(xpath="//select[@name='toPort']")
	private WebElement to;
	@FindBy(xpath="//select[@name='toMonth']")
	private WebElement tomonth;
	@FindBy(xpath="//select[@name='toDay']")
	private WebElement todate;
	@FindBy(xpath="/html/body/div/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[5]/td/form/table/tbody/tr[9]/td[2]/font/font/input[2]")
	private WebElement ticket;
	@FindBy(xpath="//select[@name='airline']")
	private WebElement airline;
	@FindBy(xpath="//input[@type='image' and @name='findFlights']")
	private WebElement conButton;
	@FindBy(xpath="//tr[9]//td//input[@name='outFlight']")
	private WebElement outflight;
	@FindBy(xpath="//tr[9]//td//input[@name='inFlight']")
	private WebElement inflight;
	@FindBy(xpath="//input[@name='reserveFlights']")
	private WebElement reservebutton;
	@FindBy(xpath="//input[@name='passFirst0']")
	private WebElement textP1fname;
	@FindBy(xpath="//input[@name='passLast0']")
	private WebElement textP1lname;
	@FindBy(xpath="//select[@name='pass.0.meal']")
	private WebElement P1meal;
	
	@FindBy(xpath="//input[@name='passFirst1']")
	private WebElement textP2fname;
	@FindBy(xpath="//input[@name='passLast1']")
	private WebElement textP2lname;
	@FindBy(xpath="//select[@name='pass.1.meal']")
	private WebElement P2meal;
	
	@FindBy(xpath="//input[@name='passFirst2']")
	private WebElement textP3fname;
	@FindBy(xpath="//input[@name='passLast2']")
	private WebElement textP3lname;
	@FindBy(xpath="//select[@name='pass.2.meal']")
	private WebElement P3meal;
	@FindBy(xpath="//select[@name='creditCard']")
	private WebElement cardname;
	@FindBy(xpath="//input[@name='creditnumber']")
	private WebElement textCnumber;
	@FindBy(xpath="//select[@name='cc_exp_dt_mn']")
	private WebElement cardexpmon;
	@FindBy(xpath="//select[@name='cc_exp_dt_yr']")
	private WebElement cardexpyr;
	@FindBy(xpath="//input[@name='cc_frst_name']")
	private WebElement textholdfname;
	@FindBy(xpath="//input[@name='cc_last_name']")
	private WebElement textholdlname;
	@FindBy(xpath="//input[@name='billAddress1']")
	private WebElement address1 ;
	@FindBy(xpath="//input[@name='billAddress2']")
	private WebElement address2 ;
	@FindBy(xpath="//input[@name='billCity']")
	private WebElement city ;
	@FindBy(xpath="//input[@name='billZip']")
	private WebElement Zip ;
	@FindBy(xpath="//select[@name='billCountry']")
	private WebElement country ;
	@FindBy(xpath="//tr[16]//td[2]//input[@name='ticketLess']")
	private WebElement sameaddress ;
	@FindBy(xpath="//input[@name='delAddress1']")
	private WebElement deladdress1 ;
	@FindBy(xpath="//input[@name='delAddress2']")
	private WebElement deladdress2 ;
	@FindBy(xpath="//input[@name='delCity']")
	private WebElement delcity ;
	@FindBy(xpath="//select[@name='delCountry']")
	private WebElement dcountry ;
	@FindBy(xpath="//input[@name='buyFlights']")
	private WebElement fsubmit ;
	
	
	public WebElement getDcountry() {
		return dcountry;
	}

	public void setDcountry(WebElement dcountry) {
		this.dcountry = dcountry;
	}

	public WebElement getFsubmit() {
		return fsubmit;
	}

	public void setFsubmit(WebElement fsubmit) {
		this.fsubmit = fsubmit;
	}

	public WebElement getDeladdress1() {
		return deladdress1;
	}

	public void setDeladdress1(WebElement deladdress1) {
		this.deladdress1 = deladdress1;
	}

	public WebElement getDeladdress2() {
		return deladdress2;
	}

	public void setDeladdress2(WebElement deladdress2) {
		this.deladdress2 = deladdress2;
	}

	public WebElement getDelcity() {
		return delcity;
	}

	public void setDelcity(WebElement delcity) {
		this.delcity = delcity;
	}

	public WebElement getDelZip() {
		return delZip;
	}

	public void setDelZip(WebElement delZip) {
		this.delZip = delZip;
	}

	public WebElement getDelcountry() {
		return delcountry;
	}

	public void setDelcountry(WebElement delcountry) {
		this.delcountry = delcountry;
	}

	@FindBy(xpath="//input[@name='delZip']")
	private WebElement delZip ;
	@FindBy(xpath="//select[@name='delCountry']")
	private WebElement delcountry ;
	public WebElement getCity() {
		return city;
	}

	public void setCity(WebElement city) {
		this.city = city;
	}

	public WebElement getZip() {
		return Zip;
	}

	public void setZip(WebElement zip) {
		Zip = zip;
	}

	public WebElement getCountry() {
		return country;
	}

	public void setCountry(WebElement country) {
		this.country = country;
	}

	public WebElement getSameaddress() {
		return sameaddress;
	}

	public void setSameaddress(WebElement sameaddress) {
		this.sameaddress = sameaddress;
	}

	public WebElement getAddress2() {
		return address2;
	}

	public void setAddress2(WebElement address2) {
		this.address2 = address2;
	}

	public WebElement getAddress1() {
		return address1;
	}

	public void setAddress1(WebElement address1) {
		this.address1 = address1;
	}

	public WebElement getCardname() {
		return cardname;
	}

	public void setCardname(WebElement cardname) {
		this.cardname = cardname;
	}

	public WebElement getTextCnumber() {
		return textCnumber;
	}

	public void setTextCnumber(WebElement textCnumber) {
		this.textCnumber = textCnumber;
	}

	public WebElement getCardexpmon() {
		return cardexpmon;
	}

	public void setCardexpmon(WebElement cardexpmon) {
		this.cardexpmon = cardexpmon;
	}

	public WebElement getCardexpyr() {
		return cardexpyr;
	}

	public void setCardexpyr(WebElement cardexpyr) {
		this.cardexpyr = cardexpyr;
	}

	public WebElement getTextholdfname() {
		return textholdfname;
	}

	public void setTextholdfname(WebElement textholdfname) {
		this.textholdfname = textholdfname;
	}

	public WebElement getTextholdlname() {
		return textholdlname;
	}

	public void setTextholdlname(WebElement textholdlname) {
		this.textholdlname = textholdlname;
	}

	public WebElement getP1meal() {
		return P1meal;
	}

	public void setP1meal(WebElement p1meal) {
		P1meal = p1meal;
	}

	public WebElement getP2meal() {
		return P2meal;
	}

	public void setP2meal(WebElement p2meal) {
		P2meal = p2meal;
	}

	public WebElement getP3meal() {
		return P3meal;
	}

	public void setP3meal(WebElement p3meal) {
		P3meal = p3meal;
	}

	public WebElement getTextP1fname() {
		return textP1fname;
	}

	public void setTextP1fname(String textP1fname) {
		this.textP1fname.sendKeys(textP1fname);
	}

	public WebElement getTextP1lname() {
		return textP1lname;
	}

	public void setTextP1lname(String textP1lname) {
		this.textP1lname.sendKeys(textP1lname);
	}

	public WebElement getTextP2fname() {
		return textP2fname;
	}

	public void setTextP2fname(String textP2fname) {
		this.textP2fname.sendKeys(textP2fname);
	}

	public WebElement getTextP2lname() {
		return textP2lname;
	}

	public void setTextP2lname(String textP2lname) {
		this.textP2lname.sendKeys(textP2lname);
	}

	public WebElement getTextP3fname() {
		return textP3fname;
	}

	public void setTextP3fname(String textP3fname) {
		this.textP3fname.sendKeys(textP3fname);
	}

	public WebElement getTextP3lname() {
		return textP3lname;
	}

	public void setTextP3lname(String textP3lname) {
		this.textP3lname.sendKeys(textP3lname);
	}

	public WebElement getReservebutton() {
		return reservebutton;
	}

	public void setReservebutton(WebElement reservebutton) {
		this.reservebutton = reservebutton;
	}

	public WebElement getInflight() {
		return inflight;
	}

	public void setInflight(WebElement inflight) {
		this.inflight = inflight;
	}

	public WebElement getOutflight() {
		return outflight;
	}

	public void setOutflight(WebElement outflight) {
		this.outflight = outflight;
	}

	public WebElement getConButton() {
		return conButton;
	}

	public void setConButton(WebElement conButton) {
		this.conButton = conButton;
	}

	public WebElement getTicket() {
		return ticket;
	}

	public void setTicket(WebElement ticket) {
		this.ticket = ticket;
	}

	public WebElement getAirline() {
		return airline;
	}

	public void setAirline(WebElement airline) {
		this.airline = airline;
	}

	public WebElement getTo() {
		return to;
	}

	public void setTo(WebElement to) {
		this.to = to;
	}

	public WebElement getTomonth() {
		return tomonth;
	}

	public void setTomonth(WebElement tomonth) {
		this.tomonth = tomonth;
	}

	public WebElement getTodate() {
		return todate;
	}

	public void setTodate(WebElement todate) {
		this.todate = todate;
	}

	
	
	
	public WebElement getFromDate() {
		return fromDate;
	}

	public void setFromDate(WebElement fromDate) {
		this.fromDate = fromDate;
	}

	public WebElement getMonth() {
		return month;
	}

	public void setMonth(WebElement month) {
		this.month = month;
	}

	
	public WebElement getPassengers() {
		return passengers;
	}

	public void setPassengers(WebElement passengers) {
		this.passengers = passengers;
	}

	public WebElement getFrom() {
		return from;
	}

	public void setFrom(WebElement from) {
		this.from = from;
	}

	
	
	
	
	
	
	
	
	public WebElement getTextsignon() {
		return textsignon;
	}

	public void setTextsignon(WebElement textsignon) {
		this.textsignon = textsignon;
	}

	public WebElement getTextcp() {
		return textcp;
	}

	public void setTextcp(String textcp) {
		this.textcp.sendKeys(textcp); 
	}

	public WebElement getTextp() {
		return textp;
	}

	public void setTextp(String textp) {
		this.textp.sendKeys(textp); 
	}

	
	public String getTextUN() {
		return textUN.getAttribute("value");
	}

	public void setTextUN(String textUN) {
		this.textUN.sendKeys(textUN);
	}

	
	public String getTextfirstName() {
		return textfirstName.getAttribute("value");
	}

	public void setTextfirstName(String textfirstName) {
		this.textfirstName.sendKeys(textfirstName); 
	}

	public String getTextlastName() {
		return textlastName.getAttribute("value");
	}

	public void setTextlastName(String textlastName) {
		this.textlastName.sendKeys(textlastName);
	}

	public String getTextphone() {
		return textphone.getAttribute("value");
	}

	public void setTextphone(String textphone) {
		this.textphone.sendKeys(textphone);
	}

	public String getTextemail() {
		return textemail.getAttribute("value");
	}

	public void setTextemail(String textemail) {
		this.textemail.sendKeys(textemail); 
	}

	public WebElement getTextsubmit() {
		return textsubmit;
	}

	public void setTextsubmit(WebElement textsubmit) {
		this.textsubmit = textsubmit;
	}
	public WebElement getRegister() {
		return register;
	}

	public void setRegister(WebElement register) {
		this.register = register;
	}

	public WebElement getLogin() {
		return login;
	}

	public void setLogin(WebElement login) {
		this.login = login;
	}

	public String getTextpass() {
		return textpass.getAttribute("value");
	}

	public void setTextpass(String textpass) {
		this.textpass.sendKeys(textpass);
	}

	public String getTextName() {
		return textName.getAttribute("value");
	}

	public void setTextName(String textName) {
		this.textName.sendKeys(textName);
	}

	public Locations1(){
		PageFactory.initElements(driver, this);
		
	}
	
}
