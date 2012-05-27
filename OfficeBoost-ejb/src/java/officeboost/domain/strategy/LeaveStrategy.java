/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package officeboost.domain.strategy;

/**
 *
 * @author sorra
 */
public class LeaveStrategy {
    public static final String NO_LIMIT = "{no limit}";
    public static final String ONE_STAY = "{one stay}";
    
    private String id;
    
    public void execute() {
	switch(id) {
	    case NO_LIMIT:{
		executeNoLimit();
	    }
	    case ONE_STAY:{
		executeOneStay();
	    }
	    default:{
//		throw new Exception("LeaveStrategy id: "+id+" is wrong!");
	    }
	}
    }
    
    private void executeNoLimit() {
	;
    }
    
    private void executeOneStay() {
	;
    }
}
