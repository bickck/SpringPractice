package test.spring.java;

import java.io.IOException;
import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;


@Controller
public class LoginController extends HttpServlet {
	
	private static final Logger logger = LoggerFactory.getLogger(LoginController.class);
	
	@RequestMapping(value = "/login.do", method = RequestMethod.GET)
	public String Login(Locale locale, Model model) {
		logger.info("Login Controller Welcome home! The client locale is { }.", locale);
		
		
		return "login/login";
	}
	
	@RequestMapping(value = "/register.do",method = RequestMethod.GET)
	public String Register(Locale locale, HttpServletRequest req, HttpServletResponse rep) {
		logger.info("Login Controller register Welcome home! The client locale is { }.", locale);
		
		return "login/Register";
	}
}
