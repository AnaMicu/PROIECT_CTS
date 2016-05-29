package ro.home.cts.junit;


import ro.home.cts.build.Oferta;
import junit.framework.TestCase;

public class TestCaseSetHotelOferta extends TestCase {

	Oferta oferta;
	
	public TestCaseSetHotelOferta(String name) {
		super(name);
	}
	
	protected void setUp() throws Exception {
		super.setUp();
		
		oferta=new Oferta("Hercule", 4);
	}

	protected void tearDown() throws Exception {
		super.tearDown();
	    oferta=null;
		
	}
	
	public void testHotelValoriNormale(){
		String hotel="Azur";
		oferta.setHotel(hotel);
		assertEquals("Verificare setHorel cu valori normale!",hotel, oferta.getHotel());	
	}
	
	public void testHotelEmpty(){
		String hotel="";
		try{
			oferta.setHotel(hotel);
			fail("Input gol!");
		}catch(Exception e){
			
		}
	}

}
