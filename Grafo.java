import java.util.*;

import it.unibs.fp.mylib.InputDati;
public class Grafo {
	
	private int numeroNodi=0;
	private Map<Integer, LinkedList<Nodo>> grafo=new HashMap<Integer, LinkedList<Nodo>>();
	private LinkedList<Integer> giaAggiunti=new LinkedList<Integer>();
	Random r=new Random();
	
	public int getNumeroNodi() {
		return numeroNodi;
	}

	public void setNumeroNodi(int numeroNodi) {
		this.numeroNodi = numeroNodi;
	}

	public Map<Integer, LinkedList<Nodo>> getGrafo() {
		return grafo;
	}

	public void setGrafo(Map<Integer, LinkedList<Nodo>> grafo) {
		this.grafo = grafo;
	}

	public LinkedList<Integer> getGiaAggiunti() {
		return giaAggiunti;
	}

	public void setGiaAggiunti(LinkedList<Integer> giaAggiunti) {
		this.giaAggiunti = giaAggiunti;
	}

	public Grafo(int numeroNodi) {
		this.numeroNodi=numeroNodi;
		for(int i=0;i<numeroNodi;i++) {
			grafo.put(i, new LinkedList<>());
		}
	}
	public boolean presenzaNodo(int numeroNodo) {
		for(int i=0;i<grafo.size();i++)
			if(i==numeroNodo)
				return true;
		return false;
	}
	public Nodo creaNodo() {
		return new Nodo(InputDati.leggiIntero("Numero nodo: "),
				Math.abs(r.nextInt()%100));
	}
	public void aggiungiNodo(int indice) {
		if(presenzaNodo(indice))
			grafo.get(indice).add(creaNodo());
		else
			System.out.println("Nodo non presente");
	}
	
	
	public void stampaGrafo() {
		for(int i=0;i<grafo.size();i++) {
			System.out.println("Da "+i+" a:");
			for(int j=0;j<grafo.get(i).size();j++)
				System.out.println(grafo.get(i).get(j).getNumero()+" con peso: "+
			grafo.get(i).get(j).getPeso());
		}
	}
	
	

}
