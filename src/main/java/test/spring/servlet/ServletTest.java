package test.spring.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.bind.annotation.RequestMapping;

//@WebServlet(urlPatterns = "/getInfo.do")
public class ServletTest extends HttpServlet {

	@Override
	@RequestMapping(value = "test.do")
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		System.out.println( "ServletTest in doGet()");
	}
}
