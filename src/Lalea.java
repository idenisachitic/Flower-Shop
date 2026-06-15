package B2026_J08;

public class Lalea extends DecoratorBuchet{

	public Lalea(Florarie buchet) {
		super(buchet);
	}

	public String descriere()
	{
		return buchet.descriere() + ", cu lalea ";
	}
	
	public double pret()
	{
		return buchet.pret() + 8;
				
	}
}

