package ro.home.cts.junit;

import ro.home.cts.build.Oferta;
import junit.framework.TestCase;

public class TestCaseConstructorOferta extends TestCase {
	
	Oferta oferta;

	public TestCaseConstructorOferta(String name) {
		super(name);
	}

	
	public void testConstructorValoriNormale(){
		String hotel="Azur";
		int nrStele=5;
		oferta=new Oferta(hotel, nrStele);
		assertEquals("Verifica hotel!",hotel, oferta.getHotel());
		assertEquals("Verifica numarul de stele!",nrStele, oferta.getNrStele());
	}
	
	
	public void testConstructorValoriAberanteStele(){
		String hotel="Azur";
		int nrStele=0;
		try{
			oferta=new Oferta(hotel, nrStele);
			fail("Numar stele aberant!");
		}catch(Exception ex){
			
		}
	}
	
	public void testConstructorValoriNegativeStele(){
		String hotel="Azur";
		int nrStele=-5;
		try{
			oferta=new Oferta(hotel, nrStele);
			fail("Numar stele negativ!");
		}catch(Exception ex){
			
		}
	}
	

	public void testConstructorValoriPreaMariStele(){
		String hotel="Azur";
		int nrStele=6;
		try{
			oferta=new Oferta(hotel, nrStele);
			fail("Numar stele prea mare!");
		}catch(Exception ex){
			
		}
	}
	
	
	
	public void testConstructorValoriNuleHotel(){
		String hotel=null;
		int nrStele=4;
		try{
			oferta=new Oferta(hotel, nrStele);
			fail("Valori nule hotel!");
		}catch(Exception ex){
			
		}
	}
	
	public void testConstructorEmptyHotel(){
		String hotel="";
		int nrStele=4;
		try{
			oferta=new Oferta(hotel, nrStele);
			fail("Input gol!");
		}catch(Exception ex){
			
		}
		
	}
	
	
}
