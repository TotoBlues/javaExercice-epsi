
public class Qcm extends Examen{
	private int nbQuestions;
	
	public Qcm(int nbQuestion) {
		this.nbQuestions = nbQuestion;
	}
	
	public void	setReponsesCorrectes(int nbReponsesCorrect) {
		super.setNote(nbReponsesCorrect * 20 / nbQuestions);
	}
	
	public void setAppreciation() {
		int note = super.getNote();
		if (note < 8) {
			super.setAppreciation("insuffisant");
		}
		else if (note >= 8 && note < 12) {
			super.setAppreciation("passable");
		}
		else if (note >= 12 && note <= 15) {
			super.setAppreciation("bien");
		}
		else if (note >= 16) {
			super.setAppreciation("très bien");
		}
	}
}