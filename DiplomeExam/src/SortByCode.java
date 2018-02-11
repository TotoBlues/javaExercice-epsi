import java.util.Comparator;

public class SortByCode implements Comparator<Examen> {
	public boolean compare(Examen a, Examen b) {
		return (a.getCode().equals(b.getCode());
	}
}
