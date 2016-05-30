package ro.home.cts.junit;

import ro.home.cts.TipPachet;
import ro.home.cts.build.Oferta;
import junit.framework.TestCase;

public class TestCaseOfertaZileOferta extends TestCase {
	
	Oferta oferta=new Oferta();

	public TestCaseOfertaZileOferta(String name) {
		super(name);
	}
	
	
	public void testOfertaCazareValoriNormale(){
		int nrZile=7;
		TipPachet tip=TipPachet.SEJUR;
		int ofertaAddZile=oferta.ofertaCazare(nrZile,tip);
		assertEquals("Valori normale metoda ofertaCazare()",8,ofertaAddZile);
	}
//Sejur->minim 7 zile->add o zi gratis
	public void testOfertaCazareValoriDiferiteZile(){
		int nrZile=14;
		TipPachet tip=TipPachet.SEJUR;
		try{
			oferta.ofertaCazare(nrZile, tip);
			fail("Numar zile nu corespunde cu oferta!");
		}catch(Exception e){
			
		}
	}
	
	public void testOfertaCazareValoriDifertieTip(){
		int nrZile=7;
		TipPachet tip=TipPachet.CITYBREAK;
		try{
			oferta.ofertaCazare(nrZile, tip);
			fail("Tipul de vacanta nu corespunde ofertei!");
		}catch(Exception e){
			
		}
	}
	
	
	
	
}
