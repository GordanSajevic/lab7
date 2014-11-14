package lab5;

public class sabiranjeDvaRandomBroja {
	public static void main(String[] args){

		double a1=Math.random();

		double a2=a1*10;

		double a3=Math.round(a2);

		double b1=Math.random();

		double b2=b1*10;

		double b3=Math.round(b2);

		double suma=a3+b3;

		double razlika=a3-b3;

		System.out.println("Zbir je: ");

		System.out.println(suma);

		System.out.println("Razlika je: ");

		System.out.println(razlika);

		}
}
