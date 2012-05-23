/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package backing;

import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.context.FacesContext;
import javax.inject.Inject;
import stub.TaskSys;
import model.CurrentUser;

/**
 *
 * @author 123
 */
@ManagedBean
public class SubmitBacking extends AbstractBacking {

    /**
     * Creates a new instance of SubmitBean
     */
    @ManagedProperty(value = "")
    private String userName; 
    @ManagedProperty(value = "")
    private String toSubmit;
    @Inject
    private CurrentUser userSession;
    @Inject
    private TaskSys taskList;

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
            
    public SubmitBacking() {
    }

}
