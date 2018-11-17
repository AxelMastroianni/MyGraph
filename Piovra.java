import java.util.*;

import it.unibs.fp.mylib.InputDati;
import it.unibs.fp.mylib.Read;
public class Piovra {
	public static void stampaLista(LinkedList<Integer> listaDiInteri) {
		for(int i=0;i<listaDiInteri.size();i++)
			System.out.println(listaDiInteri.get(i));
		System.out.println("--------------------------------");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random r=new Random();
		/*Map<Integer, String> mappa=new HashMap<Integer,String>();
		for(int i=0;i<10;i++)
			mappa.put(i, InputDati.leggiStringaNonVuota("Inserisci una parola: "));
		for(int i=0;i<mappa.size();i++){
			System.out.println(mappa.get(i));
		}*/
		Map<Integer, LinkedList<Integer>> superMappa=new HashMap<Integer, LinkedList<Integer>>();
		for(int i=0;i<10;i++) {
			superMappa.put(i, new LinkedList<>());
			for(int j=0;j<4;j++) {
				superMappa.get(i).add(r.nextInt()%100);
			}
		}
		for(int i=0;i<superMappa.size();i++)
			stampaLista(superMappa.get(i));
		
		Grafo g=new Grafo(7);
		
		g.aggiungiNodo(0);//la partenza
		g.aggiungiNodo(0);
		g.aggiungiNodo(0);
		g.aggiungiNodo(1);
		g.aggiungiNodo(1);
		g.aggiungiNodo(5);
		g.aggiungiNodo(4);
		g.aggiungiNodo(2);
		g.aggiungiNodo(2);
		g.aggiungiNodo(3);
		g.aggiungiNodo(6);
		g.stampaGrafo();
		//Read reader=new Read();
		//reader.explore("./src/PgAr_Map_5.xml");
		

	}

}
