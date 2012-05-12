/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author sorra
 */
public class Authorizer {

    public boolean isInGroup(CurrentUser currentUser, String groupName) {
	if (currentUser.getUsername().equals(groupName)) {
	    return true;
	} else {
	    return false;
	}
    }
}
