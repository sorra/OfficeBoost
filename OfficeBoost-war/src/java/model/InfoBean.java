/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.io.Serializable;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.SessionScoped;

/**
 *
 * @author XJ
 */
@ManagedBean
@SessionScoped
public class InfoBean implements Serializable {

    /**
     * Creates a new instance of InfoBean
     */

    /**
     * Creates a new instance of InfoBean
     */
    @ManagedProperty(value = "090000")
    private String stuid;
    @ManagedProperty(value = "")
    private String gender;
    @ManagedProperty(value = "")
    private String grade;
    @ManagedProperty(value = "")
    private String phoneNo;
    @ManagedProperty(value = "")
    private String remark;
   
    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getGrade() {
        return grade;
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }

    public String getPhoneNo() {
        return phoneNo;
    }

    public void setPhoneNo(String phoneNo) {
        this.phoneNo = phoneNo;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public String getStuid() {
        return stuid;
    }

    public void setStuid(String stuid) {
        this.stuid = stuid;
    }

    public InfoBean() {
    }
    
}
