package ro.home.cts.junit;



import ro.home.cts.build.Oferta;
import junit.framework.TestCase;

public class TestCaseCostMicDejunOferta extends TestCase {

	Oferta oferta=new Oferta();
	
	public TestCaseCostMicDejunOferta(String name) {
		super(name);
	}

	public void testMetodaValoriNormale(){
		int nrZile=5;
		double pretMdj=20;
		double cost=oferta.costMicDejun(nrZile, pretMdj);
		assertEquals("Valori normale cost!",100.0,cost);
	}
	
	
	public void testMetodaValoriNuleZile(){
		int nrZile=0;
		double pretMdj=10;
		try{
			oferta.costMicDejun(nrZile, pretMdj);
			fail("Nr zile are valoare nula!");
		}catch(Exception ex){
			
		}
		
	}
	
	public void testMetodaValoriNegativeZile(){
		int nrZile=-7;
		double pretMdj=10;
		try{
			oferta.costMicDejun(nrZile, pretMdj);
			fail("Nr zile are valoare negativa!");
		}catch(Exception ex){
			
		}
		
	}
	
	//Numarul maxim de zile pentru sejur este 8,pentru city brak 4 si pentru circuit 16.
	public void testMetodaValoareMaximaZile(){
		int nrZile=19;
		double pretMdj=15;
		try{
			oferta.costMicDejun(nrZile, pretMdj);
			fail("Nr zile are valoare prea mare!");
		}catch(Exception ex){
		}	
	}
	
	
	
	public void testMetodaValoareNulaPret(){
		int nrZile=19;
		double pretMdj=0.0;
		try{
			oferta.costMicDejun(nrZile, pretMdj);
			fail("Pretul are valoare nula!");
		}catch(Exception ex){
			
		}
		
	}
	
	public void testMetodaValoareNegativaPret(){
		int nrZile=19;
		double pretMdj=-80.0;
		try{
			oferta.costMicDejun(nrZile, pretMdj);
			fail("Pretul are vaoare negativa!");
		}catch(Exception ex){
			
		}
	}
	
	//Pretul maxim poate fi 20 
	public void testMetodaValoareMaximaPret(){
		int nrZile=4;
		double pretMdj=80;
		try{
			oferta.costMicDejun(nrZile, pretMdj);
			fail("Pret prea mare!");
		}catch(Exception ex){
		}	
	}
	
}