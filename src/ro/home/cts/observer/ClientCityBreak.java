package ro.home.cts.observer;

import ro.home.cts.build.Oferta;

public class ClientCityBreak implements IClient{

	@Override
	public void notificare(Oferta oferta) {
		System.out.println("Oferta!" + "\n" + "CityBreak " + oferta.getPlecare() + "-" + oferta.getDestinatie() +"\n"+"Hotel "+ 
				oferta.getHotel() + " " + oferta.getNrStele() + " Stele" + "\n" + oferta.getNrZile() + " zile" + "\n" + "Pret pe noapte: "
							+ oferta.getPretNoapte() + "\n" + "Mic DeJun Inclus: " +
							oferta.isAreMDJ() + "\n" + "Pret mic dejun pe zi: "+ oferta.getPretMDJ());
	}

}
