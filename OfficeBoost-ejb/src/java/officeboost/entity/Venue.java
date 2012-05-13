/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package officeboost.entity;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 *
 * @author sorra
 */
@Entity
public class Venue implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    private String name;
    private String introduction;

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

    @Override
    public int hashCode() {
	int hash = 0;
	hash += (int) id;
	return hash;
    }

    @Override
    public boolean equals(Object object) {
	// TODO: Warning - this method won't work in the case the id fields are not set
	if (!(object instanceof Venue)) {
	    return false;
	}
	Venue other = (Venue) object;
	if (this.id != other.id) {
	    return false;
	}
	return true;
    }

    @Override
    public String toString() {
	return "officeboost.entity.Venue[ id=" + id + " ]";
    }
    
}
