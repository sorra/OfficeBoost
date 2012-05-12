/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package backing;

import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import model.Authorizer;

/**
 *
 * @author sorra
 */
@ManagedBean
public class Navigator extends AbstractBacking {

    public String authenticationNavigate(String outcome) {
	if (isUserLoggedIn()) {
	    return outcome;
	} else {
	    getFacesContext().addMessage(null, new FacesMessage("请登录! "));
	    return "authentication_failure";
	}
    }

    public String authorizationNavigate(String outcome, String groupName) {
	Authorizer authorizer = new Authorizer();
	if (authorizer.isInGroup(getCurrentUser(), groupName)) {
	    return outcome;
	} else {
	    getFacesContext().addMessage(null, new FacesMessage("没有权限! "));
	    return "authorization_failure";
	}
    }
}
