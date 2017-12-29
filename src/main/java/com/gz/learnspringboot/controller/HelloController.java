package com.gz.learnspringboot.controller;

import com.gz.learnspringboot.HelloService;
import com.gz.learnspringboot.vo.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Arrays;

/**
 * @author xiaozefeng
 */
@Controller
public class HelloController {

    @Autowired
    HelloService helloService;

    @GetMapping("/")
    public String index(Model model) {
        model.addAttribute("msg", "Hello Thymeleaf");
        model.addAttribute("persons", Arrays.asList(
                Person.of("jack", 18),
                Person.of("rose", 20),
                Person.of("lucy", 25)));

        return "index";
    }

    @GetMapping("/hello")
    @ResponseBody
    public String hello() {
        return helloService.sayHello();
    }
}
