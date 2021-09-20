package test.spring.java.Handller;

import javax.servlet.ServletContext;
import javax.servlet.ServletRequest;
import javax.servlet.ServletRequestEvent;

import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

public class LoginHandler extends ServletRequestEvent {
	
	

	public LoginHandler(ServletContext sc, ServletRequest request) {
		super(sc, request);
		// TODO Auto-generated constructor stub
		
	}
}
