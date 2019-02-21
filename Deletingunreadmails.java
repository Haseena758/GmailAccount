package automation;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.ElementNotVisibleException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Deletingunreadmails {
	private WebDriver w = null;

	public Deletingunreadmails(WebDriver w) {
		this.w = w;

	}

	public void delete() {
		System.out.println("deleting unread mails");
		try {
			List<WebElement> lst = w.findElements(By.xpath("//tr[@class='zA zE']"));
			List<WebElement> lt = w.findElements(By.xpath("//*[@role='checkbox']"));
			for (int i = 1; i <= lt.size(); i++) {
				for (int j = i; j<=lst.size(); j++) {
					
						lt.get(j).click();
				}
				w.findElement(By.xpath("//div[@data-tooltip='Delete']")).click();
			}
		} catch (ElementNotVisibleException ex) {
			System.out.println("no such mails found");
		}
	System.out.println("delete operation is also performed");

	}

}
