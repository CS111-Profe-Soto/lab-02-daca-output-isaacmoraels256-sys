/**
 * Program description. Demonstrate an understanding of basic variables and output applied to DACA article
 * @author Isaac Morales
 */
public class Main
{
	public static void main(String[] args)
	{
		//DECLARATION + INITIALIZATION SECTION
		String surname, givenName, category, cardNum, birthCountry, termsAndConditions, USCIS,
				dateofbirth, sex, Validfrom, cardExpires;
		
		//INPUT SECTION
		surname = "SPECIMEN";
		givenName = "TEST V";
		category = "C09";
		cardNum = "SRC0000000725";
		birthCountry = "Ethiopia";
		termsAndConditions = "None";
		USCIS = "000-000-725";
		dateofbirth = "01 JAN 1920";
		sex = "M";
		Validfrom = "01/01/80";
		cardExpires = "05/10/11";

		// N/A
		
		//CALCULATION SECTION
		
		//OUTPUT SECTION
		System.out.println("╔══════════════════════════════════════════════════════════════════════");
		System.out.println("║         UNITED STATES OF AMERICA");
		System.out.println("║                                  EMPLOYMENT AUTHORIZATION CARD");
		System.out.println("║                       Surname");
		System.out.println("║                       "+ surname + " ");
		System.out.println("║  .----.    .----.     Given Name");
		System.out.println("║ (   ^  \\  /  ^   )    "+ givenName +" ");
		System.out.println("║        |  |           USCIS#         Category   Card#");
		System.out.println("║       _/  \\_          "+ USCIS +"    "+ category + "        "+ cardNum +"");
		System.out.println("║      (_    _)         Country of Birth");
		System.out.println("║   ,    `--`    ,      "+ birthCountry +" ");
		System.out.println("║   \\'-.______.-'/      Terms and Conditions");
		System.out.println("║    \\          /       "+ termsAndConditions +" ");
		System.out.println("║     '.--..--.'        Date of Birth   Sex");
		System.out.println("║       `\"\"\"\"\"`         "+ dateofbirth +"     "+ sex +"");
		System.out.println("║                       Valid From:     "+ Validfrom +"");
		System.out.println("║                       Card Expires:   "+ cardExpires +"");
		System.out.println("║ ascii art by: jgs     NOT VALID FOR REENTRY TO U.S.");
		System.out.println("╚══════════════════════════════════════════════════════════════════════");
		//ascii art credit: http://www.oocities.org/spunk1111/bodypart.htm
	}
}
