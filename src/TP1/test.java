package TP1;

public class test {
	public static void main(String [] args) {
		Date d = new Date(22,10,2021);
		Etudiant e = new Etudiant ("samer","taieb",d);
		Etudiant e2 = new Etudiant ("marwa","taieb",15,10,2021);
		e.Affichage();
		e2.Affichage();
	}

}
