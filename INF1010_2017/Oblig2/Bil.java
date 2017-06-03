public class Bil{
	protected String skilt;

	public Bil(String skilt){
		this.skilt = skilt;
	}

	public void skrivUtInfo(){
    System.out.println(getClass().getName()+": Skiltnummer: "+ skilt);
    
  }
}