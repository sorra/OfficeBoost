/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package backing;

import javax.enterprise.context.RequestScoped;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedProperty;
import javax.faces.context.FacesContext;
import javax.inject.Named;

/**
 *
 * @author sorra
 */
@Named(value = "login_backing")
@RequestScoped
public class Login {
    @ManagedProperty(value="")
    private String username;
    @ManagedProperty(value="")
    private String password;
    
    private final String uString = "abc";
    private final String pString = "123";
    
    public String login() {
	FacesMessage outMessage = null;
	
	if (username.equals(uString) && password.equals(pString)) {
	    
	     return "main";
	} else {
           
	    outMessage = new FacesMessage("Login failed! ");
	    
            FacesContext.getCurrentInstance().addMessage(null, outMessage);
	return "login";
	}
	
    }

    /**
     * Creates a new instance of Login
     */
    public Login() {
    }

    public String getUsername() {
	return username;
    }

    public void setUsername(String username) {
	this.username = username;
    }

    public String getPassword() {
	return password;
    }

    public void setPassword(String password) {
	this.password = password;
    }
}
