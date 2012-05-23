/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package stub;

/**
 *
 * @author sorra
 */
public class Lock {
    private int taskId;
    
    public Lock(int tid) {
	taskId = tid;
    }
    
    public int getTaskId() {
	return taskId;
    }
}
