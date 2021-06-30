package tests;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import pagesobjects.HomePage;
import pagesobjects.SearchPage;
import setup.Driver;

public class SearchTest {
	private WebDriver driver;

	@Before
	public void criarDriver() {
		Driver wDriver = new Driver();
		driver = wDriver.WebDriver();
	}

	@Test
	public void pesquisarProdutoValido() {
		String termoDaBusca = "Dress";
		termoDaBusca = termoDaBusca.toLowerCase();
		
		HomePage homePage = new HomePage(driver);
		homePage.fazerPesquisa(termoDaBusca);

		SearchPage searchPage = new SearchPage(driver);
		boolean result = searchPage.validarResultado(termoDaBusca);
		Assert.assertTrue(result);
	}

	@After
	public void fecharDriver() {
		driver.close();
		driver.quit();
	}
}
