package ro.home.cts.build;

import java.util.Calendar;
import java.util.Date;
import java.util.Random;

public class Oferta {
	String plecare;
	String destinatie;
	String hotel;
	int nrStele;
	int nrZile;
	double pretNoapte;
	boolean areMDJ;
	double pretMDJ;
	
	
	public String getPlecare() {
		return plecare;
	}
	public void setPlecare(String plecare) {
		this.plecare = plecare;
	}
	public String getDestinatie() {
		return destinatie;
	}
	public void setDestinatie(String destinatie) {
		this.destinatie = destinatie;
	}
	public String getHotel() {
		return hotel;
	}
	public void setHotel(String hotel) {
		if(hotel.isEmpty())
			throw new UnsupportedOperationException();
		this.hotel = hotel;
	}
	public int getNrStele() {
		return nrStele;
	}
	public void setNrStele(int nrStele) {
		if(nrStele <= 0 ||  nrStele > 5)
			throw new UnsupportedOperationException();
		this.nrStele = nrStele;
	}
	public int getNrZile() {
		return nrZile;
	}
	public void setNrZile(int nrZile) {
		this.nrZile = nrZile;
	}
	public double getPretNoapte() {
		return pretNoapte;
	}
	public void setPretNoapte(double pretNoapte) {
		this.pretNoapte = pretNoapte;
	}
	public boolean isAreMDJ() {
		return areMDJ;
	}
	public void setAreMDJ(boolean areMDJ) {
		this.areMDJ = areMDJ;
	}
	public double getPretMDJ() {
		return pretMDJ;
	}
	public void setPretMDJ(double pretMDJ) {
		this.pretMDJ = pretMDJ;
	}
	
	
	public Oferta(String hotel,int nrStele){
		if(nrStele <=0)
			throw new UnsupportedOperationException();
		else if(hotel == null || hotel.isEmpty())
			throw new UnsupportedOperationException();
		this.hotel = hotel;
		this.nrStele = nrStele;
	}
	
	public Oferta(String plecare, String destinatie, String hotel, int nrStele,
			int nrZile, double pretNoapte, boolean areMDJ, double pretMDJ) {
		super();
		this.plecare = plecare;
		this.destinatie = destinatie;
		this.hotel = hotel;
		this.nrStele = nrStele;
		this.nrZile = nrZile;
		this.pretNoapte = pretNoapte;
		this.areMDJ = areMDJ;
		this.pretMDJ = pretMDJ;
	}
	
	
	public Oferta(){
		
	}
	
	public double costMicDejun(int nrZile,double pretMdj){
		if(nrZile <= 0  || nrZile >=16)
	 		throw new UnsupportedOperationException();
	  else if(pretMdj <= 0 || pretMdj > 20)
		  throw new UnsupportedOperationException();
		double cost=nrZile*pretMdj;
		return cost;
		
	}
	
	public double costCazare(int nrZile,double pretNoapte){
		if(nrZile == 0 && pretNoapte == 0)
			throw new UnsupportedOperationException();
		else if(nrZile < 0 || nrZile >=16)
			throw new UnsupportedOperationException();
		else if(pretNoapte < 40 || pretNoapte >= Double.MAX_VALUE)
			throw new UnsupportedOperationException();
		double costCazare=nrZile*pretNoapte;
		return costCazare;
		
	}
	//6
      public int ofertaCazare(int nrZile){
    	  if(nrZile == 7)
    		  nrZile=nrZile+1;
    	  else
    		 System.out.println("Nu se aplica oferta!");
		return nrZile;
      }
	//7
      public double ofertaMicDejun(int nrZile,double pretMicDejun){
    	  double reducere=0;
    	  if(nrZile > 7)
    		  reducere=pretMicDejun*0.05;
    	  else
    		  reducere=pretMicDejun*0.02;
    		  
		return pretMicDejun;
    	  
      }
      
      //8
      public double discountCazare(int nrZile,double pretNoapte){
    	  double discount=0;
    	  if(nrZile > 10)
    		  discount=nrZile*pretNoapte*0.10;
    	  else 
    		  discount=nrZile*pretNoapte*0.05;
    		  
		return pretNoapte;
    	  
      }
	//9
	public void discountMicDejun(int nrStele,double pretMdj){
		double pret_redus=0; 
		double pret_discount=0;
		
		if(nrStele < 4)
		{
			 pret_discount=pretMdj*0.05;
			 pret_redus=pretMdj-pret_discount;
				System.out.println("Pentru hotelurile de minim 3 stele se acorda un disocunt de 5% pentru micul dejun" + "\n" +pret_redus);
		}
			
		else if(nrStele <= 5 )
			pret_discount=pretMdj*0.1;  
		 pret_redus=pretMdj-pret_discount;
		System.out.println("Pentru hotelurile de maxim 5  stele se acorda un disocunt de 10% pentru micul dejun" + "\n" +pret_redus);
	}
	
	
	//10
	public double costTotalOferta(boolean areMicDejun,double pret,double pretNoapte,int nrZile){
		double rez=0;
		if(areMicDejun == true)
			rez=nrZile*(pretNoapte+pret);
		else
			rez=nrZile*pretNoapte;
		return rez;
		
	}
	
	
	@Override
	public String toString() {
		return "Oferta [plecare=" + plecare + ", destinatie=" + destinatie
				+ ", hotel=" + hotel + ", nrStele=" + nrStele  + ", areMDJ=" + areMDJ
				+ ", pretMDJ=" + pretMDJ + "]";
	}
	
	
	
}
