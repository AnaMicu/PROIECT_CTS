package ro.home.cts.test;

import ro.home.cts.AgentieTurism;
import ro.home.cts.Circuit;
import ro.home.cts.CityBreak;
import ro.home.cts.PachetDisponibil;
import ro.home.cts.Sejur;
import ro.home.cts.TipPachet;
import ro.home.cts.build.IOferta;
import ro.home.cts.build.Oferta;
import ro.home.cts.build.OfertaBuild;
import ro.home.cts.build.OfertaProprie;
import ro.home.cts.cor.AlertaMail;
import ro.home.cts.cor.LastBooking;
import ro.home.cts.cor.LastBreakfast;
import ro.home.cts.facade.GeneratorOferta;
import ro.home.cts.observer.ClientCircuit;
import ro.home.cts.observer.ClientCityBreak;
import ro.home.cts.observer.ClientSejur;

public class Test {

	public static void main(String[] args) {
		
		AgentieTurism agentie=AgentieTurism.getAgentieTurism("Bucuresti");
		agentie.afisareDetalii();
	
		
		Oferta oferta=new OfertaBuild("Bucuresti", "Grecia")
		.setHotel("Ramada")
		.setStele(4)
		//.setNrZile(3)
		//.setPretNoapte(100)
		.setPretMDJ(5)
		.areMDJ().build();
		System.out.println(oferta.toString());
		
		OfertaProprie o=new OfertaProprie();
		IOferta o1=o.getOfertaDisponibila(TipPachet.SEJUR);
		System.out.println(o1.getTip());
		o1.detaliiPacheteDisponibile();
		System.out.println(o1.costPachet());
	
		System.out.println("**********************");
		o=new OfertaProprie("Sejur");
		Sejur s=new Sejur(8, 200);
		o.setActiune(s);
		o.discount();
		
	    CityBreak cb=new CityBreak(9, 150);
		o.setActiune(cb);
		o.discount();
		
		Circuit c=new Circuit(18, 180);
		o.setActiune(c);
		o.discount();
		
	    System.out.println("\n\n");
		System.out.println("************   Oferta Pachet!!!   *****************");
		PachetDisponibil pachet=new PachetDisponibil("Oferta de luna iunie!!");
		ClientSejur cs=new ClientSejur();
		ClientCityBreak ccb=new ClientCityBreak();
		ClientCircuit cc=new ClientCircuit();
		
		
		pachet.adaugaClient(cs);
		pachet.DetaliiPachete(TipPachet.SEJUR);
		System.out.println("************************************");
		
		pachet.adaugaClient(ccb);
		pachet.DetaliiPachete(TipPachet.CITYBREAK);
		pachet.stergeClient(ccb);
		pachet.DetaliiPachete(TipPachet.CITYBREAK);
		System.out.println("----------------------------------");
		pachet.adaugaClient(cc);
		pachet.DetaliiPachete(TipPachet.CIRCUIT);
		
		
		//COR
		AlertaMail mailAlert=new AlertaMail(new LastBooking());
		mailAlert.adaugaAlerta(new LastBreakfast());
		Oferta o_1=new Oferta("Iasi", "Franta", "Carol", 3, 8, 25, true, 7);
		mailAlert.procesareStareVreme(o_1);
		Oferta o_2=new Oferta("Iasi", "Franta", "Carol", 3, 8, 42, true, 2);
	     mailAlert.procesareStareVreme(o_2);
		Oferta o_3=new Oferta("Iasi", "Franta", "Carol", 3, 8, 35, true, 40);
		mailAlert.procesareStareVreme(o_3);
		
		
		LastBooking book=new LastBooking();
		LastBreakfast breakF=new LastBreakfast();
		breakF.setNextAlert(book);
		
		Oferta o_4=new Oferta("Iasi", "Franta", "Carol", 3, 8, 27, true, 7);
		Oferta o_5=new Oferta("Iasi", "Franta", "Carol", 3, 8, 35, true, 40);
		breakF.alertaPachetPromotional(o_4);
		breakF.alertaPachetPromotional(o_5);
		
		System.out.println("!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
		//facade
		GeneratorOferta generareOferta=new GeneratorOferta();
		System.out.println("Pret estimativ pentru un sejur de 7 zile cu mic dejun inclus");
		//generareOferta.costTotalSejur();
		System.out.println("Pret estimativ pentru un city break de 3 zile cu mic dejun inclus");
		//generareOferta.costTotalCityBreak();
		System.out.println("Pret estimativ pentru un circuit de 14 zile cu mic dejun inclus");
		//generareOferta.costTotalCircuit();
		generareOferta.costTotalVacanta();
		
		//template
		IOferta ofertaTemplate= new Sejur(7, 100);
		ofertaTemplate.template();
		System.out.println("***********");
		ofertaTemplate=new CityBreak(4, 50);
		ofertaTemplate.template();
		System.out.println("***********");
		ofertaTemplate=new Circuit(15, 75);
		ofertaTemplate.template();
		
	
		
		
	}

}
