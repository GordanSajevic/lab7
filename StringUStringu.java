package projekat;

public class stringUStringu {

	public static void main(String[] args) {
		String prviString="haris";
		String drugiString="hahar haris";
		System.out.println(prviString);
		System.out.println(drugiString);
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
