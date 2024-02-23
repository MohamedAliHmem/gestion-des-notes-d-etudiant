package tp1;

import java.util.ArrayList;

public class Etudiant implements Statisticable, Comparable<Etudiant>{
	int matricule;
	String nom;
	ArrayList<Note> notes;
	
	public Etudiant(int matricule, String nom) {
		this.matricule = matricule ;
		this.nom = nom;
		this.notes = new ArrayList<>();
	}
	
	void addNote(Note n) {
		this.notes.add(n);
	}
	
	public double getValue() {
		double somme=0;
		if(this.notes.isEmpty()) {
			return 0;
		}else {
			for(Note n : this.notes) {
				somme += n.note;
			}
		}
		return somme/this.notes.size();
	}


	@Override
	public int compareTo(Etudiant e1) {
		if(e1 == null) {
			return 1;
		}else {
			if(this.getValue() > e1.getValue())
				return 1;
			else if(this.getValue() < e1.getValue())
				return -1;
			else
				return 0;
		}
	}
}
