package it.isosistemi.shapes;

/**
 * @author Corsi
 * @version 1.0
 * @created 30-mag-2017 16.16.05
 */
public class Cerchio implements Forma {

	private int raggio;

	public Cerchio(){

	}

	public Cerchio(int radius) {
		// TODO Auto-generated constructor stub
		this.raggio = radius;
	}

	public void finalize() throws Throwable {

	}

	public int calcolaperimetro(){
		return 0;
	}

	public int calcolaarea() {
		// TODO Auto-generated method stub
		return this.raggio*this.raggio*3;
	}

}