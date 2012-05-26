/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package officeboost.domain;

/**
 *
 * @author sorra
 */
public class Lock {
    private String taskId;
    
    public Lock(String tid) {
	taskId = tid;
    }
    
    public String getTaskId() {
	return taskId;
    }
}
