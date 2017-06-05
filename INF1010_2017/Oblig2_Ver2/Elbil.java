class Elbil extends Bil implements skrivInfo{

	private int kWh;
	Elbil(String skilt, int kWh){
		super(skilt);
		this.kWh = kWh;
	}

	public void skrivInfo(){
		System.out.println("Nummer: " +skilt +"\n" +
		"Batteri: " + kWh );
	}

}