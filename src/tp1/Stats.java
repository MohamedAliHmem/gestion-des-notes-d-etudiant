package tp1;

import java.util.ArrayList;
import java.util.Collections;

public class Stats {
	
	public static double calculMoy(Etudiant e) {
		return e.getValue();
	}
	
	public static double calculMax(Etudiant e) {
		if(e.notes.isEmpty())
			return 0;
		else
			return Collections.max(e.notes).note;
	}
	
	public static double calculMin(Etudiant e) {
		if(e.notes.isEmpty())
			return 0;
		else
			return Collections.min(e.notes).note;
	}
	
	public static int meilleurEtudiant (ArrayList<Etudiant> e) {
		
		if(e.isEmpty()) {
			return 0;
		}else {
			return Collections.max(e).matricule;
		}
	}
	
	public static int mauvaiseEtudiant (ArrayList<Etudiant> e) {
		if(e.isEmpty()) {
			return 0;
		}else {
			return Collections.min(e).matricule;
		}
	}
	
	public static double moyenneEtudiant(ArrayList<Etudiant> e) {
		double moy=0 ;
		if(e.isEmpty()) {
			return 0;
		}else {
			for(Etudiant etudiant : e) {
				moy += etudiant.getValue();
			}
		}
		return moy/e.size();
	}
	
	public static void main(String[] args) {
		Note n1 = new Note("francais",1);
		Note n2 = new Note("englais",8);
		
		Etudiant e1 = new Etudiant(123,"dali");
		e1.addNote(n1);
		e1.addNote(n2);
		
		
		Note n21 = new Note("francais",16);
		Note n22 = new Note("englais",13);
		
		Etudiant e2 = new Etudiant(124,"ahmed");
		e2.addNote(n21);
		e2.addNote(n22);
		
		
		ArrayList<Etudiant> list = new ArrayList<>();
		list.add(e1);
		list.add(e2);
		
		System.out.println(meilleurEtudiant(list));
	}

}
