package com.mavenbase.minilibspringboot.config;

import org.springframework.web.servlet.HandlerInterceptor;
//这段代码暂时用不上
public class LoginHandlerInterceptor implements HandlerInterceptor {
    /*@Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        Object loginUser = request.getSession().getAttribute("loginUser");
        if(loginUser==null){
            request.setAttribute("msg","请先登录");
            request.getRequestDispatcher("/index.html").forward(request,response);
            return false;
        }else{
            return true;
        }
    }*/
}
