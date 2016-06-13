package ro.home.cts.facade;

import ro.home.cts.Circuit;
import ro.home.cts.CityBreak;
import ro.home.cts.Sejur;

public class GeneratorOferta {
	private Sejur sejur;
	private CityBreak citybreak;
	private Circuit circuit;
	
	public static final double PRET_MDJ = 5;
	
	public GeneratorOferta() {
		sejur=new Sejur(7, 150);
		citybreak=new CityBreak(3, 75);
		circuit=new Circuit(14, 50);
	}
	
	public void costTotalSejur(){
		System.out.println(sejur.costPachet() + PRET_MDJ);
	}
	
   public void costTotalCityBreak(){
	   System.out.println(citybreak.costPachet() + PRET_MDJ);
	}
	
   public void costTotalCircuit(){
	   System.out.println(circuit.costPachet() + PRET_MDJ);
	}
	
   public void costTotalVacanta(){
	   System.out.println(sejur.costPachet() + PRET_MDJ);
	   System.out.println(citybreak.costPachet() + PRET_MDJ);
	   System.out.println(circuit.costPachet() + PRET_MDJ);
   
   }

   
   
}
