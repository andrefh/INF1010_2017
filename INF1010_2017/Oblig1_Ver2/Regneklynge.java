import java.util.ArrayList;

class Regneklynge{
	
	private antallRacks = 0; 
	private int antall_noder_i_rack; 

	private ArrayList<Rack> stacks_i_regneklyngen; 

	public Regneklynge( int antall_noder_i_rack, ArrayList<Rack> nodene_i_regneklyngen) {
		this.antall_noder_i_rack = antall_noder_i_rack;
		stacks_i_regneklyngen = new ArrayList<Rack>(); 

	}

	public void sett_inn_node (Node node){
		if (nodene_i_regneklyngen.isEmpty() ){
			antallRacks ++; 
			Stack nyStack = new Stack(antall_noder_i_rack, antallRacks);
			stacks_i_regneklyngen.add(nyStack);
			stacks_i_regneklyngen.get(0).sett_node_i_array(node); 


			}
		else 
	}

	
	
}