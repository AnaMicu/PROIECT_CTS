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
		this.hotel = hotel;
	}
	public int getNrStele() {
		return nrStele;
	}
	public void setNrStele(int nrStele) {
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
	@Override
	public String toString() {
		return "Oferta [plecare=" + plecare + ", destinatie=" + destinatie
				+ ", hotel=" + hotel + ", nrStele=" + nrStele  + ", areMDJ=" + areMDJ
				+ ", pretMDJ=" + pretMDJ + "]";
	}
	
	
	
}
