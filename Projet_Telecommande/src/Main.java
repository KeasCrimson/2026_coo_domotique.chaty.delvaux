import thermos.Thermostat;

public class Main {

	public static void main(String args[])
	{
		Telecommande t=new Telecommande();
		
		
		Lampe l1=new Lampe("Lampe1");
		t.ajouterAppareil(l1);
		
		Hifi h1 = new Hifi();
		t.ajouterAppareil(h1);

		Cheminee ch1 = new Cheminee();
		AdapterCheminee ad1 = new AdapterCheminee(ch1);
		t.ajouterAppareil(ad1);
		
		TelecommandeGraphique tg=new TelecommandeGraphique(t);
		

		
	}
	
}
