class Rack{
	
	private int StackTeller; 
	private Node[] denne_rackens_noder; 

	public Rack( int antall_noder, int teller){
		this.denne_rackens_noder = new Node[antall_noder];
		StackTeller = teller; 
	}

	public boolean harPlass(){
		boolean ledig = false; 
		for (Node s: denne_rackens_noder){
			
			if (s == null)
			{
				ledig = true;
				break;
			}
			else {
				ledig = false; 
				break;
				}
			}
		return ledig;

	}

	private void sett_node_i_array(Node node){
		for (int i = 0; i > denne_rackens_noder.length; i++ ){
			if (denne_rackens_noder[i]== null){
				denne_rackens_noder[i] = node;
				return;
			}
			else{
				System.out.println("Her har det skjedd en feil. Lag ny rack! ");
			}
			
		}
	}
}