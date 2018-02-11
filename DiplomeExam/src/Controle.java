
public class Controle extends Examen {
	private String app;
	
	public void setNote(float note) throws ExamExceptions {
		if (note < 0 || note > 20)
			throw new ExamExceptions("Note Projet invalid");
		super.setNote(note);
	}
	
	public String getAppreciation() {
		return app;
	}
	
	public void setAppreciation(String app) {
		this.app = app;
	}
}
