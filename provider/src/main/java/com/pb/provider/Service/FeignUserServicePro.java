package com.pb.provider.Service;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
public class FeignUserServicePro {

    @GetMapping("/login")
    public String login(){
        return "login success 8085";
    }
    @PostMapping("/check")
    public boolean check(@RequestBody Map map){
        String username = (String) map.get("username");
        String password = (String) map.get("password");
        return username.equals("feign")&&password.equals("123456");
    }
    @GetMapping("/login2")
    public String login2(){
        return "login success2";
    }
}
