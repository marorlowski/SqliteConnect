package Entiti;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity(name = "Adres")
public class Adres {

    @Id
    @Column(name = "id_adres")
    private
    int idAdres;

    @Column(name = "miasto")
    private
    String miasto;


    public int getIdAdres() {
        return idAdres;
    }

    public void setIdAdres(int idAdres) {
        this.idAdres = idAdres;
    }

    public String getMiasto() {
        return miasto;
    }

    public void setMiasto(String miasto) {
        this.miasto = miasto;

    }

    @Override
    public String toString() {
        return "Adres{" +
                "idAdres=" + idAdres +
                ", miasto='" + miasto + '\'' +
                '}';
    }
}
