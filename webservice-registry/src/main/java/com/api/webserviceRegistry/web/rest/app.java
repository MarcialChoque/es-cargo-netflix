package com.api.webserviceRegistry.web.rest;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Administrador on 25/01/2016.
 */
@RestController
@RequestMapping("/api")
public class app {

    @RequestMapping("/home")
    public String home(){
        return "config - eureka";
    }
}