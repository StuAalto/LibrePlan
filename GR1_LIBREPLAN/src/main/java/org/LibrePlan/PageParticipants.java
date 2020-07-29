package org.LibrePlan;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class PageParticipants extends BandeauMenu {

	static Logger logger = LoggerFactory.getLogger(PageTypesDAvancement.class);
	Actions action;

	// WEBELEMENTS
	// Titres
	@FindBy(xpath = "//*[text()='Liste des participants']")
	private WebElement titre_participants;

	@FindBy(xpath = "//td[@class='z-caption-l' and contains(.,'Créer')]")
	private WebElement titre_creer_participant;

	@FindBy(xpath = "//span[@class='z-tab-text' and contains(.,'Données personnelles')]")
	private WebElement titre_onglet_donnees_persos;

	@FindBy(xpath = "//span[text()='Données de base']")
	private WebElement titre_bloc_donnees_de_base;

	// Tableau
	@FindBy(xpath = "//div[@class='z-column-cnt' and contains(.,'Surnom')]")
	private WebElement colonne_surnom;

	@FindBy(xpath = "//div[@class='z-column-cnt' and contains(.,'Prénom')]")
	private WebElement colonne_prenom;

	@FindBy(xpath = "//div[@class='z-column-cnt' and contains(.,'ID')]")
	private WebElement colonne_id;

	@FindBy(xpath = "//div[@class='z-column-cnt' and contains(.,'Code')]")
	private WebElement colonne_code;

	@FindBy(xpath = "//div[@class='z-column-cnt' and contains(.,'En file')]")
	private WebElement colonne_enFile;

	@FindBy(xpath = "//div[@class='z-column-cnt' and contains(.,'Opérations')]")
	private WebElement colonne_operations;

	// Formulaires
	@FindBy(xpath = "//table[@class='filtering-area z-hbox']/tbody/tr/td/table/tbody/tr/td[3]/span/i/input")
	private WebElement champ_rechercher;

	@FindBy(xpath = "//input[@class='z-textbox' and contains(@style,'200')]")
	private WebElement champ_details_perso;

	// Boutons & icônes
	@FindBy(xpath = "//table[@class='filtering-area z-hbox']/tbody/tr/td/table/tbody/tr/td[3]/span/i/i")
	private WebElement icone_rechercher;

	@FindBy(xpath = "//td[@class='z-caption-l' and contains(.,'options')]")
	private WebElement bouton_options;

	@FindBy(xpath = "//td[@class='z-button-cm' and contains(.,'Filtre')]")
	private WebElement bouton_filtres;

	@FindBy(xpath = "//div/span/table/tbody/tr/td[text()='Créer']")
	private WebElement bouton_creer;

	// Page Créer un participant
	// Champs
	@FindBy(xpath = "//input[@style='width:350px;' and @disabled]")
	private WebElement champ_code;

	@FindBy(xpath = "//table/tbody[2]/tr[2]/td[2]/div/input[contains(@style,'500')]")
	private WebElement champ_prenom;

	@FindBy(xpath = "//table/tbody[2]/tr[4]/td[2]/div/input[contains(@style,'500')")
	private WebElement champ_nom;

	@FindBy(xpath = "//table/tbody[2]/tr[5]/td[2]/div/input[contains(@class,'textbox')]")
	private WebElement champ_id;

	@FindBy(xpath = "//div/select[contains(@style,'200')]")
	private WebElement menu_type;

	// Boutons et checkboxes
	@FindBy(xpath = "//span[@class='z-checkbox']/input[@type='checkbox']/following-sibling::label[contains(.,'le code')]/ancestor::div[contains(@style,'1272')]")
	private WebElement checkbox_generer_code;

	// METHODES
	// Méthodes de clics sur boutons
	public void clicCreer() {
		bouton_creer.click();
	}
}
