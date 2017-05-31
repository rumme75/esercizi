package it.isosistemi.shapes;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Corsi
 * @version 1.0
 * @created 30-mag-2017 16.15.29
 */
public class Canvas {

	//private List<Cerchio> cerchi;
	//private List<Cuadrato> quadrati;
	//private List<Rettangolo> rettangoli;

	private List<Forma> forme;

	public Canvas(){
		
//		rettangoli = new ArrayList();
//		cerchi = new ArrayList();
//		quadrati = new ArrayList();
		forme = new ArrayList();
	}

	public void finalize() throws Throwable {

	}

	public int CalcolaAreaTotale(){
		int areaTotale = 0;
		
/*		for (Rettangolo r: rettangoli){
			areaTotale += r.calcolaarea();
		}
		
		for (Cuadrato q: quadrati){
			areaTotale += q.calcolaarea();
		}
		for (Cerchio ce: cerchi){
			areaTotale += ce.calcolaarea();
		}*/

		for (Forma f: forme){
			areaTotale += f.calcolaarea();
		}
		
		return areaTotale;

	}

	public int CalcolaPerimetro(){
		
		return 0;

	}
	
/*	public void add(Rettangolo r){
		rettangoli.add(r);
	}*/

	public void add(Forma f){
		forme.add(f);
	}
	
	public Object size() {
		// TRestitiuisce il numero di forme contenute dal canvas
	/*	return rettangoli.size() +
				quadrati.size() +
				cerchi.size();*/
		return forme.size();
	}

/*	public void add(Cerchio ce) {
		// TODO Auto-generated method stub
		cerchi.add(ce);
	
	}

	public void add(Cuadrato q) {
		// TODO Auto-generated method stub
		quadrati.add(q);
	}
*/	

}