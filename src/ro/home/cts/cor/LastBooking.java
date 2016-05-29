package ro.home.cts.cor;


import ro.home.cts.build.Oferta;

public class LastBooking extends PachetSpecial{

	@Override
	public void alertaPachetPromotional(Oferta special) {
		if(special.getPretNoapte() < 30)
		{
			if(this.next!=null)
		this.next.alertaPachetPromotional(special);
			
		}
		else 
			if(special.getPretNoapte() <= 36)
				{
				System.out.println("Nu rata!!!Cazare la jumatate de pret!!");
				if(this.next!=null)
					this.next.alertaPachetPromotional(special);
				}
			else System.out.println("Cazare redusa!!");
		
	}

	
	}
	


