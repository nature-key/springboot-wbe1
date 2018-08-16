package com.springboot.servlet.book;

import org.springframework.boot.SpringBootConfiguration;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.boot.web.servlet.ServletListenerRegistrationBean;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.annotation.Bean;

import java.util.Arrays;

@SpringBootConfiguration
public class MyConfigServlet {
    @Bean
    public ServletRegistrationBean myServlet() {
        ServletRegistrationBean registrationBean = new ServletRegistrationBean(new BookServlet(), "/myServlet");
        return registrationBean;

    }

    @Bean
    public FilterRegistrationBean createFilter() {
        FilterRegistrationBean filter = new FilterRegistrationBean();
        filter.setFilter(new EnchFilter());
        filter.setUrlPatterns(Arrays.asList("/myServlet"));
        return filter;
    }

    @Bean
    public ServletListenerRegistrationBean CreateListener(){
        ServletListenerRegistrationBean listener = new ServletListenerRegistrationBean(new DogContextLinster());
        return  listener;

    }


}
