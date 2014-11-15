package lab5;

public class VolumenIPovrsina {
	public static void main(String args[]){
		double broj1=Math.random()*51;
		double broj2=Math.random()*51;
		int broj1Int=(int) broj1;
		int broj2Int=(int) broj2;
		System.out.println("Prvi nasumicni broj je: " + broj1Int);
		System.out.println("Drugi nasumicni broj je: " + broj2Int);
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
