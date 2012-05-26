/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package officeboost.domain;

import javax.ejb.LocalBean;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author sorra
 */
@Stateless
@LocalBean
public class StrategyService {
    @PersistenceContext
    EntityManager em;

    public void assign() {
	
    }
    
}
