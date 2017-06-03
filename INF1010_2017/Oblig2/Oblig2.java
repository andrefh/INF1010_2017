import java.util.*;
import java.io.*;

public class Oblig2{
	public static void main(String[] args) throws IOException{
		ArrayList<Bil> biler = new ArrayList<Bil>();

		if (args.length == 0){
			System.out.println("Du har glemt aa skrive noe filnavn. Proev igjen. ");
			System.exit(1);
		}
		
		File minfil = new File(args [0]);
		Scanner tastatur = new Scanner(minfil);	
		
		try {
			while (tastatur.hasNext()){
			String nylinje = tastatur.next();
			

				if (nylinje.equals("EL")){
					String regnr = tastatur.next(); 
					double kwt = Double.parseDouble(tastatur.next());
					Bil s = new Elbil (regnr, kwt);
					biler.add(s);
					
				}

				if (nylinje.equals("LASTEBIL")){
					String regnr = tastatur.next(); 
					double co2 = Double.parseDouble(tastatur.next());
					double vekt = Double.parseDouble(tastatur.next());
					Bil s = new Lastebil (regnr, co2, vekt);
					biler.add(s);
					
				}

				if (nylinje.equals("PERSONBIL")){
					String regnr = tastatur.next(); 
					double co2 = Double.parseDouble(tastatur.next());
					int plasser = Integer.parseInt(tastatur.next());
					Bil s = new Personbil (regnr, co2, plasser);
					biler.add(s);
					
				}
			}
		}

		catch (NoSuchElementException e) 
		{ 	System.out.println("Filen er tom");
			System.exit(1); } 
		

if (args[1].equals("FOSSIL")){
	for (Bil s : biler){
		if (s instanceof Fossilbil){
			s.skrivUtInfo();
		}
	}
}

if (args[1].equals("EL")){
	for (Bil s : biler){
		if (s instanceof Elbil){
			s.skrivUtInfo();
		}
	}
}

		
		

	
		
	}
}