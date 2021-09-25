package com.luv2code.springdemo.config;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.provisioning.JdbcUserDetailsManager;
import org.springframework.security.provisioning.UserDetailsManager;

@Configuration
@EnableWebSecurity
public class AppsecurityConfig extends WebSecurityConfigurerAdapter {

	@Autowired
	private DataSource datasource ;
	
	@Override
	protected void configure(AuthenticationManagerBuilder auth) throws Exception {

		auth.jdbcAuthentication().dataSource(datasource);

	}

	@Override
	protected void configure(HttpSecurity http) throws Exception {

		http
				.authorizeRequests()
						.antMatchers("/customer/**").hasAnyRole("EMPLOYEE" ,"MANAGER" ,"ADMIN")
						.antMatchers("/customer/showformforupdate*").hasRole("MANAGER")
						.antMatchers("/customer/savecustomer*").hasRole("MANAGER")
						 .antMatchers("/customer/deleteform*").hasRole("ADMIN")
						.antMatchers("/resources/**").permitAll()
				.and()
						.formLogin()
						.loginPage("/showlogin")
						.loginProcessingUrl("/userauth")
						.permitAll()
				.and()
						.logout()
						.permitAll()
				.and()
						.exceptionHandling()
						.accessDeniedPage("/accessDenied")
				
						
				;
		
		
//		http.authorizeRequests()
//		.antMatchers("/customer/showForm*").hasAnyRole("MANAGER", "ADMIN")
//		.antMatchers("/customer/save*").hasAnyRole("MANAGER", "ADMIN")
//		.antMatchers("/customer/delete").hasRole("ADMIN")
//		.antMatchers("/customer/**").hasRole("EMPLOYEE")
//		.antMatchers("/resources/**").permitAll()
//		.and()
//		.formLogin()
//			.loginPage("/showlogin")
//			.loginProcessingUrl("/userauth")
//			.permitAll()
//		.and()
//		.logout().permitAll()
//		.and()
//		.exceptionHandling().accessDeniedPage("/accessDenied");

	}
	
	
	@Bean
	public UserDetailsManager userDetailsManager() {
		
		JdbcUserDetailsManager jdbcUserDetailsManager = new JdbcUserDetailsManager();
		
		jdbcUserDetailsManager.setDataSource(datasource);
		
		return jdbcUserDetailsManager; 
	}
	
	
	
	
	
	
	
	
	
	
	
	

}
