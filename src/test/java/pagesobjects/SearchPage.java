package pagesobjects;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SearchPage {

	private WebDriver driver;

	@FindBy(how = How.XPATH, using = "/html/body/div/div/div/div/div/ul/li/div/div/h5/a")
	private List<WebElement> resultados;

	public SearchPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
		this.driver = driver;
	}

	public boolean validarResultado(String termoDaBusca) {
		for (int i = 0; i < resultados.size(); i++) {
			String result = resultados.get(i).getText().toLowerCase();
			if (result.contains(termoDaBusca)) {
				return true;
			}
		}
		return false;
	}
}
