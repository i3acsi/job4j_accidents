package ru.job4j.accident.config;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.modelmapper.AbstractConverter;
import org.modelmapper.Converter;
import org.modelmapper.ModelMapper;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.view.InternalResourceViewResolver;
import org.springframework.web.servlet.view.JstlView;

import java.text.SimpleDateFormat;
import java.util.Date;

@Configuration
@ComponentScan("ru.job4j.accident")
public class WebConfig {

    @Bean
    public ViewResolver viewResolver() {
        InternalResourceViewResolver bean = new InternalResourceViewResolver();
        bean.setViewClass(JstlView.class);
        bean.setPrefix("/WEB_INF/views/");
        bean.setSuffix(".jsp");
        return bean;
    }

    @Bean
    public ObjectMapper objectMapper() {
        return new ObjectMapper();
    }

    @Bean
    public ModelMapper modelMapper() {
        ModelMapper modelMapper = new ModelMapper();
        SimpleDateFormat formatter = new SimpleDateFormat("dd-MM-yyyy HH:mm:ssZ");
        Converter<Date, String> dateStringConverter = new AbstractConverter<>() {
            protected String convert(Date source) {
                return source == null ? null : formatter.format(source);
            }
        };
        modelMapper.addConverter(dateStringConverter);
        return modelMapper;
    }
}