package com.example.homework2.config;

import com.example.homework2.interceptor.loginInterceptor;
import org.apache.tomcat.util.descriptor.LocalResolver;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;


@Configuration
public class webConfig implements WebMvcConfigurer
{
    @Override
    public void addViewControllers(ViewControllerRegistry registry)
    {
        registry.addViewController("/tologin").setViewName("/LOGIN");
        registry.addViewController("/login").setViewName("/LOGIN");
        registry.addViewController("/").setViewName("/LOGIN");

        // 登陆后的主页
        //registry.addViewController("/SHOW.html").setViewName("dashboard");
    }

    @Override
    public void addInterceptors(InterceptorRegistry registry)
    {
        //注册Interceptor拦截器
        InterceptorRegistration registration = registry.addInterceptor(new loginInterceptor());
        registration.addPathPatterns("/**"); //所有路径都被拦截
        registration.excludePathPatterns( //添加不拦截路径
                "/login",       //登录
                "/tologin",
                "/**/*.html",   //html静态资源
                "/**/*.js",     //js静态资源
                "/**/*.css"     //css静态资源
        );
    }
}
