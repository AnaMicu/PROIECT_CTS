package ro.home.cts;

import ro.home.cts.build.IOferta;
import ro.home.cts.build.Oferta;

public class Sejur extends IOferta{
	
	public int nrZile;
	public double pret;
	
	

	public Sejur(int nrZile, double pret) {
		super();
		this.nrZile = nrZile;
		this.pret = pret;
	}
	
	

	@Override
	public void detaliiPacheteDisponibile() {
		//System.out.println(plecare + " " + destinatie + " " + pret);
		System.out.println("Numar zile:" + nrZile + "\n" + "Pret pe zi :" + pret);
		
	}



	@Override
	public double costPachet() {
		double cost=nrZile*pret;
		System.out.println("Costul cazarii: " + cost);
		return cost;
	}


	@Override
	public String getTip() {
		
		return "SEJUR";
	}



	@Override
	public void acordaReducere() {
		double reducere;
		if(nrZile > 7)
		{
			reducere=pret*10/100;
			System.out.println("Se acorda 10% reducere pentru un numar mai mare de 7 zile :" + reducere);
		}
		
		else
		{
			reducere=0;
			System.out.println("Numarul de zile nu se incadreaza in reducere!");
			
		}
			
		
	}







	

	

}
