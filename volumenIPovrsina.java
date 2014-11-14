package lab5;

public class volumenIPovrsina {
	public static void main(String args[]){
		double broj1=Math.random()*51;
		double broj2=Math.random()*51;
		System.out.println("Prvi nasumicni broj je: " + (int) broj1);
		System.out.println("Drugi nasumicni broj je: " + (int) broj2);
		double volumenPiramide=((int)broj1*(int)broj1*(int)broj2)/3;
		double stranicaPiramide=(broj1*Math.sqrt((int)broj1*(int)broj1-((int)broj1*(int)broj1))/4)/2;
		double povrsinaPiramide=(int)broj1*(int)broj1+4*stranicaPiramide;
		System.out.println("Volumen piramide je: " + volumenPiramide + 
				", a povrsina svih stranica i baze piramide je: " + povrsinaPiramide);
		double volumenSfere = (4*(int)broj1*(int)broj1*(int)broj1*Math.PI)/4;
		double povrsinaSfere = 4*(int)broj1*(int)broj1*Math.PI;
	}
}
