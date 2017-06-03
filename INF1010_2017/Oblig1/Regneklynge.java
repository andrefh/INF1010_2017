import java.util.*;

public class Regneklynge{

	private ArrayList<Rack> Nodeliste;
	private int antallNoderPrRack; 
	private int noder;

	public Regneklynge( int antallNoderPrRack){
		Nodeliste = new ArrayList<Rack>();
		this.antallNoderPrRack = antallNoderPrRack;
	}

	public double flops(){
		double maxKap = 0;
		for (Rack s : Nodeliste){
			for (int i = 0; i< s.getDenneRackensNoder().length; i++){
				if (s.getDenneRackensNoder()[i] != null){
					maxKap += (s.getDenneRackensNoder()[i].getProsessorEn().getmHz())*(s.getDenneRackensNoder()[i].getProsessorEn().getKjerner())*8*1000000000 ;
						if(s.getDenneRackensNoder()[i].getProsessorTo() != null){
						maxKap += (s.getDenneRackensNoder()[i].getProsessorTo().getmHz())*(s.getDenneRackensNoder()[i].getProsessorTo().getKjerner())*8*1000000000 ;	
						}
					
				}
			}
		}
		return maxKap;
	}

	public void SettInnNode(Node node){
		if (this.Nodeliste.isEmpty()) {
			Rack nyRack = new Rack(antallNoderPrRack);
			Nodeliste.add(nyRack);
			nyRack.getDenneRackensNoder()[0] = node;
			return;
		}

		for (Rack s: Nodeliste){
			for (int i = 0; i< s.getDenneRackensNoder().length; i++){
				if (s.getDenneRackensNoder()[i] == null){
					s.getDenneRackensNoder()[i] = node;
					return;
				}

			}
		}
	Rack nyRack = new Rack(antallNoderPrRack);
	Nodeliste.add(nyRack);
	nyRack.getDenneRackensNoder()[0] = node;
	return;
	
}

	public ArrayList<Rack> getRackliste(){
		return Nodeliste;
	}	

	public void printRackOgNode(){
		for (Rack s: Nodeliste){
			for (int i = 0;  i< s.getDenneRackensNoder().length; i++){
				if( s.getDenneRackensNoder()[i] == null){
					return;
				}
				else {
					if(s.getDenneRackensNoder()[i].harToProsessorer()){

					}
					System.out.println(s.getDenneRackensNoder()[i].getProsessorEn().getmHz());
				}					
				 
			}
		}
	}
}