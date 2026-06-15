package B2026_J08;

public class Trandafir extends DecoratorBuchet{

	public Trandafir(Florarie buchet) {
		super(buchet);
		
	}
	
	public String descriere()
	{
		return buchet.descriere() + ", cu trandafir ";
	}
	
	public double pret()
	{
		return buchet.pret() + 15;
				
	}

}

