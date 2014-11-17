package projekat;

public class Jmbg {
	
	public static void main(String[] args) {
	Scanner unos=new Scanner(System.in);
	System.out.println("Unesite svoj matični broj: ");
	String jmbg=unos.next();
	String danRodjenja=jmbg.substring(0,2);
	String mjesecRodjenja=jmbg.substring(2, 4);
	String godinaRodjenja=jmbg.substring(4, 7);
	String regija=jmbg.substring(7, 9);
	String spol=jmbg.substring(9,11);
	int intDanRodjenja=Integer.parseInt(danRodjenja);
	int intMjesecRodjenja=Integer.parseInt(mjesecRodjenja);
	int intGodinaRodjenja=Integer.parseInt(godinaRodjenja);
	int intRegija=Integer.parseInt(regija);
	int intSpol=Integer.parseInt(spol);
	if ((intDanRodjenja<=31)&&(intDanRodjenja>0)&&(intMjesecRodjenja<=12)&&(intMjesecRodjenja>0)&&(jmbg.length()<=13))
			{
				System.out.println("Maticni broj je validan.");
			}
	else
		{
			System.out.println("Maticni broj nije validan.");
		}
	}
}
