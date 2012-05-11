/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.io.Serializable;

/**
 *
 * @author sorra
 */
public class CurrentUser implements Serializable {
    
    private int id = 0;
    private String username;
    
    /**
     * Creates a new instance of UserSession
     */
    public CurrentUser() {
    }
    
    public CurrentUser(String username) {
//	this.id = id;
	this.username = username;
    }

    public int getId() {
	return id;
    }

    public void setId(int id) {
	this.id = id;
    }

    public String getUsername() {
	return username;
    }

    public void setUsername(String username) {
	this.username = username;
    }
}
