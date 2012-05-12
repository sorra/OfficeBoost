/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package backing;

import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import model.CurrentUser;
import model.UserSys;

/**
 *
 * @author sorra
 */
@ManagedBean
public class LoginBacking extends AbstractBacking {

    @ManagedProperty(value = "")
    private String username;
    @ManagedProperty(value = "")
    private String password;

    public String loginAction() {

	if (UserSys.getInstance().checkLogin(username, password)) {
//	    getFacesContext().addMessage(null, new FacesMessage("登录成功! "));
	    getSessionMap().put("currentUser", new CurrentUser(username));
	    return "success";
	} else {
	    getFacesContext().addMessage(null, new FacesMessage("登录失败! "));
	    return "failure";
	}

    }

    /**
     * Creates a new instance of Login
     */
    public LoginBacking() {
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
