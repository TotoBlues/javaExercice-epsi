
public class Qcm extends Examen{
	private static int _nbQuestions;
	
	public Qcm(int nbQuestions) {
		_nbQuestions = nbQuestions;
	}
	
	public void	setReponsesCorrectes(int nbReponsesCorrect) {
		super.setNote(nbReponsesCorrect * 20 / _nbQuestions);
	}
}