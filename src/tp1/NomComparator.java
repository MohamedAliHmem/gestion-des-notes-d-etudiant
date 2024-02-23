package tp1;

import java.util.Comparator;

public class NomComparator implements Comparator<Etudiant>{

	
	@Override
	public int compare(Etudiant e1, Etudiant e2) {
		return e1.nom.compareTo(e2.nom);
	}

}
