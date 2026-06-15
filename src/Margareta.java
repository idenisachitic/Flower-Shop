package B2026_J08;

public class Margareta extends DecoratorBuchet{

	public Margareta(Florarie buchet) {
		super(buchet);
		
	}
	
	public String descriere()
	{
		return buchet.descriere() + ", cu margareta ";
	}
	
	public double pret()
	{
		return buchet.pret() + 7;
				
	}

}