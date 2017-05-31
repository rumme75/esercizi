package it.isosistemi.shapes.test;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import it.isosistemi.shapes.Canvas;
import it.isosistemi.shapes.Cerchio;
import it.isosistemi.shapes.Cuadrato;
import it.isosistemi.shapes.Rettangolo;
import it.isosistemi.shapes.Triangolo;

public class ShapesTest {
	
	private Canvas c;
	private Rettangolo r;
	private Cerchio ce;
	private Cuadrato q;
	private Triangolo t;
	
	@Before
	public void Setup(){
		
		int altezza = 4;
		int larghezza = 5;
		int latoq = 6;
		int radius = 5;
		int base = 2;

		// Creo un canvas e una forma
		  c = new Canvas();
		  r = new Rettangolo(altezza,larghezza);
		  ce = new Cerchio(radius);
		  q = new Cuadrato (latoq);
		  t = new Triangolo (base, altezza);
	}

	@Test
	public void shouldAddShapeToCanvas() {
		
		
		//Voglio aggiungere una forma al canvas
		c.add(r);
		c.add(ce);
		c.add(q);
		
		// Verifico che il canvas contiene una forma
		assertEquals("Ci sono 3 forme", 3, c.size());
	}
	
	@Test
	public void shouldCalculateAreaOnShape() {
		
		int areaR = r.calcolaarea();
		assertTrue("L'area del rettangolo non è nulla", areaR>0);
		
		int areaC = ce.calcolaarea();
		assertTrue("L'area del cerchio non non è nulla", areaC>0);

		
		int areaQ = q.calcolaarea();
		assertTrue("L'area quadrato non è nulla", areaQ>0);

	}
	
	@Test
	public void shouldCalculateCanvasArea() {
		//Voglio calcolare l'area totale
		c.add(r);
		c.add(ce);
		c.add(q);
		c.add(t);
	
		int areatotale = c.CalcolaAreaTotale();
		
		assertTrue("L'area totale è positiva", areatotale > 0);
		
	}
		
}
