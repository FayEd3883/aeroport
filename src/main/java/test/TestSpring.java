package test;

import java.sql.Date;
import java.util.Collection;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import dao.DaoClient;
import dao.DaoPassager;
import dao.DaoReservation;
import model.Adresse;
import model.Client;
import model.Passager;
import model.Reservation;

public class TestSpring {
	private static ClassPathXmlApplicationContext context;
	
	public static void main(String[] args) {
		context = new ClassPathXmlApplicationContext("applicationContext.xml");
		m1();
		context.close();

	}
	public static void m1() {
		 Client c1=null;
		 c1.setId(1);
		 c1.setNom("toto");
		 c1.setNumeroTel(125);
		 c1.setEmail("dede");
		 Reservation r1=new Reservation(1,new Date(0),12);
		 Reservation r2=new Reservation(2,new Date(0),13);
		 DaoReservation dr=context.getBean(DaoReservation.class);
		 dr.create(r1);
		 dr.create(r2);
		 Collection liste=null;
		 liste.add(r1);
		 liste.add(r2);
		 c1.setReservation(liste);
	     dr.create(r1);
	     DaoClient dph =  context.getBean(DaoClient.class);
	     dph.create(c1);
	}
	
}
