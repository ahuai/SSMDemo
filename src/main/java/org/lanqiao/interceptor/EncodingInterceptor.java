package org.lanqiao.interceptor;

import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Created by LiuYuanhuai on 2017/9/5.
 */
public class EncodingInterceptor implements HandlerInterceptor {
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        System.out.println("进入了字符集拦截器");
        request.setCharacterEncoding("utf-8");
        response.setCharacterEncoding("utf-8");
//        若返回值为true,则control方法继续执行.若为false,请求到这终止,不再执行control方法
        return true;
    }

    public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler, ModelAndView modelAndView) throws Exception {
        System.out.println("进入字符集postHandle方法");
    }

    public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex) throws Exception {
        System.out.println("进入字符集afterCompletion");
    }
}
