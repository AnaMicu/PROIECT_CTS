package ro.home.cts.junit;

import java.text.DecimalFormat;

import ro.home.cts.build.Oferta;
import junit.framework.TestCase;

public class TestCaseDiscountCazareOferta extends TestCase {

	Oferta oferta=new Oferta();
	
	public TestCaseDiscountCazareOferta(String name) {
		super(name);
	}
	
	public void testDiscountCazareValoriNormale(){
		int nrZile=7;
		double pretNoapte=20.0;
		double discount=oferta.discountCazare(nrZile, pretNoapte);
		assertEquals("Valori normale!",7.0,discount);
	}
	
	public void testDiscountCazareValoriAnormale(){
		int nrZile=0;
		double pretNoapte=0;
		try{
			oferta.discountCazare(nrZile, pretNoapte);
			fail("Valori nule!");
		}catch(Exception e){
			
		}
	}
	
	public void testDiscountCazareValoriNegativeZile(){
		int nrZile=-5;
		double pretNoapte=20;
		try{
			oferta.discountCazare(nrZile, pretNoapte);
			fail("Valori negative zile!");
		}catch(Exception e){
			
		}
	}
	
	public void testDiscountCazareValoriMaximeZile(){
		int nrZile=15;
		double pretNoapte=20;
		try{
			oferta.discountCazare(nrZile, pretNoapte);
			fail("Numar prea mare de zile!");
		}catch(Exception e){
			
		}
	}

	
	public void testDiscountCazareValoriNegativePret(){
		int nrZile=7;
		double pretNoapte=-45;
		try{
			oferta.discountCazare(nrZile, pretNoapte);
			fail("Pretul negativ!");
		}catch(Exception e){
			
		}
	}
	//Minim 20 euro
	public void testDiscountCazareValoriMinimePret(){
		int nrZile=7;
		double pretNoapte=15;
		try{
			oferta.discountCazare(nrZile, pretNoapte);
			fail("Pretul sub limita!");
		}catch(Exception e){
			
		}
	}
	
	//Maxim 250 euro
		public void testDiscountCazareValoriMaximePret(){
			int nrZile=7;
			double pretNoapte=300;
			try{
				oferta.discountCazare(nrZile, pretNoapte);
				fail("Pretul peste limita!");
			}catch(Exception e){
				
			}
		}
	
		public void testDiscountCazareValoriIntreZile(){
			int nrZile=10;
			double pretNoapte=25;
			double discount=oferta.discountCazare(nrZile, pretNoapte);
			assertEquals("Valori normale!",12.5,discount);
			
		}
}
