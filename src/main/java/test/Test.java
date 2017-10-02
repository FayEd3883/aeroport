package test;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import model.Aeroport;
import model.CompagnieAerienne;
import model.CompagnieAerienneVol;
import model.Ville;
import model.Vol;

public class Test {

	public static void main(String[] args) throws ParseException {
m1();
	}
static void m1() throws ParseException {
	 CompagnieAerienne ca1 = new CompagnieAerienne((long) 1,"Air France");
	 CompagnieAerienne ca2 = new CompagnieAerienne((long) 2,"Aer Lingus");
	 CompagnieAerienne ca3 = new CompagnieAerienne((long) 3,"Aigle Azur");
	 CompagnieAerienne ca4 = new CompagnieAerienne((long) 4,"Air Algerie");
	 CompagnieAerienne ca5 = new CompagnieAerienne((long) 5,"Air Mauritius");
	 
	 Ville v1 = new Ville(91100, "Corbeil");
	 Ville v2 = new Ville(75000, "Paris");
	 Ville v3 = new Ville(91101, "Corbeil1");
	 Ville v4 = new Ville(91102, "Corbeil2");
	 
	 Vol vol1 = new Vol(11, new SimpleDateFormat("dd-MM-yyyy").parse("14-03-2017"), new SimpleDateFormat("dd-MM-yyyy").parse("21-03-2017"), 
			 new SimpleDateFormat("HH:mm").parse("23:50"), new SimpleDateFormat("HH:mm").parse("23:50"), 
			 new Aeroport((long) 50,"Corbeil"), new Aeroport((long) 51,"Paris") ) ;
	 
	 Vol vol2 = new Vol(11, new SimpleDateFormat("dd-MM-yyyy").parse("5-07-2017"), new SimpleDateFormat("dd-MM-yyyy").parse("25-07-2017"), 
			 new SimpleDateFormat("HH:mm").parse("23:50"), new SimpleDateFormat("HH:mm").parse("23:50"), 
			 new Aeroport((long) 50,"Corbeil"), new Aeroport((long) 51,"Paris") ) ;
	 
	 Vol vol3 = new Vol(11, new SimpleDateFormat("dd-MM-yyyy").parse("14-03-2017"), new SimpleDateFormat("dd-MM-yyyy").parse("16-03-2017"), 
			 new SimpleDateFormat("HH:mm").parse("23:50"), new SimpleDateFormat("HH:mm").parse("23:50"), 
			 new Aeroport((long) 50,"Corbeil"), new Aeroport((long) 51,"Paris") ) ;
	 
	 Vol vol4 = new Vol(11, new SimpleDateFormat("dd-MM-yyyy").parse("28-03-2017"), new SimpleDateFormat("dd-MM-yyyy").parse("04-04-2017"), 
			 new SimpleDateFormat("HH:mm").parse("23:50"), new SimpleDateFormat("HH:mm").parse("23:50"), 
			 new Aeroport((long) 50,"Corbeil"), new Aeroport((long) 51,"Paris") ) ;
	 
	 Vol vol5 = new Vol(11, new SimpleDateFormat("dd-MM-yyyy").parse("30-12-2017"), new SimpleDateFormat("dd-MM-yyyy").parse("14-01-2018"), 
			 new SimpleDateFormat("HH:mm").parse("23:50"), new SimpleDateFormat("HH:mm").parse("23:50"), 
			 new Aeroport((long) 50,"Corbeil"), new Aeroport((long) 51,"Paris") ) ;
	
	CompagnieAerienneVol cav1 = new CompagnieAerienneVol("101", ca1,vol1);
	CompagnieAerienneVol cav2 = new CompagnieAerienneVol("102", ca2,vol1);
	CompagnieAerienneVol cav3 = new CompagnieAerienneVol("103", ca3,vol3);
}
}
