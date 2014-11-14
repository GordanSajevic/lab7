package lab5;

public class kvadratIKrug {
	public static void main(String[] args) {

		double broj=7;

		double povrsinaKvadrata=broj*broj;

		double povrsinaKruga=broj*broj*Math.PI;

		int kvadratUKrug = (int) povrsinaKruga/(int) povrsinaKvadrata;

		double visinaValjka = 0.5 + Math.random()*37.2;

		double zapreminaValjka =  visinaValjka * povrsinaKruga;

		System.out.println("Povrsina kvadrata je: " + povrsinaKvadrata);

		System.out.println("Povrsina kruga je: " + povrsinaKruga);

		System.out.println("Povrsina kvadrata stane u povrsinu kruga " + kvadratUKrug + " puta.");

		System.out.println("Zapremina valjka je: " + zapreminaValjka);

	}
}
