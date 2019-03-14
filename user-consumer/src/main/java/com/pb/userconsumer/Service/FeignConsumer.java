package com.pb.userconsumer.Service;
import com.pb.userconsumer.config.UserFeignFallback;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import java.util.Map;

@FeignClient(value = "dm-user-provider",fallback = UserFeignFallback.class)
public interface FeignConsumer {

@GetMapping("/login")
     String login();
@PostMapping("/check")
     boolean check(@RequestBody Map map);
}
