package Constants;



import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.By;


public class Search {

    private WebDriver driver;
    public Search(WebDriver driver) {
        this.driver = driver;
    }
    
    /**
     * Elements identification for flow of the exercise and you can see the code more organized
     * 
     * Example: searchbox.sendkeys();
     * 
     * @return
     */
    public WebElement searchbox() {
        return driver.findElement(By.name("q"));
    }
    
    public WebElement Searchgoogle() {
        return driver.findElement(By.name("btnK"));
    }

    public WebElement clickout() {
        return driver.findElement(By.cssSelector("body > div.L3eUgb > div.o3j99.LLD4me.yr19Zb.LS8OJ > div > img"));
    }

    public WebElement clicklink() {
        return driver.findElement(By.partialLinkText("https://www.focusservices.com"));
    }
   
    public WebElement allpage() {
        return driver.findElement(By.id("rcnt"));
    }
    
    public WebElement nowhiring() {
        return driver.findElement(By.cssSelector("#text-4 > div > p > a > span"));
    }
    public WebElement location() {
        return driver.findElement(By.cssSelector("#menu-item-4726 > a > span.avia-menu-text"));
    }
    public WebElement urllocation() {
        return driver.findElement(By.xpath("//*[@id=\"av-tab-section-1\"]/div/div[1]/a[1]/span[2]/span"));
    }
    public WebElement centralamerica() {
        return driver.findElement(By.cssSelector("#av-tab-section-1 > div > div.av-tab-section-tab-title-container.avia-tab-title-padding-small > a:nth-child(2) > span.av-tab-section-image"));
    }
    public WebElement txtsvnc() {
        return driver.findElement(By.cssSelector("#av-tab-section-1 > div > div.av-tab-section-inner-container.avia-section-default > div.av-layout-tab.av-animation-delay-container.avia-builder-el-68.el_after_av_tab_sub_section.el_before_av_tab_sub_section.av-active-tab-content > div > div > section > div > h2"));
    }
    
    public WebElement asia() {
        return driver.findElement(By.xpath("//*[@id=\"av-tab-section-1\"]/div/div[1]/a[3]/span[1]"));
    }
    
    public WebElement txtphil() {
        return driver.findElement(By.cssSelector("#av-tab-section-1 > div > div.av-tab-section-inner-container.avia-section-default > div.av-layout-tab.av-animation-delay-container.avia-builder-el-85.el_after_av_tab_sub_section.avia-builder-el-last.av-active-tab-content > div > div > div.flex_column.av_one_half.flex_column_div.av-zero-column-padding.first.avia-builder-el-88.el_after_av_hr.el_before_av_one_half > section > div > h3 > b"));
    }
    
}

