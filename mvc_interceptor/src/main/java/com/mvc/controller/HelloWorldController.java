package com.mvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Hello world!
 *
 */
@Controller
public class HelloWorldController
{
    @RequestMapping(value="/hello",method = RequestMethod.GET)
    public String sayHello()
    {
        return "hello";
    }
}
