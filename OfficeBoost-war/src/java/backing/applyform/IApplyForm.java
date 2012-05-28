/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package backing.applyform;

/**
 *
 * @author sorra
 */
public interface IApplyForm {
    //表单页面的权限控制
    public void authorityNav();
    
    //加载表单实例
    public void load();
}
