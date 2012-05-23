/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package stub;

import java.util.ArrayList;
import java.util.List;
import javax.faces.bean.ApplicationScoped;
import javax.faces.bean.ManagedBean;

/**
 *
 * @author sorra
 */
@ManagedBean
@ApplicationScoped
public class Office {
    private List<Lock> lockList = new ArrayList<>();
    
    public void submitTask() {	
    }
}
