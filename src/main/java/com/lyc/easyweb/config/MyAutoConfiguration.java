package com.lyc.easyweb.config;

import com.lyc.easyweb.exception.GlobalExceptionHandler;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

/**
 *
 */
@Configuration
@Import({GlobalExceptionHandler.class, Knife4jConfig.class,})
public class MyAutoConfiguration {
}