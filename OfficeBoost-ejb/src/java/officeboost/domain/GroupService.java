/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package officeboost.domain;

import javax.ejb.LocalBean;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import officeboost.entity.User;
import officeboost.entity.Group;

/**
 *
 * @author sorra
 */
@Stateless
@LocalBean
public class GroupService {
    @PersistenceContext
    EntityManager em;

    public void assign(User user, Group group) {
	group.getUserList().add(user);
    }
    
}
