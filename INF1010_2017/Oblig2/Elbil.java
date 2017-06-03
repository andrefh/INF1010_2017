public class Elbil extends Bil{
	protected double kwt; 

	public Elbil(String skilt, double kwt){
		super(skilt);
		this.kwt = kwt;
	}
	public void skrivUtInfo(){
    System.out.println(getClass().getName()+": Skiltnummer: "+skilt + "Batteri: "+kwt);
    
  }
}