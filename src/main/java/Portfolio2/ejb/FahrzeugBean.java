/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Portfolio2.ejb;

import Portfolio2.jpa.Fahrzeug;
import Portfolio2.jpa.Kunde;
import Portfolio2.jpa.Leihvertrag;
import java.util.List;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;

/**
 *
 * @author MildL
 */

@Stateless
public class FahrzeugBean extends EntityBean<Fahrzeug, Long> {

    public FahrzeugBean() {
        super(Fahrzeug.class);
    }
    
    public List<Leihvertrag> getLeihvertragFromKunde (LeihvertragBean leihvertrag,Kunde kunde) {
        return leihvertrag.findByName(kunde); 
    }
}
