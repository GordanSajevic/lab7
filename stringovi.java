package projekat;

public class stringovi {
	public static void main(String[] args) {
		String jmbg="1608990190145";
		String danRodjenja=jmbg.substring(0,2);
		String mjesecRodjenja=jmbg.substring(2, 4);
		String godinaRodjenja=jmbg.substring(4, 7);
		String regija=jmbg.substring(7, 9);
		String spol=jmbg.substring(9,11);
		System.out.println("Datum rođenja: " + danRodjenja + "." + mjesecRodjenja + ".1" + godinaRodjenja);
		if (regija.equals("19"))
		{
			System.out.println("Regija: Zenica");
		}
		if (spol.equals("01"))
		{
			System.out.println("Spol: Muški (valjda)");
		}
		
	}
}
