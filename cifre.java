package lab5;

public class cifre {
	public static void main(String args[]){
		double broj=10000+Math.random()*90000;
		System.out.println("Nasumicni broj je: " + (int) broj);
		int cifra;
		System.out.println("Cifre nasiumicnog broja: ");
		for(int brojac=0; brojac<5; brojac++)
		{
			cifra=(int)broj%10;
			broj=broj/10;
			System.out.println(cifra);
		}
	}

}
