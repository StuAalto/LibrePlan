package org.LibrePlan;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.TimeZone;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PageProjet {
	WebDriver driver;
	@FindBy(xpath = ("//input[contains(@class,'z-textbox')]"))
	WebElement champ_nom_projet;
	@FindBy(xpath = ("//span[@class='z-checkbox']/input[@type='checkbox'][@checked='checked']"))
	WebElement checkbox_code;
	@FindBy(xpath = ("//td[1]/input[contains(@class,'z-textbox')]"))
	WebElement champ_code_projet;
	@FindBy(xpath = ("//div[@class='z-errbox-right z-errbox-close']"))
	WebElement message_erreur;
	@FindBy(xpath = ("//div[contains(@class,'z-errbox-right z-errbox-close z-errbox-close-over')]"))
	WebElement message_close;
	@FindBy(xpath = ("//tr[@class='z-row z-grid-odd']//i[contains(@class,'z-datebox-btn')]"))
	WebElement btn_date_debut;
	@FindBy(xpath = ("//tr[@class='z-row']//i[contains(@class,'z-datebox-btn')]"))
	WebElement btn_date_echeance;
	@FindBy(xpath = ("//div[1]/i[contains(@class,'z-datebox')]/input[contains(@class,'z-datebox-inp')]"))
	WebElement champ_date_debut;
	@FindBy(xpath = ("//tr[@class='z-row z-row-over']//i[contains(@class,'z-datebox')]/input[contains(@class,'z-datebox-inp')]"))
	WebElement champ_date_echeance;
	@FindBy(xpath = ("//td[.='Accepter']"))
	WebElement btn_accepter;
	@FindBy(xpath = ("//td[.='Détail du projet']"))
	WebElement titre;
	@FindBy(xpath = ("//input[@class='z-textbox z-textbox-disd z-textbox-text-disd'][@disabled='disabled']"))
	WebElement valeur_par_defaut;

	private static final DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");

	public void saisirNomProjet(String n) {
		SocleTechnique.renseignerChamps(champ_nom_projet, n);
		champ_nom_projet.isDisplayed();

	}

	public boolean isCheckboxSelectionne() {

		return checkbox_code.isSelected();
	}

	public boolean deselectionnecheckbox(int i) {
		if (checkbox_code.isSelected()) {
			checkbox_code.click();
		}
		return !(checkbox_code.isSelected());
	}

	public void saisirCodeProjet(String c) {
		champ_code_projet.click();
		champ_code_projet.clear();
		champ_code_projet.sendKeys(c);

	}

	public void selectDateDebut(WebDriver driver) throws ParseException {

		btn_date_debut.click();
		Calendar calendar = Calendar.getInstance();
		calendar.add(Calendar.DATE, 5);
		SimpleDateFormat sdf = new SimpleDateFormat("dd MMM yyyy");
		String String_date_format = sdf.format(calendar.getTime()).toString();
		String nouvelle_date_debut = String_date_format;
		Calendar c = Calendar.getInstance();
		c.setTime(sdf.parse(nouvelle_date_debut));
		System.out.println(nouvelle_date_debut = sdf.format(c.getTime()));
		champ_date_debut.clear();
		champ_date_debut.sendKeys(nouvelle_date_debut);

	}

	public void selectDateEcheance(WebDriver driver) throws ParseException {
		btn_date_echeance.click();
		Calendar calendar = Calendar.getInstance();
		calendar.add(Calendar.DATE, 15);
		SimpleDateFormat sdf = new SimpleDateFormat("dd MMM yyyy");
		String String_date_format = sdf.format(calendar.getTime()).toString();
		String nouvelle_date_echeance = String_date_format;
		Calendar c = Calendar.getInstance();
		c.setTime(sdf.parse(nouvelle_date_echeance));
		System.out.println(nouvelle_date_echeance = sdf.format(c.getTime()));
		champ_date_echeance.clear();
		champ_date_echeance.sendKeys(nouvelle_date_echeance);

	}

	public boolean accepter() {

		btn_accepter.click();
		return titre.isDisplayed();
	}

	public boolean isDisabled() {
		if (valeur_par_defaut.isEnabled()) {
			// valeur_par_defaut.click();
		}
		return !(valeur_par_defaut.isEnabled());

	}

}
