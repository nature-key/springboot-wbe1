一.访问静态资源

   1.默认路径
   
     "classpath:/META-INF/resources/", "classpath:/resources/",
     "classpath:/static/", "classpath:/public/"
   
   2.可以用spring.resources.staticLocations=classpath:/html/修改路径
   
   3.也可以直接访问webapp下静态资源
   
二.servlet的两种方式（@ServletComponentScan启动类必须配置）

     1.使用注解
     
          @WebServlet("/user.do")   继承HttpServlet 
          
          @WebListener  实现ServletContextListener 启动时监听
          
          @WebFilter("/user.do")  实现Filter 拦截路由
   
   
     
     2.不用注解（使用配置类）
       servlet注册到ServletRegistrationBean
       
       filter注册到FilterRegistrationBean
       
       listener注册ServletListenerRegistrationBean
   