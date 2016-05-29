package ro.home.cts;

import ro.home.cts.build.IOferta;
import ro.home.cts.build.Oferta;

public class Circuit extends IOferta{
	
	
	public int nrZile;
	public double pret;

	public Circuit(int nrZile, double pret) {
		this.nrZile = nrZile;
		this.pret = pret;
	}
	
	public int getNrZile() {
		return nrZile;
	}


	public void setNrZile(int nrZile) {
		this.nrZile = nrZile;
	}


	public double getPret() {
		return pret;
	}


	public void setPret(double pret) {
		this.pret = pret;
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
		return "CIRCUIT";
	}

	@Override
	public void acordaReducere() {
		double reducere;
		if(nrZile > 14)
		{
			reducere=pret*15/100;
			System.out.println("Se acorda 15% reducere pentru un numar mai mare de 14 zile :" + reducere);
		}
		
		else
		{
			System.out.println("Numarul de zile nu se incadreaza in reducere!");
			
		}
		
	}




}