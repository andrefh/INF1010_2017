import java.util.Iterator;
import java.util.Collections;

class OrdnetLenkeListe<T extends Comparable & Liste>
{
	//ordnet i stigende rekkefolge
	//det minste elementet forst, storste sist i listen
    
	private Node foran = null;
	private int antNoder; //kan oke naar setter inn og minke naar tar ut
	T data;
	private Node node = new Node(data);
	
	//Beregner antall elementer i listen og returnerer antall
    public int storrelse()
	{
	int antall = 0;
	Node current = foran;
		while(current != null)
		{
			antall++;
			current = current.neste;
		}
		return antall;
	}
	
	//public T ordne()
	//{ 
	//Collection.sort?
	//	return ;
	//}
	
	

    //Sjekker om listen er tom
    //@return om listen er tom
    public boolean erTom()
	{
		if(foran == null)
		{
			return true;
		}
		else
		{
			return false;
		}
		//return foran == 0; et alternativ
	}

    //Setter inn et element i listen
    //@param element elementet som settes inn
   public void settInn(T element)
		{
			Node nyNode = new Node(element);
			nyNode.neste = foran; //sett nestepeker til det samme som foranpeker
			foran = nyNode;//sett foranpeker til ny node
			//hvis listen er tom peker foran paa null
			//da maa vi lage ny node, fungerer både paa node og null
			//siste elementet maa peke paa null
		}
		
    //Fjerner et element fra begynnelsen av listen. 
	//Hvis listen er tom,
    //returneres null.
    //@return elementet
   // public T fjern() //skal ta ut det minste elementet, hodenoden
	//{
	//	Node current = foran;
	//	if (current == null)  
	//	{
	//	return null;
	//	}
	//	else
	//	{
		//element = current;
		//current = null;
	//	}
		//return element;
	//}
	
	int compareTo(T element)
	{
int sammenligne = 0;
T data;

	sammenligne = node.data.compareTo(element); //returnerer: sortere leksikalt hvis Stringobjekt
		if(sammenligne < 0)
		{
		//System.out.println(T.compareTo(element))
			return -1;
		}
		else if(sammenligne > 0)
		{
			return 1;
		}
		else
		{
			return 0;
		}
	}
	
	private class Node 
	{
		T data;
		Node neste;
		
		public Node(T data)
		{
			this.data = data;
		}
	}
}
Mardol Mim
