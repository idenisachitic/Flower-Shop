package B2026_J08;

public class Crizantema extends DecoratorBuchet{

	public Crizantema(Florarie buchet) {
		super(buchet);
	}
	
	public String descriere()
	{
		return buchet.descriere() + ", cu crizantema ";
	}
	
	public double pret()
	{
		return buchet.pret() + 12;
				
	}

}