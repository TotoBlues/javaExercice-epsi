package phrase_exercice;

public class Phrase {
	private String _phrase = "";
	private String _separateur = " ";
	
	public void ajouter(String... s) {
		for (String valeur : s) {
			_phrase += valeur + _separateur;
		}
	}
	
	public void ajouter(String s, int nb) {
		for (int i = 0; i < nb; i++) {
			_phrase += s + _separateur;
		}
	}
	
	public void setSeparateur(String s) {
		_separateur = s;
	}
	
	public void setSeparateur(char s) {
		_separateur = String.valueOf(s);
	}

	public int getNbLettres() {
		char[] valeurs = _phrase.toCharArray();
		int nb = 0;
		for (int i = 0; i < _phrase.length(); i++) {
			if (valeurs[i] >= 'A' && valeurs[i] <= 'Z' ||	
					valeurs[i] >= 'a' && valeurs[i] <= 'z')
				nb++;
		}
		return (nb);
	}
	
	public String toString() {
		_phrase = _phrase.substring(0, _phrase.length() - _separateur.length());
		return (_phrase + '.');
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
		phrase.setSeparateur(' fjeioz ');
		phrase.ajouter("toujours", "et", "encore");
	
		phrase.ajouter("lol")
		phrase.setSeparateur(" bite ");
		System.out.println(phrase);
		System.out.println(phrase.getNbLettres());
	}

}