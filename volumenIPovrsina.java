package lab5;

public class VolumenIPovrsina {
	public static void main(String args[]){
		Scanner unos = new Scanner(System.in);
		System.out.println("Unesite prvi broj: ");
		double broj1 = unos.nextDouble();
		System.out.println("Unesite drugi broj: ");
		double volumenPiramide=((int)broj1*(int)broj1*broj2Int)/3;
		double stranicaPiramide=(broj1*Math.sqrt(broj1Int*broj1Int-(broj1Int*broj1Int))/4)/2;
		double povrsinaPiramide=broj1Int*broj1Int+4*stranicaPiramide;
		System.out.println("Volumen piramide je: " + volumenPiramide + 
				", a povrsina svih stranica i baze piramide je: " + povrsinaPiramide);
		double volumenSfere = (4*broj1Int*broj1Int*broj1Int*Math.PI)/4;
		double povrsinaSfere = 4*broj1Int*broj1Int*Math.PI;
		System.out.println.("Volumen Sfere je :" + volumenSfere + ", a povrsina sfere je: " + povrsinaSfere);
	}
}
