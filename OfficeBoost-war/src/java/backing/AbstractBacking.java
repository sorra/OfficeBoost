/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package backing;

import java.util.Map;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.RequestScoped;
import javax.faces.context.FacesContext;
import javax.faces.context.Flash;
import model.CurrentUser;

/**
 *
 * @author sorra
 */

@RequestScoped
public class AbstractBacking {
    
    @ManagedProperty(value="#{facesContext}")
    private FacesContext facesContext;
    
    @ManagedProperty(value="#{requestScope}")
    private Map<String, Object> requestMap;
    
    @ManagedProperty(value="#{sessionScope}")
    private Map<String, Object> sessionMap;    
    
    public boolean isUserLoggedIn() {
	return getSessionMap().containsKey("currentUser");
    }
    
    public CurrentUser getCurrentUser() {
	return (CurrentUser)getSessionMap().get("currentUser");
    }
    
    public void setCurrentUser(CurrentUser currentUser) {
	getSessionMap().remove("currentUser");
	if (currentUser != null) {
	    getSessionMap().put("currentUser", currentUser);
	}
    }
    
    
    public Flash getFlash() {
	return getFacesContext().getExternalContext().getFlash();
    }

    public FacesContext getFacesContext() {
	return facesContext;
    }

    public void setFacesContext(FacesContext facesContext) {
	this.facesContext = facesContext;
    }

    public Map<String, Object> getRequestMap() {
	return requestMap;
    }

    public void setRequestMap(Map<String, Object> requestMap) {
	this.requestMap = requestMap;
    }

    public Map<String, Object> getSessionMap() {
	return sessionMap;
    }

    public void setSessionMap(Map<String, Object> sessionMap) {
	this.sessionMap = sessionMap;
    }
    
}
