package cn.xaiu.demo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @RequestMapping("/hello")
    public  void say(@RequestParam("name") String name){
        System.out.println("我爱你亲"+name);
    }
}
