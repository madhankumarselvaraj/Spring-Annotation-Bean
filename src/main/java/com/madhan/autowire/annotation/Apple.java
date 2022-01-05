/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.madhan.autowire.annotation;

import org.springframework.beans.factory.annotation.Autowired;

/**
 *
 * @author Madhankumar Selvaraj I Create the Bean using annotation
 */
public class Apple {

@Autowired // This used for Autowire annotation for another bean 
Processor prs;

public void getConfig() {
    prs.processor();
    System.out.println("32G Memory, 2GB RAM, 4.7Inch Display");
}

public Processor getPrs() {
    return prs;
}

}
