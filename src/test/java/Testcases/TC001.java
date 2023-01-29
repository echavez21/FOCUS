package Testcases;

import org.testng.annotations.*;
import static org.testng.Assert.*;
import java.time.Duration;
import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import Constants.*;

public class TC001 extends Webdriverbase {

	@Parameters("browser")
	@BeforeClass(alwaysRun = true)
	public void setUp(String browser) throws Exception {
		webDriverSetUp(browser);
		driver.manage().window().maximize();

	}

	@Parameters("urlvalue")
	@Test(priority = 1)
	public void search(String urlvalue) throws Throwable {
		driver.get("https://www.google.com/");

		Search search = new Search(driver);
		Search btnsearch = new Search(driver);
		Search Clicklink = new Search(driver);
		WebElement opt1 = search.clickout();
		Actions actions1 = new Actions(driver);

		search.searchbox().sendKeys("Focus Service");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
		actions1.moveToElement(opt1).perform();
		btnsearch.Searchgoogle().click();
		String url = search.clicklink().getAttribute("innerText");
		String sSubCadena = url.substring(38, 67);
		Webdriverbase.assertEqualsByText(urlvalue, sSubCadena);
		System.out.println("The URL is:" + sSubCadena);
		Clicklink.clicklink().click();
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,document.body.scrollHeight)", "");

		String hiring = search.nowhiring().getAttribute("innerHTML");
		if (driver.findElements(By.cssSelector("#text-4 > div > p > a > span")).size() > 0) {

			System.out.println("The option:" + hiring + "Exist");
		} else {
			System.out.println("The option:" + hiring + "Not Exist");

		}
	}

	@Parameters("urlvalue1")
	@Test(priority = 2)
	public void northamerica(String urlvalue1) throws Throwable {
		Search search = new Search(driver);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
		WebElement opt2 = search.location();
		Actions actions2 = new Actions(driver);
		actions2.moveToElement(opt2).build().perform();
		search.location().click();

		WebElement link = driver.findElement(By.xpath("//*[@id=\"av-tab-section-1\"]/div/div[1]/a[1]/span[2]/span"));
		String url1 = search.urllocation().getAttribute("innerHTML");
		if (link.isEnabled()) {
			System.out.println("The link belong of: " + url1 + "option, exist");
		} else {
			System.out.println("No link is there");
		}
	}

	@Test(priority = 3)
	public void centralamerica() throws Throwable {
		Search search = new Search(driver);
		WebElement opt3 = search.centralamerica();
		Actions actions3 = new Actions(driver);
		actions3.moveToElement(opt3).build().perform();
		search.centralamerica().click();

		boolean verifytxtsvnc = driver.findElement(By.cssSelector(
				"#av-tab-section-1 > div > div.av-tab-section-inner-container.avia-section-default > div.av-layout-tab.av-animation-delay-container.avia-builder-el-68.el_after_av_tab_sub_section.el_before_av_tab_sub_section.av-active-tab-content > div > div > section > div > h2"))
				.isDisplayed();
		String verifytxt = search.txtsvnc().getAttribute("innerText");
		if (verifytxtsvnc) {
			assertTrue(verifytxtsvnc);
			System.out.println("***The option:" + "'" + verifytxt + "'" + " is displayed***");
		} else {
			assertFalse(verifytxtsvnc);
			System.out.println("***The option:" + "'" + verifytxt + "'" + " is not displayed***");
		}
	}

	@Test(priority = 4)
	public void asia() throws Throwable {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		Search search = new Search(driver);
		WebElement opt4 = search.asia();
		Actions actions4 = new Actions(driver);
		actions4.moveToElement(opt4).perform();
		search.asia().click();

		boolean verifyoption1 = driver.findElement(By.cssSelector("#text-4 > div > p > a > span")).isEnabled();
		String txtasia = search.txtphil().getAttribute("innerHTML");
		if (verifyoption1) {
			assertTrue(verifyoption1);
			System.out.println("***The option:" + "'" + txtasia + "'" + " is displayed***");
		} else {
			assertFalse(verifyoption1);
			System.out.println("***The option:" + "'" + txtasia + "'" + " is not displayed***");
		}
	}

	@Test(priority = 5)
	public void closewindow() throws Throwable {

		driver.close();
		System.out.println("Window closed");
	}

}
