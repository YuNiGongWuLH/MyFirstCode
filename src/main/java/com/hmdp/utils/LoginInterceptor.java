package com.hmdp.utils;

import cn.hutool.core.bean.BeanUtil;
import cn.hutool.core.util.StrUtil;
import com.hmdp.dto.UserDTO;
import com.hmdp.entity.User;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.web.servlet.HandlerInterceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.util.Map;
import java.util.concurrent.TimeUnit;

public class LoginInterceptor implements HandlerInterceptor {



    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        //判断是否需要拦截（ThreadLocal中是否有用户）
        if(UserHolder.getUser() == null){
            response.setStatus(401);
            return false;
        }
        return true;



//        //2.获取session中的用户
//        Object user = session.getAttribute("user");
//        //3.判断用户是否存在
//        if(user ==null){
//            //4.不存在，拦截， 返回401状态码
//            response.setStatus(401);
//            return false;
//        }
//        //5.存在，保存用户信息到Thread Local
//        UserHolder.saveUser((UserDTO) user);
//        //6.放行
//        return true;
    }
}
