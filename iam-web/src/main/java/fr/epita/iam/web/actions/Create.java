package fr.epita.iam.web.actions;

import java.io.IOException;

import javax.inject.Inject;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.web.context.support.SpringBeanAutowiringSupport;

import fr.epita.iamcore.datamodel.Identity;
import fr.epita.iamcore.services.dao.IdentityDAO;

/**
 * Servlet implementation class Create
 */
public class Create extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	@Inject
	IdentityDAO dao;

    /**
     * Default constructor. 
     */
    public Create() {
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String firstName = request.getParameter("firstName");
		Identity identity = new Identity();
		identity.setDisplayName(firstName);
		dao.save(identity);
		
		HttpSession session = request.getSession();
		session.setAttribute("message", "La création s'est bien déroulée : " + identity.getDisplayName());
		response.sendRedirect("index.jsp");
	}

	/* (non-Javadoc)
	 * @see javax.servlet.GenericServlet#init(javax.servlet.ServletConfig)
	 */
	@Override
	public void init(ServletConfig config) throws ServletException {
		SpringBeanAutowiringSupport.processInjectionBasedOnServletContext(this, config.getServletContext());
		super.init(config);
	}
	
	

}
