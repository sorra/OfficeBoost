/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package backing;

import javax.inject.Named;
import javax.enterprise.context.RequestScoped;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedProperty;
import javax.faces.context.FacesContext;
import javax.inject.Inject;
import model.TaskList;
import model.UserSession;

/**
 *
 * @author 123
 */
@Named(value = "submitBean")
@RequestScoped
public class SubmitBean {

    /**
     * Creates a new instance of SubmitBean
     */
    @ManagedProperty(value = "")
    private String userName; 
    @ManagedProperty(value = "")
    private String toSubmit;
    @Inject
    private UserSession userSession;
    @Inject
    private TaskList taskList;

    public String getToSubmit() {
        return toSubmit;
    }

    public void setToSubmit(String toSubmit) {
        this.toSubmit = toSubmit;
    }
    
    public String pageSubmit(){
        FacesMessage outMessage = null;
        outMessage = new FacesMessage("申请成功");
        taskList.add(userName, toSubmit);
        FacesContext.getCurrentInstance().addMessage(null, outMessage);
        return "main";
        
    }
            
    public SubmitBean() {
    }

}
