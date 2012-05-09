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
    private List<String> taskList = new ArrayList<>();
    
    public List<String> list() {
        return getTaskList();
    }

    /**
     * Creates a new instance of TaskList
     */
    public TaskList() {
    }

    /**
     * @return the taskList
     */
    public List<String> getTaskList() {
        return taskList;
    }

    /**
     * @param taskList the taskList to set
     */
    public void setTaskList(List<String> taskList) {
        this.taskList = taskList;
    }
}
