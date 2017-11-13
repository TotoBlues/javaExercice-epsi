import java.util.ArrayList;

public class Diplome{
	java.util.List<Examen> listNote = new ArrayList<Examen>();
	private int _moy = -1;
	
	public void setExamen(Examen exam) {
		listNote.add(exam);
	}
	
	public boolean isValide() {
		int i = 0;
		for (Examen l : listNote) {
			_moy += l.getNote();
			i++;
		}
		_moy /= i;
		if (_moy != -1 && _moy > 10) {
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
		diplome.setExamen(examen);
		diplome.setExamen(projet);
		diplome.setExamen(qcm);
		System.out.println(diplome.isValide());
	}
}
