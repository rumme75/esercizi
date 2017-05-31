package it.isosistemi.shapes;

/**
 * @author Corsi
 * @version 1.0
 * @created 30-mag-2017 16.15.49
 */
public class Cuadrato implements Forma{

	private int lato;

	public Cuadrato(){

	}

	public Cuadrato(int latoq) {
		// TODO Auto-generated constructor stub
		this.lato=latoq;
	}

	public void finalize() throws Throwable {

	}

	public int calcolaperimetro(){
		return 0;
	}

	public int calcolaarea() {
		// TODO Auto-generated method stub
		return this.lato*this.lato;
	}

}