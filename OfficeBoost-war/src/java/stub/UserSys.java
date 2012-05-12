/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package stub;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author sorra
 */
public class UserSys {
    private static UserSys instance = null;
    private List<String> userList = new ArrayList<>();
    private List<String> pwList = new ArrayList<>();
    
    public static UserSys getInstance() {
	if (instance == null) {
	    instance = new UserSys();
	}
	return instance;
    }
    
    public boolean checkLogin(String username, String password) {
	for (int i = 0; i < userList.size(); i++) {
	    if (userList.get(i).equals(username) && pwList.get(i).equals(password)) {
		return true;
	    }
	}
	return false;
    }
    
    private UserSys() {
	userList.add("student");
	pwList.add("123");
	userList.add("worker");
	pwList.add("123");
	userList.add("admin");
	pwList.add("123");
    }
}
