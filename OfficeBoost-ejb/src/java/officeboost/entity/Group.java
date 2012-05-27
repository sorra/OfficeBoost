/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package officeboost.entity;

import java.io.Serializable;
import java.util.List;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;

/**
 *
 * @author sorra
 */
@Entity(name="obGroup")
public class Group implements Serializable {
    private static final long serialVersionUID = 1L;
    
    private long id;
    private String name;
    private String introduction;
    private List<User> userList;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    public long getId() {
	return id;
    }
    public void setId(long id) {
	this.id = id;
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
    
    @ManyToMany
    @JoinTable(name="Group_User", 
	    joinColumns={@JoinColumn(name="group_id")}, 
	    inverseJoinColumns={@JoinColumn(name="user_id")})
    public List<User> getUserList() {
	return userList;
    }

    public void setUserList(List<User> userList) {
	this.userList = userList;
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
	if (!(object instanceof Group)) {
	    return false;
	}
	Group other = (Group) object;
	if (this.id != other.id) {
	    return false;
	}
	return true;
    }

    @Override
    public String toString() {
	return "officeboost.entity.Group[ id=" + id + " ]";
    }
    
}
