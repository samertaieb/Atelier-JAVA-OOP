package TP2;

public class DD extends BB {
int d ;
public DD(int g ,int h, int i) {
	super(i,h);
	this.d=g;
}
public void Affichage() {
	super.Affichage();
	System.out.println(d);
}
public void ppp() {
	System.out.println("rahi om ommi abstract");
}
}
