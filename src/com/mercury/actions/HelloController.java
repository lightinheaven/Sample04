package com.mercury.actions;

import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

import com.mercury.beans.User;
import com.mercury.beans.UserInfo;
import com.mercury.services.HelloService;

public class HelloController implements Controller {
	private HelloService hs;
	private String viewPage;
	public HelloService getHs() {
		return hs;
	}
	public void setHs(HelloService hs) {
		this.hs = hs;
	}
	public String getViewPage() {
		return viewPage;
	}
	public void setViewPage(String viewPage) {
		this.viewPage = viewPage;
	}
	@Override
	public ModelAndView handleRequest(HttpServletRequest request,
			HttpServletResponse response) throws Exception {
		// TODO Auto-generated method stub
		System.out.println("In HelloController");
		User user = parse(request);
		Map<String, UserInfo> model = new HashMap<String, UserInfo>();
		model.put("userInfo", hs.process(user));
		return new ModelAndView(viewPage, model);
	}
	
	private User parse(HttpServletRequest request) {
		User user = new User();
		user.setName(request.getParameter("name"));
		user.setAge(Integer.parseInt(request.getParameter("age")));
		return user;
	}
}
