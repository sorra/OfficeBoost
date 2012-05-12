/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package backing;

import javax.faces.bean.ManagedBean;

/**
 *
 * @author sorra
 */
@ManagedBean
public class LogoutBacking extends AbstractBacking {
    
    public void logoutAction() {
	getFacesContext().getExternalContext().invalidateSession();
	getFacesContext().getApplication().getNavigationHandler().
		handleNavigation(getFacesContext(), null, "login");
    }
}
