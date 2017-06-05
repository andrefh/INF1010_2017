class Lastebil extends Fossilbil implements skrivInfo{

private int maxKg; 

Lestebil(String skilt, double co2, int maxKg ){
	super(skilt, co2);
	this.maxKg = maxKg;
}	
}