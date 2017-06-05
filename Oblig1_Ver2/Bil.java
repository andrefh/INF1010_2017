class Bil implements skrivInfo{
	protected String skilt;

	Bil(String skilt){
		this.skilt = skilt;
	}

	public void skrivInfo(){
		System.out.println("Nummer: " +skilt);
	}
}