/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import javax.inject.Named;
import javax.enterprise.context.SessionScoped;
import java.io.Serializable;

/**
 *
 * @author XJ
 */
@Named(value = "workflowSession")
@SessionScoped
public class WorkflowSession implements Serializable {

    /**
     * Creates a new instance of WorkflowSession
     */
    private String reasonForLeave;
    private String opinion;

    public String getOpinion() {
        return opinion;
    }

    public void setOpinion(String opinion) {
        this.opinion = opinion;
    }

    public String getOpinion2() {
        return opinion2;
    }

    public void setOpinion2(String opinion2) {
        this.opinion2 = opinion2;
    }

    public String getReasonForLeave() {
        return reasonForLeave;
    }

    public void setReasonForLeave(String reasonForLeave) {
        this.reasonForLeave = reasonForLeave;
    }
    private String opinion2;
    public WorkflowSession() {
    }
}
