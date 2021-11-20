package Magasin;

public class Primaire extends Article implements vendableKilog  {
	double stock;
	public Primaire( String n, String f,double PA,double PV) {
		super(PA,PV,n,f);
		this.stock=0;
	}
	public void Affichage() {
		super.Affichage();
		System.out.println("");
	}
	public double  AlimentationStock(int qte) {
		this.stock+=qte;
		return this.prixAchat*qte;
	}
	public double Vendre (double qte) {
	
		if(this.stock < qte) 
			this.stock-=qte;
		return qte * prixVente;
		}
	

}
