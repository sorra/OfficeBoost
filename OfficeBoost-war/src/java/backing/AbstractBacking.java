/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package backing;

import java.util.Map;
import javax.enterprise.context.RequestScoped;
import javax.faces.bean.ManagedProperty;
import javax.faces.context.FacesContext;
import javax.faces.context.Flash;

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
