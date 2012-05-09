/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import javax.inject.Named;
import javax.enterprise.context.SessionScoped;
import java.io.Serializable;
import javax.inject.Inject;

/**
 *
 * @author XJ
 */
@Named(value = "navigationBean")
@SessionScoped
public class NavigationBean implements Serializable {

    /**
     * Creates a new instance of NavigationBean
     */
    
    @Inject @Named(value="userSession")
    UserSession userSession;
    public NavigationBean() {
    }
    public String fileReplyTo() { 
        
        if("student".equals(userSession.getUsername()))
            return "temp_file_reply1.xhtml"; 
        
         if("worker".equals(userSession.getUsername()))
            return "temp_file_reply2.xhtml"; 
         
         if("admin".equals(userSession.getUsername()))
            return "temp_file_reply3.xhtml"; 
         
          return "main";
    } 
}
