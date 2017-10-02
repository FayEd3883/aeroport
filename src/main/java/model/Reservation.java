package model;

import java.sql.Date;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Version;

@Entity
public class Reservation {

	@Id
	private long id;
	
	private Date date;
	private int numero;
	@ManyToOne
	@JoinColumn(name = "passager_id")
	private Passager passager;
	@ManyToOne
	@JoinColumn(name = "vol_id")
	private Vol vol;
	@Version
	private int version;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int  numero) {
		this.numero = numero;
	}

	public Passager getPassager() {
		return passager;
	}

	public void setPassager(Passager passager) {
		this.passager = passager;
	}

	public Vol getVol() {
		return vol;
	}

	public void setVol(Vol vol) {
		this.vol = vol;
	}

	public int getVersion() {
		return version;
	}

	public void setVersion(int version) {
		this.version = version;
	}

	public Reservation(long id, Date date, int numero) {
	
		this.id = id;
		this.date = date;
		this.numero = numero;
	}
	public Reservation() {
		
		
	}
	
}
