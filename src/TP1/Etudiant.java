package TP1;

public class Etudiant {
	String nom;
	String prenom;
	Date dateNaissance;
	
public  Etudiant(String n , String p ,Date d) {
	nom = n;
	prenom = p;
	dateNaissance = d ;
			
	
}
public  Etudiant(Date d) {
	
	dateNaissance = d ;
	nom = null;
	
			
	
}
public  Etudiant(String n ) {
	nom = n;
	

			
	
}
public Etudiant(String n , String p , int j , int m , int a) {
	nom = n;
	prenom = p;
	dateNaissance = new Date(j,m,a) ;
}



public void Affichage () {
	this.dateNaissance.affichage();
	System.out.println(nom+"/"+prenom);
}
}
