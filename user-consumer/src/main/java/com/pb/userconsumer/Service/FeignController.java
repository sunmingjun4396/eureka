package com.pb.userconsumer.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
public class FeignController {

    @Autowired
    FeignConsumer feignConsumer;
    @GetMapping("/login")
    public String login(){
         return feignConsumer.login();
    }
    @PostMapping("/check")
    public String check(@RequestParam("username")String username, @RequestParam("password")String password){
        Map map=new HashMap();
        map.put("username",username);
        map.put("password",password);
        boolean check = feignConsumer.check(map);
        if (check){
            return "hello"+map.get("username")+"登陆成功";
        }
        return "登录失败";
    }
}
