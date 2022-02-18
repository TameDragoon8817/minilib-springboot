package com.mavenbase.minilibspringboot.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
//@EnableWebMvc//不要写这个
public class MVCConfig implements WebMvcConfigurer {
    @Override
    public void addViewControllers(ViewControllerRegistry registry) {
        registry.addViewController("/main.html").setViewName("dashboard");
        registry.addViewController("/").setViewName("dashboard");
    }
}

/*    @Bean
    public LocalResolverAll localeResolver(){
        return new LocalResolverAll();
    }*/

    /*@Override
    public void addInterceptors(InterceptorRegistry registry) {
        registry.addInterceptor(new LoginHandlerInterceptor()).addPathPatterns("/**").excludePathPatterns("/index.html","/css/*","/js/*","/image/*");
    }*/
    /* @Bean
    public ViewResolver webViewResolver(){
        return new WebViewResolver();
    }
    //视图跳转

}
/*
class WebViewResolver implements ViewResolver{
    @Override
    public View resolveViewName(String s, Locale locale) {
        return null;
    }
}*/
