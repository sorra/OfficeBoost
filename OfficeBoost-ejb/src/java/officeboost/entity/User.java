/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package officeboost.entity;

import java.io.Serializable;
import java.util.List;
import javax.persistence.*;

/**
 *
 * @author sorra
 */
@Entity(name="obUser")
public class User implements Serializable {
    private static final long serialVersionUID = 1L;
    private long id;
    private String uid;
    private String password;
    private String name;
    private String introduction;
    private List<Group> groupList;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    public long getId() {
	return id;
    }
    public void setId(long id) {
	this.id = id;
    }
   
    public String getUid() {
	return uid;
    }
    public void setUid(String uid) {
	this.uid = uid;
    }

    public String getPassword() {
	return password;
    }
    public void setPassword(String password) {
	this.password = password;
    }

    public String getName() {
	return name;
    }
    public void setName(String name) {
	this.name = name;
    }

    public String getIntroduction() {
	return introduction;
    }
    public void setIntroduction(String introduction) {
	this.introduction = introduction;
    }

    @ManyToMany(mappedBy="userList")
    public List<Group> getGroupList() {
	return groupList;
    }

    public void setGroupList(List<Group> groupList) {
	this.groupList = groupList;
    }
    
    @Override
    public int hashCode() {
	int hash = 0;
	hash += (int) id;
	return hash;
    }

    @Override
    public boolean equals(Object object) {
	// TODO: Warning - this method won't work in the case the id fields are not set
	if (!(object instanceof User)) {
	    return false;
	}
	User other = (User) object;
	if (this.id != other.id) {
	    return false;
	}
	return true;
    }

    @Override
    public String toString() {
	return "officeboost.entity.User[ id=" + id + " ]";
    }

}
