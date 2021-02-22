package com.example.demo;

/**
 * @author Oliver Henlich
 */

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.aspectj.EnableSpringConfigured;

@org.springframework.context.annotation.Configuration
@ComponentScan("com.example.demo")
@EnableSpringConfigured
public class Configuration {

}
