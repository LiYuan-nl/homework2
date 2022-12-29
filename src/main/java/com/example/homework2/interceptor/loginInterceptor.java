package com.example.homework2.interceptor;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

public class loginInterceptor implements HandlerInterceptor{
    @Override
    public boolean preHandle (HttpServletRequest request, HttpServletResponse response, Object handler)throws Exception
    {
        // 获取session
        Object loginUser = request.getSession().getAttribute("loginUser");

        // 若session不存在，则未登录，进行拦截
        if(loginUser == null){
            request.setAttribute("msg", "未登录");
            //返回首页
            //request.getRequestDispatcher("login").forward(request, response);
            response.sendRedirect(request.getContextPath()+"/tologin");

            return false;
        }
        else
            return true;
    }

    @Override
    public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler, ModelAndView modelAndView) throws Exception {
    }

    @Override
    public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler,Exception ex) throws Exception {
    }
}
