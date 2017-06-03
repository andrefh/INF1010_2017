public class Personbil extends Fossilbil{
	protected int sitteplasser;

	public Personbil(String skilt, double co2, int sitteplasser){
		super(skilt, co2);
		this.sitteplasser = sitteplasser;
	} 

	public void skrivUtInfo(){
    System.out.println( getClass().getName()+ ":\nSkiltnummer:"+skilt + "\nPlasser: "+ sitteplasser);
    
  }
}