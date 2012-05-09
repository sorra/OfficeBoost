/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package backing;

import javax.inject.Named;
import javax.enterprise.context.SessionScoped;
import java.io.Serializable;
import javax.faces.bean.ManagedProperty;

/**
 *
 * @author sorra
 */
@Named(value = "userSession")
@SessionScoped
public class UserSession implements Serializable {
    @ManagedProperty(value="false")
    private boolean valid;
    @ManagedProperty(value="")
    private String username;
    
    public void login(String usernameString) {
	valid = true;
	username = usernameString;
    }
    
    public void logout() {
	valid = false;
	username = "";
    }

    /**
     * Creates a new instance of UserSession
     */
    public UserSession() {
    }

    public boolean isValid() {
	return valid;
    }

    public void setValid(boolean valid) {
	this.valid = valid;
    }

    public String getUsername() {
	return username;
    }

    public void setUsername(String username) {
	this.username = username;
    }
}
