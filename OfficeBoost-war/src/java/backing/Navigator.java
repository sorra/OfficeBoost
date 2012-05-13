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

    public String authNav(String outcome) {
	if (isUserLoggedIn()) {
//	    no use
	    return outcome;
	} else {
	    getFacesContext().addMessage(null, new FacesMessage("请登录! "));
	    getFacesContext().getApplication().getNavigationHandler().
		    handleNavigation(getFacesContext(), null, "auth_failure");
	    return "auth_failure";
	}
    }

    public String authorityNav(String outcome, String groupName) {
	Authorizer authorizer = new Authorizer();
	if (authorizer.isInGroup(getCurrentUser(), groupName)) {
//	    no use
	    return outcome;
	} else {
	    getFacesContext().addMessage(null, new FacesMessage("没有权限! "));
	    getFacesContext().getApplication().getNavigationHandler().
		    handleNavigation(getFacesContext(), null, "authority_failure");
	    return "authority_failure";
	}
    }
}
