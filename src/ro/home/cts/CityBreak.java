package ro.home.cts;

import ro.home.cts.build.IOferta;
import ro.home.cts.build.Oferta;

public class CityBreak extends IOferta{

	public double pret;
	public int nrZile;
	
	public CityBreak(int nrZile,double pret) {
		super();
		this.pret = pret;
		this.nrZile = nrZile;
	}

	@Override
	public void detaliiPacheteDisponibile() {
		System.out.println("Numar zile:" + nrZile + "\n" + "Pret pe zi :" + pret);
	}

	@Override
	public double costPachet() {
		double cost=nrZile*pret;
		return cost;
	}


	@Override
	public String getTip() {
		return "CITYBREAK";
	}

	@Override
	public void acordaReducere() {
		double reducere;
		if(nrZile > 3)
		{
			reducere=pret*5/100;
			System.out.println("Se acorda 5% reducere pentru un numar mai mare de 3 zile :" + reducere);
		}
		
		else
		{
			System.out.println("Numarul de zile nu se incadreaza in reducere!");
			
		}
	}



	

}
