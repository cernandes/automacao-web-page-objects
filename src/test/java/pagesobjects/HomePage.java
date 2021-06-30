package pagesobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
	
	private WebDriver driver;

	@FindBy(how = How.CSS, using = "#search_query_top")
	private WebElement barraDePesquisa;

	@FindBy(how = How.CSS, using = "#searchbox > button")
	private WebElement botaoPesquisar;

	public HomePage(WebDriver driver) {
		PageFactory.initElements(driver, this);
		this.driver = driver;
	}

	public void fazerPesquisa(String termoDaBusca) {
		termoDaBusca = termoDaBusca.toLowerCase();
		barraDePesquisa.sendKeys(termoDaBusca);
		botaoPesquisar.click();
	}
}
