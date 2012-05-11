/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import backing.AbstractBacking;
import java.io.Serializable;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

/**
 *
 * @author XJ
 */
@ManagedBean
@SessionScoped
public class NavigationBean extends AbstractBacking implements Serializable {

    /**
     * Creates a new instance of NavigationBean
     */
    public NavigationBean() {
    }
    
    public String fileReplyTo() { 
	if (getFacesContext() == null) {
	    throw new RuntimeException("facesContext null! ");
	}
        CurrentUser currentUser = (CurrentUser)getSessionMap().get("currentUser");
	if (currentUser == null) {
	    return "home";
	}
        if("student".equals(currentUser.getUsername()))
            return "temp_file_reply1.xhtml"; 
        
         if("worker".equals(currentUser.getUsername()))
            return "temp_file_reply2.xhtml"; 
         
         if("admin".equals(currentUser.getUsername()))
            return "temp_file_reply3.xhtml"; 
         
          return "home";
    } 
}
