package TP2;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AA[] tab =new AA[10];
		tab[0]=new AA(3);
		tab[1]=new AA(5);
		tab[2]=new BB(1,2);
		tab[3]=new BB(3,4);
		tab[4]=new CC(5,6);
		tab[5]=new CC(7,8);
		tab[6]=new DD(1,2,3);
		tab[7]=new DD(4,5,6);
		tab[8]=new EE(4,5,6);
		tab[9]=new EE(7,8,9);
		for (int i =0;i<10 ;i++) {
			if (tab[i] instanceof CC ) {
			((CC)tab[i]).Affichage();
			tab[i].afficheType();
			tab[i].ppp();
		}}

	}

}
