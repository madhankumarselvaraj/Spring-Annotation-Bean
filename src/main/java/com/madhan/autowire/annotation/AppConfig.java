/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.madhan.autowire.annotation;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 *
 * @author Madhankumar Selvaraj I Create the Bean using annotation
 */
@Configuration // This is Configure the bean
public class AppConfig {

@Bean // This is Bean 
public Apple getPhone() {
    return new Apple();
}

@Bean
public Processor getProcessor() {
    return new Processor();
}

}
