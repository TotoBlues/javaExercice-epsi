package cesar;

public class AlgoCesar {
	public String encrypte(String s) {
	    char[] valeur = s.toCharArray();
	    for (int i = 0; i < s.length(); i++) {
	    	if (valeur[i] >= 'a' && valeur[i] <= 'z')
	    		if ((int) (valeur[i] - 'a') < 3)
	    			valeur[i] = (char) (valeur[i] + 23);
	    		else
	    			valeur[i] = (char) ('a' + (valeur[i] - 'z') + 23 - 1);
	    	else if (valeur[i] >= 'A' && valeur[i] <= 'Z')
	    		if ((int) (valeur[i] - 'A') < 3)
	    			valeur[i] = (char) (valeur[i] + 23);
	    		else
	    			valeur[i] = (char) ('A' + (valeur[i] - 'Z') + 23 - 1);

	    }
	    return (new String(valeur));
	  }
	
	  public static void main(String[] args) {
	    AlgoCesar algoCesar = new AlgoCesar();

	    String resultat = algoCesar.encrypte("");
	    System.out.println(resultat);
	    System.out.println("".equals(resultat));

	    // étape 2
	    resultat = algoCesar.encrypte("az");
	    System.out.println("xw".equals(resultat));

	    // étape 3
	    resultat = algoCesar.encrypte("AZ");
	    System.out.println("XW".equals(resultat));

	    // étape 4
	    resultat = algoCesar.encrypte("1,000.00");
	    System.out.println("1,000.00".equals(resultat));
	    

	    // étape 5
	    String phrase = "In cryptography, a Caesar cipher is one "
	                    + "of the simplest and most widely known "
	                    + "encryption techniques.";
	    resultat = algoCesar.encrypte(phrase);

	    String phraseAttendue = "Fk zovmqldoxmev, x Zxbpxo zfmebo fp lkb "
	                            + "lc qeb pfjmibpq xka jlpq tfabiv hkltk "
	                            + "bkzovmqflk qbzekfnrbp.";
	    System.out.println(phraseAttendue.equals(resultat));
	 }
}
