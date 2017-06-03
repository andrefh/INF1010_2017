public class Lastebil extends Fossilbil{
	
	protected double nyttevekt; 

	public Lastebil(String skilt, double co2, double nyttevekt ){
		super(skilt, co2);
		this.nyttevekt = nyttevekt; 
	}
	public void skrivUtInfo(){
    System.out.println(getClass().getName()+ "\nSkiltnummer:\n "+ skilt + " Vekt: \n"+ nyttevekt);
    
  }
}