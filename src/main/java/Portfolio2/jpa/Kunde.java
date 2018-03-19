/*
 * Copyright © 2018 Dennis Schulmeister-Zimolong
 * 
 * E-Mail: dhbw@windows3.de
 * Webseite: https://www.wpvs.de/
 * 
 * Dieser Quellcode ist lizenziert unter einer
 * Creative Commons Namensnennung 4.0 International Lizenz.
 */
package Portfolio2.jpa;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.Id;

/**
 * Entity-Klasse für eine Sendung
 */
@Entity
public class Kunde implements Serializable {
    
    @Id
    private long KundeId;            
    private String vorname;
    private String nachname;  
    private String strasse;    
    private String hausnr;
    private String plz;       
    private String ort; 
    private String land;
    
    //@OneToMany
    //private Leihvertrag leihvertrag;
    
    
    //<editor-fold defaultstate="collapsed" desc="Konstruktoren">

    public Kunde() {
    }

    public Kunde(long KundeId, String vorname, String nachname, String strasse, String hausnr, String plz, String ort, String land) {
        this.KundeId = KundeId;
        this.vorname = vorname;
        this.nachname = nachname;
        this.strasse = strasse;
        this.hausnr = hausnr;
        this.plz = plz;
        this.ort = ort;
        this.land = land;
    }
    
    //</editor-fold>

    //<editor-fold defaultstate="collapsed" desc="Setter und Getter">
    
    public long getKundeId() {
        return KundeId;
    }

    public void setKundeId(long KundeId) {
        this.KundeId = KundeId;
    }

    public String getVorname() {
        return vorname;
    }

    public void setVorname(String vorname) {
        this.vorname = vorname;
    }

    public String getNachname() {
        return nachname;
    }

    public void setNachname(String nachname) {
        this.nachname = nachname;
    }

    public String getStrasse() {
        return strasse;
    }

    public void setStrasse(String strasse) {
        this.strasse = strasse;
    }

    public String getHausnr() {
        return hausnr;
    }

    public void setHausnr(String hausnr) {
        this.hausnr = hausnr;
    }

    public String getPlz() {
        return plz;
    }

    public void setPlz(String plz) {
        this.plz = plz;
    }

    public String getOrt() {
        return ort;
    }

    public void setOrt(String ort) {
        this.ort = ort;
    }

    public String getLand() {
        return land;
    }

    public void setLand(String land) {
        this.land = land;
    }

    //</editor-fold>

}
