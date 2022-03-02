package com.project.springsecurity.config;

import javax.sql.DataSource;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.method.configuration.EnableGlobalMethodSecurity;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

@Configuration
@EnableWebSecurity // 스프링 시큐리티 필더가 스프링 필터체인에 등록이 됩니다.
@EnableGlobalMethodSecurity(securedEnabled = true, prePostEnabled = true) // secured 어노테이션 활성화 ,
																			// preAuthorize,postAuthorize 활성화
public class SecurityConfig extends WebSecurityConfigurerAdapter {

	// 해당 메서드의 리턴되는 오브젝트를 IoC로 등록해준다.
	@Bean
	public BCryptPasswordEncoder encodePassWd() {
		return new BCryptPasswordEncoder();
	}

	@Override
	protected void configure(HttpSecurity http) throws Exception {
		http.csrf().disable();
		http.authorizeRequests().antMatchers("/user/**").authenticated().antMatchers("/manager/**")
				.access("hasRole('ROEL_ADMIN') or hasRole('ROLE_MANAGER')").antMatchers("/admin/**")
				.access("hasRole('ROLE_ADMIN')").anyRequest().permitAll().and().formLogin().loginPage("/loginForm")
				.loginProcessingUrl("/login").loginProcessingUrl("/");
	}
	// 로그인을 하지 않으면 /user로 들어가는 경로는 403페이지 오류가 뜸 (권한이 없다는 뜻)
}
