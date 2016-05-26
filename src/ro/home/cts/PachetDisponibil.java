package ro.home.cts;

import java.util.ArrayList;
import java.util.Random;

import ro.home.cts.build.Oferta;
import ro.home.cts.observer.IClient;


public class PachetDisponibil {
	
String msg;
	
	ArrayList<IClient> clienti=new ArrayList<>();
	
		public void adaugaClient(IClient client){
			this.clienti.add(client);
		}
	
		public void stergeClient(IClient client){
			this.clienti.remove(client);
		}
		
		private void notificareClient(Oferta oferta){
			if(this.clienti!=null){
				for(IClient client:this.clienti){
					client.notificare(oferta);
					
				}
			}
			
		}
		
		
	

		public PachetDisponibil(String msg) {
			super();
			this.msg = msg;
		}
		
		
		public void DetaliiPachete(TipPachet tip)
		{
			float pret=(new Random()).nextInt(390);
			float pretMDJ=(new Random()).nextInt(20);
			int nrStele=(new Random().nextInt(5));
			Oferta o_sejur=new Oferta("Bucuresti", "Grecia", "Atos", nrStele, 7, pret, true, pretMDJ);
			Oferta o_citybreak=new Oferta("Bucuresti", "Roma", "Hercules", nrStele, 3, pret, true, pretMDJ);
			Oferta o_circuit=new Oferta("Bucuresti", "Budapesta-Viena-Praga", "Flora-Wien-Nemo", nrStele, 14, pret, true, pretMDJ);
			if(tip==TipPachet.SEJUR)
				this.notificareClient(o_sejur);
			else 
				if(tip==TipPachet.CITYBREAK)
				this.notificareClient(o_citybreak);
			else
				this.notificareClient(o_circuit);
			
		}

		
}
