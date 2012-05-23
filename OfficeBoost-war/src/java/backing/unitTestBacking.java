/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package backing;

import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;
import officeboost.domain.ProcessMgr;

/**
 *
 * @author sorra
 */
@ManagedBean
public class unitTestBacking extends AbstractBacking {
    @EJB
    private ProcessMgr processMgr;
    private String mes = null;    
    
    public String getMes() {
	if (mes == null) {
	    mes = processMgr.mes();
	}
	return mes;
    }

    public void setMes(String mes) {
	this.mes = mes;
    }
    
}
