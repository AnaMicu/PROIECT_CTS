package ro.home.cts.cor;

import java.util.Date;

import ro.home.cts.PachetDisponibil;
import ro.home.cts.build.Oferta;

public class LastBreakfast extends PachetSpecial{

	@Override
	public void alertaPachetPromotional(Oferta special) {
		if(special.getPretMDJ() > 30 && special.getPretMDJ()<= 60)
			System.out.println("Reducere la mic dejum!!");
		else
			if(special.getPretMDJ() <= 30)
				{if(this.next!=null)
					this.next.alertaPachetPromotional(special);
				}
				else 
					System.out.println("Reducre avantajoasa la mic dejum!!");			
		
	}

	
		 
}
