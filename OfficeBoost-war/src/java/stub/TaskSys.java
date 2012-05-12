/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package stub;

import java.util.ArrayList;
import java.util.List;
import javax.faces.bean.ApplicationScoped;
import javax.faces.bean.ManagedBean;
import model.Task;

/**
 *
 * @author 123
 */
@ManagedBean
@ApplicationScoped
public class TaskSys {
    private List<Task> taskList = new ArrayList<>();
    
    public List<Task> list() {
        return taskList;
    }
    
    public void add(String username, String toSubmit) {
        Task task = new Task();
        task.setId(taskList.size());
        task.setUsername(username);
        task.setContent(toSubmit);
        taskList.add(task);
    }

    /**
     * Creates a new instance of TaskList
     */
    public TaskSys() {
    }

    /**
     * @return the taskList
     */
    public List<Task> getTaskList() {
        return taskList;
    }

    /**
     * @param taskList the taskList to set
     */
    public void setTaskList(List<Task> taskList) {
        this.taskList = taskList;
    }
}
