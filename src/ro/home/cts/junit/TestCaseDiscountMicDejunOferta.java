package ro.home.cts.junit;

import ro.home.cts.build.Oferta;
import junit.framework.TestCase;

public class TestCaseDiscountMicDejunOferta extends TestCase {

	Oferta oferta=new Oferta();
	
	public TestCaseDiscountMicDejunOferta(String name) {
		super(name);
	}

	
	public void testDiscountMicDejunValoriNormale(){
		int nrStele=1;
		double pretMdj=10;
		
		double pret_redus=oferta.discountMicDejun(nrStele, pretMdj);
		assertEquals("Valori normale!",9.5,pret_redus);
	}
	
	public void testDiscountMicDejunValoriNormale2(){
		int nrStele=5;
		double pretMdj=10;
		
		double pret_redus=oferta.discountMicDejun(nrStele, pretMdj);
		assertEquals("Valori normale!",9.0,pret_redus);
	}
	
	public void testDiscountMicDejunValoriNormale3(){
		int nrStele=2;
		double pretMdj=10;
		
		double pret_redus=oferta.discountMicDejun(nrStele, pretMdj);
		assertEquals("Valori normale!",9.5,pret_redus);
	}
	
	public void testDiscountMicDejunValoriNormale4(){
		int nrStele=4;
		double pretMdj=10;
		
		double pret_redus=oferta.discountMicDejun(nrStele, pretMdj);
		assertEquals("Valori normale!",9.0,pret_redus);
	}
	
	public void testDiscountMicDejunValoriNule(){
		int nrStele=0;
		double pretMdj=0;
		try{
			oferta.discountMicDejun(nrStele, pretMdj);
			fail("Valori nule!");
		}catch(Exception ex){
			
		}
	}
	
	
	public void testDiscountMicDejunValoareNulaStele(){
		int nrStele=0;
		double pretMdj=6;
		try{
			oferta.discountMicDejun(nrStele, pretMdj);
			fail("Numarul de stele null!");
		}catch(Exception ex){
			
		}
	}
	
	public void testDiscountMicDejunValoareNulaPret(){
		int nrStele=4;
		double pretMdj=0;
		try{
			oferta.discountMicDejun(nrStele, pretMdj);
			fail("Pretul este null!");
		}catch(Exception ex){
			
		}
	}
	
	public void testDiscountMicDejunValoareNegativaStele(){
		int nrStele=-5;
		double pretMdj=6;
		try{
			oferta.discountMicDejun(nrStele, pretMdj);
			fail("Numarul de stele negativ!");
		}catch(Exception ex){
			
		}
	}
	
	
	public void testDiscountMicDejunValoareNegativaPret(){
		int nrStele=5;
		double pretMdj=-10;
		try{
			oferta.discountMicDejun(nrStele, pretMdj);
			fail("Pret negativ!");
		}catch(Exception ex){
			
		}
	}
	
	
	public void testDiscountMicDejunValoareMaximaStele(){
		int nrStele=6;
		double pretMdj=6;
		try{
			oferta.discountMicDejun(nrStele, pretMdj);
			fail("Numarul de stele negativ!");
		}catch(Exception ex){
			
		}
	}
	
	//Valoare maxima pentru pret este 44 euro
	public void testDiscountMicDejunValoareMaximaPret(){
		int nrStele=4;
		double pretMdj=51;
		try{
			oferta.discountMicDejun(nrStele, pretMdj);
			fail("Numarul de stele negativ!");
		}catch(Exception ex){
			
		}
	}
	//Valoare minima pentru pret este 5 euro
	public void testDiscountMicDejunValoareMinimaPret(){
		int nrStele=4;
		double pretMdj=4;
		try{
			oferta.discountMicDejun(nrStele, pretMdj);
			fail("Numarul de stele negativ!");
		}catch(Exception ex){
			
		}
	}
	
	
}
