package it.isosistemi.shapes;



/**
 * @author Corsi
 * @version 1.0
 * @created 31-mag-2017 10.43.38
 */
public class Triangolo implements Forma {

	private int altezza;
	private int base;

	public Triangolo(){

	}

	public void finalize() throws Throwable {

	}
	
	public Triangolo(int base, int altezza2	) {
		// TODO Auto-generated constructor stub
		this.altezza = altezza2;
		this.base = base;
	}

	public int calcolaarea(){
		return this.base*this.altezza/2;
	}

	public int calcolaperimetro(){
		return 0;
	}

}