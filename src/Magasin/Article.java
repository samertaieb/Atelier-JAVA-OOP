package Magasin;

public abstract class Article {
	
	String nom;
	String fournisseur;
	Double prixAchat;
	Double prixVente;
	
	
	
	public Article( Double PA,Double PV,String n, String f ) {
		this.prixAchat=PA;
		this.prixVente=PV;
		this.nom=n;
		this.fournisseur=f;
	}
	public void Affichage() {
		System.out.println("");
	}
	public void calculerRendement(){
	}

}
