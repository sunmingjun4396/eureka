package com.pb.userconsumer.config;

import com.pb.userconsumer.Service.FeignConsumer;
import org.springframework.stereotype.Component;

import java.util.Map;

@Component
public class UserFeignFallback implements FeignConsumer {
    @Override
    public String login() {
        return "恭喜你!登录失败";
    }

    @Override
    public boolean check(Map map) {
        return false;
    }
}
