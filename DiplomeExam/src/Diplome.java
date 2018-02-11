import java.time.LocalDate;
import java.time.Month;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Diplome {
	private List<Examen> listNote = new ArrayList<Examen>();
	private int moy = -1;
	
	public List<Examen> getExamens(String compareBy) {
		if (compareBy.equals("note"))
			Collections.sort(listNote, new SortByCodeExam());
			afficherDetailDesNotes();
			return listNote;
	}
	
	public void afficherDetailDesNotes() {
		for (Examen exam : listNote) {
			System.out.print(String.format("%.2f", exam.getNote()));
			System.out.print(", ");
			System.out.println(exam.getAppreciation());
		}
	}
	
	public  MentionNote getMention() {
		if (moy >= 10 && moy <= 12)
			return MentionNote.PASSABLE;
		else if (moy > 12 && moy <= 14)
			return MentionNote.BIEN;
		else if (moy > 14 && moy <= 16)
			return (MentionNote.TRESBIEN);
		else if (moy > 16)
			return (MentionNote.EXCELLENT);
		return MentionNote.RATE;
	}
	
	public void delivrer() throws ExamExceptions {
		throw new ExamExceptions("Moyenne general inferieur 10");
	}
	
	public void setExamen(Examen exam) {
		listNote.add(exam);
	}

	public boolean isValide() throws ExamExceptions {
		int i = 0;
		for (Examen l : listNote) {
			moy += l.getNote();
			i++;
		}
		moy /= i;
		if (moy != -1 && moy > 10) {
			System.out.println(this.getMention());
			return true;
		}
		else {
			delivrer();
			return false;
		}
	}
	
	public static void main(String [] args) {
		Diplome diplome = new Diplome();
		Controle control = new Controle();
		Projet projet = new Projet();
		try {
			Qcm qcm = new Qcm(22);
		
			control.setDate(LocalDate.of(2017, Month.APRIL, 6));
			projet.setDate(LocalDate.of(2017, Month.APRIL, 7));
			qcm.setDate(LocalDate.of(2017, Month.APRIL, 8));
			control.setNote((float) 11.5);
			projet.setNote((float) 9.3, 3);
			qcm.setReponsesCorrectes(18);
			control.setCode("JAVA-LANG001");
			projet.setCode("PHP-PRJ");
			qcm.setCode("C-QCM");
			projet.setAppreciation("très bien", "bien");
			qcm.setAppreciation();
			control.setAppreciation("très bien");
			diplome.setExamen(projet);			
			diplome.setExamen(control);
			diplome.setExamen(qcm);
			diplome.afficherDetailDesNotes();
			System.out.println("\n\n\n");
			diplome.getExamens("note");
			System.out.println("\n\n\n");
			System.out.println(control);
			System.out.println(projet);
			System.out.println(qcm);
			System.out.println(diplome.isValide());
		}
		catch(ExamExceptions e) {
			System.err.println("Error : " + e.getMessage());
			System.exit(2);
		}
	}
}
