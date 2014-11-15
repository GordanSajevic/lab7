package lab5;

public class Kamata {
	public static void main(String[] args) {

		double glavnica = 500;

		double kamata = (Math.random()*16);

		double ukupno=glavnica*(kamata/100)+glavnica;

		System.out.println("Kamata je: " + (int)kamata + "% ,a novac koji mora biti vracen: " + ukupno);

	}
}
