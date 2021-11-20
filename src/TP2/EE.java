package TP2;

public class EE extends BB {
int e;
public EE(int j,int k, int l) {
	super(k,l);
	this.e=j;
}
public void Affichage() {
	super.Affichage();
	System.out.println(e);
}
}
