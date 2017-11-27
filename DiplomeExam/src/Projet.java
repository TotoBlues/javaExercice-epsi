
public class Projet extends Examen{
	public void setNote(int oral, int ecrit) {
		int note = oral + ecrit;
		super.setNote(note);
	}
	
	public void setAppreciation(String appOral, String appEcrite) {
		super.setAppreciation(new String("Appreciation Orale : " + appOral + ". Appreciation Ecrite : " + appEcrite + "."));
	}
}
