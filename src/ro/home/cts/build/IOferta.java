package ro.home.cts.build;

import ro.home.cts.TipPachet;

public abstract class IOferta {
	
	public abstract void detaliiPacheteDisponibile();
	public abstract String getTip();
	
	//facade
	public abstract double costPachet();
	
	//strategy
	public abstract void acordaReducere();
	

	public final void template(){
		detaliiPacheteDisponibile();
		costPachet();
		acordaReducere();
	}
	

}
