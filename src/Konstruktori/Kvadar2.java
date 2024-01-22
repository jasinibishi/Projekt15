package Konstruktori;

public class Kvadar2 {
	public static void main(String[] args) {
		Kvadar kv = new Kvadar();
		System.out.println("Volumen" + kv.getVolumen());
		Kvadar kv2 = new Kvadar(2,2,2);
		System.out.println("Volument" + kv2.getVolumen());
}
}