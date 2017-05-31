package it.isosistemi.shapes;

/**
 * @author Corsi
 * @version 1.0
 * @created 30-mag-2017 16.15.55
 */
public class Rettangolo implements Forma{

	private int altezza;
	private int largezza;

	public Rettangolo(){

	}

	public Rettangolo(int altezza2, int larghezza) {
		// TODO Auto-generated constructor stub
		this.altezza = altezza2;
		this.largezza = larghezza;
	}

	public void finalize() throws Throwable {

	}

	public int calcolaarea(){
		return this.altezza*this.largezza;
	}

	public int calcolaperimetro(){
		return 0;
	}

}