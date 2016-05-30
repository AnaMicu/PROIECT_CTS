package ro.home.cts.junit;

import ro.home.cts.build.Oferta;
import junit.framework.TestCase;

public class TestCaseCostTotalOferta extends TestCase {
	
	Oferta oferta=new Oferta();

	public TestCaseCostTotalOferta(String name) {
		super(name);
	}

	public void testCostTotalOfertaValoriNormale(){
		boolean areMicDejun=true;
		double pretMdj=6.0;
		double pretNoapte=25.0;
		int nrZile=7;
		
		double calcul=oferta.costTotalOferta(areMicDejun, pretMdj, pretNoapte, nrZile);
		assertEquals("Valori normale!!",217.0,calcul);
	}
	
	
	public void testCostTotalFaraMicDejun(){
		boolean areMicDejun=false;
		double pretMdj=6.0;
		double pretNoapte=25.0;
		int nrZile=7;
		try{
			oferta.costTotalOferta(areMicDejun, pretMdj, pretNoapte, nrZile);
			fail("Nu s-a cerut mic dejun!");
			
		}catch(Exception e){
			
		}
	}
	
	
	public void testCostTotalValoriNule(){
		boolean areMicDejun=false;
		double pretMdj=0;
		double pretNoapte=0;
		int nrZile=0;
		try{
			oferta.costTotalOferta(areMicDejun, pretMdj, pretNoapte, nrZile);
			fail("Valori nule!");
			
		}catch(Exception e){
			
		}
	}
	
	
	public void testCostTotalValoriNegativePretMdj(){
		boolean areMicDejun=true;
		double pretMdj=-8;
		double pretNoapte=25;
		int nrZile=5;
		try{
			oferta.costTotalOferta(areMicDejun, pretMdj, pretNoapte, nrZile);
			fail("Pret mic dejun negativ!!");
			
		}catch(Exception e){
			
		}
	}
	
	
	public void testCostTotalValoriNegativePretNoapte(){
		boolean areMicDejun=true;
		double pretMdj=8;
		double pretNoapte=-25;
		int nrZile=5;
		try{
			oferta.costTotalOferta(areMicDejun, pretMdj, pretNoapte, nrZile);
			fail("Pret pe noapte  negativ!!");
			
		}catch(Exception e){
			
		}
	}
	
	
	public void testCostTotalValoriNegativeNrZile(){
		boolean areMicDejun=true;
		double pretMdj=8;
		double pretNoapte=25;
		int nrZile=-5;
		try{
			oferta.costTotalOferta(areMicDejun, pretMdj, pretNoapte, nrZile);
			fail("Numar de zile negativ!!");
			
		}catch(Exception e){
			
		}
	}
	
	//Pretul pentru micul dejun este de minim 5 euro si maxim 15 euro
	public void testCostTotalValoriPesteMaximPretMicDejun(){
		boolean areMicDejun=true;
		double pretMdj=16;
		double pretNoapte=25;
		int nrZile=5;
		try{
			oferta.costTotalOferta(areMicDejun, pretMdj, pretNoapte, nrZile);
			fail("Pret mic dejun peste medie!!");
			
		}catch(Exception e){
			
		}
	}
	
	//Pretul pentru micul dejun este de minim 5 euro si maxim 15 euro
		public void testCostTotalValoriSubMinimPretMicDejun(){
			boolean areMicDejun=true;
			double pretMdj=4;
			double pretNoapte=25;
			int nrZile=5;
			try{
				oferta.costTotalOferta(areMicDejun, pretMdj, pretNoapte, nrZile);
				fail("Pret mic dejun sub medie!!");
				
			}catch(Exception e){
				
			}
		}
	
		//Pretul cazarii pe noapte este de minim 20 euro si maxim 250
		public void testCostTotalValoriPesteMaximPretNoapte(){
			boolean areMicDejun=true;
			double pretMdj=6;
			double pretNoapte=300;
			int nrZile=5;
			try{
				oferta.costTotalOferta(areMicDejun, pretMdj, pretNoapte, nrZile);
				fail("Pret pe noapte peste medie!!");
				
			}catch(Exception e){
				
			}
		}
	

		//Pretul cazarii pe noapte este de minim 20 euro si maxim 250
		public void testCostTotalValoriSubMinimPretNoapte(){
			boolean areMicDejun=true;
			double pretMdj=6;
			double pretNoapte=5;
			int nrZile=5;
			try{
				oferta.costTotalOferta(areMicDejun, pretMdj, pretNoapte, nrZile);
				fail("Pret pe noapte sub medie!!");
				
			}catch(Exception e){
				
			}
		}
		//Numarul de zile de cazare este intre minim 1 zi si maxim 14 zile
		public void testCostTotalValoriPesteMaximZile(){
			boolean areMicDejun=true;
			double pretMdj=6;
			double pretNoapte=20;
			int nrZile=15;
			try{
				oferta.costTotalOferta(areMicDejun, pretMdj, pretNoapte, nrZile);
				fail("Numarul de zile este peste maxim!!");
				
			}catch(Exception e){
				
			}
		}
		
		
}
