package ro.home.cts.junit;

import ro.home.cts.build.Oferta;
import junit.framework.TestCase;

public class TestCaseSetNrSteleOferta extends TestCase {

	Oferta oferta;
	
	public TestCaseSetNrSteleOferta(String name) {
		super(name);
	}

	protected void setUp() throws Exception {
		super.setUp();
		
		oferta=new Oferta("Hercule", 4);
	}
	
	public void testNrSteleValoriNormale(){
		int nrStele=5;
		oferta.setNrStele(nrStele);
		assertEquals("Verificare setNrStele cu valori normale!",nrStele,oferta.getNrStele());
		
	}
	
	public void testNrSteleValoriNule(){
		int nrStele=0;
		try{
			oferta.setNrStele(nrStele);
			fail("Numar invalid!");
		}catch(Exception e){
			
		}
	}
	
	public void testNrSteleValoriNegative(){
		int nrStele=-4;
		try{
			oferta.setNrStele(nrStele);
			fail("Numar egativ!");
		}catch(Exception e){
			
		}
	}
	
	public void testNrSteleValoriPesteLimita(){
		int nrStele=6;
		try{
			oferta.setNrStele(nrStele);
			fail("Numar prea mare!");
		}catch(Exception e){
			
		}
	}
}
