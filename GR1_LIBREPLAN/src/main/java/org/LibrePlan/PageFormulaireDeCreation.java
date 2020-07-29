package org.LibrePlan;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.util.Calendar;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class PageFormulaireDeCreation {

	static Logger logger = LoggerFactory.getLogger(TestCreerFeuilleTempsRHT01.class);

	WebDriver driver;

	@FindBy(xpath = "//td[@class='z-button-cm' and contains(.,'Ajouter une ligne')]")
	WebElement bouton_ajouter_une_ligne;

	public void ajouterUneLigne() {

		bouton_ajouter_une_ligne.click();

	}

	@FindBy(xpath = "//table[@style='table-layout: fixed;']//tbody//tr//td//div//i[@class='z-datebox']//input[@size='11']")
	WebElement champ_date;

	public void saisirDate() throws Exception {

		Calendar calendar = Calendar.getInstance();
		calendar.add(Calendar.DATE, 0);
		SimpleDateFormat sdf = new SimpleDateFormat("dd MMM yyyy");
		System.out.println("Aujourd'hui, nous sommes le: " + sdf.format(calendar.getTime()));
		String String_date_format = sdf.format(calendar.getTime()).toString();

		String nouvelle_date = String_date_format;
		Calendar c = Calendar.getInstance();
		c.setTime(sdf.parse(nouvelle_date));
		c.add(Calendar.DATE, 3); // number of days to add
		System.out.println(nouvelle_date = sdf.format(c.getTime()));

		champ_date.clear();
		champ_date.sendKeys(nouvelle_date);

	}

	@FindBy(xpath = "//input[@class='z-combobox-inp' and @style='width: 178px;']")
	WebElement champ_ressource;

	@FindBy(xpath = "//i[@class='z-combobox' and @style='width:200px;']//i[@class='z-combobox-btn']")
	WebElement fleche_cliquable_champ_ressource;

	// ATTENTION PREREQUIS AVOIR CREE UNE RESSOURCE - SINON A AJOUTER

	// public void selectionnerUneRessource() {
	//
	// // fleche_cliquable_champ_ressource.click();
	//
	// Select select_ressource = new Select(champ_ressource);
	// select_ressource.getFirstSelectedOption();
	//
	// // Attention une ressource doit avoir été créée au préalable !!!!!
	//
	// }

	@FindBy(xpath = "//div[@class='listWorkReportLines z-grid']//i[@class='z-bandbox-btn' and @style='user-select: none;']")
	WebElement bouton_loupe_tache;

	@FindBy(xpath = "//tr[@class='z-listitem z-listitem-seld']//div[@class='z-listcell-cnt z-overflow-hidden']")
	WebElement champ_selection_tache;

	// public void selectionnerProjet() {
	// bouton_loupe_tache.click();
	//
	// Select select_projet = new Select(champ_selection_tache);
	// System.out.println(select_projet.getOptions());
	//
	// }

	@FindBy(xpath = "//input[@class='z-textbox']")
	WebElement champ_heure;

	@FindBy(xpath = "//div[@class='z-errbox-right z-errbox-close']")
	WebElement croix_fermer_popup;

	@FindBy(xpath = "//td[6][@class='z-row-inner']//input[@type='checkbox']")
	WebElement case_a_cocher_realise;

	@FindBy(xpath = "//div[@class='z-errbox-right z-errbox-close']")
	WebElement zone_croix;

	@FindBy(xpath = "//div[@class='z-errbox-right z-errbox-close-over']")
	WebElement croix_fermer;

	public void modifierChampHeure() {
		champ_heure.clear();
		champ_heure.sendKeys("8");

	}
	//
	// Actions fermer_popup = new Actions(driver);
	// fermer_popup.moveToElement(zone_croix).build().perform();
	// croix_fermer.click();
	//
	// }

	// Ajouter méthode séléectionner type d 'heure

	public void cocherCaseRealise() {

		case_a_cocher_realise.click();
	}

}
