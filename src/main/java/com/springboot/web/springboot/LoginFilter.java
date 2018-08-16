package com.springboot.web.springboot;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import java.io.IOException;
//路由拦截器
@WebFilter("/user.do")
public class LoginFilter implements Filter {
    @Override
    public void init(FilterConfig filterConfig) throws ServletException {

    }

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        System.out.println(servletRequest.getRemoteHost());
        filterChain.doFilter(servletRequest,servletResponse);
    }

    @Override
    public void destroy() {

    }
}
