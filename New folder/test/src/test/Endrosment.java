package test;

import java.util.List;

import org.apache.http.impl.SocketHttpServerConnection;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class Endrosment {


	


	public static void main(String[] args) {
		
		By Endorsement_Grid= By.xpath("//div[5]/form[3]/axis-card/div/table/tbody");
		By ToolTipContainer=By.xpath(".//tooltipcontainer/div");
		By ChangeOrder_ToolTip=By.xpath(".//dynamic-component/div/h3");
		By OrderNumberTextField=By.xpath("(.//dynamic-component//div[1])[2]//input");
		By SaveOrederNumberBtn=By.xpath("(.//dynamic-component//div[1])[3]/button[2]");
		By CancleOrederNumberBtn=By.xpath(".//dynamic-component//div[1])[3]/button[1]");
		By IndexDropDown=By.xpath("(.//dynamic-component//div[1])[2]//axis-dropdown-list/li/a");
		String path="H:/drivers/";
		String url="http://uiux.commercial.aig.net/aiquic/index";
		 String oldSequenceNum;
		 String oldAliasNumber;

System.setProperty("webdriver.gecko.driver", path+"geckodriver.exe");
WebDriver driver=new FirefoxDriver();
driver.get(url);

driver.findElement(By.xpath(".//*[text()='Endorsements']")).click();

WebElement endorsementTable = driver.findElement(Endorsement_Grid);
List<WebElement> rows = endorsementTable.findElements(By.tagName("tr"));
int noOfRows = rows.size();
System.out.println(noOfRows);

for (int rowNum=0;rowNum<noOfRows; rowNum++) {
		
	List<WebElement> cells = rows.get(rowNum).findElements(By.tagName("td"));
	int colmn=cells.size();
	System.out.println(colmn);
	for(int clmn=0;clmn<colmn;clmn++)
	{
		 oldSequenceNum=cells.get(6).getText();
		 cells.get(2).click();
	    System.out.println(oldSequenceNum+"/n" );
		cells.get(0).click();
	    driver.findElement(OrderNumberTextField).click();
	    driver.findElement(IndexDropDown).click();
	   WebElement elem=driver.findElement(IndexDropDown);
	     Select se =new Select(elem);
	    se.selectByIndex(2);
		
		    // driver.findElement(OrderNumberTextField).sendKeys("2");
              driver.findElement(SaveOrederNumberBtn).click();
          
	    break;
		}
	break;
	//System.out.println(rowNum);
	}
       }
}

