package com.rahul.filterDemo.filters;

import jakarta.servlet.*;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import org.springframework.stereotype.Component;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;


//@Component
public class RequestFilter implements Filter {

    @Override
    public void doFilter(ServletRequest servletRequest,
                         ServletResponse servletResponse,
                         FilterChain filterChain) throws IOException, ServletException {

        HttpServletRequest httpServletRequest =
                (HttpServletRequest) servletRequest;


        HttpServletResponse httpServletResponse =
                (HttpServletResponse) servletResponse;

        BufferedReader re = httpServletRequest.getReader();

        StringBuilder st = new StringBuilder();

        String line= re.readLine();

        while(line != null){
            st.append(line);
            line = re.readLine();
        }

        System.out.println(st);

        filterChain.doFilter(servletRequest,servletResponse);

    }
}