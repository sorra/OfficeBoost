/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package gate;

import domain.Functor;
import java.io.IOException;
import javax.ejb.EJB;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author sorra
 */
@WebServlet(urlPatterns = {"/gate"})
public class GateServlet extends HttpServlet{
    @EJB
    Functor functor;

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	resp.getWriter().println( functor.functor() );
    }
    
}
