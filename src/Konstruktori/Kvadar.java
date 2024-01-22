package Konstruktori;

public class Kvadar {
     int dolzina;
     int visina;
     int sirina;

     public int getVolumen () {
	 return (dolzina *visina* sirina);
	 }
Kvadar(){
	 dolzina = 10;
	 visina = 10;
     sirina = 15;
     }
Kvadar (int d, int v, int s){
	dolzina = d;
	visina = v;
	sirina = s;
}

	}
