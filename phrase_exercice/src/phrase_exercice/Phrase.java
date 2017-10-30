package phrase_exercice;

public class Phrase {
	private String phrase = "";
	private String separateur = " ";
	
	public void ajouter(String... s) {
		for (String valeur : s) {
			phrase += valeur + separateur;
		}
	}
	
	public void ajouter(String s, int nb) {
		for (int i = 0; i < nb; i++) {
			phrase += s + separateur;
		}
	}
	
	public void setSeparateur(String s) {
		separateur = s;
	}
	
	public void setSeparateur(char s) {
		separateur = String.valueOf(s);
	}

	public int getNbLettres() {
		char[] valeurs = phrase.toCharArray();
		int nb = 0;
		for (int i = 0; i < phrase.length(); i++) {
			if (valeurs[i] >= 'A' && valeurs[i] <= 'Z' ||	
					valeurs[i] >= 'a' && valeurs[i] <= 'z')
				nb++;
		}
		return (nb);
	}
	
	public String toString() {
		phrase = phrase.substring(0, phrase.length() - 1);
		return (phrase + ".");
	}

	public static void main(String[] args) {
		Phrase phrase = new Phrase();
		phrase.ajouter("Une");
		phrase.ajouter("classe");
		phrase.ajouter("pour");
		phrase.ajouter("ajouter");
		phrase.ajouter("des mots");
		phrase.setSeparateur(" et encore ");
		phrase.ajouter("des mots", 3);
		phrase.setSeparateur(' ');
		phrase.ajouter("toujours", "et", "encore");
	
		System.out.println(phrase);
		System.out.println(phrase.getNbLettres());
	}

}