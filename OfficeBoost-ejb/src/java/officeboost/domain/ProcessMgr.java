/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package officeboost.domain;

import javax.annotation.PostConstruct;
import javax.ejb.Singleton;
import javax.ejb.LocalBean;
import org.jbpm.api.Configuration;
import org.jbpm.api.ProcessEngine;
import org.jbpm.api.ProcessInstance;
import org.jbpm.api.task.Task;

/**
 *
 * @author sorra
 */
@Singleton
@LocalBean
public class ProcessMgr {
    private ProcessEngine processEngine = null;
    
    @PostConstruct
    public void init() {	
	Configuration configuration = new Configuration();
	processEngine = configuration.buildProcessEngine();
    }
    
    public String mes() {
	String mes = null;
	
	processEngine.getRepositoryService().createDeployment().addResourceFromClasspath("pd/leave.jpdl.xml").deploy();
	ProcessInstance processInstance = processEngine.getExecutionService().startProcessInstanceByKey("leave");
	
	Task apply = processEngine.getTaskService().findPersonalTasks("applier").get(0);
	processEngine.getTaskService().completeTask(apply.getId());
	mes = "task apply: "+apply.getId()+"\n";
	
	Task task1 = processEngine.getTaskService().findPersonalTasks("teacher").get(0);
	processEngine.getTaskService().completeTask(task1.getId(), "approve");
	mes += "task1: "+task1.getId()+"\n";
	
	Task task2 = processEngine.getTaskService().findPersonalTasks("studentoffice").get(0);
	processEngine.getTaskService().completeTask(task2.getId(), "approve");
	mes += "task2: "+task2.getId()+"\n";
	
//	Task task3 = processEngine.getTaskService().findPersonalTasks("school").get(0);
//	processEngine.getTaskService().completeTask(task3.getId(), "finish");
//	mes += "task3: "+task3.getId()+"\n";
	
	return mes;
    }
    
}
