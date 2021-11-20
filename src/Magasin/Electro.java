package Magasin;

import TP3.Soldable;
import TP3.vendablePiece;

public class Electro extends Article implements Soldable ,vendablePiece {
	int stock;
	public Electro(String n, String f,double PA,double PV) {
		super(PA,PV,n,f);
		this.stock=0;
		// TODO Auto-generated constructor stub
	}
	public void Affichage() {
		super.Affichage();
		System.out.println("");
	}
	public void AlimentationStock() {}
	public double Vendre (int qte) {
		
		if(this.stock < qte) 
			this.stock-=qte;
		return qte * prixVente;
		}
	
	public double lancerSolde (double pourcent) {
		this.prixVente = this.prixVente*pourcent;
		
		return	this.prixVente;
	}
	public double finSolde(double pourcent ) {
		
this.prixVente = this.prixVente/pourcent;
		
		return	this.prixVente;
	}
}
