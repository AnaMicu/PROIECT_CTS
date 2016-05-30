package ro.home.cts.junit;

import ro.home.cts.build.Oferta;
import junit.framework.TestCase;

public class TestCaseOfertaMicDejunOferta extends TestCase {
	
	Oferta oferta=new Oferta();

	public TestCaseOfertaMicDejunOferta(String name) {
		super(name);
	}

	public void testOfertaMicDejunValoriNormale(){
		int nrZile=8;
		double pretMdj=11.0;
		double reducere=oferta.ofertaMicDejun(nrZile, pretMdj);
		assertEquals("Valori normale!!!", 0.55,reducere);
	}
	
	public void testOfertaMicDejunValoriNormale2(){
		int nrZile=6;
		double pretMdj=15.0;
		double reducere=oferta.ofertaMicDejun(nrZile, pretMdj);
		assertEquals("Valori normale!!!", 0.3,reducere);
	}
	
	
	public void testOfertaMicDejunValoriAnormale(){
		int nrZile=0;
		double pretMdj=25.0;
		try{
			oferta.ofertaMicDejun(nrZile, pretMdj);
			fail("Numarul de zile are valoare nula!");
			
		}catch(Exception e){
			
		}
	}
	
	public void testOfertaMicDejunValoriNule(){
		int nrZile=0;
		double pret=0.0;
		try{
			oferta.ofertaMicDejun(nrZile, pret);
			fail("Valori nule!");
		}catch(Exception ex){
			
		}
	}
	
	public void testOfertaMicDeJunMaximZile(){
		int nrZile=360;
		double pretMdj=15.0;
		try{
			oferta.ofertaMicDejun(nrZile, pretMdj);
			fail("Numarul de zile are valoare pre mare!");	
		}catch(Exception e){
			
		}
	}
	
	public void testOfertaMicDeJunNegativZile(){
		int nrZile=-1;
		double pretMdj=25.0;
		try{
			oferta.ofertaMicDejun(nrZile, pretMdj);
			fail("Numarul de zile minim!");
			
		}catch(Exception e){
			
		}
	}
	
	//Pret maxim mic dejun 15 euro
	public void testOfertaMicDejunMaximPret(){
		int nrZile=4;
		double pret=55.0;
		try
		{
			oferta.ofertaMicDejun(nrZile, pret);
			fail("Pret preste limita!");
			
		}catch(Exception ex){
			
		}
	}
	
	public void testOfertaMicDejunNegativPret(){
		int nrZile=4;
		double pret=-15.0;
		try
		{
			oferta.ofertaMicDejun(nrZile, pret);
			fail("Pret negativ!");
			
		}catch(Exception ex){
			
		}
	}
	
	//Pret minim mic dejun 5 euro
	public void testOfertaMicDejunMinimPret(){
		int nrZile=4;
		double pret=1.0;
		try
		{
			oferta.ofertaMicDejun(nrZile, pret);
			fail("Pret sub limita!");
			
		}catch(Exception ex){
			
		}
	}
	
	
	
	
	
	
}
