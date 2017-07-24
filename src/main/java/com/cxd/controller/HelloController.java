package com.cxd.controller;

import com.cxd.entity.PersonProperties;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created with IntelliJ IDEA.
 * User: cxd
 * Date: 2017/7/24
 * Description:
 */
@RestController
public class HelloController {

   // @Value("${name}")
   // private String name;

   // @Value("${content}")
    // private String content;

    @Autowired
    private PersonProperties personProperties;

    @RequestMapping("/hello")
    public String hello(){
        return "Hello World";
    }

    @RequestMapping(value = "/name",method = RequestMethod.GET)
    public String say(){
        //return content;
        return personProperties.getName()+personProperties.getAge();
    }


}
