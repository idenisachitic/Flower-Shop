package B2026_J08;

public class Bujor extends DecoratorBuchet{

	public Bujor(Florarie buchet) {
		super(buchet);
	}
	
	public String descriere()
	{
		return buchet.descriere() + ", cu bujor ";
	}
	
	public double pret()
	{
		return buchet.pret() + 10;
				
	}

}
