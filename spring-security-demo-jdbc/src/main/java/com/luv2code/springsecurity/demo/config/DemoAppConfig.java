package com.luv2code.springsecurity.demo.config;

import java.beans.PropertyVetoException;
import java.util.logging.Logger;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

import com.mchange.v2.c3p0.ComboPooledDataSource;

@Configuration
@EnableWebMvc
@ComponentScan(basePackages = "com.luv2code.springsecurity.demo")
@PropertySource("classpath:db.properities")
public class DemoAppConfig {
	
	// define the enviroment object to get the values from the external file
	@Autowired
	private Environment env ;
	
	// define my own logger 
	Logger log = Logger.getLogger(getClass().getName());
	
	
	// define bean for view resolver 
	@Bean
	public ViewResolver view()
	{
		
		InternalResourceViewResolver viewresolver = 
				new InternalResourceViewResolver();
		
		viewresolver.setPrefix("/WEB-INF/view/");
		viewresolver.setSuffix(".jsp");
		
		return viewresolver ;
	}
	
	
	// define data source
	@Bean
	public DataSource myseurityDatasource()
	{
		// connection pool 
		ComboPooledDataSource datasource = new ComboPooledDataSource();
		// set jdbc proerities
		log.info("jdbc url >>: "+env.getProperty("url"));
		log.info("jdbc user >>: "+env.getProperty("user"));
		
		try {
			datasource.setDriverClass(env.getProperty("driver"));
		} catch (PropertyVetoException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		datasource.setJdbcUrl(env.getProperty("url"));
		datasource.setUser(env.getProperty("user"));
		datasource.setPassword(env.getProperty("password"));
		
		// set connection pool properities
		datasource.setMaxPoolSize(convert(env.getProperty("max.pool")));
		datasource.setMinPoolSize(convert(env.getProperty("min.pool")));
		datasource.setInitialPoolSize(convert(env.getProperty("intial.pool")));
		datasource.setMaxIdleTime(convert(env.getProperty("max.ideltime")));
		
		
		return datasource ;
		
	}
	
	
	// helper method to convert the string into integer
	public int convert(String value)
	{
		int result = Integer.parseInt(value);
		return result ;
	}
	
	
	
	
	
	
	
	
	
	

}
