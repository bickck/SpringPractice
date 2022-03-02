package com.project.springsecurity.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.annotation.Secured;
import org.springframework.security.access.prepost.PostAuthorize;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.project.springsecurity.model.User;
import com.project.springsecurity.repository.UserRepository;

@Controller
public class IndexController {

	@Autowired
	private UserRepository userRepository;

	@Autowired
	private BCryptPasswordEncoder bCryptPasswordEncoder;

	@GetMapping({ "", "/" })
	public String indexController() {
		return "index";
	}

	@GetMapping("/user")
	public @ResponseBody String user() {
		return "user";
	}

	// 기본은 낚아챔 하지만 configue 설정을 하면 스프링 시큐리티 작동 안함
	@GetMapping("/loginForm")
	public String login() {
		return "loginForm";
	}

	@GetMapping("/joinForm")
	public String joinForm() {
		return "joinForm";
	}

	@PostMapping("/join")
	public String join(User user) {
		user.setRole("ROLE_USER");
		String rawPassword = user.getPassword();
		String encPassword = bCryptPasswordEncoder.encode(rawPassword);
		user.setPassword(encPassword);
		userRepository.save(user); // 회원가입 잘됨, 비밀번호 1234 => 시큐리티로 로그인 할 수 없음, 이유는 패스워드가 암호화가 안되었음
		return "redirect:/loginForm";
	}

	@GetMapping("/joinproc")
	public @ResponseBody String joinproc() {
		return "회원가입 완료됨";
	}

	@GetMapping("/admin")
	public @ResponseBody String admin() {
		return "admin";
	}

	@GetMapping("/manager")
	public @ResponseBody String manager() {
		return "manager";
	}
	
	@Secured("ROLE_ADMIN")
	@GetMapping("/data")
	public @ResponseBody String data(){
		return "개인 정보";
	}
	
	// @PostAuthorize <= Security config에서 prePostAuthroize 활성화하면 나타남 preAuthorize도 같이
	@PreAuthorize("hasRole('ROLE_MANAGER') or hasRole('ROLE_ADMIN')")
	@GetMapping("/info")
	public @ResponseBody String info(){
		return "개인 정보";
	}
}
