/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Portfolio2.jpa;

import javax.persistence.Entity;
import javax.persistence.Id;


@Entity
public class Fahrzeug {
    
    @Id
    private long FahrzeugId;
    
    private String hersteller;
    private String modell;
    private String baujahr;

    //<editor-fold defaultstate="collapsed" desc="Konstruktoren">
    public Fahrzeug() {
    }
    
    public Fahrzeug(long FahrzeugId, String hersteller, String modell, String baujahr) {
        this.FahrzeugId = FahrzeugId;
        this.hersteller = hersteller;
        this.modell = modell;
        this.baujahr = baujahr;
    }
    
    //</editor-fold>

    //<editor-fold defaultstate="collapsed" desc="Getter und Setter">
    public long getFahrzeugId() {
        return FahrzeugId;
    }
    
    public void setFahrzeugId(long FahrzeugId) {
        this.FahrzeugId = FahrzeugId;
    }
    
    public String getHersteller() {
        return hersteller;
    }
    
    public void setHersteller(String hersteller) {
        this.hersteller = hersteller;
    }
    
    public String getModell() {
        return modell;
    }
    
    public void setModell(String modell) {
        this.modell = modell;
    }
    
    public String getBaujahr() {
        return baujahr;
    }
    
    public void setBaujahr(String baujahr) {
        this.baujahr = baujahr;
    }
    
    //</editor-fold>
    
    
}
