/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.ArrayList;
import java.util.List;
import javax.inject.Named;
import javax.enterprise.context.ApplicationScoped;

/**
 *
 * @author 123
 */
@Named(value = "taskList")
@ApplicationScoped
public class TaskList {
    private List<Task> taskList = new ArrayList<>();
    
    public List<Task> list() {
        return taskList;
    }

    /**
     * Creates a new instance of TaskList
     */
    public TaskList() {
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
