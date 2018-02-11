import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public abstract class Examen {
	private LocalDate date;
	private String code; 
	private float note;
	
	public abstract String getAppreciation();
	
	public float getNote() {
		return note;
	}
	
	public void setNote(float note) throws ExamExceptions {
		this.note = note;
	}
	
	public LocalDate getDate() {
		return date;
	}

	public void setDate(LocalDate date) {
		this.date = date;
	}
	
	@Override
	public String toString() throws NullPointerException {
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd MMMM yyyy");

		String toString = String.format("%.2f/20", note);
		toString += " à l'examen du ";
		toString += date.format(formatter);
		return toString;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}
}