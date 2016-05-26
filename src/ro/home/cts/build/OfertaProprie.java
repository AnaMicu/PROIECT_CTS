package ro.home.cts.build;

import ro.home.cts.Circuit;
import ro.home.cts.CityBreak;
import ro.home.cts.PachetDisponibil;
import ro.home.cts.Sejur;
import ro.home.cts.TipPachet;



public  class OfertaProprie {
	
	IOferta actiune;
	String msg;
	
	public OfertaProprie() {}
	
	public OfertaProprie(String msg) {
		super();
		this.msg = msg;
	}

	public void setActiune(IOferta actiune)
	{
		this.actiune=actiune;
	}
	
	public void discount(){
	  actiune.acordaReducere();
	}
	
	public IOferta getOfertaDisponibila(TipPachet tipPachet){
		IOferta pachet=null;
		switch(tipPachet){
		case SEJUR: 
			pachet=new Sejur(7, 20);
			break;
			
		case CITYBREAK :
			pachet=new CityBreak(3,15);
			break;
			
		case CIRCUIT :
			pachet=new Circuit(14, 10);
			break;
	}
		return pachet;
	
	}

}
