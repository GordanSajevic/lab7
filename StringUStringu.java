package projekat;

public class StringUStringu {

	public static void main(String[] args) {
		Scanner unos = new Scanner(System.in);
		System.out.println("Unesite prvi string: ");
		String prviString = unos.next();
		System.out.println("Unesite drugi string: ");
		String drugiString = unos.next();
		int prvaDuzina=prviString.length();
		int drugaDuzina=drugiString.length();
		int brojac_slova=0;
		for (int brojac=0; brojac<prvaDuzina; brojac++)
		{
			String slovo;
			slovo=prviString.substring(brojac,brojac+1);
			for (int brojac2=0; brojac2<drugaDuzina; brojac2++)
			{
				if (slovo.equals(drugiString.substring(brojac2, brojac2+1)))
				{
					brojac_slova++;
					if (brojac_slova==prvaDuzina)
					{
						System.out.println("True");
					}
				}
			}
		}	
		
			
		
	}

}
