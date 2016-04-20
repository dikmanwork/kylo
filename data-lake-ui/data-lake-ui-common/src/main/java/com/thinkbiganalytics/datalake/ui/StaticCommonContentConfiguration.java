package com.thinkbiganalytics.datalake.ui;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

/**
 * Created by sr186054 on 4/12/16.
 */
@Configuration
public class StaticCommonContentConfiguration extends WebMvcConfigurerAdapter {
    @Override
    public void addResourceHandlers(ResourceHandlerRegistry registry) {
        registry.addResourceHandler("/ui-common/**").addResourceLocations("classpath:/static-common/");
    }
}
