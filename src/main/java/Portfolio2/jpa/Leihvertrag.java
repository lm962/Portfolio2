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
import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * Entity-Klasse für einen Fernsehsender.
 */
@Entity
public class Leihvertrag implements Serializable {
    
    @Id
    private long LeihvertragId;

    
    @Temporal(TemporalType.DATE)
    private Date startDatum = new Date();
    
    @Temporal(TemporalType.DATE)
    private Date endDatum = new Date();
    
    @ManyToOne
    private Kunde kunde;
    
    @ManyToOne
    private Fahrzeug fahrzeug;
    
    
    //<editor-fold defaultstate="collapsed" desc="Konstruktoren">
    public Leihvertrag() {
    }

    public Leihvertrag(long LeihvertragId, Date startDatum, Date endDatum, Kunde kunde, Fahrzeug fahrzeug) {
        this.LeihvertragId = LeihvertragId;
        this.startDatum = startDatum;
        this.endDatum = endDatum;
        this.kunde = kunde;
        this.fahrzeug = fahrzeug;
    }

    //</editor-fold>
    
    //<editor-fold defaultstate="collapsed" desc="Setter und Getter">
   public long getLeihvertragId() {
        return LeihvertragId;
    }

    public void setLeihvertragId(long id) {
        this.LeihvertragId = LeihvertragId;
    }

    public Date getStartDatum() {
        return startDatum;
    }

    public void setStartDatum(Date startDatum) {
        this.startDatum = startDatum;
    }

    public Date getEndDatum() {
        return endDatum;
    }

    public void setEndDatum(Date endDatum) {
        this.endDatum = endDatum;
    }
    //</editor-fold>

}
