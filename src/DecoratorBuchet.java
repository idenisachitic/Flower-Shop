package B2026_J08;

public class DecoratorBuchet implements Florarie{
	
	protected Florarie buchet;
	
	public DecoratorBuchet(Florarie buchet)
	{
		this.buchet = buchet;
		
	}

	
	public String descriere() {
		return buchet.descriere();
		
	}


	public double pret() {
		return buchet.pret();
	}

}