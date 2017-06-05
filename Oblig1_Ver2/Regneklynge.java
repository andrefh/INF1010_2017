import java.util.ArrayList;

class Regneklynge{
	
	
	private int antall_noder_i_rack; 

	private ArrayList<Rack> racks_i_regneklyngen; 

	public Regneklynge( int antall_noder_i_rack) {
		this.antall_noder_i_rack = antall_noder_i_rack;
		racks_i_regneklyngen = new ArrayList<Rack>(); 

	}

	public Rack ledig_Rack (){
		Rack muligRack = null; 
		for (Rack r : racks_i_regneklyngen){
			if (r.harPlass()){
				muligRack = r;
			}
			
		}
		return muligRack; 

	}

	public void sett_inn_node (Node node){
		Rack nyRack = ledig_Rack(); 


		if (racks_i_regneklyngen.isEmpty() ){ //hvis regneklyngen er tom. Lag ny rack.
			nyRack = new Rack(antall_noder_i_rack);
			racks_i_regneklyngen.add(nyRack);
			}
		
		else if (nyRack == null){
			nyRack = new Rack (antall_noder_i_rack);
			racks_i_regneklyngen.add(nyRack);
			nyRack = ledig_Rack();
		}

		nyRack.sett_node_i_array(node);
	}

	public void printNoder(){
		for (Rack r : racks_i_regneklyngen){
			
			for (Node n : r.getDenne_rackens_noder()){
				
				if (n == null)
					{
						return; 
					}
				else if( n.harProsessor2()){
					
					n.getProsessor1().printInfo();
					System.out.println("\n");
					n.getProsessor2().printInfo();
				}
				else{
					n.getProsessor1().printInfo();
				}
			}
		}
	}

	public float regneFLOPS_i_Klyngen(){
		float FLOPS = 0; 
		for (Rack r: racks_i_regneklyngen){
			for (Node n : r.getDenne_rackens_noder()){
				if (n == null){
					return FLOPS;
				}

				FLOPS = FLOPS + (8*(float)(n.getProsessor1().getAntall_kjerner()) * (float) ((n.getProsessor1().getKlokkehastighet() * 1000000000) ));
				if (n.harProsessor2()){
					FLOPS = FLOPS + (8* (float)(n.getProsessor2().getAntall_kjerner()) * (float ) ((n.getProsessor2().getKlokkehastighet() * 1000000000)));
				}
			}
		}
		return FLOPS;
	}

	public int noderMedPaakrevdMinne (int paakrevdMinne){
		int teller = 0;
		for (Rack r : racks_i_regneklyngen){
			for (Node n : r.getDenne_rackens_noder()){
				if (n == null){
					break;					
				}

				if (n.getMinne() >= paakrevdMinne){
					teller = teller+ 1;
				}
			}
		}
		return teller; 
	}
	
	
}