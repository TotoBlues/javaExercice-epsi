
public class Projet extends Controle {
	public void setNote(float oral, float ecrit) throws ExamExceptions {
		if (oral < 0 || oral > 10 && ecrit < 0 || ecrit > 10)
			throw new ExamExceptions("Note Projet invalid");
		super.setNote(oral + ecrit);
	}

	public void setAppreciation(String appOral, String appEcrite) {
		super.setAppreciation("Appreciation Orale : " + appOral + ". Appreciation Ecrite : " + appEcrite + ".");		
	}

}
