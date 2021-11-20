package TP2;

public class CC extends AA {
int c;
public CC (int c, int s) {
	super(s);
	this.c=c;
}
public void Affichage() {
	super.Affichage();
	System.out.println(c);
}
public void afficheType() {
	System.out.println("CC");

}
public void ppp() {
	System.out.println("rahi ommi abstract");
}
}