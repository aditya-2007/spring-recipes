package com.aditya.spring6practice.court.web;

import java.util.Set;

import org.springframework.web.context.support.AnnotationConfigWebApplicationContext;
import org.springframework.web.servlet.DispatcherServlet;

import com.aditya.spring6practice.court.config.CourtConfiguration;

import jakarta.servlet.ServletContainerInitializer;
import jakarta.servlet.ServletContext;
import jakarta.servlet.ServletException;

public class CourtServletContainerInitializer implements ServletContainerInitializer {
    
    public static final String MSG = "Starting Court Web Application";

    @Override
    public void onStartup(Set<Class<?>> c, ServletContext ctx) throws ServletException {
	
	var webAppContext = new AnnotationConfigWebApplicationContext();
	webAppContext.register(CourtConfiguration.class);
	
	var dispatcherServlet = new DispatcherServlet(webAppContext);
	
	/* add servlet mapping*/
	var courtRegistration = ctx.addServlet("court", dispatcherServlet);
	courtRegistration.addMapping("/");
	courtRegistration.setLoadOnStartup(1);
    }
    
    
}
