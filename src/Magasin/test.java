package Magasin;

public class test {
	public static void main(String [] args) {
		Electro[] tableauElectro =new Electro[3];
		Primaire[] tableauPrimaire=new Primaire[2];
		magasin m =new magasin(tableauPrimaire,tableauElectro);
		tableauElectro[0]=new Electro("micro-onde","LG",300.00,500.00);
		tableauElectro[1]=new Electro("TV","Samsung",1200.00,1899);
		tableauElectro[2]=new Electro("refrigérateur","mont-balanc",600,899);
		tableauPrimaire[2]=new Primaire("tomate","MCSB",1.200,1.800);
		tableauPrimaire[2]=new Primaire("pomme de terre","MCSB",0.700,1.000);
		for (int i=0;i<3;i++) {
			
		}
	}
	public  test() {
		// TODO Auto-generated constructor stub
	}

}
