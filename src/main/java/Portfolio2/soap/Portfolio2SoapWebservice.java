/*
 * Copyright © 2018 Dennis Schulmeister-Zimolong
 * 
 * E-Mail: dhbw@windows3.de
 * Webseite: https://www.wpvs.de/
 * 
 * Dieser Quellcode ist lizenziert unter einer
 * Creative Commons Namensnennung 4.0 International Lizenz.
 */
package Portfolio2.soap;


import Portfolio2.ejb.FahrzeugBean;
import Portfolio2.ejb.KundeBean;
import Portfolio2.ejb.LeihvertragBean;
import Portfolio2.jpa.Fahrzeug;
import Portfolio2.jpa.Kunde;
import Portfolio2.jpa.Leihvertrag;
import java.util.List;
import javax.ejb.EJB;
import javax.ejb.Stateless;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;

/**
 * Einfacher SOAP-Webservice zum Anlegen und Suchen von Fernsehsendern und
 * Sendungen.
 */
@Stateless
@WebService
public class Portfolio2SoapWebservice {

    @EJB
    FahrzeugBean fahrzeugBean;

    @EJB
    LeihvertragBean leihvertragBean;
    
    @EJB
    KundeBean kundeBean;


    // Fahrzeug speichern
    @WebMethod
    @WebResult(name = "fahrzeug")
    public Fahrzeug createNewFahrzeug(@WebParam(name = "fahrzeug") Fahrzeug fahrzeug) {
        return fahrzeugBean.saveNew(fahrzeug);
    }

    // Kunde anlegen
    @WebMethod
    @WebResult(name = "kunde")
    public Kunde createNewKunde(@WebParam(name = "kunde") Kunde kunde) {
        return kundeBean.saveNew(kunde);
    }

    //Fahrzeug ausleihen
    @WebMethod
    @WebResult(name = "leihvertrag")
    public Leihvertrag createNewLeihvertrag(@WebParam(name = "leihvertrag") Leihvertrag leihvertrag) {
        return leihvertragBean.saveNew(leihvertrag);
    }
    
    //Alle Fahrzeuge ausgeben
    @WebMethod
    @WebResult(name = "alleFahrzeuge")
    public List<Fahrzeug> getAllFahrzeug() {
        return fahrzeugBean.findAll();
    }
    
    //alle Vertäge eines Kunden ausgeben
    @WebMethod
    @WebResult(name = "alleLeihvertraege")
    public List<Leihvertrag> getAllLeihvertrag(Kunde kunde) {
        return leihvertragBean.findByName(kunde);
    }


}
