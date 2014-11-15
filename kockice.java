package lab5;

public class Kockice {
	public static void main(String[] args) {

		double kocka1=1+Math.random()*6;

		double kocka2=1+Math.random()*6;

		int kocka1Int=(int)kocka1;

		int kocka2Int=(int)kocka2;

		int suma = kocka1Int + kocka2Int;

		int razlika = kocka1Int - kocka2Int;

		System.out.println("Prva kockica: ");

		System.out.println(kocka1Int);

		System.out.println("Druga kockica: ");

		System.out.println(kocka2Int);

		System.out.println("Suma je: ");

		System.out.println(suma);

		System.out.println("Razlika je: ");

		System.out.println(razlika);

	}



}

