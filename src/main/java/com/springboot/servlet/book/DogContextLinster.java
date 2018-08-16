package com.springboot.servlet.book;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

public class DogContextLinster implements ServletContextListener {
    @Override
    public void contextInitialized(ServletContextEvent servletContextEvent) {
        System.out.println("======"+servletContextEvent.getServletContext());
    }

    @Override
    public void contextDestroyed(ServletContextEvent servletContextEvent) {

    }
}
