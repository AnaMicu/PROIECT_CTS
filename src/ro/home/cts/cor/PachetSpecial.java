package ro.home.cts.cor;

import ro.home.cts.PachetDisponibil;
import ro.home.cts.build.Oferta;

public abstract class PachetSpecial {
	
protected PachetSpecial next; 
	
	public abstract void alertaPachetPromotional(Oferta special);
	
    public void setNextAlert(PachetSpecial next) {
		this.next = next;
	}

}
