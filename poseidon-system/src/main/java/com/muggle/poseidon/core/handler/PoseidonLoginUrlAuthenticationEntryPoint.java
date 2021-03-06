package com.muggle.poseidon.core.handler;

import org.springframework.security.core.AuthenticationException;
import org.springframework.security.web.authentication.LoginUrlAuthenticationEntryPoint;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
/**
 * @program: poseidon
 * @description: 未登录处理
 * @author: muggle
 * @create: 2018-12-31
 **/
public class PoseidonLoginUrlAuthenticationEntryPoint extends LoginUrlAuthenticationEntryPoint {
    public PoseidonLoginUrlAuthenticationEntryPoint(String loginFormUrl) {
        super(loginFormUrl);
    }

    @Override
    public void commence(HttpServletRequest request, HttpServletResponse response, AuthenticationException authException) throws IOException, ServletException {
        response.setContentType("application/json;charset=UTF-8");
        final PrintWriter writer = response.getWriter();
        writer.write("{\"code\":\"401\",\"msg\":\"用户未登录\"}");
        writer.close();
    }
}
