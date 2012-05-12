/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package backing;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;

/**
 *
 * @author sorra
 */
@ManagedBean
public class InfoBacking extends AbstractBacking {
    @ManagedProperty(value="")
    String username;
    
}
