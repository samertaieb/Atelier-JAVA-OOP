package TP1;

public class Date {
int jour;
int mois;
int annee;
public Date (int j , int  m , int a) {
	jour = j;
	mois= m;
	annee =a;
}
public void affichage () {
	System.out.println(jour+"/"+mois+"/"+annee);
}
}
