package tp1;

public class Note implements Statisticable, Comparable<Note>{
	String nom;
	double note;
	
	public Note(String nom, double note) {
		this.nom = nom;
		this.note = note;
	}
	
	public double getValue() {
		return this.note;
	}

	@Override
	public int compareTo(Note o) {
		// TODO Auto-generated method stub
		return 0;
	}
}
