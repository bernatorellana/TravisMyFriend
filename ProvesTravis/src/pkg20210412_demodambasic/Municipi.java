
package pkg20210412_demodambasic;

/**
 *
 * @author Usuari
 */
public class Municipi {
    private long id;
    private String nom;
    
    private Provincia provincia;

    public Municipi(long id, String nom, Provincia provincia) {
        this.id = id;
        this.nom = nom;
        setProvincia(provincia);
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public Provincia getProvincia() {
        return provincia;
    }

    public void setProvincia(Provincia provincia) {
        this.provincia = provincia;
        provincia.addMunicipi(this);
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 79 * hash + (int) (this.id ^ (this.id >>> 32));
        return hash;
    }
    
    //-----------------------------------
    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Municipi other = (Municipi) obj;
        if (this.id != other.id) {
            return false;
        }
        return true;
    }
    
    
    
}
