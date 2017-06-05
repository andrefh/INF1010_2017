class Rack{
	
	private int ID; 
	private Node[] denne_rackens_noder; 
	static int antallID = 0; 

	public Rack( int antall_noder){
		this.denne_rackens_noder = new Node[antall_noder];
		ID = antallID;
		antallID++; 
	}

	public boolean harPlass(){
		boolean ledig = false; 
		for (Node s: denne_rackens_noder){
			
			if (s == null)
			{
				ledig = true;
				break;
			}

			}
		return ledig;

	}

	public void sett_node_i_array(Node node){
		for (int i = 0; i < denne_rackens_noder.length; i++ ){
			
			if (denne_rackens_noder[i]== null){
				denne_rackens_noder[i] = node;
				
				return;
			}
			
		}
	}

	public Node[] getDenne_rackens_noder(){
		return denne_rackens_noder;
	}

	public int getAntallID(){
		return (antallID - 1 );
	}
}