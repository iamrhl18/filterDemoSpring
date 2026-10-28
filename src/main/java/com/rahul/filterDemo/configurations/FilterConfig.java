package com.rahul.filterDemo.configurations;

import com.rahul.filterDemo.filters.DummyFilter;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


@Configuration
public class FilterConfig {
     @Bean
    public FilterRegistrationBean<DummyFilter> getDummyFilterBean(){
         FilterRegistrationBean<DummyFilter> registrationBean =
                 new FilterRegistrationBean<>();

         registrationBean.setFilter(new DummyFilter());
         registrationBean.setOrder(1);
         // adduldpattern is used when we want that whenever this end point is called then this filter is called first
         // we can pass the list of url : so we can set for the diffrent url pattern

         registrationBean.addUrlPatterns("/hello/*");
         return registrationBean;
     }
}
