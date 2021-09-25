package com.luv2code.springsecurity.demo.config;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

public class mySpringmvnDispatcherSeveltIntializer extends AbstractAnnotationConfigDispatcherServletInitializer {

	@Override
	protected Class<?>[] getRootConfigClasses() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	protected Class<?>[] getServletConfigClasses() {
		// return our configuration class
		return new Class []{DemoAppConfig.class};
	}

	@Override
	protected String[] getServletMappings() {
		// return our main or default  mapping 
		return new String[] {"/"};
	}

}
