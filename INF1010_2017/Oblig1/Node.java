public class Node{

	private int minne; 
	
	private Prosessor en;
	private Prosessor to;


	public Node(int minne, double mHz, int kjerner){
		this.minne = minne;
		this.en = new Prosessor(mHz, kjerner);
	}

	public Node(int minne, double mHz, int kjerner, double mHz2, int kjerner2){
		this.minne = minne;
		this.en = new Prosessor (mHz, kjerner);
		this.to = new Prosessor (mHz2, kjerner2);
	}

	public Prosessor getProsessorEn(){
		return en;
	}


	public Prosessor getProsessorTo(){
		return to;
	}

	public boolean harToProsessorer(){
		if (to == null){
			 return true; 
		}
		return false; 
	}

	
}