/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package officeboost.domain;

import javax.ejb.LocalBean;
import javax.ejb.Stateless;

/**
 *
 * @author sorra
 */
@Stateless
@LocalBean
public class Functor {

    public String functor() {
	return "Functioning!";
    }

    // Add business logic below. (Right-click in editor and choose
    // "Insert Code > Add Business Method")
    
}
