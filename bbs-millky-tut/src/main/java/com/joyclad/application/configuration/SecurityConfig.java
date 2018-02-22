package com.joyclad.application.configuration;

import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.builders.WebSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

@Configuration
@EnableWebSecurity
public class SecurityConfig extends WebSecurityConfigurerAdapter{

	@Override
	protected void configure(HttpSecurity http) throws Exception {
		 http
         .formLogin()
             .loginPage("/user/login")
         .and()
             .logout()
                 .logoutUrl("/user/logout")
                 .deleteCookies("JSESSIONID")
                 .logoutSuccessUrl("/blog/list")
         .and()
             .authorizeRequests()
                 .antMatchers("/**/write*", "/**/edit*", "/**/delete*")
                 .authenticated()
                 .antMatchers("/**").permitAll();
	}

	@Override
	public void configure(WebSecurity web) throws Exception {
		// TODO Auto-generated method stub
		web.ignoring().antMatchers("/console/**");
		super.configure(web);
	}

}

//google client id
//88158276478-ciutbiso8gphp7u32s68nc1d4jdfg6ep.apps.googleusercontent.com
//google client secret
//qFhhDX6xukZ3_eI0fJA_NCA0


