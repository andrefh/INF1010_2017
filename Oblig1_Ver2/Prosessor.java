class Prosessor{
	
	private int antall_kjerner; 
	private double klokkehastighet; ; //måles i Hz. Del på 1000 for MHz

	public Prosessor(int antall_kjerner, double klokkehastighet){
		this.antall_kjerner = antall_kjerner;
		this.klokkehastighet = klokkehastighet; 
	}

	public void printInfo(){
		System.out.println("Kjerner;" + antall_kjerner + ".\nMhZ: " + klokkehastighet);
	}

	public int getAntall_kjerner(){
		return antall_kjerner;
	}

	public double getKlokkehastighet(){
		return klokkehastighet;
	}

	
}