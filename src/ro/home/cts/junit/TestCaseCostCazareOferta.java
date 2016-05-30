package ro.home.cts.junit;

import ro.home.cts.build.Oferta;
import junit.framework.TestCase;

public class TestCaseCostCazareOferta extends TestCase {

	Oferta oferta=new Oferta();
	
	public TestCaseCostCazareOferta(String name) {
		super(name);
	}

	public void testCostCazareValoriNormale(){
		int nrZile=6;
		double pretNoapte=100;
		double pretCazare=oferta.costCazare(nrZile, pretNoapte);
		assertEquals("Valori normale cost!",600.0,pretCazare);
	}
	
	public void testCostCazareValoriAnormale(){
		int nrZile=0;
		double pretNoapte=0.0;
		try{
			oferta.costCazare(nrZile, pretNoapte);
			fail("Valori nule!");
			
		}catch(Exception ex){
			
		}
	}
	
	public void testCostCazareValoriNegativeZile(){
		int nrZile=-4;
		double pretNoapte=80;
		try{
			oferta.costCazare(nrZile, pretNoapte);
			fail("Numar de zile negativ!");
			
		}catch(Exception ex){
			
		}
	}
	
	public void testCostCazareValoriNegativePret(){
		int nrZile=2;
		double pretNoapte=-80;
		try{
			oferta.costCazare(nrZile, pretNoapte);
			fail("Pret negativ!");
			
		}catch(Exception ex){
			
		}
	}
	
	
	//Numarul maxim de zile este intre 1 si 14.
	public void testCostCazareValoriMariZile(){
		int nrZile=360;
		double pretNoapte=120;
		try{
			oferta.costCazare(nrZile, pretNoapte);
			fail("Numar de zile prea mare!");
		}catch(Exception ex){
			
		}
	}
	
	//Pret minim pe noapte 20 euro
	public void testCostCazareValoriMinimePret(){
		int nrZile=5;
		double pretNoapte=1.0;
		try{
			oferta.costCazare(nrZile, pretNoapte);
			fail("Pret prea mic!");
			
		}catch(Exception e){
			
		}
	}
	
	public void testCostCazareValoareMinimaPret(){
		int nrZile=5;
		double pretNoapte=Double.MAX_VALUE;
		try{
			oferta.costCazare(nrZile, pretNoapte);
			fail("Pret prea mare!");
		}catch(Exception ex){
			
		}
	}
	
	
	
	
}
