/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package officeboost.domain;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.ejb.EJB;
import javax.ejb.LocalBean;
import javax.ejb.Singleton;
import org.jbpm.api.task.Task;


/**
 *
 * @author sorra
 */
@Singleton
@LocalBean
public class OfficeMgr {
    @EJB
    ProcessMgr pm;
    
    Map<String, Lock> lockMap = new HashMap<>();
    
    public List<Task> getTaskList(String assignee) {
	List<Task> taskList = pm.getProcessEngine().getTaskService().findPersonalTasks(assignee);
	for (int i = 0; i < taskList.size(); i++) {
	    if ( lockMap.containsKey(taskList.get(i).getId()) ) {
		taskList.remove(i);
	    }
	}
	return taskList;
    }
    
    public int getTask(String taskId) {
	//get formInstance by taskId
	
	//return formInstance
	return 0;
    }
    
    public void submit(String taskId) {	
    }
}
