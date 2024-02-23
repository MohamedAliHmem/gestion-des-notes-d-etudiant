package tp1;

import java.util.Comparator;

public class MoyenneComparator implements Comparator<Etudiant>{

	
	@Override
	public int compare(Etudiant e1, Etudiant e2) {
		return Double.compare(e1.getValue(), e2.getValue());
	}

}

