package com.mercury.actions;

import java.util.HashMap;
import java.util.Map;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.SimpleFormController;

import com.mercury.beans.User;
import com.mercury.beans.UserInfo;
import com.mercury.services.HelloService;

public class HelloAction extends SimpleFormController {
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
	public ModelAndView onSubmit(Object command) {
		System.out.println("In HelloAction");
		User user = (User)command;
		Map<String, UserInfo> model = new HashMap<String, UserInfo>();
		model.put("userInfo", hs.process(user));
		return new ModelAndView(viewPage, model);
	}
}
