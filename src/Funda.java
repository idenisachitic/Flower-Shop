package B2026_J08;

public class Funda extends DecoratorBuchet{

	public Funda(Florarie buchet) {
		super(buchet);
	}
	
	public String descriere()
	{
		return buchet.descriere() + ", cu fundita ";
	}
	
	public double pret()
	{
		return buchet.pret() + 20;
				
	}
	

}
