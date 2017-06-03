import java.util.Iterator; 

class StatiskTabell<T> implements Tabell<T>{
	private int kapasitet;
	private T[] tabell;

	StatiskTabell(int lengde){
		tabell = (T[]) new Object[lengde];
		kapasitet = lengde;
	}

	public int storrelse(){
		int antall = 0; 
		for (int i = 0; tabell[i] != null ; i++){
			antall++;
		}
		return antall;
	}
	/**
	* Sjekker om tabellen er tom
	* @return om tabellen er tom
	*/
		public boolean erTom(){
			return (tabell[0] == null);
		}
		/**
	* Setter inn et element i tabellen
	* @param element elementet som settes inn
	* @throws FullTabellUnntak hvis tabellen allerede er full
	*/
	public void settInn(T element) throws FullTabellUnntak{
		if (storrelse() == kapasitet){
			throw new FullTabellUnntak(storrelse());
		}
		else (tabell[storrelse()]) = element;
		
	}
	/**
	* Henter (uten aa fjerne) et element fra tabellen
	* @param plass plassen i tabellen som det hentes fra
	* @return elementet paa plassen
	* @throws UgyldigPlassUnntak hvis plassen ikke er en gyldig
	*indeks i arrayet eller plassen
	*ikke inneholder noe element
	*/
	public T hentFraPlass(int plass) throws UgyldigPlassUnntak {
		return tabell[plass];
	}

	public Iterator<T> iterator(){
		return new StatiskTabellIterator();
	}

	private class StatiskTabellIterator implements Iterator<T>{
	  private int iteratorTeller = 0;

	//hvis OBlig7 tryner; sjekk denne!!!
	  public boolean hasNext(){
	    return iteratorTeller < kapasitet;
	  }
	  @SuppressWarnings("unchecked")
	  public T next(){
	    return (T)tabell[iteratorTeller++];
	  }
	  public void remove(){
	  }
	}
	
}