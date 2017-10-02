package util;

import java.text.SimpleDateFormat;
import java.util.Date;

import javax.persistence.Embeddable;

@Embeddable
public class Heure{	
	public Heure() {this(new SimpleDateFormat("HH:mm").format(new Date()));}
	public Heure(Date value) {new SimpleDateFormat("HH:mm").format(value);}
	public Heure(Object value) {
		if (!value.equals(null)) 
			{if (!(value instanceof Date)) System.out.println("ErrorFormatHeure");
		}	
	}
}