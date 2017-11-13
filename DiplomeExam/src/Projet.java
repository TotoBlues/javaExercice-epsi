
public class Projet extends Examen{
	public void setNote(int oral, int ecrit) {
		int note = oral + ecrit;
		super.setNote(note);
	}
}
