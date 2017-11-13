
public class Qcm extends Examen{
	private int nbQuestions;
	
	public Qcm(int nbQuestion) {
		this.nbQuestions = nbQuestion;
	}
	
	public void	setReponsesCorrectes(int nbReponsesCorrect) {
		super.setNote(nbReponsesCorrect * 20 / nbQuestions);
	}
}