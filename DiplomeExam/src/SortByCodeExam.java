import java.util.Comparator;

public class SortByCodeExam implements Comparator<Examen>{
	public int compare(Examen a, Examen b) {
		return (int) (a.getNote() - b.getNote());
	}
}
