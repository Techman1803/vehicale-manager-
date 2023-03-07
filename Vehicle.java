public class Vehicle{
	
	public static void main(String[] args)
	{
		PetrolEngine pe = new PetrolEngine();
		pe.Start();
		DieselEngine de = new DieselEngine();
		de.Start();
		Electricengine EE = new Electricengine();
		EE.start();
				
	}
}