package edu.miu.cs590.ccpaymentservice.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class CreditServiceMVCConfigurer implements WebMvcConfigurer {
    @Autowired
    private CreditServiceInterceptor creditServiceInterceptor;

    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        registry.addInterceptor(creditServiceInterceptor);
    }
}
