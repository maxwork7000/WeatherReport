package core;

import java.io.FileInputStream;
import java.io.Writer;
import java.util.Properties;
import org.openqa.selenium.By;
import com.aventstack.extentreports.ExtentTest;

class Checking {

	static Properties info = new Properties();
	static Writer report;

	public static void main(String[] args) throws Exception {

		info.load(new FileInputStream("./elements.properties"));
		Common.openBrowser("firefox", info.getProperty("uri"));
//		Common.openBrowser("firefox", "https://weather.com/sports-recreation/fishing/");
		Thread.sleep(10000);

//		System.out.println(Common.writeLineWithInformation("Your location", "Actual your location now",
//				Common.takeValue(By.className("styles__locationName__2syw7")), logger));
		
//              System.out.println(Common.takeValue(By.className("styles__locationName__2syw7")));
		System.out.println(MainPage.convertInCelsius());
		System.out.println(MainPage.cleanFahrenheit());
		System.out.println(MainPage.compareCelsius());
		System.out.println(MainPage.compareFahrenheit());
		System.out.println(MainPage.compareLocation());
System.out.println(MainPage.compareCelsius());


//              System.out.println(Common.isThisElementOnPage(By.className("styles__logo__1rxtm")));
//		      System.out.println(Common.isThisElementOnPage(By.xpath("//span[@class='icon icon-font iconset-ui icon-search']")));
//		      System.out.println(Common.isThisElementOnPage(By.xpath("//input[@class='theme__inputElement__4bZUj input__inputElement__1GjGE']")));
//		      System.out.println(Common.isThisElementOnPage(By.className("styles__brand__2qIZV")));
//		      System.out.println(Common.isThisElementOnPage(By.xpath("//span[@class='icon icon-font iconset-ui icon-globe']")));
//		      System.out.println(Common.isThisElementOnPage(By.xpath("//span[text()='US']")));
//		      System.out.println(Common.isThisElementOnPage(By.xpath("//span[text()='°F']")));
//		      System.out.println(Common.isThisElementOnPage(By.xpath("//span[@class='icon icon-font iconset-arrows icon-arrow-down-triangle']")));
//		      System.out.println(Common.isThisElementOnPage(By.className("styles__button__2mXSV")));
//		      System.out.println(Common.isThisElementOnPage(By.className("styles__temperature__1VbnH")));
//		      System.out.println(Common.isThisElementOnPage(By.className("styles__locationName__2syw7")));
//		      System.out.println(Common.isThisElementOnPage(By.className("svg-symbol-cloud")));
////		      System.out.println(Common.isThisElementOnPage(By.xpath("//span[@class='styles__alertsBadge__1mKcX styles__alert-3__1sva0']")));
//		      System.out.println(Common.isThisElementOnPage(By.xpath("//span[text()='Today']")));
//		      System.out.println(Common.isThisElementOnPage(By.xpath("//span[text()='Hourly']")));
//		      System.out.println(Common.isThisElementOnPage(By.xpath("//span[text()='5 Day']")));
//		      System.out.println(Common.isThisElementOnPage(By.xpath("//span[text()='10 Day']")));
//		      System.out.println(Common.isThisElementOnPage(By.xpath("//span[text()='Weekend']")));
//		      System.out.println(Common.isThisElementOnPage(By.xpath("//span[text()='Monthly']")));
//		      System.out.println(Common.isThisElementOnPage(By.xpath("//span[text()='Maps']")));
//		      System.out.println(Common.isThisElementOnPage(By.className("styles__fullText__e4H6D")));
//		      System.out.println(Common.isThisElementOnPage(By.id("WX_Top300Variable"))); // advertising
//		      System.out.println(Common.isThisElementOnPage(By.xpath("//img[@class='image']")));
//		      System.out.println(Common.isThisElementOnPage(By.xpath("//h1[@class='headline wx-ellipsis-text']")));
//		      System.out.println(Common.isThisElementOnPage(By.xpath("//span[@class='wx-description']")));
//		      //25
//		      System.out.println(Common.isThisElementOnPage(By.xpath("//img[@class='styles__donation_bgimg__iySnG']")));
//		      Common.scrollDown();
//		      System.out.println(Common.isThisElementOnPage(By.xpath("//h2[text()='Trending']")));
//		      System.out.println(Common.isThisElementOnPage(By.xpath("//h2[text()='EXPLORE YOUR AREA']")));
//		      System.out.println(Common.isThisElementOnPage(By.id("map")));
//		      System.out.println(Common.isThisElementOnPage(By.id("stay-up-to-date-hdr")));
//		      
//		      //30
//		      System.out.println(Common.isThisElementOnPage(By.xpath("//img[@alt='Fan Photos']")));
//			  System.out.println(Common.isThisElementOnPage(By.xpath("//img[@alt='Commuter Forecast']")));
//		      System.out.println(Common.isThisElementOnPage(By.xpath("//img[@alt='Features']")));
//		      Common.scrollDown2();
//		      System.out.println(Common.isThisElementOnPage(By.xpath("//h2[text()='RECOMMENDED']")));
//		      
//		      System.out.println(Common.isThisElementOnPage(By.xpath("//h2[text()='OUR PHOTO GALLERY PICKS']")));
//		      Common.scrollDown2();
//		      System.out.println(Common.isThisElementOnPage(By.xpath("//span[text()='Sponsored Content']")));
//		      Common.scrollDown2();
//		      System.out.println(Common.isThisElementOnPage(By.xpath("//h2[text()='Connect With Us']")));
//		      System.out.println(Common.isThisElementOnPage(By.xpath("//span[@class='icon icon-font iconset-social icon-facebook1']")));
//		      System.out.println(Common.isThisElementOnPage(By.xpath("//span[@class='icon icon-font iconset-social icon-twitter']")));
//		      System.out.println(Common.isThisElementOnPage(By.xpath("//span[@class='icon icon-font iconset-social icon-google-plus']")));
//		      System.out.println(Common.isThisElementOnPage(By.xpath("//span[@class='icon icon-font iconset-social icon-instagram']")));
//		      System.out.println(Common.isThisElementOnPage(By.xpath("//span[@class='icon icon-font iconset-social icon-youtube1']")));
//		      
//		      System.out.println(Common.isThisElementOnPage(By.xpath("//img[@class='logo-image lazyloaded']")));
//		      System.out.println(Common.isThisElementOnPage(By.xpath("//a[@title='Feedback']")));
//		      System.out.println(Common.isThisElementOnPage(By.xpath("//a[@title='Careers']")));
//		      System.out.println(Common.isThisElementOnPage(By.xpath("//a[@title='Download Apps']")));
//		      System.out.println(Common.isThisElementOnPage(By.xpath("//a[@title='Press Room']")));
//		      //47
//		      System.out.println(Common.isThisElementOnPage(By.xpath("//a[@title='Advertise With Us']")));
//		      System.out.println(Common.isThisElementOnPage(By.xpath("//a[@title='TV']")));
//		      System.out.println(Common.isThisElementOnPage(By.xpath("//strong[text()='Terms of Use']")));
//		      System.out.println(Common.isThisElementOnPage(By.xpath("//strong[text()='Privacy Policy']")));
//		      System.out.println(Common.isThisElementOnPage(By.xpath("//strong[text()='Parental Controls']")));
//		      
//		      System.out.println(Common.isThisElementOnPage(By.xpath("//strong[text()='AdChoices']")));
//		      System.out.println(Common.isThisElementOnPage(By.xpath("//img[@class='logo-choices']")));
//		      System.out.println(Common.isThisElementOnPage(By.xpath("//strong[text()='Ad Partners']")));
//		      System.out.println(Common.isThisElementOnPage(By.xpath("//strong[text()='Analytics Partners']")));
//		      System.out.println(Common.isThisElementOnPage(By.xpath("//strong[text()='Data Rights']")));
//		      //57
//		      System.out.println(Common.isThisElementOnPage(By.xpath("//img[@class='lazyloaded georgia-logo-compressor']")));
//		      System.out.println(Common.isThisElementOnPage(By.xpath("//p[text()='© Copyright TWC Product and Technology LLC 2014, ']")));
//		      System.out.println(Common.isThisElementOnPage(By.xpath("//span[@class='cloudpower']")));
//		      System.out.println(Common.isThisElementOnPage(By.xpath("//img[@src='/weather/assets/footer/cloud_logo@2x.png']")));
//		      System.out.println(Common.isThisElementOnPage(By.xpath("//span[@class='boldcloud']")));
//		      //62
//		      Common.scrollUp();
//		      
//		      Common.leftClickOnElement(By.xpath("//span[@class='icon icon-font iconset-arrows icon-arrow-down-triangle']"));
//		      //63
//		      System.out.println(Common.isThisElementOnPage(By.xpath("//button[text()='°F']")));
//		      System.out.println(Common.isThisElementOnPage(By.xpath("//button[text()='°C']")));
//		      System.out.println(Common.isThisElementOnPage(By.xpath("//span[text()='Americas']")));
//		      System.out.println(Common.isThisElementOnPage(By.xpath("//span[text()='Africa']")));
//		      System.out.println(Common.isThisElementOnPage(By.xpath("//span[text()='Asia Pacific']")));
//		      System.out.println(Common.isThisElementOnPage(By.xpath("//span[text()='Europe']")));
//		      System.out.println(Common.isThisElementOnPage(By.xpath("//span[text()='Middle East']")));
//		      
//		      Common.leftClickOnElement(By.xpath("//span[@class='styles__icon__3ME1R styles__menuButton__3cALc']"));
////		      Thread.sleep(3000);//71
//		      System.out.println(Common.isThisElementOnPage(By.xpath("//span[text()='Weather']")));
//		      System.out.println(Common.isThisElementOnPage(By.xpath("//a[@class='styles__navigationItem__2faNj']")));
//		      System.out.println(Common.isThisElementOnPage(By.xpath("//a[text()='Hourly Forecast']")));
//		      System.out.println(Common.isThisElementOnPage(By.xpath("//a[text()='10 Day Forecast']")));
//		      System.out.println(Common.isThisElementOnPage(By.xpath("//a[text()='Monthly Forecast']")));
//		      System.out.println(Common.isThisElementOnPage(By.xpath("//a[text()='National Forecast']")));
//		      System.out.println(Common.isThisElementOnPage(By.xpath("//a[text()='National News']")));
//		      System.out.println(Common.isThisElementOnPage(By.xpath("//a[text()='Get Notifications']")));
//		      System.out.println(Common.isThisElementOnPage(By.xpath("//a[text()='Almanac']")));
//		      //80
//		      System.out.println(Common.isThisElementOnPage(By.xpath("//span[text()='Maps']")));
//		      System.out.println(Common.isThisElementOnPage(By.xpath("//a[text()='Weather in Motion®']")));
//		      System.out.println(Common.isThisElementOnPage(By.xpath("//a[text()='Radar Maps']")));
//		      System.out.println(Common.isThisElementOnPage(By.xpath("//a[text()='Classic Weather Maps']")));
//		      System.out.println(Common.isThisElementOnPage(By.xpath("//a[text()='Regional Satellite']")));
//		      //85
//		      System.out.println(Common.isThisElementOnPage(By.xpath("//span[text()='Severe']")));
//		      System.out.println(Common.isThisElementOnPage(By.xpath("//a[text()='Severe Alerts']")));
//		      System.out.println(Common.isThisElementOnPage(By.xpath("//a[text()='Safety and Preparedness ']")));
//		      System.out.println(Common.isThisElementOnPage(By.xpath("//a[text()='Get Severe Alerts']")));
//		      System.out.println(Common.isThisElementOnPage(By.xpath("//a[text()='Hurricane Central']")));
//		      
//		      System.out.println(Common.isThisElementOnPage(By.xpath("//span[text()='Video & Photos']")));
//		      System.out.println(Common.isThisElementOnPage(By.xpath("//a[text()='Top Stories']")));
//		      System.out.println(Common.isThisElementOnPage(By.xpath("//a[text()='Video']")));
//		      System.out.println(Common.isThisElementOnPage(By.xpath("//a[text()='Slideshows']")));
//		      //94
//		      System.out.println(Common.isThisElementOnPage(By.xpath("//span[text()='Activities']")));
//		      System.out.println(Common.isThisElementOnPage(By.xpath("//a[text()='Boat & Beach Forecast']")));
//		      System.out.println(Common.isThisElementOnPage(By.xpath("//a[text()='Gardening Forecast']")));
//		      System.out.println(Common.isThisElementOnPage(By.xpath("//a[text()='Ski Forecast']")));
//		      
//		      System.out.println(Common.isThisElementOnPage(By.xpath("//span[text()='Health']")));
//		      System.out.println(Common.isThisElementOnPage(By.xpath("//a[text()='Allergy Tracker']")));
//		      System.out.println(Common.isThisElementOnPage(By.xpath("//a[text()='Cold & Flu']")));
//		      System.out.println(Common.isThisElementOnPage(By.xpath("//a[text()='Water Scarcity']")));
//		      //102
//		      System.out.println(Common.isThisElementOnPage(By.xpath("//span[text()='TV']")));
//		      System.out.println(Common.isThisElementOnPage(By.xpath("//a[text()='Watch Live']")));
//		      System.out.println(Common.isThisElementOnPage(By.xpath("//a[text()='Personalities']")));
//
//		      Common.leftClickOnElement(By.xpath("//span[@class='styles__icon__3ME1R styles__active__2UFF0 styles__menuButton__3cALc styles__active__1H8SQ']"));
//
//
//		      Common.moveElement(By.className("styles__fullText__e4H6D"));
////		      Thread.sleep(3000);
//		      System.out.println(Common.isThisElementOnPage(By.className("styles__navHeader__TD0tI")));
//		      System.out.println(Common.isThisElementOnPage(By.xpath("//span[text()='Allergy Tracker']")));
//		      System.out.println(Common.isThisElementOnPage(By.xpath("//span[text()='Boat & Beach']")));
//		      System.out.println(Common.isThisElementOnPage(By.xpath("//span[text()='Cold & Flu']")));
//		      System.out.println(Common.isThisElementOnPage(By.xpath("//span[text()='Farming']")));
//		      System.out.println(Common.isThisElementOnPage(By.xpath("//span[text()='Fishing']")));
//		      System.out.println(Common.isThisElementOnPage(By.xpath("//span[text()='Ski Forecast']")));
////		      Thread.sleep(3000);
//
//		      
//
//		      
//		     
//		      Common.stopDriver();
	}



		      









		      



		     
		
}
