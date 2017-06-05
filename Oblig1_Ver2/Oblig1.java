class Oblig1{
	public static void main(String[] args) {
		
		Regneklynge flusterCluck = new Regneklynge(12);

		
		for (int teller = 0; teller < 650; teller ++){
			Node nyNode = new Node(64, 8, 2.6, 8 ,2.6 );
			flusterCluck.sett_inn_node(nyNode);
		}

		for (int i = 0; i < 16 ; i++){
			Node minNode = new Node (1024, 8 , 2.3, 8 , 2.3 ); 
			flusterCluck.sett_inn_node(minNode);
		}

		

		
		System.out.println(flusterCluck.regneFLOPS_i_Klyngen() + " MegaHertz.");
		System.out.println( "Noder med minst 32 GB minne "+flusterCluck.noderMedPaakrevdMinne(32));
		System.out.println("Noder med minst 64 GB minne "+ flusterCluck.noderMedPaakrevdMinne(64));
		System.out.println("Noder med minst 128 GB minne " +flusterCluck.noderMedPaakrevdMinne(128));
		System.out.println("Antall rack " + Rack.antallID);



	}
}