package org.LibrePlan;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PageFeuillesDeTemps {

	@FindBy(xpath = "//td[text()='Nouvelle feuille de temps']")
	WebElement bouton_cliquable_nouvelle_feuille_de_temps;

	public PageFormulaireDeCreation clicNouvelleFeuilleTemps(WebDriver driver) {
		bouton_cliquable_nouvelle_feuille_de_temps.click();
		return PageFactory.initElements(driver, PageFormulaireDeCreation.class);

	}
}
 