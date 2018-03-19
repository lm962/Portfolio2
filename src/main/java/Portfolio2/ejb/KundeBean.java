/*
 * Copyright © 2018 Dennis Schulmeister-Zimolong
 * 
 * E-Mail: dhbw@windows3.de
 * Webseite: https://www.wpvs.de/
 * 
 * Dieser Quellcode ist lizenziert unter einer
 * Creative Commons Namensnennung 4.0 International Lizenz.
 */
package Portfolio2.ejb;

import Portfolio2.jpa.Kunde;
import java.util.Date;
import java.util.List;
import javax.ejb.Stateless;

/**
 * Minimale EJB zum Lesen und Schreiben von Fernsehsendungen.
 */
@Stateless
public class KundeBean extends EntityBean<Kunde, Long> {
    
    public KundeBean() {
        super(Kunde.class);
    }
    
    public List<Kunde> findByStartBetween(Date startTimeFrom, Date startTimeTo) {
        
        return em.createQuery("SELECT p FROM Program p"
                            + "    WHERE p.startTime >= :startTimeFrom"
                            + "      AND p.startTime <= :startTimeTo"
                            + "    ORDER BY p.startTime, p.name")
                 .setParameter("startTimeFrom", startTimeFrom)
                 .setParameter("startTimeTo", startTimeTo)
                 .getResultList();
    }
}
