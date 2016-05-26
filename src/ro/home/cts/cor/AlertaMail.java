package ro.home.cts.cor;

import ro.home.cts.build.Oferta;

public class AlertaMail {

	PachetSpecial special=null;

	public AlertaMail(PachetSpecial special) {
		super();
		this.special = special;
	}
	
	public void adaugaAlerta(PachetSpecial special){
		if(special==null)
			this.special=special;
		else
		{PachetSpecial handler=null;
		for(handler=this.special; handler.next!=null;handler=handler.next)
			handler.next=special;
			
		}
	}
	
	public void procesareStareVreme(Oferta oferta){
		if(this.special!=null)
		this.special.alertaPachetPromotional(oferta);
	}
}
