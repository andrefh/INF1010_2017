class Node{
	
	
	private int minne; 
	private Prosessor prosessor1 ;  
	private Prosessor prosessor2; 

	public Node( int minne , int kjerner1, double klokkehastighet1 ) {
		prosessor1 = new Prosessor (kjerner1, klokkehastighet1);
		this.minne = minne; 
		prosessor2 = null; 
	}

	
	public Node( int minne , int kjerner1, double klokkehastighet1 , int kjerner2, double klokkehastighet2) {
		prosessor1 = new Prosessor (kjerner1, klokkehastighet1);
		prosessor2 = new Prosessor (kjerner2, klokkehastighet2);
		this.minne = minne; 
		
		
	}

	public boolean harProsessor2(){
		if (prosessor2 == null){
			return false;

		}
		else{
			return true; 
		}
	}

	public Prosessor getProsessor1(){
		return prosessor1;
	}

		public Prosessor getProsessor2(){
		return prosessor2;
	}

	public int getMinne(){
		return minne;
	}

	
}