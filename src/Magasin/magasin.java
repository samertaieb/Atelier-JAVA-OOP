package Magasin;

public class magasin {
	double Depenses;
	double Revenus;
	Primaire[] ProduitsPrimaire;
	Electro[]  ProduitsElectro;
	
	
	public magasin(Primaire[] PP,Electro[] PE) {
		// TODO Auto-generated constructor stub
		this.Depenses=0;
		this.Revenus=0;
		this.ProduitsPrimaire=PP;
		this.ProduitsElectro=PE;
		
	}
	public void  descriptionEtatmagasin() {
		System.out.println("les depenses totals de ce magasin"+ Depenses);
		System.out.println("les revenus totals de ce magasin"+ Revenus);
		
	}
	public double calculateurRendement() {
		return this.Revenus-this.Depenses;
		
	}
}
