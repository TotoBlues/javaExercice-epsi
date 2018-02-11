
public class Qcm extends Controle {
	private int nbQuestions;
	
	public Qcm(int nbQuestion) throws ExamExceptions {
		if (nbQuestion <= 0)
			throw new ExamExceptions("Nb Questions invalid");
		else
			this.nbQuestions = nbQuestion;
	}
	
	public void	setReponsesCorrectes(float nbReponsesCorrect) throws ExamExceptions {
		if (nbReponsesCorrect <= 0 || nbReponsesCorrect > nbQuestions)
			throw new ExamExceptions("Nb Correct Questions invalid");
		super.setNote(nbReponsesCorrect * 20 / nbQuestions);
	}
	
	public void setAppreciation() {
		if (super.getNote() < 8) {
			super.setAppreciation("insuffisant");
		}
		else if (super.getNote() >= 8 && super.getNote() < 12) {
			super.setAppreciation("passable");
		}
		else if (super.getNote() >= 12 && super.getNote() <= 15) {
			super.setAppreciation("bien");
		}
		else if (super.getNote() >= 16) {
			super.setAppreciation("très bien");
		}
	}
}