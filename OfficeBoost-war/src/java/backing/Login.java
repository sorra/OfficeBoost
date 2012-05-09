/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package backing;

import model.UserSession;
import javax.enterprise.context.RequestScoped;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedProperty;
import javax.faces.context.FacesContext;
import javax.inject.Inject;
import javax.inject.Named;
import model.UserSys;

/**
 *
 * @author sorra
 */
@Named(value = "login_backing")
@RequestScoped
public class Login {

    @ManagedProperty(value = "")
    private String username;
    @ManagedProperty(value = "")
    private String password;
    @Inject @Named(value="userSession")
    UserSession userSession;

    public String loginAction() {
	FacesMessage outMessage = null;

	if (UserSys.getInstance().checkLogin(username, password)) {
//	    outMessage = new FacesMessage("Login success! ");
	    userSession.login(username);
	    return "success";
	} else {
	    outMessage = new FacesMessage("Login failed! ");
	    FacesContext.getCurrentInstance().addMessage(null, outMessage);
	    return "failure";
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
