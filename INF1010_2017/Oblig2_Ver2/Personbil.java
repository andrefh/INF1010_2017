class Personbil extends Fossilbil implements skrivInfo{

	private int antallSeter; 

	Personbil(String skilt, double co2, int antallSeter){
		super(skilt, co2);
		this.antallSeter = antallSeter;
	}
}