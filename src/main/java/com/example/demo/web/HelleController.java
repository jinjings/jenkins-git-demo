package com.example.demo.web;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author jj
 * @version 1.0
 * @description: TODO
 * @date 2021/2/8 13:49
 */
@RestController
public class HelleController {

    @RequestMapping("hello")
    public String sayHello(String name){

        return name.concat("::::::::::: say hello!!!!!!!");
    }

}
