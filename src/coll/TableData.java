package coll;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TableData {

	WebDriver dr;

	int no_of_coll= 3;   // on site no of column displayed in one row

	@Test
	public void t1() {

		dr= new ChromeDriver();
		dr.get("https://www.w3schools.com/html/html_tables.asp");

		WebElement table= dr.findElement(By.xpath("//table[@id=\"customers\"]")) ;

		List<WebElement> tab_Data= table.findElements(By.tagName("td"));

		int total_data_block=tab_Data.size();
		System.out.println("size is :: "+ total_data_block);

		int col_count = 0;
		for(WebElement each : tab_Data) {
			
			JavascriptExecutor js = ((JavascriptExecutor)dr);
			js.executeScript("arguments[0].scrollIntoView(true);", each);
			
			String data_of_table= each.getText();
			System.out.print(data_of_table);
			System.out.print(" 				");
			col_count ++;
			
			if(col_count == 3) {
				System.out.println(" ");
				col_count= 0;
			}
			
		}		
	}	
}
