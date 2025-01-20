package com.xworkz.userapp.webinitializer;

import com.xworkz.userapp.configuration.SpringConfiguration;
import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

public class UserWebInitializer extends AbstractAnnotationConfigDispatcherServletInitializer {


    public UserWebInitializer(){
        System.out.println("UserWebInitializer invokes");
    }


            @Override
    protected Class<?>[] getRootConfigClasses() {
                System.out.println("getRootConfigClasses invoked");
        return new Class[0];
    }

    @Override
    protected Class<?>[] getServletConfigClasses() {
        System.out.println("getServletConfigClasses invoked");
        return new Class[]{SpringConfiguration.class};
    }

    @Override
    protected String[] getServletMappings() {
        System.out.println("getServletMappings invoked");
        return new String[]{"/"};
    }
}
