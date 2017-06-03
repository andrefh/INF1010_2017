public class Rack{
	private Node[] denneRackensNoder;
	private int id;
	static int antallID = 0;  


	public Rack(int antall){
		denneRackensNoder = new Node[antall];
		antallID ++;
		this.id = antallID;

	}
	public Node[] getDenneRackensNoder(){
		return denneRackensNoder;
	}

	public int getID(){
		return id;
	}
}