/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Portfolio2.ejb;

import Portfolio2.jpa.Kunde;
import Portfolio2.jpa.Leihvertrag;
import javax.ejb.Stateless;

/**
 *
 * @author MildL
 */

@Stateless
public class LeihvertragBean extends EntityBean<Leihvertrag, Long>{
    
    public LeihvertragBean () {
        super(Leihvertrag.class);
    }
    
}
