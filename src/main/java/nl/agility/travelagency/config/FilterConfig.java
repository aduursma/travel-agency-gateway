package nl.agility.travelagency.config;

import nl.agility.travelagency.web.CustomMdcFilter;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class FilterConfig {

    @Bean
    public FilterRegistrationBean customMdcFilter() {
        FilterRegistrationBean<CustomMdcFilter> registrationBean = new FilterRegistrationBean<>();
        registrationBean.setFilter(new CustomMdcFilter());
        registrationBean.addUrlPatterns("/api/*");

        return registrationBean;
    }

}
