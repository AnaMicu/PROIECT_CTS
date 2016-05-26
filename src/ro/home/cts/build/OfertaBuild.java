package ro.home.cts.build;


public class OfertaBuild {
	
private Oferta oferta=null;
	
	public OfertaBuild(String plecare,String destinatie){
		this.oferta=new Oferta(plecare, destinatie, "", 0, 0, 0, false, 0);
	}
	
	public OfertaBuild setHotel(String hotel){
		this.oferta.setHotel(hotel);
		return this;
	}
	public OfertaBuild setNrZile(int nrZile){
		this.oferta.setNrZile(nrZile);
		return this;
	}
	public OfertaBuild setStele(int nrStele){
		this.oferta.setNrStele(nrStele);
		return this;
	}
	public OfertaBuild setPretNoapte(double pretNoapte){
		this.oferta.setPretNoapte(pretNoapte);
		return this;
	}
	public OfertaBuild areMDJ(){
		this.oferta.setAreMDJ(true);
		return this;
	}
	public OfertaBuild setPretMDJ(double pretMDJ){
		this.oferta.setPretMDJ(pretMDJ);
		return this;
	}

	
	public Oferta build() {
	
		return this.oferta;
	}

	

}
