import java.util.ArrayList;
import java.util.List;

public class Diplome{
	private List<Examen> listNote = new ArrayList<Examen>();
	private int moy = -1;
	
	public void afficherDetailDesNotes() {
		for (Examen exam : listNote) {
			System.out.print(exam.getNote());
			System.out.print(", ");
			System.out.println(exam.getAppreciation());
		}
	}
	
	public void setExamen(Examen exam) {
		listNote.add(exam);
	}

	public boolean isValide() {
		int i = 0;
		for (Examen l : listNote) {
			moy += l.getNote();
			i++;
		}
		moy /= i;
		if (moy != -1 && moy > 10) {
			return true;
		}
		else {
			return false;
		}
	}
	
	public static void main(String [] args) {
		Diplome diplome = new Diplome();
		Examen examen = new Examen();
		Projet projet = new Projet();
		Qcm qcm = new Qcm(22);
		
		examen.setNote(20);
		projet.setNote(9, 6);
		qcm.setNote(20);
		projet.setAppreciation("très bien", "bien");
		qcm.setAppreciation();
		examen.setAppreciation("très bien");
		diplome.setExamen(examen);
		diplome.setExamen(projet);
		diplome.setExamen(qcm);
		diplome.afficherDetailDesNotes();
		System.out.println(diplome.isValide());
	}
}
