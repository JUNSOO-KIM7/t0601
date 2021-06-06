package test.controller;

import java.io.IOException;
import java.util.HashMap;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class FrontController extends HttpServlet{
	
	HashMap<String, Controller> map = null;
	
	@Override
	public void init(ServletConfig config) throws ServletException {
		// TODO Auto-generated method stub
		map = new HashMap<String,Controller>();
		map.put("/logins.do", new LoginSController());	// 여기 계속 추가  ㄱ ㄱ ㄱ ㄱ 
		map.put("/loginp.do", new LoginPController());
		map.put("/enSub.do", new EnrollSubjectController());
	
	}
	
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String uri = req.getRequestURI();
		String contextPath = req.getContextPath();		
		String path = uri.substring(contextPath.length());	
		
		Controller cont = map.get(path);
		cont.execute(req, resp);
		
	}
}
