package model;

import java.io.Serializable;
import java.util.Collection;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "Aeroport")
public class Aeroport implements Serializable {

    /**
     * 
     */
    private static final long serialVersionUID = 3531602893312350878L;

    /*** ---------- Constructor ---------- ***/        
    public Aeroport() {}
    
    /*** ---------- Attributes ---------- ***/    
    /* ---------- PK attribute ---------- */        
    @Id
    private Long id;

    @Column
    private String nom;

    @Column(name = "Ville_Id")
    private Long villeId;
    
    @Column(name = "Escale_Id", nullable=true)
    private Long escaleId;

    @OneToMany(mappedBy = "aeroportId",fetch=FetchType.LAZY)
    private Collection<Ville> listVilles;
    
    @OneToMany(mappedBy = "aeroportId",fetch=FetchType.LAZY)
    private Collection<Escale> listEscales;

    /*** ---------- Equals & HashCode ---------- ***/        
    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Aeroport other = (Aeroport) obj;
        if (id == null) {
            if (other.id != null)
                return false;
        } else if (!id.equals(other.id))
            return false;
        return true;
    }
    
    public int hashCode() {
        int hashcode = 0;
        hashcode = hashcode + (getId() == null ? 0 : getId().hashCode());
        return hashcode;
    }
        
    /*** ----------Other Constructors ---------- ***/    
    public Aeroport(Long id, String nom) {this.id=id; this.nom=nom;}
    public Aeroport(int id, String nom) {setId((long) id); this.nom=nom;}
    /*** ---------- Getters & Setters ---------- ***/    
    public void setId(Long value)         {this.id = value;}
    public void setId(int value)         {this.id = (long) value;}
    public Long getId()                 {return id;}

    public void setNom(String value)     {this.nom = value;}
    public String getNom()                 {return nom;}

    public void setVilleId(Long value)     {this.villeId=value;}
    public void setVilleId(int value)     {this.villeId=(long) value;}
    public Long getVilleId()            {return villeId;}
    
    public void setescaleId(Long value) {this.escaleId=value;}
    public Long getescaleId()            {return escaleId;}
    
    @SuppressWarnings("unused")
    private void setListVilles(Collection<Ville> value)        {this.listVilles = value;}
    private Collection<Ville> getListVilles()                {return listVilles;}

    public Collection<Escale> getListEscales()                 {return listEscales;}
    public void setListEscales(Collection<Escale> value)    {this.listEscales = value;}
    
    /*** ---------- To String ---------- ***/    
    public String toString() {
        return toString(false);
    }
    
    public String toString(boolean idOnly) {
        if (idOnly) {
            return "Aeroport [Id=" + id + "]";
        }
        else {
            return "Aeroport[Id=" + id + ", Nom=" + nom 
                    + "Nombre de Villes associées=" + getListVilles().size()
                    + "Nombre d'escales asscoiées=" + getListEscales().size()
                    +"]";
        }
    }
}