package com.luv2code.springsecurity.demo.config;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.User.UserBuilder;

@Configuration
@EnableWebSecurity
public class DemoSecurityConfig extends WebSecurityConfigurerAdapter {

	// the datasource 
	@Autowired
	private DataSource datasource ;
	
	@Override
	protected void configure(AuthenticationManagerBuilder auth) throws Exception {

		// add the user from the database 
		auth.jdbcAuthentication().dataSource(datasource);



	}

	@Override
	protected void configure(HttpSecurity http) throws Exception {


		http.authorizeRequests()
		.antMatchers("/").hasRole("EMPLOYEE")
		.antMatchers("/leader").hasRole("ADMIN")
		.antMatchers("/manager").hasRole("MANAGER")
		.and()
			.formLogin().loginPage("/showloginform").
			loginProcessingUrl("/userAuth")
			.permitAll()
		.and()
		    .logout()
		    .permitAll()
		.and()
		    .exceptionHandling()
		    .accessDeniedPage("/customerror")
		    ;
	}

	
	
	
	
	
	
	
}
